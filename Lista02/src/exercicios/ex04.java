package exercicios;

public class ex04 
{
	public static void main(String[] args) 
	{
		/* 4) Imprima a saída: {0,2,4,6,8 ... 100}*/
		
		int i = 0;
		for(; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " - ");
			}
		}
	}
}
