package ex02;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		JLabel label = new JLabel();
		this.add(new LabelPanel(label), BorderLayout.NORTH);
		this.add(new MainPanel(label), BorderLayout.CENTER);
	}
}
