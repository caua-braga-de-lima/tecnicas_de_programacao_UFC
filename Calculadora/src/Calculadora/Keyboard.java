package Calculadora;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Keyboard extends JPanel 
{
	public Keyboard()
	{
		this.setBackground(Color.white);
		this.add(adButtons());
	}

	public JPanel adAllButtons() 
	{
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4));
		Button button = new Button();
		buttonPanel.add(button.adButtons("1"));
		buttonPanel.add(adButtons("8"));
		buttonPanel.add(adButtons("9"));
		buttonPanel.add(adButtons("*"));
		buttonPanel.add(adButtons("4"));
		buttonPanel.add(adButtons("5"));
		buttonPanel.add(adButtons("6"));
		buttonPanel.add(adButtons("-"));
		buttonPanel.add(adButtons("1"));
		buttonPanel.add(adButtons("2"));
		buttonPanel.add(adButtons("3"));
		buttonPanel.add(adButtons("0"));
		
		return buttonPanel;
	}
}
