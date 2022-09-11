package exercicios;

public class ex08 {
	public static void main(String[] args) 
	{
		/*8) Imprima a saída:
		0 - 100
		1 - 99
		2 - 98
		...
		49 - 51*/
		
		int i = 0;
		int j = 0;
		for(j = 100; i < 50 && j >= 51; i++, j--)
		{
			System.out.println(i + " - " + j + "\n");
		}
	}
}
