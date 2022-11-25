//CLASSE GOL - CORRESPONDE AO PAINEL DE CELULAS DO GOL;

package penaltyMania;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Goal extends JPanel /*implements ActionListener*/
{
	//ATRIBUTO - ARRAYLIST DE CELULAS DO GOL:
	private ArrayList<GoalCell> goalCells;
	public Boolean isOn;
	
	//METODO CONSTRUTOR - INICIA O ARRAYLIST E "CONSTROI" UM GOL 9 X 18:
	public Goal()
	{
		goalCells = new ArrayList<GoalCell>();
		this.isOn = false;
		goalFactory();	
	}
	
	//GETTERS E SETTERS:
	public ArrayList<GoalCell> getGoalCells() 
	{
		return goalCells;
	}

	public void setGoalCells(ArrayList<GoalCell> goalCells) 
	{
		this.goalCells = goalCells;
	}

	
	//METODO - RETORNA O GOL COMO UM PAINEL DE BOTOES:
	public JPanel getGoalPanel()
	{
		JPanel goalPanel = new JPanel();
		goalPanel.setLayout(new GridLayout(9, 18));
		
		for(GoalCell g: this.goalCells)
		{
			goalPanel.add(g.getButton());
		}
		
		return goalPanel;
	}
	
	//METODO - FABRICA DE GOL:
	public void goalFactory()
	{
		for(int i = 0; i < 9; i++)
		{
			getGoalMapping(i);
		}
	}

	//METODO - FAZ O MAPEAMENTO DO GOL:
	public void getGoalMapping(int i) 
	{
		for(int j = 0; j < 18; j++)
		{
			if(i == 0 || j == 0 || j == 17)
			{
				this.goalCells.add(new GoalCell(i, j, new ButtonClass().newButton(null, false), GoalSection.OUT, false));
			}
			
			else if(i == 1 || j == 1 || j == 16)
			{
				this.goalCells.add(new GoalCell(i, j, new ButtonClass().newButton(null, false), GoalSection.POST, false));
			}
			
			else
			{
				this.goalCells.add(new GoalCell(i, j, new ButtonClass().newButton(null, false), GoalSection.GOAL, false));
			}
		}
	}
}
