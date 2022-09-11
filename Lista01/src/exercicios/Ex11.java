package exercicios;

public class Ex11 
{
	public static void main(String[] args) 
	{
		/*11)Verifique se A é maior que 10 se não for verifique se A mais B é igual a
		20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
		for diferente de 20, imprima: "número não válido".*/
		
//		CASO 1:
			
//		int a = 15;
//		int b = 93483984; /*NÃO IMPORTA O VALOR DE B*/
		
//		CASO 2:
//			
//		int a = 5;
//		int b = 15;
		
//		CASO 3:
			
		int a = 5;
		int b = 25;
		
		if(a <= 10)
		{
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
