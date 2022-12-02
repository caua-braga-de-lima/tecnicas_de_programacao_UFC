package ex04;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowPanel extends JPanel
{
	private InsertPanel insertPanel;
	private int largest;
	private int smallest;
	private float average;
	
	public JPanel getPanel(InsertPanel insertPanel)
	{
		JPanel panel = new JPanel();
		this.insertPanel = insertPanel;
		panel.setLayout(new FlowLayout());
		getPanelInfo(panel);
		return panel;	
	}

	public void getPanelInfo(JPanel panel) 
	{		
		for(int i = 0; i < this.insertPanel.getValues().size(); i++)
		{
			for(int j = 1; j < this.insertPanel.getValues().size(); j++)
			{
				this.average += (this.insertPanel.getValues().get(i) + this.insertPanel.getValues().get(j)) / this.insertPanel.getValues().size() ;
				
				if(this.insertPanel.getValues().get(i) >= this.insertPanel.getValues().get(j))
				{
					this.largest = this.insertPanel.getValues().get(i);
					this.smallest = this.insertPanel.getValues().get(j);
				}
			}
		}
		updatePanel(panel);
	}

	public void updatePanel(JPanel panel) 
	{
		panel.add(new JLabel("Maior: "));
		panel.add(new JLabel("" + this.largest));
		panel.add(new JLabel("Menor: "));
		panel.add(new JLabel("" + this.smallest));
		panel.add(new JLabel("Média: "));
		panel.add(new JLabel("" + this.average));
	}
}
