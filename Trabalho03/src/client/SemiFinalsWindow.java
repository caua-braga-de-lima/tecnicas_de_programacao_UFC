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

public class SemiFinalsWindow extends JFrame implements ActionListener
{
	private JPanel scorePanel;
	private FinalsWindow fWindow;
	private TextField auxField;
	private ArrayList<TextField> textFields;
	
	public SemiFinalsWindow(FinalsWindow fWindow)
	{
		this.fWindow = fWindow;
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.black);
		this.setLayout(new BorderLayout());
		this.add(setLabel(), BorderLayout.NORTH);
		getPanelInfo();
		this.add(scorePanel);	
		Button button = new Button();
		JButton doneButton = button.newButton("DONE", Color.black);
		doneButton.addActionListener(this);
		this.add(doneButton, BorderLayout.SOUTH);
	}

	public void getPanelInfo() 
	{
		this.scorePanel = new JPanel();
		this.textFields = new ArrayList<TextField>(); 
		scorePanel.setLayout(new GridLayout(2, 9));
		
		for(int i = 1; i <= 4; i++)
		{
			scorePanel.add(teamLabel());
			//para syncar com o bolao, receba um como parametro
			auxField = new TextField(3);
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
		label.setText("SEMIFINALS - SET YOUR BET:");
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
			this.setVisible(false);
			this.fWindow.setVisible(true);
		}
	}
}
