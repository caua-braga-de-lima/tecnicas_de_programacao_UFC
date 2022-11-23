package penaltyMania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FinishButton extends JButton implements ActionListener{

	private Goal goalPanel;
	public Boolean isOn;
	
	public JButton getButton(String text, Goal goalPanel)
	{
		Button button = new Button();
		button.setText(text);
		button.addActionListener(this);
		this.goalPanel = goalPanel;
		
		return button;	
	}
	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
