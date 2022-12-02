package ex05;

import javax.swing.JButton;

public class Button extends JButton
{
	public JButton newButton(String text)
	{
		JButton button = new JButton();
		button.setText(text);
		
		return button;
	}
}
