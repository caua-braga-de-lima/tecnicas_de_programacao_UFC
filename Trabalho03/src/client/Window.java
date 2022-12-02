package client;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame
{
	private JPanel panel;
	
	public Window()
	{
		this.setSize(600, 800);
		this.setTitle("Sistema de Cadastro de Bolões da Copa - Cauã Braga de Lima - 536094");
		this.panel = new JPanel();
		this.add(panel);
		getPanelInfo();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}

	public void getPanelInfo() 

		this.panel.setVisible(true);
		this.panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.panel.setBackground(Color.black);
		JLabel label = new JLabel();
		label.setText("WORLD CUP SWEEPSTAKES!");
		label.setForeground(Color.white);
		label.setFont(new Font("Google Sans", Font.BOLD, 30));
		this.panel.add(label);
		this.panel.add(new NewButton().getButton());
		this.panel.add(new ShowButton().getButton());
		this.panel.add(new ImportButton().getButton());
		this.panel.add(new ExportButton().getButton());
	}
}
