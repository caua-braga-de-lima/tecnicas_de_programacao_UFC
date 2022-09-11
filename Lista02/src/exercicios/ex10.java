package exercicios;

import java.util.Scanner;

public class ex10 
{
	public static void main(String[] args) 
	{
		/*10) Faça um programa que possa exibir uma sequência como a abaixo,
		 * sendo o teto dos pares da esquerda e direita informados pelo usuário.
		 * Exemplo: com pares da esquerda e direita com o teto de 2 unidades
		 * 
		 * 0 - 0
		 * 0 - 1
		 * 0 - 2
		 * 1 - 0
		 * 1 - 1
		 * 1 - 2
		 * 2 - 0
		 * 2 - 1
		 * 2 - 2
		 * 3 - 0
		 * 3 - 1
		 * 3 - 2
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o teto da esquerda: ");
		int teto_esquerda = entrada.nextInt();
		System.out.print("Digite o teto da direita: ");
		int teto_direita = entrada.nextInt();
		
		for(int i = 0; i <= teto_esquerda; i++)
		{
			for(int j = 0; j <= teto_direita; j++)
			{
				System.out.print(i + " - " + j);
				System.out.println(" ");
			}
		}
		entrada.close();
	}
}
