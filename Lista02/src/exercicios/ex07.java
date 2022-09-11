package exercicios;

public class ex07 
{
	public static void main(String[] args) 
	{
		/*7) Imprima a saída:
		0 - 0
		1 - 3
		2 - 6
		...
		100 - 300*/
		
		int i = 0;
		int j = 0;
		for(; i <= 100 && j <= 300; i++, j += 3)
		{
			System.out.println(i + " - " + j + "\n");
		}
	}
}
