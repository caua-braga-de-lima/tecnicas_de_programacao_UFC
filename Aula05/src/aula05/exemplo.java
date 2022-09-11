package aula05;

public class exemplo 
{
	public static int teste(int numero) //toda fução que é chamada na main é ESTÁTICA
	{
		return numero;
	}
	
	public static int teste2(int numero)
	{
		numero++;
		return numero;
	}
	
	public static void imprimir_vetor(int numeros []) // passagem por referência
	{
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
	}
	
	public static void recursão1()
	{
		System.out.println("f1");
	}
	
	public static void recursão2()
	{
		System.out.println("f2");
	}
	
	public static void recursão3()
	{
		System.out.println("f3");
	}
	
	public static void main(String[] args) 
	{
//		for(int i = 5; i >= 0; i--)
//		{
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				System.out.println("*");
			}
		}
		
		
	
		
//		int numero = 10;
//		System.out.println("número na main: " + numero);
//		System.out.println("número na função: " + teste(numero));
//		System.out.println("número de retorno da função: " + teste2(numero));
		
		// vetores em java
		
//		int numeros [] = new int [5];
//		numeros[0] = 10;
//		numeros[1] = 20;
//		numeros[2] = 30;
//		numeros[4] = 40;
//		numeros[5] = 50;
//		
//		imprimir_vetor(numeros);
		
//		recursão1(); // a função retorna pra função que chamou ela
//		recursão2();
//		recursão3();
	}
}
