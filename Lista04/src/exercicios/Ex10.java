package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 
{
	public static int verificar(ArrayList<Character> numero)
	{
		int resultado = 0;
		for(int posicao : numero)
		{
			resultado += posicao^(numero.size());
		}
		
		int num = 0;
		for(int posicao : numero)
		{
			num = (int)posicao;
		}
		
		if(resultado == num)
		{
			return resultado;
		}
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		/*10) O conceito da Álgebra para um número de Armstrong diz que: é um número de n
		dígitos que é igual a soma de cada um dos seus dígitos elevado a n-ésima potência .
		Por exemplo, 153 (n = três dígitos) é igual a 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
		Faça um programa em Java que verifique se um número, de n dígitos, é um número de
		Armstrong.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número para saber se é um número de Armstrong: ");
		ArrayList<Character> numero = new ArrayList<>();
		
		for(Character posicao : numero)
		{
			posicao = input.next().charAt(0);
			numero.add(posicao);
		}
		
		System.out.println(" ");
		
		if(verificar(numero) == -1)
		{
			System.out.print("O número informado NÃO é um número de Armstrong.");
		}
		else
		{
			System.out.println("O número informado É um número de Armstrong.");
		}
		
		input.close();
		

	}

}
