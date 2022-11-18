package ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class MainWindow extends JFrame
{
	public MainWindow()
	{
		this.setSize(300, 300);
		this.setLayout(new FlowLayout());
		TextField tf = new TextField();
		this.add(tf);
		Button b = new Button();
		this.add(b.newButton("Enviar", tf));
		this.setVisible(true);
		
	}
}
