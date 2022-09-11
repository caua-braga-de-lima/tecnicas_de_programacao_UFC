package exercicios;

public class ex03 
{
	public static void separacao(int vet[])
	{
		int aux;
		
		for(int i = 0; i < vet.length; i++)
		{
			for(int j = i+1; j < vet.length; j++)
			{
				if(vet[i] >= vet[j])
				{
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		/*3) Separação de valores positivos e negativos: Sua função deverá receber um vetor e 
			  deverá colocar nesse vetor os números negativos  nas primeiras posições e os números
			  negativos nas últimas posições.*/
		
		// vetor exemplo
		int vet[] =  {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		separacao(vet);
		
		System.out.println("O vetor na ordem crescente é: ");
		
		for(int i = 0; i < vet.length; i++)
		{
			System.out.print(vet[i] + " ");
		}

	}

}
