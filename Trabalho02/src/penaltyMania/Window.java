//CLASSE JANELA - CORRESPONDE AO FRAME BASE DO PROGRAMA E HERDA OS ATRIBUTOS DA CLASSE JFRAME.

package penaltyMania;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame
{	
	
	//METODO CONSTRUTOR - CONFIGURA O TAMANHO E AS INFORMACOES BASICAS DA JANELA:
		public Window()
		{
			this.setSize(1200, 600);
			this.setTitle("Penalty Mania - Cauã Braga de Lima - 536094");
			setWindowLayout();
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);	
		}

		//METODO - CONFIGURA O LAYOUT DA JANELA E ADICIONA OS 3 PAINEIS PRINCIPAIS:
		public void setWindowLayout() 
		{
			this.setLayout(new BorderLayout());
			Goal goal = new Goal();
			GoalKeeper goalKeeper = new GoalKeeper(goal);
			Menu menu = new Menu();
			ScoreDisplay score = new ScoreDisplay();
			this.add(score.getScorePanel(goalKeeper), BorderLayout.SOUTH);
			this.add(menu.getMenu(goal, goalKeeper, score), BorderLayout.NORTH);
			this.add(goal.getGoalPanel(), BorderLayout.CENTER);
	

		}
}
