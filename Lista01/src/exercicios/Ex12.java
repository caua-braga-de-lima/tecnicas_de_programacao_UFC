package exercicios;

public class Ex12 
{
	public static void main(String[] args) 
	{
		/*12) Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
		B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
		verdadeiras, imprima: "números não válidos". Sejam as afirmações
		anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
		disciplina de Técnicas de Programação”.*/
		
//		CASO 1:
			
		int a = 15;
		int b = 5;
		
//		CASO 2:
			
//		int a = 5;
//		int b = 15;
		
//		CASO 3:
			
//		int a = 5;
//		int b= 25;
		
		if((a <= 10) && ((a + b) != 20))
		{
			System.out.println("números não válidos.");
		}
		else
		{
			if((a > 10))
			{
				System.out.println("A > 10");
			}
			
			if((a + b) == 20)
			{
				System.out.println("A + B == 20");
			}
		}
		
		
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação.");

	}

}
