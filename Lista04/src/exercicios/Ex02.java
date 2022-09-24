package exercicios;

import java.util.Scanner;

public class Ex02 
{
	public static double aluguel(double preco, int opcao, String dia)
	{
		double precoFinal = 0;
		
		if(dia.equals("segunda") == true || dia.equals("terça") == true|| dia.equals("quinta") == true)
		{
			precoFinal = preco - (0.4*preco);
		}
	else if(dia.equals("quarta") == true|| dia.equals("sexta") == true|| dia.equals("sábado") == true|| dia.equals("sabado") == true|| dia.equals("domingo") == true)
		{
			precoFinal = preco;
		}
		
		if(opcao == 2)
		{
			precoFinal += (0.15*preco);
		}
		
		return precoFinal;
	}
	
	public static void main(String[] args) 
	{
		/*2) Um aluguel de ferramentas tem a seguinte regra para aluguel.
		● As segundas, terças e quintas: um desconto de 40% em cima do preço normal;
		● Às quartas, sextas, sábados e domingos: preço normal;
		● Aluguel de ferramentas comuns: preço normal e ferramentas novas: acréscimo de
		15% em cima do preço normal.*/
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Insira o valor do aluguel da ferramenta: R$");
		double preco = input.nextDouble();
		int opcao;
		do
		{
			System.out.println("Que tipo de ferramenta você deseja?" + "\n" + "[ 1 ] FERRAMENTA COMUM" + "\n" + "[ 2 ] FERRAMENTA NOVA");
			System.out.print("Sua opção: ");
			opcao = input.nextInt();
		}
		while(opcao != 1 && opcao != 2);
		
		System.out.print("Digite o tempo em dias que você precisará das ferramentas: ");
		int dias = input.nextInt();
		String dia[] = new String[dias];
		double precoTotal = 0;
		
		System.out.println("INSIRA OS DIAS DA SEMANA:");
		for(int i = 0; i < dias; i++)
		{
			do
			{
				System.out.print((i+1) + "° dia: ");
				dia[i] = input.next();
				dia[i] = dia[i].toLowerCase();
			}
			while(dia[i].equals("segunda") == false && dia[i].equals("terça") == false && dia[i].equals("quarta") == false && dia[i].equals("quinta") == false && dia[i].equals("sexta") == false && dia[i].equals("sábado") == false && dia[i].equals("sabado") == false && dia[i].equals("domingo") == false);
			
			precoTotal += aluguel(preco, opcao, dia[i]);
		}
		
		System.out.println("O preço total a ser pago pelo aluguel é R$" + precoTotal);
		input.close();		
	}

}
