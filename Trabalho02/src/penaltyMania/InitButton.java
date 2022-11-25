//CLASSE REFERENTE AO BOTAO INICIAR DO MENU:
package penaltyMania;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class InitButton extends JButton implements ActionListener
{
	//ATRIBUTOS - RECEBE UM GOL DE REFERENCIA PARA TER CONTROLE SOBRE SUAS CELULAS:
	private Goal goalPanel;
	public Boolean isOn;
	
	//METODO - RETORNA O BOTAO JA COM O ACTIONLISTENER:
	public JButton getButton(String text, Goal goalPanel)
	{
		JButton button = new JButton();
		button.setText(text);
		button.setBackground(Color.GREEN);
		button.addActionListener(this);
		this.goalPanel = goalPanel;
		return button;
	}
	
	//METODO DE EVENTO - DESBLOQUEIA TODAS AS CELULAS DO GOL:
	public void actionPerformed(ActionEvent e) 
	{
		for(GoalCell cell : this.goalPanel.getGoalCells())
		{
			cell.getButton().isOn = true;
		}
	}

}
