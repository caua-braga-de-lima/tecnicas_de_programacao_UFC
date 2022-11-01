package ExemplosLayout;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GridLayoutExemplo {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame ();
		frame.setSize(300, 200);
		frame.setLayout(new FlowLayout());
		
		JPanel painel =new JPanel();
		painel .setLayout(new GridLayout(2,2));
		painel.add(new JRadioButton("um"));
		painel.add(new JButton("dois"));
		painel.add(new Button("3"));
		painel.add(new Button("4"));

		JPanel painel3= new JPanel();
		painel3 .setLayout(new GridLayout(1,1));
		painel3.add(new JRadioButton("um"));
		
		JPanel painel2 = new JPanel();
		GridLayout grid = new GridLayout(3,1);
		painel2.setLayout(grid);
		painel2.add(new JLabel("Ola mundo!"));
		painel2.add(new JTextField());
		painel2.add(new Checkbox("oi"));
	
		
		frame.add(painel3);
		frame.add(painel2);
		frame.add(painel);
		
		frame.setVisible(true);
  }
}
