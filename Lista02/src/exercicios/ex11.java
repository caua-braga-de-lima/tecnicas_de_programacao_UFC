package exercicios;

public class ex11 
{
	public static void main(String[] args) 
	{
		/*11)Faça um programa que possa gerar uma segûencia como a seguinte.
	0 - 0
	0 - 1
	0 - 0
	0 - 1
	0 - 2
	1 - 0
	1 - 1
	1 - 0
	1 - 1
	1 - 2
	2 - 0
	2 - 1
	2 - 0
	2 - 1
	2 - 2
	3 - 0
	3 - 1
	3 - 0
	3 - 1
	3 - 2*/
		
		for(int esquerda = 0; esquerda <= 3; esquerda++)
		{
			for(int direita = 0; direita <= 1; direita++)
			{
				System.out.println(esquerda + " - " + direita);
				if(direita == 1)
				{
					for(direita = 0; direita <= 2; direita++)
					{
						System.out.println(esquerda + " - " + direita);
					}
				}
			}
		}
	}
}
