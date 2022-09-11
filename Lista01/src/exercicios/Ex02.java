package exercicios;

public class Ex02 
{
	public static void main(String[] args) 
	{
		/*2) Verifique se A é menor que 10, se verdade imprima: "A < 10", e 
		verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20". 
		Caso nenhumas das afirmação não seja verdadeira, imprima: "número não
		válido", (obs: apenas uma impressão é permitida na saída do programa).*/
		
// 		CASO 1:
		
//		int a = 5;
//		int b = 15;
		
//		CASO 2:
//			
//		int a = 15;
//		int b = 5;
		
//		CASO 3:
			
		int a = 15;
		int b = 20;
		
		if(a < 10)
		{
			System.out.println("A < 10");
		}
		else if((a+b) == 20)
		{
			System.out.println("A + B  == 20");
		}
		else
		{
			System.out.println("número não válido.");
		}
	}

}
