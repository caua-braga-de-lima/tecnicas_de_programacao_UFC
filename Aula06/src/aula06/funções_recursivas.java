package aula06;

public class funções_recursivas 
{
	public static void main(String[] args) 
	{
		public static int f1(int n) 
		{
			n++;
			if (n > 10)
				return 1;
			return f2();
		}

		public static int f2() 
		{
			return f1();
		}

		public static void main(String[] args) 
		{
			System.out.println(f(0));
		}
		
		/* a recursividade exige mais do computador do que a iteração, pois mais blocos
		de memória são alocados, enquanto na iteração, os blocos são automaticamente
		limpos*/
		
		// nova declaração de vetores:
		
		// int vetor[] = { valor1, valor2, valor3..., valor n};
}

}
