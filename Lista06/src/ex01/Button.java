package ex01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Button extends JButton implements ActionListener
{
	private ColorPanel colorPanel;
	private Color color;
	
	public Button(ColorPanel colorPanel, String text, Color color)
	{
		this.colorPanel = colorPanel;
		this.color = color;
		this.setText(text);
		this.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{
		this.colorPanel.setBackground(color);
	}
}
