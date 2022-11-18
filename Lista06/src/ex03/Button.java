package ex03;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Button extends JButton
{
	private TextField textField;
	
	public JButton newButton(String text, TextField tf)
	{
		JButton button = new JButton(text);
		this.textField = tf;
		ButtonAction b2 = new ButtonAction(textField);
		button.addActionListener(b2);	
		return button;
	}
}
