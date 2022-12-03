package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import business.SoccerTeam;
import business.SweepStake;

public class QuarterFinalsWindow extends JFrame implements ActionListener
{
	private JPanel scorePanel;
	private SweepStake sweepStake;
	private SemiFinalsWindow sfWindow;
	
	public QuarterFinalsWindow(SemiFinalsWindow sfWindow)
	{
		this.sfWindow = sfWindow;
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setVisible(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.BLACK);
		JLabel label = setLabel();
		this.add(label, BorderLayout.NORTH);
		getScorePanel();
		this.add(scorePanel);
		Button button = new Button();
		JButton doneButton = button.newButton("DONE", Color.black);
		doneButton.addActionListener(this);
		this.add(doneButton, BorderLayout.SOUTH);
		
	}

	public JLabel setLabel() 
	{
		JLabel label = new JLabel();
		label.setText("QUARTERFINALS - SET YOUR BET:");
		label.setAlignmentX(CENTER_ALIGNMENT);
		label.setForeground(Color.white);
		label.setFont(new Font("Google Sans", Font.BOLD, 30));
		return label;
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
	
	public void getScorePanel() 
	{
		this.scorePanel = new JPanel();
		scorePanel.setLayout(new GridLayout(4, 9, 2, 2));
		
		for(int i = 1; i <= 8; i++)
		{
			scorePanel.add(new JLabel("TEAM: "));
			scorePanel.add(new TextField(3));
			scorePanel.add(scoreLabel());
			scorePanel.add(new TextField(1));
			
			if(i % 2 != 0)
			{
				scorePanel.add(xSymbol());
			}
		}	
	}

	public void actionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		this.sfWindow.setVisible(true);
	}
}
