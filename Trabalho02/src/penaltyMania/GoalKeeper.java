package penaltyMania;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GoalKeeper 
{
	private GoalCell leftHand;
	private GoalCell rightHand;
	private GoalCell foot;
	private ArrayList<GoalCell> actingArea;
	private Goal goalPanel;
	
	public GoalKeeper(Goal goalPanel)
	{
		this.goalPanel = goalPanel;
		Random drawer = new Random();
		getHands(goalPanel, drawer);
		getFoot(goalPanel, drawer);
	}

	public void getHands(Goal goalPanel, Random drawer) 
	{
		GoalCell aux1 = new GoalCell(drawer.nextInt(0, 144), drawer.nextInt(0, 144), null, null, null);
		GoalCell aux2 = new GoalCell(drawer.nextInt(0, 144), drawer.nextInt(0, 144), null, null, null);
		
		if(aux1.getYPosition() > aux2.getYPosition())
		{
			this.leftHand = aux2;
			this.rightHand = aux1;
		}
	}
	
	
	public void caseSame() 
	{
		if(this.rightHand.getXPosition() == this.leftHand.getXPosition() && this.leftHand.getYPosition() == this.rightHand.getYPosition())
		{
			this.rightHand.setXPosition(1);
		}
	}

	public void getFoot(Goal goalPanel, Random drawer) 
	{
		do
		{
			this.foot = goalPanel.getGoalCells().get(drawer.nextInt(144, 162));	
		} while(foot.getYPosition() < leftHand.getYPosition() && foot.getYPosition() > rightHand.getYPosition());
		
	}
	
	public void getArea()
	{
		ArrayList<GoalCell> actingArea = new ArrayList<GoalCell>();
		
		for(GoalCell cell : goalPanel.getGoalCells())
		{
			if(cell.getXPosition() >= leftHand.getXPosition() && cell.getYPosition() >= leftHand.getYPosition())
			{
				cell.isGoalKeeper = true;
				cell.setBackground(Color.RED);
				actingArea.add(cell);
			}
		}
		
		this.actingArea = actingArea;
	}
	
	
	

	
}
