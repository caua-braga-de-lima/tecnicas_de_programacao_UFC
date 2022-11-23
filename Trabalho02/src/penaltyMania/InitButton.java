package penaltyMania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class InitButton extends JButton implements ActionListener
{
	private Goal goalPanel;
	public Boolean isOn;
	
	public JButton getButton(String text, Goal goalPanel)
	{
		JButton button = new JButton();
		button.setText(text);
		button.addActionListener(this);
		this.goalPanel = goalPanel;
		return button;
	}
	public void actionPerformed(ActionEvent e) 
	{
		this.goalPanel.isOn = true;
	}

}
