package ex05;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel
{
	public JPanel getPanel()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Digite os números: " ));
		JComboBox box = new JComboBox();
		box.add(new JLabel("SOMAR"));
		box.add(new JLabel("MULTIPLICAR"));
		panel.add(box);
		Button button = new Button();
		panel.add(button.newButton("Enviar"));
		
		return panel;
	}
}
