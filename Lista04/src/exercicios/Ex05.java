package exercicios;

import java.util.Scanner;

public class Ex05 
{
	public static void divisao()
	{
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public static int soma(int vet[])
	{
		int soma = 0;
		
		for(int i = 0; i < vet.length; i++)
		{
			soma += vet[i];
		}
		
		return soma;
	}
	
	public static int produto(int vet[])
	{
		int produto = 1;
		
		for(int i = 0; i < vet.length; i++)
		{
			produto *= vet[i];
		}
		
		return produto;
	}
	
	public static double media(int vet[])
	{
		int soma = 0;
		
		for(int i = 0; i < vet.length; i++)
		{
			soma += vet[i];
		}
		
		double media = soma / vet.length;
		
		return media;
	}
	
	
	public static void main(String[] args) 
	{
		/*5) Faça o seguinte programa:
		● Receba 3 vetores e mostre para cada vetor: a soma, o produto e a média dos
		elementos de cada vetor,
		● Depois gere um vetor que tenha a soma de todas as somas computadas, outro vetor
		com o produto de todas as produtos computados e por fim um terceiro que tenha
		todas as médias computadas.
		● Calcule a soma do vetor que contém todas as somas, calcule a média do vetor que
		contém todas as médias e calcule o produto do vetor que contém todos os produtos
		calculados.
		● Você deverá fazer essa questão com algumas funções e reaproveitar as funções
		criadas para ser utilizadas em partes distintas do algoritmo descrito nesta questão*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o tamanho dos vetores: ");
		int tamanho = input.nextInt();
		
		int vet1[] = new int[tamanho];
		
		divisao();
		
		System.out.println("1° VETOR: ");
		for(int i = 0; i < vet1.length; i++)
		{
			System.out.print((i+1) + "° POSIÇÃO: ");
			vet1[i] = input.nextInt();
		}
		
		divisao();
		
		int vet2[] = new int[tamanho];
		System.out.println("2° VETOR: ");
		for(int i = 0; i < vet1.length; i++)
		{
			System.out.print((i+1) + "° POSIÇÃO: ");
			vet2[i] = input.nextInt();
		}
		
		divisao();
		
		int vet3[] = new int[tamanho];
		System.out.println("3° VETOR: ");
		for(int i = 0; i < vet1.length; i++)
		{
			System.out.print((i+1) + "° POSIÇÃO: ");
			vet3[i] = input.nextInt();
		}
		
		divisao();
		
		System.out.println("A SOMA DO 1° VETOR É " + soma(vet1));
		System.out.println("A SOMA DO 2° VETOR É " + soma(vet2));
		System.out.println("A SOMA DO 3° VETOR É " + soma(vet3));
		System.out.println("O PRODUTO DO 1° VETOR É " + produto(vet1));
		System.out.println("O PRODUTO DO 2° VETOR É " + produto(vet2));
		System.out.println("O PRODUTO DO 3° VETOR É " + produto(vet3));
		System.out.println("A MÉDIA DO 1° VETOR É: " + media(vet1));
		System.out.println("A MÉDIA DO 2° VETOR É: " + media(vet2));
		System.out.println("A MÉDIA DO 3° VETOR É: " + media(vet3));
		
		divisao();
		
		int vetSoma[] = {soma(vet1), soma(vet2), soma(vet3)};
		System.out.println("O VETOR DE SOMAS DOS 3 VETORES É :");
		for(int i = 0; i < vetSoma.length; i++)
		{
			System.out.print(vetSoma[i] + " ");
		}
		
		divisao();
		
		int vetProduto[] = {produto(vet1), produto(vet2), produto(vet3)};
		System.out.println("O VETOR DE PRODUTOS DOS 3 VETORES É: ");
		for(int i = 0; i < vetProduto.length; i++)
		{
			System.out.print(vetProduto[i] + " ");
		}
		
		divisao();
		
		
		double vetMedia[] = {media(vet1), media(vet2), media(vet3)};
		System.out.println("O VETOR DE MÉDIAS DOS 3 VETORES É:");
		for(int i = 0; i < vetMedia.length; i++)
		{
			System.out.print(vetMedia[i] + " ");
		}
		
		divisao();
		
		
		int soma = 0;
		for(int i = 0; i < vetSoma.length; i++)
		{
			soma += vetSoma[i];
		}
		
		int produto = 1;
		for(int i = 0; i < vetProduto.length; i++)
		{
			produto *= vetProduto[i];
		}
		
		int somaMedia = 0;
		for(int i = 0; i < vetMedia.length; i++)
		{
			somaMedia += vetMedia[i];
		}
		
		double media = somaMedia / vetMedia.length;
		
		double vetTotal[] = {soma, produto, media};
		System.out.println("O VETOR COM A SOMA, PRODUTO E MÉDIA DOS VETORES ANTERIORES É:");
		for(int i = 0; i < vetTotal.length; i++)
		{
			System.out.print(vetTotal[i] + " ");
		}
		
		divisao();
		
		int somaFinal = 0;
		int produtoFinal = 1;
		
		for(int i = 0; i < vetTotal.length; i++)
		{
			somaFinal += vetTotal[i];
			produtoFinal *= vetTotal[i];
		}
		
		double mediaFinal = somaFinal / vetTotal.length;
		
		System.out.println("A SOMA DOS ELEMENTOS DO VETOR FINAL É " + somaFinal);
		System.out.println("O PRODUTO DOS ELEMENTOS DO VETOR FINAL É " + produtoFinal);
		System.out.println("A MÉDIA DOS ELEMENTOS DO VETOR FINAL É " + mediaFinal);
		
		input.close();
		
	}

}
