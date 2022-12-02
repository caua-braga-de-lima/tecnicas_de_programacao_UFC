//CLASSE DISPLAY DO PLACAR - REFERENTE AO PAINEL DE PONTUACAO.
package penaltyMania;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import penaltyMania.GoalCell;
import penaltyMania.GoalKeeper;

public class ScoreDisplay extends JPanel implements ActionListener
{
	//ATRIBUTOS:
	private GoalKeeper goalKeeper;
	private JLabel compLabel;
	private JLabel playerLabel;
	
	//METODO - RETORNA O PAINEL DE PONTUACAO:
	public JPanel getScorePanel(GoalKeeper goalKeeper)
	{
		this.goalKeeper = goalKeeper;
		adActionListener(goalKeeper);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.setBackground(Color.BLACK);
		buttonPanel.setSize(300, 600);
		getPanelInfo(buttonPanel);
		return buttonPanel;
	}
	
	//METODO - ADICIONA O ACTIONLISTENER NAS CELULAS DO GOL:
	public void adActionListener(GoalKeeper goalKeeper) 
	{
		for(GoalCell cell : goalKeeper.getGoalPanel().getGoalCells())
		{
			cell.getButton().addActionListener(this);
		}
	}

	//METODO - CONFIGURA AS INFORMACOES DO PAINEL:
	public void getPanelInfo(JPanel buttonPanel) 
	{
		this.playerLabel = new JLabel();
		playerLabel.setText("JOGADOR: 0");
		playerLabel.setForeground(Color.WHITE);
		playerLabel.setFont(new Font("Google Sans", Font.BOLD, 20));
		buttonPanel.add(playerLabel, BorderLayout.WEST);
		this.compLabel = new JLabel();
		compLabel.setText("COMPUTADOR: 0");
		compLabel.setForeground(Color.WHITE);
		compLabel.setFont(new Font("Google Sans", Font.BOLD, 20));
		buttonPanel.add(compLabel, BorderLayout.EAST);
	}

	//METODO DE EVENTO - ATUALIZA A PONTUACAO DO JOGADOR E DO COMPITADOR DE ACORDO COM A JOGADA:
	public void actionPerformed(ActionEvent e) 
	{
		this.compLabel.setText("COMPUTADOR: " + goalKeeper.getComputerScore());
		this.playerLabel.setText("JOGADOR: " + goalKeeper.getPlayerScore());
	}
	
	
	
	
}

