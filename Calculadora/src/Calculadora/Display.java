package Calculadora;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel
{
	public Keyboard keyboard;
	
	public Display(Keyboard keyboard)
	{
		this.keyboard = keyboard;
		this.setBackground(Color.white);
		JLabel label = new JLabel();
		this.setLayout(new BorderLayout());
		this.add(label, BorderLayout.NORTH);
	
	}
}
