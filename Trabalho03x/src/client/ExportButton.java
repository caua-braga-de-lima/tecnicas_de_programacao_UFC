package client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExportButton extends Button implements ActionListener
{
	public Button getButton()
	{
		Button button = new Button();
		button.newButton("Export Sweepstake", Color.white);
		button.addActionListener(this);
		return button;
	}
	public void actionPerformed(ActionEvent e) 
	{

		
	}

}
