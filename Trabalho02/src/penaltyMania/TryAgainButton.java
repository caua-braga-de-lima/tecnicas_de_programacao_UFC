package penaltyMania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgainButton implements ActionListener
{
	private Menu menu;
	private GoalKeeper goalKeeper;
	
	public TryAgainButton(Menu menu, GoalKeeper goalKeeper)
	{
		this.menu = menu;
		this.goalKeeper = goalKeeper;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		goalKeeper.toResetActingArea();
	}
}


