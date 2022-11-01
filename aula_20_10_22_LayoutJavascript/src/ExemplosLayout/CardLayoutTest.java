package ExemplosLayout;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutTest extends JFrame {
	JPanel pnlCard;
	JPanel pnlBotoes;
	JButton btnPrimeiro;
	JButton btnAnterior;
	JButton btnProximo;
	JButton btnUltimo;
	JComboBox cmbEscolha;

	public CardLayoutTest() {
		super("CardLayoutTest");
		initialize();
	}

	private JComboBox getCmbEscolha() {
		if (cmbEscolha == null) {
			cmbEscolha = new JComboBox();

			// Adiciona o nome dos painéis no combo box.
			for (Component c : getPnlCard().getComponents()) {
				cmbEscolha.addItem(c.getName());
			}

			cmbEscolha.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					((CardLayout) getPnlCard().getLayout()).show(getPnlCard(),
							(String) e.getItem());
				}
			});
		}
		return cmbEscolha;
	}

	private void initialize() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(getPnlCard(), BorderLayout.CENTER);
		getContentPane().add(getPnlBotoes(), BorderLayout.SOUTH); // adiciona os
		// botões na área inferior da janela
		pack();
	}

	private JPanel getPnlCard() {
		if (pnlCard == null) {
			pnlCard = new CardLayoutPanel();
		}
		return pnlCard;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CardLayoutTest().setVisible(true);
			}
		});
	}

	private JButton getBtnPrimeiro() {
		if (btnPrimeiro == null) {
			btnPrimeiro = new JButton("Primeiro");
			btnPrimeiro.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					((CardLayout) getPnlCard().getLayout()).first(getPnlCard());
				}
			});
		}
		return btnPrimeiro;
	}

	private JButton getBtnAnterior() {
		if (btnAnterior == null) {
			btnAnterior = new JButton("Anterior");
			btnAnterior.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					((CardLayout) getPnlCard().getLayout())
							.previous(getPnlCard());
				}
			});
		}
		return btnAnterior;
	}

	private JButton getBtnProximo() {
		if (btnProximo == null) {
			btnProximo = new JButton("Próximo");
			btnProximo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					((CardLayout) getPnlCard().getLayout()).next(getPnlCard());
				}
			});
		}
		return btnProximo;
	}

	private JButton getBtnUltimo() {
		if (btnUltimo == null) {
			btnUltimo = new JButton("Último");
			btnUltimo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					((CardLayout) getPnlCard().getLayout()).last(getPnlCard());
				}
			});
		}
		return btnUltimo;
	}

	private JPanel getPnlBotoes() {
		if (pnlBotoes == null) {
			pnlBotoes = new JPanel();
			pnlBotoes.add(getBtnPrimeiro());
			pnlBotoes.add(getBtnAnterior());
			pnlBotoes.add(getBtnProximo());
			pnlBotoes.add(getBtnUltimo());
		}
		return pnlBotoes;
	}

}
