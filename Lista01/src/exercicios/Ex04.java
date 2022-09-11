package exercicios;

public class Ex04 
{
	public static void main(String[] args) 
	{
		/*4) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
		imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
		diferentes de 10; A é menor que 10) caso não seja verdade imprima:
		"número não válido".*/
	
// 		CASO 1:
		
//		int a = 5;
//		int b = 15;
				
// 		CASO 2:
		
//		int a = 5;
//		int b = 5;
		
// 		CASO 3:
		
		int a = 5;
		int b = 20;
		
		if((a > 10) || ((a+b) == 20))
		{
			System.out.println("número válido.");
		}
		else if((a == b))
		{
			System.out.println("A é igual a B;");
			System.out.println("A e B são diferentes de 10;");
			System.out.println("A é menor que 10;");
		}
		else
		{
			System.out.println("número não válido.");
		}
	}

}
