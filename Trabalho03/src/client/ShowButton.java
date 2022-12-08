package client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ShowButton 
{
	public JButton getButton()
	{
		Button button = new Button();
		return button.newButton("Show SweepStakes", Color.yellow);
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
