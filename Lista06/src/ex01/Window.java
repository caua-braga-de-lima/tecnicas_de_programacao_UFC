package ex01;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Window extends JFrame
{
	public Window()
	{
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setWindowLayout();
		this.setVisible(true);	
	}

	public void setWindowLayout() 
	{
		this.setLayout(new BorderLayout());
		ColorPanel colorPanel = new ColorPanel();
		this.add(new MenuPanel(colorPanel), BorderLayout.NORTH);
		this.add(colorPanel, BorderLayout.CENTER);
	}
}
