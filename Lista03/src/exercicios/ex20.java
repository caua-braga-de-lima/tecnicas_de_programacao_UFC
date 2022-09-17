package exercicios;

public class ex20 
{
	public static void diferenciar(int vet1[], int vet2[])
	{
		int aux = 0;
		
		System.out.println("Os elementos que estão no vetor no primeiro vetor, mas não estão no segundo são:");
		for(int i = 0; i < vet1.length; i++)
		{
			aux = 0;
			for(int j = 0; j < vet2.length; j++)
			{
				if(vet1[i] != vet2[j])
				{
					aux++;
				}
			}
			if(aux == vet2.length)
			{
				System.out.print(vet1[i] + " ");
			}
		}
	}
	public static void main(String[] args) 
	{
		/*20) Diferença-A: são informados dois vetores (A e B) e o programa deverá
		mostrar todos elementos que estão no vetor A e não estão no vetor B;*/
		
		//vetores exemplo:
		int vet1[] =  {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		int vet2[] = {12, 11, 8, 25, 32, 65, 19, 20, -4, -19, -10, -6};
		
		diferenciar(vet1, vet2);
		
		
	}

}
