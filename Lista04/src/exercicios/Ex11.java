package exercicios;

import java.util.Scanner;

public class Ex11 
{
	public static void main(String[] args)
	{
		/*11) Em java, desenvolva um programa que gere uma matriz no sentido horário e
		imprima na tela. Essa matriz deve ser formada pelos números da sua matrícula. Por
		exemplo, com matrícula 494959, a matriz será da seguinte forma.*/
		
		int mat[][] = new int[3][2];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o número de matrícula: ");
		for(int i = 0, posicao = 0; i < 3; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print((posicao + 1) + "° DÍGITO: ");
				mat[i][j] = input.nextInt();
				posicao++;
			}
			posicao++;
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				if(j > i)
				{
					System.out.print(mat[i][j] + " ");
					System.out.println(" ");
				}
				else
				{
					System.out.print(mat[i][j] + " ");
				}
			}
		}

	}

}
