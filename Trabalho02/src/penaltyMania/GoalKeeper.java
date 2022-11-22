//CLASSE GOLEIRO - REFERENTE AO CONJUNTO DE CELULAS DO GOL QUE CORRESPONDEM A AREA DE DEFESA.

package penaltyMania;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.ImageIcon;

public class GoalKeeper implements ActionListener
{
	//ATRIBUTOS:
	private GoalCell leftHand;
	private GoalCell rightHand;
	private GoalCell foot;
	private ArrayList<GoalCell> actingArea;
	private Goal goalPanel;
	private int cont;

	//METODO CONSTRUTOR - RECEBE UM GOL DE REFERENCIA PARA SORTEAR ALGUMAS DE SUAS CELULAS:
	public GoalKeeper(Goal goalPanel)
	{
		this.goalPanel = goalPanel;
		this.cont = 0;
		
		for(GoalCell cell : this.goalPanel.getGoalCells())
		{
			cell.getButton().addActionListener(this);
		}
		
		Random drawer = new Random();
		getHands(goalPanel, drawer);
		getFoot(goalPanel, drawer);
		getArea();
	}

	//METODO - SORTEIA A CELULA DA MAO DIREITA E A CELULA DA MAO ESQUERDA:
	public void getHands(Goal goalPanel, Random drawer) 
	{
		do
		{
			this.leftHand = new GoalCell(drawer.nextInt(0, 10), drawer.nextInt(0, 19), new Button().newButton(null, false), null, true);
			
			this.rightHand = new GoalCell(drawer.nextInt(0, 10), drawer.nextInt(0, 19), new Button().newButton(null, false), null, true);
			
		}while(this.leftHand.getYPosition() > this.rightHand.getYPosition());
		
		
		System.out.println("mao esquerda: " + this.leftHand.getXPosition() + ", " + this.leftHand.getYPosition());
		System.out.println("mao direita: " + this.rightHand.getXPosition() + ", " + this.rightHand.getYPosition());
		
	}
	

	//METODO - SORTEIA A CELULA DO PE COM BASE NAS POSICOES DA MAO DIREITA E MAO ESQUERDA:
	public void getFoot(Goal goalPanel, Random drawer) 
	{
		this.foot = new GoalCell(8, drawer.nextInt(this.leftHand.getYPosition(), this.rightHand.getYPosition() + 1), new Button().newButton(null, false), null, true);
		
		System.out.println("pe: " + this.foot.getXPosition() + ", " + this.foot.getYPosition());
	}
	
	//METODO - SELECIONA AS CELULAS QUE FARAO PARTE DA AREA DE ATUACAO COM BASE NAS 3 CELULAS JA SORTEADAS:
	public void getArea()
	{
		ArrayList<GoalCell> actingArea = new ArrayList<GoalCell>();
		
		for(GoalCell cell : goalPanel.getGoalCells())
		{
			if(cell.getXPosition() >= leftHand.getXPosition() && cell.getYPosition() >= leftHand.getYPosition() && cell.getYPosition() <= rightHand.getYPosition())
			{
				cell.isGoalKeeper = true;
				actingArea.add(cell);
				
				if(cell.getXPosition() == 8 && cell.getYPosition() == foot.getYPosition())
				{
					cell.isGoalKeeper = true;
					actingArea.add(cell);
				}
			}
			else
			{
				cell.isGoalKeeper = false;
			}
		}
		
		this.actingArea = actingArea;
	}
	
	public void toResetActingArea() 
	{
		for(GoalCell cell : this.goalPanel.getGoalCells())
		{
			if(cell.isGoalKeeper == true)
			{
				cell.toCustomButton();
				this.actingArea.remove(cell);	
			}
			
		}
	}
	
	public void toQuoteActingArea() 
	{
		for(GoalCell cell : this.goalPanel.getGoalCells())
		{
			if(cell.getButton().isOn == true)	
			{
					this.getArea();
					for(GoalCell cell2 : this.actingArea)
					{
						cell2.getButton().setBackground(Color.RED);				
					}
			}
		}
	}

	//METODO DE EVENTO - REFERENTE AO CLIQUE DO USUARIO EM UMA CELULA DO GOL:
	public void actionPerformed(ActionEvent e) 
	{		
		if(this.cont >= 1)
		{
			toResetActingArea();
			toQuoteActingArea();
			this.cont++;
		}
		else
		{
			toQuoteActingArea();
			this.cont++;
		}
		
	}


	
		
		
		
		
	
	
	

	
}
