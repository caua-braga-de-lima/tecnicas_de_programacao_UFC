package penaltyMania;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ButtonClass extends JButton
{
	public Boolean isOn;
	public static int cont;
	
	public ButtonClass newButton(String text, Boolean isOn)
	{
		ButtonClass button = new ButtonClass();
		button.setSize(600, 600);
		button.setText(text);
		button.isOn = isOn;
		
		return button;	
	}
}

