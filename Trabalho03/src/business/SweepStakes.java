package business;

import java.util.ArrayList;

import client.ShowWindow;

public class SweepStakes 
{
	private ArrayList<Player> sweepStakesList;
	private ShowWindow showWindow;
	
	public ArrayList<Player> getSweepStakesList() 
	{
		return sweepStakesList;
	}

	public void setSweepStakesList(ArrayList<Player> sweepStakesList) 
	{
		this.sweepStakesList = sweepStakesList;
	}
	
	public void setShowWindow(ShowWindow showWindow) 
	{
		this.showWindow = showWindow;
	}

}
