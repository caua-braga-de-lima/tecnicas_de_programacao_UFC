//CLASSE MENU - CORRESPONDE AO PAINEL CUJOS COMPONENTES SAO OS BOTOES DE INICIAR E FINALIZAR.

package penaltyMania;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Menu extends JPanel 
{
	//ATRIBUTO - RECEBE UM GOL DE REFERENCIA PARA TER CONTROLE SOBRE OS SEUS BOTOES.
	private Goal goal;
	private GoalKeeper goalKeeper;
	private ScoreDisplay score;
	
	//METODO - CONFIGURA OS ATRIBUTOS BASICOS DO PAINEL:
	public JPanel getMenu(Goal goal, GoalKeeper goalKeeper, ScoreDisplay score)
	{
		this.goal = goal;
		this.goalKeeper = goalKeeper;
		this.score = score;
		ButtonClass button = new ButtonClass();
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		getMenuInfo(button, buttonPanel);
		buttonPanel.setVisible(true);
		                                                                                                                      
		return buttonPanel;
	}

	//METODO - CONFIGURA A LEGENDA E OS BOTOES DO PAINEL:
	private void getMenuInfo(ButtonClass button, JPanel buttonPanel) 
	{
		JLabel label = new JLabel("Penalty Mania!");
		label.setForeground(Color.white);
		label.setFont(new Font("Google Sans", Font.BOLD, 20));
		buttonPanel.add(label);
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(new InitButton().getButton("Iniciar", goal));
		buttonPanel.add(new TryAgainButton().getButton("Tentar de Novo", goalKeeper));
		buttonPanel.add(new FinishButton().getButton("Finalizar", goal, score, goalKeeper));
	}


	
	
	
}
