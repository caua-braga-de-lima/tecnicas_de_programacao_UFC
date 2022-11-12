package exemplo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Teclado extends JPanel implements ActionListener {

	private Color CLARO = new Color(211, 211, 211);
    public Display display;
	
//	public Teclado(Display display) {
//		this.display= display;
//	}
	public Teclado() {
		setBackground(Color.BLUE);
		setLayout(new GridLayout(4, 4));

		criarBotoes("7", new Color(211, 211, 211));
		criarBotoes("8", new Color(211, 211, 211));
		criarBotoes("9", new Color(211, 211, 211));
		criarBotoes("*", new Color(169, 169, 169));

		criarBotoes("4", new Color(211, 211, 211));
		criarBotoes("5", new Color(211, 211, 211));
		criarBotoes("6", new Color(211, 211, 211));
		criarBotoes("-", new Color(169, 169, 169));

		criarBotoes("1", new Color(211, 211, 211));
		criarBotoes("2", new Color(211, 211, 211));
		criarBotoes("3", new Color(211, 211, 211));
		criarBotoes("+", new Color(169, 169, 169));

		criarBotoes("/", new Color(211, 211, 211));
		criarBotoes("0", new Color(211, 211, 211));
		criarBotoes(",", new Color(211, 211, 211));
		criarBotoes("=", new Color(169, 169, 169));

	}

	public void criarBotoes(String texto, Color cor) {
		Botao b = new Botao(texto, cor);
		b.addActionListener((ActionListener) display.label);
		add(b);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {
 			JButton b = (JButton) e.getSource();
            b.setIcon(new ImageIcon("img/withdraw.png"));
            b.setBackground(Color.WHITE);
            b.setText("Davi");
			System.out.println("Fui clicado" + e.getSource());
		}
	}

}
