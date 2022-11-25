//CLASSE CELULA DO GOL - REFERENTE A CADA QUADRADINHO INDIVIDUAL DO PAINEL DO GOL.

package penaltyMania;
import java.awt.Button;
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
	private ButtonClass button;
	public ActionEvent event;
	public Boolean isGoalKeeper;
	public static int clickCounter;
	
	//METODO CONSTRUTOR - CONFIGURAS OS ATRIBUTOS BASICOS E CUSTOMIZA O BOTAO DA CELULA:
	public GoalCell(int XPosition, int YPosition, ButtonClass b, GoalSection section, Boolean isGoalKeeper)
	{
		this.XPosition = XPosition;
		this.YPosition = YPosition;
		this.button = b;
		this.section = section;
		toCustomButton();
		b.addActionListener(this);
	}
	
	//METODO CONSTRUTOR AUXILIAR:
	public GoalCell()
	{
		
	}
	
	//GETTERS E SETTERS PARA OS ATRIBUTOS:
	public ButtonClass getButton() 
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
		if(this.button.isOn == true)
		{
			this.event = e;
			if(GoalCell.clickCounter == 0)
			{
				this.button.setIcon(new ImageIcon(new ImageIcon("img/ball.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));	
				GoalCell.clickCounter++;
			}
		}
	}
}