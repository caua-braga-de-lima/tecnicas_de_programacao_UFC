package ex04;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame
{
	private InsertPanel insertPanel;
	private ShowPanel showPanel;
	
	public Window()
	{
		this.setSize(300, 600);
		this.setLayout(new BorderLayout());
		InsertPanel insertPanel = new InsertPanel();
		this.insertPanel = insertPanel;
		ShowPanel showPanel = new ShowPanel();
		this.showPanel = showPanel;
		this.add(insertPanel.getPanel(showPanel), BorderLayout.NORTH);
		this.add(showPanel.getPanel(insertPanel), BorderLayout.CENTER);
		this.setVisible(true);			
	}
}
