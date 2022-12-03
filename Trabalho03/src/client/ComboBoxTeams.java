package client;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import business.SoccerTeam;

public class ComboBoxTeams extends JComboBox
{
	public JComboBox getComboBox()
	{
		JComboBox<JLabel> comboBox = new JComboBox<JLabel>();
		comboBox.add(new JLabel("BRA"));
		comboBox.add(new JLabel("KOR"));
		comboBox.add(new JLabel("EUA"));
		comboBox.add(new JLabel("NL"));
		comboBox.add(new JLabel("UK"));
		comboBox.add(new JLabel("POR"));
		comboBox.add(new JLabel("SEN"));
		comboBox.add(new JLabel("CH"));
		
		return comboBox;
	}
}
