package ex02;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel
{
	public MainPanel(JLabel label)
	{
		this.setLayout(new GridLayout(3,3));
		getMenuButtons(label);
	}
	
	public void getMenuButtons(JLabel label) 
	{
		this.add(new Button(label, "Java"));
		this.add(new Button(label, "JavaScript"));
		this.add(new Button(label, "Python"));
		this.add(new Button(label, "C++"));
		this.add(new Button(label, "C#"));
		this.add(new Button(label, "C"));
	}
}
