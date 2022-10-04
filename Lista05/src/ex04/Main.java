package ex04;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o nome do produto: ");
		Produto p = new Produto(input.next());
		
		System.out.print("Insira o preço de venda do produto: R$");
		p.precoVenda = input.nextDouble();
		
		System.out.print("Insira o preço de custo do produto: R$");
		p.precoCusto = input.nextDouble();
		
		System.out.print("Informe o valor das despesas da empresa: R$");
		p.despesas = input.nextDouble();
		
		System.out.println("A margem de lucro do produto é de " + p.calcMargemLucro() + "%");
	}

}
