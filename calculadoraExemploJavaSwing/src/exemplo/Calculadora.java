package exemplo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.nio.ByteOrder;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora extends JFrame{

	
	public Calculadora() {
		setSize(300, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizarLayout();
		setVisible(true);
	}
	
	
	public void organizarLayout() {

		//organizador
		setLayout(new BorderLayout());
		
		//painel dos numeros digitados
		Display display = new Display();
		display.setPreferredSize(new Dimension(200,100));
		add(display, BorderLayout.NORTH);
		
		//painel do teclado
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}
}
