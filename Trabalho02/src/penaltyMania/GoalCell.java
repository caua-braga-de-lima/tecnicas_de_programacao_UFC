package penaltyMania;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class GoalCell extends Button
{
	private int XPosition;
	private int YPosition;
	private Button button;
	
	
	public GoalCell(int XPosition, int YPosition, Button b)
	{
		this.XPosition = XPosition;
		this.YPosition = YPosition;
		this.button = b;
	}
	
}
	
	

