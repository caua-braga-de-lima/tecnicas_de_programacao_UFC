package exercicios;

import java.util.Scanner;

public class Ex04 
{
	public static void divisao()
	{
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public static char[] consoantes(String vet[])
	{
		int tamanho2 = 0;
		for(int i = 0; i < vet.length; i++) 
		{
			for(int j = 0; j < vet[i].length(); j++)
			{
				if(vet[i].charAt(j) != 'a' && vet[i].charAt(j) != 'e' && vet[i].charAt(j) != 'i' && vet[i].charAt(j) != 'o' && vet[i].charAt(j) != 'u')
				{
					tamanho2++;
				}
			}
		}
		
		char letras2[] = new char[tamanho2];
		
		for(int i = 0, posicao = 0; i < vet.length; i++)
		{
			for(int j = 0; j < vet[i].length(); j++)
			{
				if(vet[i].charAt(j) != 'a' && vet[i].charAt(j) != 'e' && vet[i].charAt(j) != 'i' && vet[i].charAt(j) != 'o' && vet[i].charAt(j) != 'u')
				{
					letras2[posicao] = vet[i].charAt(j);
					posicao++;
				}				
			}	
		}
		
		return letras2;
	}
	
	public static char[] vogais(String vet[])
	{
		int tamanho = 0;
		for(int i = 0; i < vet.length; i++) 
		{
			for(int j = 0; j < vet[i].length(); j++)
			{
				if(vet[i].charAt(j) == 'a' || vet[i].charAt(j) == 'e' || vet[i].charAt(j) == 'i' || vet[i].charAt(j) == 'o' || vet[i].charAt(j) == 'u')
				{
					tamanho++;
				}
			}
		}
		
		char letras[] = new char[tamanho];
		
		for(int i = 0, posicao = 0; i < vet.length; i++)
		{
			for(int j = 0; j < vet[i].length(); j++)
			{
				if(vet[i].charAt(j) == 'a' || vet[i].charAt(j) == 'e' || vet[i].charAt(j) == 'i' || vet[i].charAt(j) == 'o' || vet[i].charAt(j) == 'u')
				{
					letras[posicao] = vet[i].charAt(j);
					posicao++;
				}				
			}	
		}
		
		return letras;
	}
	
	public static void main(String[] args) 
	{
		/*4) Criar um programa que receba um vetor com nomes e retorne quais
		 * letras são vogais e quais são as consoantes pra cada nome. Usar uma
		 * função que verifica se é uma vogal ou consoante*/
		
		System.out.print("Informe o tamanho do vetor: ");
		Scanner input = new Scanner(System.in);
		int tamanho = input.nextInt();
		String vet[] = new String[tamanho];
		
		for(int i = 0; i < vet.length; i++)
		{
			System.out.print("Digite o " + (i+1) + "° nome: ");
			vet[i] = input.next();
			vet[i].toLowerCase();
		}
		
		divisao();
		
		char vogais[] = vogais(vet);
		System.out.println("O VETOR DE VOGAIS É: ");
		
		for(int i = 0; i < vogais.length; i++)
		{
			System.out.print(vogais[i] + " ");
		}
		
		divisao();
		
		char consoantes[] = consoantes(vet);
		System.out.println("O VETOR DE CONSOANTES É: ");
		
		for(int i = 0; i < consoantes.length; i++)
		{
			System.out.print(consoantes[i] + " ");
		}
		
		input.close();
	}

}
