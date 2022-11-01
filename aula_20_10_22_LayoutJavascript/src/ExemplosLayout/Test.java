package ExemplosLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Test {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("BorderLayoutDemo");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    	
        //JPanel panel= new JPanel();
        
        JButton button1 = new JButton("Button 2 ");
        JButton button2 = new JButton("Button 3 ");
        JPanel painel= new JPanel();
        
        painel.add(new JLabel(new ImageIcon("sol.png")));
        
        frame.add(painel,BorderLayout.NORTH);
       // frame.add(button2,BorderLayout.SOUTH);
        
        //frame.add(panel,BorderLayout.WEST);
         
        JPanel panel2= new JPanel();
        JButton button3 = new JButton("Button 3 ");
        frame.add(button3,BorderLayout.EAST);

        //frame.add(panel2,BorderLayout.EAST);
        
        //JButton button = new JButton("Long-Named Button 4 (Leste)");
        //pane.add(button, BorderLayout.EAST);
        
       
        frame.pack();
        frame.setVisible(true);
		

	}

}
