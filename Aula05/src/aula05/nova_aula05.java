package aula05;

public class nova_aula05 
{
	public static void ler_vetores(int numeros [])
	{
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println("Posição [" + i + "] = " + numeros[i]);
		}
	}
	
	public static void f1()
	{
		System.out.println("f1");
		f2();
	}
	
	public static void f2()
	{
		System.out.println("f2");
		f3();
	}
	
	public static void f3()
	{
		System.out.println("f3");
	}
	
	public static void main(String[] args) 
	{
//		for(int i = 0; i < 5; i++)
//		{
//			for(int j = 0; j <3; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		} 
		
		// o for aninhado simula o comportamento de uma matriz, sendo que o for 
		// de dentro faz referência às colunas e o for de fora, às linhas.
		
		
		// vetores em java
		
		// tipo nome []= new tipo[tamanho]
		
//		int [] numeros = new int[5];
//		
//		numeros[0] = 10;
//		numeros[1] = 20;
//		numeros[2] = 30;
//		numeros[3] = 40;
//		numeros[4] = 50;
//	
//		
//		ler_vetores(numeros);
		
		
		// funções recursivas
		
		f1();
		f2();
		f3();
		System.out.println("voltou pra main : )");
		
		// a função volta para a função que chamou ela.
		
		
		
		
		
		

	}

}
