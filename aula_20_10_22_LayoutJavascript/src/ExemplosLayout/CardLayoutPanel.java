package ExemplosLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class CardLayoutPanel   extends JPanel {
	CardLayout layout;
	public CardLayoutPanel() {
		 initialize();
		 }

		 private void initialize() {
		 layout = new CardLayout();
		 setLayout(layout);

		 JPanel pnlFlow = new JPanel(new FlowLayout());
		 pnlFlow.setName("Flow"); // especifica um nome para o painel
		 add(pnlFlow, pnlFlow.getName()); // adiciona o painel, passando o nome
	

		 JPanel pnlBorder = new JPanel(new BorderLayout());
		 pnlBorder.setName("Border");
		 add(pnlBorder, pnlBorder.getName());

		 JPanel pnlGrid = new JPanel(new GridLayout());
		 pnlGrid.setName("Grid");
		 add(pnlGrid, pnlGrid.getName());

		 JPanel pnlGridBag = new JPanel(new GridBagLayout());
		 pnlGridBag.setName("GridBag");
		 add(pnlGridBag, pnlGridBag.getName());
		 }

		
}

