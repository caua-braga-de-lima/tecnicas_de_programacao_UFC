package aula07;

import java.util.Random;

public class funçao_random 
{
	public static int pesquisar(int num, int vetor[])
	{
		for(int i = 0; i < vetor.length; i++)
		{
			if(vetor[i] == num)
				return i;
			else
				return -100;
		}
	}
	
	public static void gerarNumerosAleatorios()
	{
		Random aleatorio = new Random();
		for(int i = 0; i < 10; i++)
		{
			System.out.println(aleatorio.nextInt(10)); // escolhe numeros de 0 até 10
		}
	}
	
	public static String repetidos(int[ vet])
	{
		int cont;
		
		for()
	}
	public static void main(String[] args) 
	{
		
		
		gerarNumerosAleatorios();

	}

}
