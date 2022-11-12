package penaltyMania;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ScoreDisplay extends JPanel
{
	public JPanel getScore()
	{
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.cyan);
		buttonPanel.setSize(300, 600);
		return buttonPanel;
	}
}
