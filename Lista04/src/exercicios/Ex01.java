package exercicios;

import java.util.Scanner;

public class Ex01 
{
	public static double calcImposto(float salarioMin, float salario, int dependentes, float impostoPago)
	{
		double imposto = 0;
		if((salario / salarioMin) > 12)
		{
			imposto = salario * 0.2;
		}
		
		else if((salario / salarioMin) > 5)
		{
			imposto = salario * 0.08;
		}
		
		else if((salario / salarioMin) <= 5)
		{
			imposto = 0;
		}
		
		imposto -= dependentes * (0.02*imposto);
		imposto += imposto*0.04;
		imposto -= impostoPago;
		
		return imposto;
	}
	public static void main(String[] args) 
	{
		/*1) Desenvolver um algoritmo que determine o imposto de renda cobrado de um
		funcionário pelo governo. Seu programa deverá ler o valor do salário mínimo, o
		número de dependentes, o salário do funcionário e a taxa de imposto normal que já
		foi paga pelo funcionário.*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o valor do salário mínimo: R$");
		float salarioMin = input.nextFloat();
		System.out.print("Informe o número de dependentes: ");
		int dependentes = input.nextInt();
		System.out.print("Insira o valor do salário do funcionário: R$");
		float salario = input.nextFloat();
		System.out.print("Insira o valor do imposto normal já pago pelo usuário: R$");
		float impostoPago = input.nextFloat();
		
		System.out.println("O valor do imposto a ser pago é R$" + calcImposto(salarioMin, salario, dependentes, impostoPago));
		
		input.close();
	}

}
