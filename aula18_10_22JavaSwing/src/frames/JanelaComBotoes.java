package frames;



import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaComBotoes extends JFrame { // toda janela deve estender JFrame
	public JanelaComBotoes() { // construtor que inicializar� o conte�do da janela
		super("Minha Primeira Janela"); // t�tulo da janela
		setDefaultCloseOperation(EXIT_ON_CLOSE); // sai ao fechar a janela
		setSize(300, 200); // define largura e altura da janela
		JButton bVermelho = new JButton("Vermelho"); // cria bot�es
		bVermelho.setBackground(Color.red);
		getContentPane().add(bVermelho); // adiciona bot�es ao painel padr�o
		setVisible(true); // torna o frame que estava oculto, vis�vel
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		JanelaComBotoes j = new JanelaComBotoes();
		
		Janela janela = new Janela();
		
	}

}