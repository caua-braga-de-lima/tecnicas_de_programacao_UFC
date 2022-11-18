package penaltyMania;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class GoalCell extends Button implements ActionListener
{
	private int XPosition;
	private int YPosition;
	private GoalSection section;
	private Button button;
	public Boolean isGoalKeeper;
	
	
	public GoalCell(int XPosition, int YPosition, Button b, GoalSection section, Boolean isGoalKeeper)
	{
		this.XPosition = XPosition;
		this.YPosition = YPosition;
		this.button = b;
		this.section = section;
		toCustomButton();
		b.addActionListener(this);
	}

	public Button getButton() 
	{
		return button;
	}
	
	public int getXPosition() 
	{
		return XPosition;
	}

	public int getYPosition() 
	{
		return YPosition;
	}
	
	public void setXPosition(int change) 
	{
		XPosition += change;;
	}

	public void setYPosition(int change) 
	{
		YPosition += change;
	}
	
	public void toCustomButton()
	{
		if(this.section == GoalSection.OUT)
		{
			this.button.setBackground(Color.GREEN);
			this.button.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		}
		else if(this.section == GoalSection.POST)
		{
			this.button.setBackground(Color.WHITE);
			this.button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		}
		else if(this.section == GoalSection.GOAL)
		{
			this.button.setBackground(Color.GREEN);
			this.button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
			if(this.button.isOn == true)
			{
				this.button.setIcon(new ImageIcon(new ImageIcon("img/Ball.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				
			}

	}
	
	

}