package client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewButton extends Button implements ActionListener
{
	public Button getButton()
	{
		Button button = new Button();
		button.newButton("New Sweepstake", Color.green);
		button.addActionListener(this);
	
		return button;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
