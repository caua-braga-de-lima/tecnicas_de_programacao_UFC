package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import business.Player;
import business.SoccerTeam;
import business.SweepStakes;
import data.SweepStakeDAO;

public class FinalsWindow extends JFrame implements ActionListener
{
	private JPanel scorePanel;
	private TextField auxField;
	private Player player;
	private ArrayList<TextField> textFields;
	private ArrayList<SoccerTeam> sfWinners;
	private SoccerTeam winner;

	public FinalsWindow()
	{
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.black);
		this.setLayout(new BorderLayout());
		this.add(setLabel(), BorderLayout.NORTH);
		getPanelInfo();
		this.add(scorePanel, BorderLayout.CENTER);
		Button button = new Button();
		JButton doneButton = button.newButton("DONE", null);
		doneButton.addActionListener(this);
		this.add(doneButton, BorderLayout.SOUTH);
		
	}
	
	public void setPlayer(Player player) 
	{
		this.player = player;
	}
	
	public void getPanelInfo() 
	{
		this.scorePanel = new JPanel();
		this.textFields = new ArrayList<TextField>();
		scorePanel.setLayout(new GridLayout(1, 2));
		
		for(int i = 1; i <= 2; i++)
		{
			scorePanel.add(teamLabel());
			//para syncar com o bolao, receba um como parametro
			this.auxField = new TextField(3);
			this.textFields.add(auxField);
			scorePanel.add(auxField);
			scorePanel.add(scoreLabel());
			auxField = new TextField(1);
			this.textFields.add(auxField);
			scorePanel.add(auxField);
			
			if(i % 2 != 0)
			{
				scorePanel.add(xSymbol());
			}
		}
	}
	
	public JLabel setLabel() 
	{
		JLabel label = new JLabel();
		label.setText("FINALS - SET YOUR BET:");
		label.setAlignmentX(CENTER_ALIGNMENT);
		label.setForeground(Color.white);
		label.setFont(new Font("Google Sans", Font.BOLD, 30));
		return label;
	}
	
	public void setSfWinners(ArrayList<SoccerTeam> sfWinners) 
	{
		this.sfWinners = sfWinners;
		this.player.setFinalTeams(sfWinners);
	}
	
	public JLabel teamLabel()
	{
		return new JLabel("TEAM: ");
	}
	
	public JLabel scoreLabel()
	{
		return new JLabel("SCORE: ");
	}
	
	public JLabel xSymbol()
	{
		return new JLabel("X");
	}
	
	public void autoFill()
	{
		int aux = -1;
		for(int i = 0; i < this.textFields.size(); i++)
		{
			if(i % 2 == 0)
			{
				aux++;
				this.textFields.get(i).setText(this.sfWinners.get(aux).getName());
			}
		}
	}
	
	public void setTeamsScore() 
	{
		int aux = -1;
		for(int i = 0; i < this.textFields.size(); i++)
		{
			if(i % 2 != 0)
			{
				aux++;
				this.sfWinners.get(aux).setScore(Integer.parseInt(textFields.get(i).getText()));
			}
		}	
	}
	
	public SoccerTeam getWinner()
	{
		if(this.sfWinners.get(0).getScore() > this.sfWinners.get(1).getScore())
		{
			this.winner = this.sfWinners.get(0);
			this.player.setWinner(winner);
		}
		else
		{
			this.winner = this.sfWinners.get(1);
			this.player.setWinner(winner);
		}
		
		return this.winner;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Boolean check = true;
		
		for(TextField field : this.textFields)
		{
			if(field.getText().equals(""))
			{
				check = false;
			}
		}
		
		if(check == true)
		{
			setTeamsScore();
			getWinner();
			System.out.println(this.player.getName());
			
			for(SoccerTeam team : this.player.getQuarterTeams())
			{
				System.out.println(team.getName() + team.getScore());
			}
			for(SoccerTeam team : this.player.getSemiTeams())
			{
				System.out.println(team.getName() + team.getScore());
			}
			for(SoccerTeam team : this.player.getFinalTeams())
			{
				System.out.println(team.getName() + team.getScore());
			}
			System.out.println(this.player.getWinner().getName());
			
			SweepStakeDAO sweepStake = new SweepStakeDAO(new SweepStakes());
			sweepStake.insertSweepStake(this.player);
			this.setVisible(false);
			WinnerWindow window = new WinnerWindow(getWinner());

		}
		
	}
}

