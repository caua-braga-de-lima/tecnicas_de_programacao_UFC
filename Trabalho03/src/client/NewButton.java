package client;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import business.SweepStake;

public class NewButton implements ActionListener
{
	private MainWindow mainWindow;
	private SignUpWindow sWindow;
	
	public JButton getButton(MainWindow mainWindow, SignUpWindow sWindow)
	{
		this.mainWindow = mainWindow;
		this.sWindow = sWindow;
		Button button = new Button();
		JButton newSSButton = button.newButton("New SweepStake", Color.blue); 
		newSSButton.addActionListener(this);
		
		return newSSButton;
	}

	public void actionPerformed(ActionEvent e) 
	{
		mainWindow.setVisible(false);
		this.sWindow.setVisible(true);
		
	}
}