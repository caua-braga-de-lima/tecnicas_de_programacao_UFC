package penaltyMania;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Goal extends JPanel 
{
	private ArrayList<GoalCell> goalCells;
	
	public Goal()
	{
		goalCells = new ArrayList<GoalCell>();
		goalFactory();
	}
	
	
	public ArrayList<GoalCell> getGoalCells() 
	{
		return goalCells;
	}


	public void setGoalCells(ArrayList<GoalCell> goalCells) 
	{
		this.goalCells = goalCells;
	}


	public JPanel getGoalPanel()
	{
		JPanel goalPanel = new JPanel();
		goalPanel.setLayout(new GridLayout(9, 18));
		
		for(GoalCell g: this.goalCells)
		{
			goalPanel.add(g.getButton());
		}
		
		return goalPanel;
	}
	
	public void goalFactory()
	{
		for(int i = 0; i < 9; i++)
		{
			getGoalMapping(i);
		}
	}

	public void getGoalMapping(int i) 
	{
		for(int j = 0; j < 18; j++)
		{
			if(i == 0 || j == 0 || j == 17)
			{
				this.goalCells.add(new GoalCell(i, j, new Button().newButton(null, false), GoalSection.OUT, false));
			}
			
			else if(i == 1 || j == 1 || j == 16)
			{
				this.goalCells.add(new GoalCell(i, j, new Button().newButton(null, false), GoalSection.POST, false));
			}
			
			else
			{
				this.goalCells.add(new GoalCell(i, j, new Button().newButton(null, false), GoalSection.GOAL, false));
			}
		}
	}


	
		





	
	


}
