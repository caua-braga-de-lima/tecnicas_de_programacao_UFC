package penaltyMania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TryAgainButton extends JButton implements ActionListener
{
	private GoalKeeper goalKeeper;
	private Button button;
	
	public JButton getButton(String text, GoalKeeper goalKeeper)
	{
		Button button = new Button();
		button.setText(text);
		button.addActionListener(this);
		this.goalKeeper = goalKeeper;
		this.button = button;
		
		return button;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		goalKeeper.toResetActingArea();
		
		for(GoalCell cell : goalKeeper.getGoalPanel().getGoalCells())
		{
			cell.cont = 0;
		}
	}
	
}

