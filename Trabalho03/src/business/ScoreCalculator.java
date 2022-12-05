package business;

import java.util.ArrayList;

import client.QuarterFinalsWindow;

public class ScoreCalculator 
{
	private QuarterFinalsWindow qfWindow;
	
	public ScoreCalculator(QuarterFinalsWindow qfWindow)
	{
		this.qfWindow = qfWindow;
	}
	
	public ArrayList<SoccerTeam> getWinners()
	{
		ArrayList<SoccerTeam> winners = new ArrayList<SoccerTeam>();
		for(int i = 0; i < qfWindow.getSoccerTeams().size(); i++)
		{
			for(int j = 1; j < qfWindow.getSoccerTeams().size(); j++)
			{
				if(qfWindow.getSoccerTeams().get(i).getScore() > qfWindow.getSoccerTeams().get(j).getScore())
				{
					winners.add(qfWindow.getSoccerTeams().get(i));
				}
			}
		}
		
		return winners;
	}
}
