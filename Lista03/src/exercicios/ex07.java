package exercicios;

public class ex07 
{
	public static void inverter(int vet1[], int vet2[])
	{
		int aux;
		for(int i = 0; i < vet1.length; i++)
		{
			aux = vet1[i];
			vet1[i] = vet2[i];
			vet2[i] = aux;
		}
		
		System.out.println("VETOR 1: ");
		for(int j = 0; j < vet1.length; j++)
		{
			System.out.print(vet1[j] + " ");
		}
		
		System.out.println(" ");
		
		System.out.println("VETOR 2: ");
		for(int k = 0; k < vet2.length; k++)
		{
			System.out.print(vet2[k] + " ");
		}
	}
	public static void main(String[] args) 
	{
		/*7) Inversão de vetores: Sua função deverá receber dois vetores. Sendo que
		os dados do primeiro vetor deve ser colocado no segundo vetor e os dados
		segundo vetor devem ser colocados no primeiro vetor.*/
		
		// vetor exemplo:
		int vet[] =  {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		int vet2[] = {9, 8, 7, 6, 5, 4, 12, 67, 89, 12, 24, 13, 25, 26};
		
		inverter(vet, vet2);

	}
}
