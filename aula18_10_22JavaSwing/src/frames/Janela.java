package frames;
 
import java.awt.Color;

import javax.swing.*;        
 
public class Janela {

	
	public static void main(String[] args) 
	{
		
		JFrame janela = new JFrame ();
		janela.setSize(800, 600);
		janela.setTitle("Minha primeira janela");
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton botao = new JButton("Botao");
		botao.setBackground(Color.BLUE);
		botao.setVisible(true);
		janela.getContentPane().add(botao);		
	}
 
  
}
