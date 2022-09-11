package exercicios;

public class Ex13 
{
	public static void main(String[] args)
	{
		/*13) Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
		verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
		Caso as afirmações não sejam verdadeiras, imprima: "números não
		válidos".*/
		
//		CASO 1:
			
//		int a = 15;
//		int b = 5;
		
//		CASO 2:
			
//		int a = 5;
//		int b = 15;
		
//		CASO 3:
			
		int a = 5;
		int b = 25;
			
		
		if((a <= 10) && ((a + b) != 20))
		{
			System.out.println("números não válidos.");
		}
		else
		{
			if(a > 10)
			{
				System.out.println("A > 10");
			}
			
			if((a + b) == 20)
			{
				System.out.println("A + B == 20");
			}
		}

	}

}
