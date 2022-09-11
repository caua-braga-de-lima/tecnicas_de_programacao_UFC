package exercicios;

public class Ex09 
{
	public static void main(String[] args) 
	{
		/*9) Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
		verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
		verdadeiras imprima: "número não válido".*/
		
//		CASO 1:
			
//		int a = 15;
//		int b = 5;
		
//		CASO 2:
			
//		int a = 5;
//		int b = 4343432; /*NÃO IMPORTA O VALOR DE B*/
		
//		CASO 3:
			
		int b = 25;
        int a = 9298392; /*NÃO IMPORTA O VALOR DE A*/
		
		if((a > 10) && ((a + b) == 20))
		{
			System.out.println("A + B == 20");
		}
		else
		{
			System.out.println("número não válido.");
		}

	}

}
