package exercicios;

public class Ex03 
{
	public static void main(String[] args) 
	{
		/*3) Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
		se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
		se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
		impressões são permitidas na saída do programa).*/
		
//		CASO 1:

//		int a = 10;
//		int b = 10;
		
//		CASO 2:
		
		int a = 5;
		int b = 10;
		
		
		if(a == 10)
		{
			System.out.println("A == 10");
			if((a+b) == 20)
			{
				System.out.println("A + B == 20");
			}
		}
		
		if(b == 10)
		{
			System.out.println("B == 10");
		}

	}

}
