package tecProg;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Caua extends AdvancedRobot
{

	public void run() 
	{
		setColors(Color.WHITE, Color.BLUE, Color.CYAN);

		while(true) 
		{
			ahead(100);
			turnLeft(20);
			turnGunRight(180);
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent e) 
	{
		fire(3);
	}
	public void onHitWall(HitWallEvent event)
	{
		back(100);
		turnLeft(180);
	}

	
	public void onHitRobot(HitRobotEvent e)
	{
		back(100);
		fireBullet(1);
	}

}


