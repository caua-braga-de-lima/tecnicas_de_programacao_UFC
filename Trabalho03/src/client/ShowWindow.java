package client;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class ShowWindow extends JFrame
{
	public ShowWindow()
	{
		this.setSize(800, 600);
		this.setVisible(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		JTable table = new JTable();
	
	}
}
