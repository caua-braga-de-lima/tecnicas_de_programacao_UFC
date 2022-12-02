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
	private int computerScore;
	private int playerScore;
	public int clickCounter;

	//METODO CONSTRUTOR - RECEBE UM GOL DE REFERENCIA PARA SORTEAR ALGUMAS DE SUAS CELULAS:
	public GoalKeeper(Goal goalPanel)
	{
		this.goalPanel = goalPanel;
		this.clickCounter = 0;
		
		for(GoalCell cell : this.goalPanel.getGoalCells())
		{
			cell.getButton().addActionListener(this);
		}

		actingArea = new ArrayList<GoalCell>();
	}

	//GETTERS E SETTERS:
	public Goal getGoalPanel() 
	{
		return goalPanel;
	}
	
	public int getComputerScore() 
	{
		return computerScore;
	}
	
	public int getPlayerScore() 
	{
		return playerScore;
	}
	
	public ArrayList<GoalCell> getActingArea() 
	{
		return actingArea;
	}
	
	//METODO - SOMA 1 A PONTUACAO DO COMPUTADOR:
	public void setComputerScore() 
	{
		this.computerScore++;
	}


	//METODO - SOMA 1 A PONTUACAO DO JOGADOR:
	public void setPlayerScore() 
	{
		this.playerScore++;
	}
	
	//METODO - RESETA O PLACAR:
	public void resetScoreBoard()
	{
		this.playerScore = 0;
		this.computerScore = 0;
	}

	//METODO - SORTEIA A CELULA DA MAO DIREITA E A CELULA DA MAO ESQUERDA:
	public void getHands() 
	{
		Random drawer = new Random();
		
		do
		{
			this.leftHand = new GoalCell(drawer.nextInt(0, 10), drawer.nextInt(0, 19), new ButtonClass().newButton(null, false), null, true);
			
			this.rightHand = new GoalCell(drawer.nextInt(0, 10), drawer.nextInt(0, 19), new ButtonClass().newButton(null, false), null, true);
			
		}while(this.leftHand.getYPosition() > this.rightHand.getYPosition());	
	}
	

	//METODO - SORTEIA A CELULA DO PE COM BASE NAS POSICOES DA MAO DIREITA E MAO ESQUERDA:
	public void getFoot() 
	{
		Random drawer = new Random();
		this.foot = new GoalCell(8, drawer.nextInt(this.leftHand.getYPosition(), this.rightHand.getYPosition() + 1), new ButtonClass().newButton(null, false), null, true);
	}
	
	//METODO - SELECIONA AS CELULAS QUE FARAO PARTE DA AREA DE ATUACAO COM BASE NAS 3 CELULAS JA SORTEADAS:
	public void getArea()
	{
		this.getHands();
		this.getFoot();
		
		for(GoalCell cell : goalPanel.getGoalCells())
		{
			if(cell.getXPosition() >= this.leftHand.getXPosition() && cell.getYPosition() >= this.leftHand.getYPosition() && cell.getYPosition() <= this.rightHand.getYPosition())
			{
				cell.isGoalKeeper = true;
				this.actingArea.add(cell);
			}
			if(cell.getXPosition() == 8 && cell.getYPosition() == foot.getYPosition())
			{
				cell.isGoalKeeper = true;
				this.actingArea.add(cell);
			}
			else
			{
				cell.isGoalKeeper = false;
			}
		}
	}
	
	//METODO - DESTACA A AREA NO PAINEL DO GOL:
	public void toQuoteActingArea() 
	{
		this.getArea();
		for(GoalCell cell2 : this.actingArea)
		{
			customAreaIcon(cell2);
		}
		this.getScore();	
	}
	
	//METODO AUXILIAR - MUDA A COR DAS CELULAS DA AREA DO GOLEIRO E ADICIONA OS ICONES AS CELULAS DA MAO E DO PE:
	public void customAreaIcon(GoalCell cell2) 
	{
		if(cell2.getXPosition() == leftHand.getXPosition() && cell2.getYPosition() == leftHand.getYPosition())
		{
			cell2.getButton().setIcon(new ImageIcon(new ImageIcon("img/leftHand.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
			cell2.getButton().setBackground(Color.YELLOW);
		}
		else if(cell2.getXPosition() == rightHand.getXPosition() && cell2.getYPosition() == rightHand.getYPosition())
		{
			cell2.getButton().setIcon(new ImageIcon(new ImageIcon("img/rightHand.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
			cell2.getButton().setBackground(Color.YELLOW);
		}
		else if(cell2.getXPosition() == 8 && cell2.getYPosition() == foot.getYPosition())
		{
			cell2.getButton().setIcon(new ImageIcon(new ImageIcon("img/foot.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
			cell2.getButton().setBackground(Color.YELLOW);
		}
		else
		{
		cell2.getButton().setBackground(Color.YELLOW);	
		}
	}
	
	//METODO - RESETA A AREA DE ATUACAO:
	public void toResetActingArea() 
	{
		for(GoalCell cell : this.goalPanel.getGoalCells())
		{
			cell.isGoalKeeper = false;
			cell.toCustomButton();
			cell.getButton().setIcon(null);
		}
		this.actingArea.removeAll(actingArea);		
	}	
	
	//METODO - CONTROLA OS CLIQUES PARA O INICIO DE UMA NOVA JOGADA:
	public void clickControlling() 
	{
		if(this.clickCounter != 0)
		{
			for(GoalCell cell : this.goalPanel.getGoalCells())
			{
				cell.getButton().isOn = false;
			}
		}
		else
		{
			toQuoteActingArea();
			this.clickCounter++;
			
			for(GoalCell cell : this.goalPanel.getGoalCells())
			{
				GoalCell.clickCounter = 0;
			}
		}
	}
	
	//METODO - CALCULA A PONTUACAO DO JOGADOR E DO COMPUTADOR:
	public void getScore()
	{
		GoalCell auxCell = new GoalCell();
		for(GoalCell cell : this.goalPanel.getGoalCells())
		{
			if(cell.event != null)
			{
				auxCell = cell;
			}
		}
		verifyScore(auxCell);
	}

	//METODO AUXILIAR - VERIFICA A OCORRENCIA DE UM GOL OU DE UMA DEFESA:
	public void verifyScore(GoalCell cell) 
	{
		if(this.actingArea.contains(cell) || cell.getSection() == GoalSection.OUT || cell.getSection() == GoalSection.POST)	
		{
			this.setComputerScore();
		}
		else
		{
			this.setPlayerScore();
		}
	}

	//METODO DE EVENTO - REFERENTE AO CLIQUE DO USUARIO EM UMA CELULA DO GOL:
	public void actionPerformed(ActionEvent e) 
	{	
		Boolean check = false;
		
		for(GoalCell cell : this.goalPanel.getGoalCells())
		{
			if(cell.getButton().isOn == true)
			{
				check = true;
			}
		}
		
		if(check == true)
		{
			clickControlling();
		}	
	}	
}



	
	
	
