package exercicios;

import java.util.Scanner;

public class ex12 
{
	public static void divisao()
	{
		System.out.println(" ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" ");
	}
	public static void main(String[] args) 
	{
		/*12)Para cada item abaixo imprima as formas apresentadas. Permita que o
		usuário escolha o número de linhas e colunas desejado, para os itens
		abaixo foram utilizados com 6 linhas e 6 colunas. Porém,
		independentemente do número de linhas e colunas, as formas devem
		ser mantidas para cada item.*/
		
		// a)
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número de linhas e colunas: ");
		int linhas = entrada.nextInt();
		
		/* OBS: Nesse caso, não é viável variar o número de colunas, visto que a
		 * figura não manterá sua forma.*/
		
		for(int colunas = 1; colunas <= linhas; colunas++)
		{
			for(int i = 1; i <= colunas; i++)
			{
				System.out.print("*");
			}
			System.out.println(" ");	
		}
		
		divisao();
		
		// b)
		
		for(int colunas = 0; colunas < linhas; colunas++)
		{
			for(int i = 0; i < linhas; i++)
			{
				if((colunas + i + 1) == linhas|| (colunas == i))
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
			
		divisao();
		
		// c)
		
		for(int colunas = 0; colunas < linhas; colunas++)
		{
			for(int i = 0; i < linhas; i++)
			{
				if(colunas % 2 == 0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		
		divisao();
		
		// d)
		
		for(int colunas = 0; colunas < linhas; colunas++)
		{
			for(int i = 0; i < linhas; i++)
			{
				if(i == 0 || colunas + 1 == linhas || colunas == 0 || i + 1 == linhas)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		
		divisao();
		
		// e)
		
		for(int colunas = 0; colunas < linhas; colunas++)
		{
			for(int i = 0; i < linhas; i++)
			{
				if((i % 2) == 0 && (colunas >= (linhas/2)))
				{
					System.out.print("#");
				}
				if(colunas < (linhas/2))
				{
					System.out.print("*");
				}
				if(i % 2 != 0 && colunas >= (linhas/2))
				{
					System.out.print("$");
				}
			}
			System.out.print("\n");
		}
		
		entrada.close();
	}
}


