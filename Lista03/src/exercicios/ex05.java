package exercicios;

public class ex05 
{
	public static void juntar(int vet1[], int vet2[])
	{
		int tamanho = vet1.length + vet2.length;
		int posicao = 0;
		int novo_vet[] = new int[tamanho];
		
		for(int i = 0; i < vet1.length; i++ )
		{
			novo_vet[i] = vet1[i];
			posicao++;
		}
		
		for(int j = 0; j < vet2.length; j++)
		{
			novo_vet[posicao] = vet2[j];
			posicao++;
		}
		
		
		for(int k = 0; k < novo_vet.length; k++)
		{
			System.out.print(novo_vet[k] + " ");
		}
		
	}
	public static void main(String[] args) 
	{
		/*5) Junção de vetor: Sua função deverá receber dois vetores de qualquer
		tamanho e retornar apenas um vetor que contenha os dois vetores. O
		primeiro vetor deverá ficar nas primeiras posições e o segundo vetor nas
		últimas posições.*/
		
		// vetor exemplo
		int vet1[] =  {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		int vet2[] = {9, 8, 7, 6, 5, 4, 12, 67, 89, 12, 24, 13};
		
		System.out.println("O vetor resultante é: ");
		juntar(vet1, vet2);
		
	}

}
