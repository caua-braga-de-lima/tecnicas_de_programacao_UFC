package exercicios;

public class Ex05 
{
	public static void main(String[] args) 
	{
		/*5) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
		imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		imprima: "número não válido".*/
		
//		CASO 1:
	
//		int a = 15;
//		int b = 5;
		
//		CASO 2:
			
//		int a = 5;
//		int b = 15;
		
//		CASO 3:
			
		int a = 5;
		int b = 25;
				
		
		if((a > 10) || ((a+b) == 20))
		{
			System.out.println("número válido.");
		}
		else
		{
			System.out.println("número não válido.");
		}

	}

}
