package ex03;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Círculo circulo = new Círculo(12);
		System.out.print("Informe o raio do círculo: ");
		circulo.raio = input.nextDouble();
		
		System.out.print("A área do círculo é: " + circulo.area());

	}

}
