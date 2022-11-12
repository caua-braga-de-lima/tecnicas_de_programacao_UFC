package exemplo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel {

	public JLabel label;

	public Display() {
		this.setBackground(new Color(128, 128, 128));
		label = new JLabel();
		label.setForeground(Color.WHITE);
		label.setText("Parte do display");
		label.setFont(new Font("courier", Font.ITALIC, 20 ));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 4, 4));
		add(label);

	}
}
