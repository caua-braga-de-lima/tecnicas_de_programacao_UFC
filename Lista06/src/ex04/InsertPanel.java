package ex04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat.Field;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InsertPanel extends JPanel implements ActionListener
{
	private ArrayList<Integer> values;
	private int value;
	private TextField field;
	private JButton sendButton;
	private ShowPanel showPanel;
	
	public JPanel getPanel(ShowPanel showPanel)
	{
		this.values = new ArrayList<Integer>();
		this.showPanel = showPanel;
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setVisible(true);
		panel.add(new JLabel("Digite o número: "));
		this.field = new TextField(2);
		panel.add(field);
		Button button = new Button();
		this.sendButton = button.newButton("Enviar");
		this.sendButton.addActionListener(this);
		panel.add(this.sendButton);
		return panel;
	}


	public int getValue() 
	{
		return value;
	}


	public ArrayList<Integer> getValues() 
	{
		return values;
	}

	public void actionPerformed(ActionEvent e) 
	{
		this.value = Integer.parseInt(field.getText());
		this.values.add(this.value);
		this.field.setText("");
		this.showPanel.updatePanel(showPanel);
	}
}
