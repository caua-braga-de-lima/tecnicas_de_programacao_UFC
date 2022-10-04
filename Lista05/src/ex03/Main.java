package ex03;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o raio do círculo: ");
		Círculo circulo = new Círculo(input.nextDouble());
		double op;
		
		do
		{
			System.out.println("A área do círculo é: " + circulo.area());
			System.out.println("O perímetro da circunferência é: " + circulo.circunferencia());
			System.out.println("Insira um valor em % para alterar o raio do círculo: (OU DIGITE 0 PARA ENCERRAR O PROGRAMA.");
			op = input.nextDouble();
			circulo.aumentarCirculo(op);
		}
		while(op != 0);
	
		
		
	}
		

}
