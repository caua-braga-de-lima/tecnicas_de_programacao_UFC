package exercicios;

public class Ex08 
{
	public static void main(String[] args) 
	{
		/*8) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
		for verdade: imprima "número não válido ".*/
		
//		CASO 1:
			
//		int a = 15;
//		int b = 5;
		
//		CASO 2:
			
		int a = 5;
		int b = 398293; /*NÃO IMPORTA O VALOR DE B*/
		
		if(a > 10)
		{
			System.out.println("A > 10");
			if((a + b) == 20)
			{
				System.out.println("A + B == 20");
			}
			else
			{
				System.out.println("número não válido.");
			}
		}

	}

}
