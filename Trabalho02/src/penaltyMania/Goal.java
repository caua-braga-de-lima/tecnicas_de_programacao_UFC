package penaltyMania;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Goal extends JPanel
{
	private ArrayList<JButton> goalCells;

	public Goal()
	{
		goalCells = new ArrayList<JButton>();
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(9,18));
		goalFactory();
	}
	
	public JPanel getGoalPanel()
	{
		JPanel goalPanel = new JPanel();
		
		for(JButton b : this.goalCells)
		{
			goalPanel.add(b);
		}
		goalPanel.setLayout(new GridLayout(9, 18));
		
		return goalPanel;
	}
	
	public void goalFactory()
	{
		getLeftPost();
		getUpPost();
		getRightPost();
		getGoal();
		getOutCells();
	}

	public void getOutCells() 
	{
		for(int i = 0; i <= 8; i++)
		{
			for(int j = 0; j <= 17; j++)
			{
				if(i == 0 && (j == 0 || j == 17))
				{
					this.goalCells.add(new OutGoalCell(i, j, new Button()));
				}
			}
		}
	}

	public void getGoal() 
	{
		for(int i = 2; i <= 8; i++)
		{
			for(int j = 2; j <= 15; j++)
			{
				this.goalCells.add(new InGoalCell(i, j, new Button()));
			}
		}
	}

	public void getRightPost() 
	{
		for(int i = 1; i <= 8; i++)
		{
			this.goalCells.add(new RightGoalPost(i, 16, new Button()));
		}
	}

	public void getUpPost() 
	{
		for(int j = 1; j <= 16; j++)
		{
			this.goalCells.add(new UpGoalPost(1, j, new Button()));
		}
	}

	public void getLeftPost() 
	{
		for(int i = 1; i <= 8; i++)
		{
			this.goalCells.add(new LeftGoalPost(i, 1, new Button()));
		}
	}
	
	
	
//	public void getButtonsInfo(JPanel buttonPanel, int i) 
//	{
//		for(int j = 0; j < 18; j++)
//		{
//			Button b = new Button();
//			b.setBackground(Color.GREEN);
//			b.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//			buttonPanel.add(b);
//			GoalCell g = new GoalCell(i, j, b);
//			goalCells.add(g);					
//		}
//	}
//	
//	public void getGoalButtons(JPanel buttonPanel) 
//	{
//		for(int i = 0; i < 9; i++)
//		{
//			getButtonsInfo(buttonPanel, i);
//		}		
//	}
	
	
	


}
