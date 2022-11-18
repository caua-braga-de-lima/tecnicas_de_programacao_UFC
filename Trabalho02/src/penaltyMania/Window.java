package penaltyMania;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame
{	

	public Window()
	{
		this.setSize(1200, 600);
		this.setTitle("Penalty Mania - Cauã Braga de Lima - 536094");
		setWindowLayout();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);	
	}

	public void setWindowLayout() 
	{
		this.setLayout(new BorderLayout());
		Goal goal = new Goal();
		Menu menu = new Menu();
		this.add(menu.getMenu(goal), BorderLayout.NORTH);
		this.add(goal.getGoalPanel(), BorderLayout.CENTER);
		ScoreDisplay score = new ScoreDisplay();
		this.add(score.getScore(), BorderLayout.SOUTH);
	}
	

}
