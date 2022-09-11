package exercicios;

import java.util.Scanner;

public class ex01 
{
	public static int pesquisa(int num, int vet[])
	{
		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i] == num)
			{
				return i;
			}
		}
		return -100;
	}
	public static void main(String[] args) 
	{
		/*1) Pesquisa: Sua função deverá receber um vetor e retornar se um dado elemento
		  está dentro do vetor informado. Caso o elemento esteja no vetor, retornar a posição
	  	  do elemento no vetor, caso não esteja, retornar -100*/
		
		// vetor exemplo:
		int []vet = {4, 5, 8, 3, 2, 1, 56, 49, 37, 82, 41, 13, 29, 12, 15};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor para ver se está no vetor: ");
		int num = input.nextInt();
		int resposta = pesquisa(num, vet);
		
		if(resposta == -100 )
		{
			System.out.println("ERRO -100");
			System.out.println("O valor informado não se encontra no vetor : (");
		}
		else
		{
			System.out.println("O valor " + num + " está no vetor e está na posição " + pesquisa(num, vet));
		}
		
		input.close();
		
		
		
		
		

	}

}
