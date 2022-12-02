//CLASSE REFERENTE AO BOTAO FINALIZAR DO MENU.
package penaltyMania;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class FinishButton extends JButton implements ActionListener{

	//ATRIBUTOS - RECEBE O GOLEIRO E O PAINEL DE PONTUACAO PARA TER CONTROLE SOBRE AMBOS:
	private GoalKeeper goalKeeper;
	public Boolean isOn;
	
	//METODO - RETORNA O BOTAO JA COM O ACTIONLISTENER:
	public JButton getButton(String text, Goal goalPanel, ScoreDisplay score, GoalKeeper goalKeeper)
	{
		this.goalKeeper = goalKeeper;
		ButtonClass button = new ButtonClass();
		button.setText(text);
		button.setBackground(Color.YELLOW);
		button.addActionListener(this);
		return button;	
	}

	//METODO DE EVENTO - RESETA O PLACAR E BLOQUEIA AS CELULAS DO GOL:
	public void actionPerformed(ActionEvent e) 
	{
		goalKeeper.resetScoreBoard();
		
		for(GoalCell cell : goalKeeper.getGoalPanel().getGoalCells())
		{
			cell.getButton().isOn = false;
		}	
	}

}