package exercicios;

import java.util.Scanner;

public class Ex06 
{
	public static int tempo(double massaInicial)
	{
		int tempoSeg = 0;
		while(massaInicial >= 0.5)
		{
			massaInicial /= 2;
			tempoSeg += 50;
		}
		
		return tempoSeg;
	}
	public static void main(String[] args) 
	{
		/*6) Um determinado material radioativo perde metade de sua massa a cada 50
		segundos. Dada a massa inicial, em gramas, fazer um programa em Java que
		calcule o tempo necessário para que essa massa se torne menor que 0,5 grama. O
		programa em Java deve escrever a massa inicial, a massa final e o tempo calculado
		em horas, minutos e segundos.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a massa inicial do material (em gramas): ");
		double massaInicial = input.nextDouble();
		int tempoSeg = tempo(massaInicial);
		int tempoMin = 0;
		
		for(int i = 1; i <= tempoSeg; i++)
		{
			if(tempoSeg >= 60)
			{
				tempoSeg -= 60;
				tempoMin ++;
			}
		}
		
		int tempoHora = 0;
		
		for(int i = 1; i <= tempoSeg; i++)
		{
			if(tempoMin >= 60)
			{
				tempoMin -= 60;
				tempoHora++;
			}
		}
		
		
		System.out.println(" ");
		
		System.out.println("O tempo total para a massa do material, que inicialmente era " + massaInicial + " gramas, tornar-se menor que 0.5 g é " + tempoHora + " horas, " + tempoMin + " minutos e " + tempoSeg + " segundos.");
		
		input.close();

	}

}
