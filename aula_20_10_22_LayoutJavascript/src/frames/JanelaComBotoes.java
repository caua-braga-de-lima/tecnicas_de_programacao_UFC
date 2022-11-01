package frames;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaComBotoes extends JFrame {
	public JanelaComBotoes() {
		super("Minha Primeira Janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		
		JButton bVermelho = new JButton("Vermelho");
		bVermelho.setBackground(Color.red);
		add(bVermelho);
	
		JButton bAzul = new JButton("Vermelho");
		bAzul.setBackground(Color.blue);
		add(bAzul);
	
		setVisible(true);
	}

	public static void main(String[] args) {

		JanelaComBotoes j = new JanelaComBotoes();

	}

}