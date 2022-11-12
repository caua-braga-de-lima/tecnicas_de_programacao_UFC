package penaltyMania;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel
{		
	public JPanel getMenu()
	{
		Button button = new Button();
		JPanel buttonPanel = new JPanel();
		getMenuInfo(button, buttonPanel);
		buttonPanel.setVisible(true);
		
		return buttonPanel;
	}

	private void getMenuInfo(Button button, JPanel buttonPanel) 
	{
		JLabel label = new JLabel("Penalty Mania!");
		label.setFont(new Font("Google Sans", Font.BOLD, 20));
		buttonPanel.add(label);
		buttonPanel.setLayout(new FlowLayout());;
		buttonPanel.add(button.newButton("Iniciar"));
		buttonPanel.add(button.newButton("Finalizar"));	
	}
	
	
	
	
}
