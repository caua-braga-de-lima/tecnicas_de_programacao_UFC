package penaltyMania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ActionButton extends JButton implements ActionListener 
{
	private Goal goal;
	
	public ActionButton(Goal goal)
	{
		this.goal = goal;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		for(GoalCell cell : this.goal.getGoalCells())
		{
			cell.getButton().isOn = true;
		}
	}

}
