package ex05;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Window extends JFrame
{
	public Window()
	{
		this.setSize(300, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new Panel().getPanel());
	}
}
