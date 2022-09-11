package exercicios;

public class ex09 
{
	public static void main(String[] args) 
	{
		/*9) Imprima a saída:
		0 - 33
		2 - 36
		4 - 39
		...
		26 - 72*/
		
		int i = 0;
		int j = 0;
		for(j = 33; i < 27 && j < 73; i += 2, j += 3)
		{
			System.out.println(i + " - " + j + "\n");
		}
		
	}
	
}
