package business;

import java.util.ArrayList;

import client.QuarterFinalsWindow;

public class QuarterFinals 
{
	private ArrayList<SoccerTeam> quarterTeams;
	
	public QuarterFinals(ArrayList<SoccerTeam> quarterTeams)
	{
		this.quarterTeams = quarterTeams;
	}
	
	public ArrayList<SoccerTeam> getWinners()
	{
		ArrayList<SoccerTeam> winners = new ArrayList<SoccerTeam>();
		for(int i = 0; i < quarterTeams.size(); i++)
		{
			for(int j = 1; j < quarterTeams.size(); j++)
			{
				if(quarterTeams.get(i).getScore() > quarterTeams.get(j).getScore())
				{
					winners.add(quarterTeams.get(i));
				}
			}
		}	
		
		for(SoccerTeam winner : winners)
		{
			System.out.println(winner.getName());
		}
		return winners;
	}
}
