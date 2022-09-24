package exercicios;

import java.util.Random;

public class Ex03 
{
	public static int[] posiMulti3(int vet[])
	{
		int tamanho = 0;
		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i] > 0 && vet[i] % 3 == 0)
			{
				tamanho++;
			}
		}
		
		int novo_vet[] = new int[tamanho];
				
		for(int i = 0, posicao = 0; i < vet.length; i++)
		{
			if(vet[i] > 0 && vet[i] % 3 == 0)
			{
				novo_vet[posicao] = vet[i];
				posicao++;
			}
		}
		
		return novo_vet;
	}
	
	public static int[] positivos(int vet[])
	{
		int tamanho = 0;
		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i] > 0 && vet[i] % 3!= 0)
			{
				tamanho++;
			}
		}
		
		int novo_vet[] = new int[tamanho];
				
		for(int i = 0, posicao = 0; i < vet.length; i++)
		{
			if(vet[i] > 0 && vet[i] % 3!= 0)
			{
				novo_vet[posicao] = vet[i];
				posicao++;
			}
		}
		
		return novo_vet;
	}
	
	public static int[] negMulti3(int vet[])
	{
		int tamanho = 0;
		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i] < 0 && vet[i] % 3 == 0)
			{
				tamanho++;
			}
		}
		
		int novo_vet[] = new int[tamanho];
				
		for(int i = 0, posicao = 0; i < vet.length; i++)
		{
			if(vet[i] < 0 && vet[i] % 3 == 0)
			{
				novo_vet[posicao] = vet[i];
				posicao++;
			}
		}
		
		return novo_vet;
	}
	
	public static int[] negativos(int vet[])
	{
		int tamanho = 0;
		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i] < 0 && vet[i] % 3 != 0)
			{
				tamanho++;
			}
		}
		
		int novo_vet[] = new int[tamanho];
				
		for(int i = 0, posicao = 0; i < vet.length; i++)
		{
			if(vet[i] < 0 && vet[i] % 3 != 0)
			{
				novo_vet[posicao] = vet[i];
				posicao++;
			}
		}
		
		return novo_vet;
	}
	
	public static int[] gerar()
	{
		int vet[] = new int[100];
		Random gerador = new Random();
		for(int i = 0; i < vet.length; i++)
		{
			vet[i] = gerador.nextInt(-100, 100);
		}
		
		return vet;
	}
	public static void divisao()
	{
		System.out.println(" ");
		System.out.println(" ");
	}
	public static void main(String[] args) 
	{
		/*3) Fazer um algoritmo que percorre um vetor de 100 números, calcular e escrever se
		cada número é positivo ou negativo, e múltiplo ou não de 3, ao mesmo tempo. Como
		Reposta: preencher os seguintes vetores
		a) Números positivos múltiplos de 3
		b) Números positivos não múltiplos de 3
		c) Números negativos múltiplos de 3
		d) Números negativos não múltiplos de 3*/
		
		int vet[] = gerar();
		
		System.out.println("VETOR DE 100 NÚMEROS:");
		for(int i = 0; i < vet.length; i++)
		{
			System.out.print(vet[i] + " ");
		}
		
		divisao();
		
		System.out.println("VETOR DE POSITIVOS E MÚLTIPLOS DE 3:");
		
		int vet2[] = posiMulti3(vet);
		for(int i = 0; i < vet2.length; i++)
		{
			System.out.print(vet2[i] + " ");
		}
		
		divisao();
		
		System.out.println("VETOR DE POSITIVOS NÃO MÚLTIPLOS DE 3:");
		int vet3[] = positivos(vet);
		for(int i = 0; i < vet3.length; i++)
		{
			System.out.print(vet3[i] + " ");
		}
		
		divisao();
		
		System.out.println("VETOR DE NEGATIVOS E MÚLTIPLOS DE 3:");
		int vet4[] = negMulti3(vet);
		for(int i = 0; i < vet4.length; i++)
		{
			System.out.print(vet4[i] + " ");
		}
		
		divisao();
		
		System.out.println("VETOR DE NEGATIVOS E NÃO MÚLTIPLOS DE 3:");
		int vet5[] = negativos(vet);
		for(int i = 0; i < vet5.length; i++)
		{
			System.out.print(vet5[i] + " ");
		}
		
		
		
		
		
	}

}
