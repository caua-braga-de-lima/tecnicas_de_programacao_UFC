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

public class Menu extends JPanel implements ActionListener
{
	//ATRIBUTO - RECEBE UM GOL DE REFERENCIA PARA TER CONTROLE SOBRE OS SEUS BOTOES.
	private Goal goal;
	
	//METODO CONSTRUTOR - CONFIGURA OS ATRIBUTOS BASICOS DO PAINEL:
	public JPanel getMenu(Goal goal)
	{
		this.goal = goal;
		Button button = new Button();
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		getMenuInfo(button, buttonPanel);
		buttonPanel.setVisible(true);
		                                                                                                                      
		return buttonPanel;
	}

	//METODO - CONFIGURA A LEGENDA E OS BOTOES DO PAINEL:
	private void getMenuInfo(Button button, JPanel buttonPanel) 
	{
		JLabel label = new JLabel("Penalty Mania!");
		label.setForeground(Color.white);
		label.setFont(new Font("Google Sans", Font.BOLD, 20));
		buttonPanel.add(label);
		buttonPanel.setLayout(new FlowLayout());
	
		Button init = new Button();
		Button finish = new Button();
		JButton initButton = init.newButton("Iniciar", true);
		Button tAgain = new Button();
		initButton.addActionListener(this);
		buttonPanel.add(initButton);
		buttonPanel.add(finish.newButton("Finalizar", false));	
//		buttonPanel.add(new TryAgainButton(this));
	}	

	//METODO DE EVENTO - REFERENTE AO BOTAO INICIAR DO MENU:
	public void actionPerformed(ActionEvent e) 
	{
		for(GoalCell cell : this.goal.getGoalCells())
		{
			cell.getButton().isOn = true;
		}
		
	
	}
	
	
	
	
}
