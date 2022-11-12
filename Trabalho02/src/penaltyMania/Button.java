package penaltyMania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton
{
	public Button newButton(String text)
	{
		Button button = new Button();
		button.setText(text);
		button.setVisible(true);
		return button;	
	}

	//ENUM - MAPEAMENTO DO GOL
	//ACTIONLISTERNER- EM CADA CLASSE
}
