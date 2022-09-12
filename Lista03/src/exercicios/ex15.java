package exercicios;

public class ex15 
{
	public static void complementar(int vet1[], int vet2[])
	{
		int tamanho = vet1.length;
		int novo_vet[] = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++)
		{
			novo_vet[i] = vet1[i] + vet2[i];
			if(novo_vet[i] != 10)
			{
				novo_vet[i] = (10 - novo_vet[i]);
			}
		}
		
		System.out.println("O terceiro vetor é: ");
		for(int i = 0; i < tamanho; i++)
		{
			System.out.print(novo_vet[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		/*15) Complementação: Sua função deverá receber dois vetores de números
		inteiros positivos e negativos. Ela deverá produzir um terceiro vetor em que
		cada índice desse vetor tenha um número que somado com elementos do
		mesmo índice dos vetores anteriores tenha a soma sempre igual a 10.*/
		
		//vetor exemplo:
		int vet[] =  {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		int vet2[] = {4, 5, 7, 8, 2, -3, -18, 17, 12, 13, 8, 9, 15, 10};
		
		complementar(vet, vet2);
	}

}
