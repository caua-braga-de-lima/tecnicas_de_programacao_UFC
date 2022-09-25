package exercicios;

import java.util.Scanner;

public class Ex07 
{
	public static char[] reverter(String string)
	{
		char revertido[] = new char[string.length()];
		
		for(int i = 0, j = (string.length() - 1); j >= 0; i++, j--)
		{
			revertido[i] = string.charAt(j);
		}
		
		return revertido;
	}
	public static void main(String[] args) 
	{
		/*7) Escreva um programa Java para reverter uma string sem usar o método reverse da
		classe String.*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira uma String: ");
		String string = input.nextLine();
		
		char revertido[] = reverter(string);
		
		System.out.print("A String invertida é: ");
		for(int i = 0; i < revertido.length; i++)
		{
			System.out.print(revertido[i]);
		}
		
		input.close();
	}

}
