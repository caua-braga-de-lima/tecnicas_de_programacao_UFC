package ex02;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelPanel extends JPanel
{
	public LabelPanel(JLabel label)
	{
		this.setVisible(true);
		this.add(label);
	}
}
