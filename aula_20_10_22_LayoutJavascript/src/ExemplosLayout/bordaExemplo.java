package ExemplosLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class bordaExemplo {
public static void main(String[] args) {
	JFrame frame = new JFrame("BorderLayoutDemo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

	
	JPanel pane = new JPanel();
	JButton button = new JButton("Button 2 (centro)");
    button.setPreferredSize(new Dimension(200, 100));
    pane.add(button);
    
    button = new JButton("Button 3 (Oeste)");
    pane.add(button, BorderLayout.NORTH);
    
    button = new JButton("4 (Leste)");
    pane.add(button, BorderLayout.EAST);
    
    button = new JButton("5 (Sul)");
    pane.add(button, BorderLayout.SOUTH);
    frame.add(pane);
    frame.setVisible(true);
}
}
