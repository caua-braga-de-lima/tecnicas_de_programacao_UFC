package ExemplosLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JFrame;

public class FlowLayoutExempo {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame ();
		frame.setSize(300, 200);
	    frame.setLayout(new FlowLayout());
	    frame.setVisible(true);
	    
	    Button b= new Button("um");
		frame.add(b);		
		frame.add(new TextField(9));
		frame.add(new Button("dois"));
		frame.add(new Button("três"));		
		
		
  }
}
