package novoExemplos;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela () {
		this.setSize(200,300);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
	}
	
	
	public void popularBotoes() {
	String lista [] = {"Flameno", "Plameiras", "Gremio", "Flu", "Cruzeiro"};
		for (int i = 0; i < 5; i++) {
			criarBotoes(lista[i]);
		}
		
	}
	
	public void criarBotoes(String nome) {
		Botao b= new Botao(nome);
		ImageIcon image = new ImageIcon("sol.png");
		b.setIcon(image);
		this.add(b);
	}
}
