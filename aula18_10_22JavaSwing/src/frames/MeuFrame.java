package frames;

import javax.swing.JFrame;

public class MeuFrame extends JFrame{

	public MeuFrame(String titulo) {
		setSize(400,300);
		setTitle(titulo);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame frame1 = new MeuFrame("Teste 1");
		JFrame frame2 = new MeuFrame("Teste 2");
	}
}
