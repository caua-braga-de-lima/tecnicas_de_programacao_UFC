package client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowButton extends Button implements ActionListener
{
	public Button getButton()
	{
		Button button = new Button();
		button.newButton("Show Sweepstakes", Color.yellow);
		button.addActionListener(this);
		
		return button;
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
