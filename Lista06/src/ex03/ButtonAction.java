package ex03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonAction implements ActionListener{

	private JTextField textField;
	
	
	public ButtonAction(JTextField textField) 
	{
		this.textField = textField;
	}


	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "textField1: " + textField.getText());
	}

}
