package penaltyMania;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener
{		
	private Goal goal;
	
	public JPanel getMenu(Goal goal)
	{
		this.goal = goal;
		Button button = new Button();
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		getMenuInfo(button, buttonPanel);
		buttonPanel.setVisible(true);
		
		return buttonPanel;
	}

	private void getMenuInfo(Button button, JPanel buttonPanel) 
	{
		JLabel label = new JLabel("Penalty Mania!");
		label.setForeground(Color.white);
		label.setFont(new Font("Google Sans", Font.BOLD, 20));
		buttonPanel.add(label);
		buttonPanel.setLayout(new FlowLayout());
	
		Button init = new Button();
		Button finish = new Button();
		JButton initButton = init.newButton("Iniciar", true);
		initButton.addActionListener(this);
		buttonPanel.add(initButton);
		buttonPanel.add(finish.newButton("Finalizar", false));	
	}

	public void actionPerformed(ActionEvent e) 
	{
		for(GoalCell cell : this.goal.getGoalCells())
		{
			cell.getButton().isOn = true;
		}
	}
	
	
	
	
}
