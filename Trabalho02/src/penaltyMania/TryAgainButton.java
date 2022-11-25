//CLASSE REFERENTE AO BOTAO TENTAR NOVAMENTE DO MENU.
package penaltyMania;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TryAgainButton extends JButton implements ActionListener
{
	//RECEBE O GOLEIRO COMO ATRIBUTO PARA TER CONTROLE SOBRE SUA ÁREA:
	private GoalKeeper goalKeeper;
	
	//METODO - RECEBE O NOME DO BOTAO E UM GOLEIRO E RETORNA O BOTAO COM O ACTIONLISTENER:
	public JButton getButton(String text, GoalKeeper goalKeeper)
	{
		ButtonClass button = new ButtonClass();
		button.setText(text);
		button.setBackground(Color.BLUE);
		button.addActionListener(this);
		this.goalKeeper = goalKeeper;
		
		return button;
	}
	
	//METODO DE EVENTO: RESETA A ATUAL AREA DO GOLEIRO E DESBLOQUEIA OS BOTOES DO GOL PARA UMA NOVA TENTATIVA:
	public void actionPerformed(ActionEvent e) 
	{
		goalKeeper.toResetActingArea();
		goalKeeper.clickCounter = 0;
		
		for(GoalCell cell : goalKeeper.getGoalPanel().getGoalCells())
		{
			GoalCell.clickCounter = 0;
			cell.getButton().isOn = true;
		}
	}
	
}

