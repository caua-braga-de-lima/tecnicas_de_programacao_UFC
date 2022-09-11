package exercicios;

import java.util.Scanner;

public class ex02 
{
	public static int pesquisa_indice(int vet[], int i)
	{
		for(int cont = 0; cont < vet.length; cont++)
		{
			if(i == cont)
			{
				return vet[cont];
			}
		}
		return 404;
	}
	public static void main(String[] args) 
	{
		/*2) Pesquisa por índice: Sua função deverá receber um vetor e retornar o elemento
			  do vetor por meio de um índice informado. Seu programa deverá tratar os casos em
			  que o índice não existe no vetor.*/
		
		// vetor exemplo:
		int []vet = {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o índice do vetor para ver seu elemento: ");
		int i = input.nextInt();
		int resposta = pesquisa_indice(vet, i);
		
		if(resposta == 404)
		{
			System.out.println("O vetor não possui esse índice : (");
		}
		else
		{
			System.out.println("O elemento da posição " + i + " é o " + pesquisa_indice(vet, i));
		}
		
		input.close();
		

	}

}
