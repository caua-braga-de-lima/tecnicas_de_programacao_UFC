package Calculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame
{
	private JPanel panel;
	
	public Window(JPanel panel)
	{
		this.setSize(600, 300);
		this.add(this.panel);
		this.setVisible(true);
	}
}
