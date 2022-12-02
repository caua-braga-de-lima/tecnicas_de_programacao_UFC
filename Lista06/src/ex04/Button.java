package ex04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener
{
	public JButton newButton(String text)
	{
		JButton button = new JButton();
		button.setText(text);
		button.addActionListener(this);
		return button;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
