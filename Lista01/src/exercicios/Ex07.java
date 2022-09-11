package exercicios;

public class Ex07 
{
	public static void main(String[] args) 
	{
		/*7) Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
		verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
		afirmação não seja verdadeira, imprima: "número não válido".*/
		
//		CASO 1:
			
//		int a = 15;
//		int b = 5;
		
//		CASO 2:
			
		int a = 5;
		int b = 23892839;  /*NÃO IMPORTA O VALOR DE B*/
		
		
		if(a > 10)
		{
			if((a + b) == 20)
			{
				System.out.println("números válidos.");
			}
		}
		else
		{
			System.out.println("número não válido.");
		}
		
	}

}
