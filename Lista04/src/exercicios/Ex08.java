package exercicios;

import java.util.Scanner;

public class Ex08 
{
	public static void telefone(String[] simbolos, char[] numero)
	{
		for(int i = 0; i < numero.length; i++)
		{
			numero[i] = Character.toLowerCase(numero[i]);
			for(int j = 0; j < simbolos.length; j++)
			{
				if((simbolos[j].indexOf(numero[i])) != -1 )
				{
					if(i == 0)
					{
						System.out.print("(");
					}
					if(i == 3)
					{
						System.out.print(")");
					}
					System.out.print(simbolos[j].charAt(0));
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		/*8) Faça um programa em java que receba um número de telefone com letras e símbolos, e
		decodifique as letras para o número correspondente de acordo com a imagem. Por
		exemplo: 08899334GX##, se tornará: (088)993344911. Lembre-se de colocar os
		parênteses, para os três primeiros números que são o DDD.*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o código a ser convertido em número de telefone: ");
		
		String simbolos[] = {"0+","1#", "2abc", "3def", "4ghi", "5jkl", "6mno", "7pqrs", "8tuv", "9wxyz"};
		char numero[] = new char[12];
		
		for(int i = 0; i < numero.length; i++)
		{
			numero[i] = input.next().charAt(0);
		}
		
		telefone(simbolos, numero);
		input.close();

	}

}
