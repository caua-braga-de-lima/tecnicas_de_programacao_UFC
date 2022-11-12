package ex02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Button extends JButton implements ActionListener
{
	private JLabel label;
	private String text;
	
	public Button(JLabel label, String text)
	{
		this.label = label;
		this.text = text;
		this.setText(text);
		this.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{
		this.label.setText(text);
	}



}
