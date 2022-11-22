package penaltyMania;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Button extends JButton implements ActionListener
{
	public Boolean isOn;
	public static int cont;
	
	public Button newButton(String text, Boolean isOn)
	{
		Button button = new Button();
		button.setSize(600, 600);
		button.setText(text);
		button.isOn = isOn;
		
		return button;	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}
