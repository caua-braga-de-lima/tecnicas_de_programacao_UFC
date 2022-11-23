//CLASSE CELULA DO GOL - REFERENTE A CADA QUADRADINHO INDIVIDUAL DO PAINEL DO GOL.

package penaltyMania;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class GoalCell extends Button implements ActionListener
{
	//ATRIBUTOS:
	private int XPosition;
	private int YPosition;
	private GoalSection section;
	private Button button;
	public Boolean isGoalKeeper;
	public int cont;
	
	//METODO CONSTRUTOR - CONFIGURAS OS ATRIBUTOS BASICOS E CUSTOMIZA O BOTAO DA CELULA:
	public GoalCell(int XPosition, int YPosition, Button b, GoalSection section, Boolean isGoalKeeper)
	{
		this.XPosition = XPosition;
		this.YPosition = YPosition;
		this.button = b;
		this.section = section;
		this.cont = 0;
		toCustomButton();
		b.addActionListener(this);
	}
	
	//GETTERS E SETTERS PARA OS ATRIBUTOS:
	public Button getButton() 
	{
		return button;
	}
	
	public int getXPosition() 
	{
		return XPosition;
	}

	public int getYPosition() 
	{
		return YPosition;
	}
	
	//METODO - MUDA A POSICAO X DE UMA CELULA EM UMA UNIDADE:
	public void setXPosition(int change) 
	{
		XPosition += change;;
	}
	
	//METODO - MUDA A POSICAO Y DE UMA CELULA EM UMA UNIDADE:
	public void setYPosition(int change) 
	{
		YPosition += change;
	}
	
	public GoalSection getSection() 
	{
		return section;
	}
	
	//METODO - CUSTOMIZA O BOTAO DA CELULA DE ACORDO COM A SUA SECAO NO GOL:
	public void toCustomButton()
	{
		if(this.section == GoalSection.OUT)
		{
			this.button.setBackground(Color.GREEN);
			this.button.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		}
		else if(this.section == GoalSection.POST)
		{
			this.button.setBackground(Color.WHITE);
			this.button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		}
		else if(this.section == GoalSection.GOAL)
		{
			this.button.setBackground(Color.GREEN);
			this.button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		}
	}
	
	//METODO DE EVENTO - REFERENTE AO CLIQUE DO USUARIO EM UMA CELULA DO GOL:
	public void actionPerformed(ActionEvent e) 
	{	
		if(this.cont == 0) //contador incrementa no metodo de area do goleiro
		{
			this.button.setIcon(new ImageIcon(new ImageIcon("img/Ball.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));	
			this.cont++;
		}

	}
	
	

}