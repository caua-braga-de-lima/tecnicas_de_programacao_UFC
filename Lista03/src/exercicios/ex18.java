package exercicios;

public class ex18 
{
	public static int[] organizar(int vet[])
	{
		int aux = 0;
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
		
		return vet;
	}
	public static void main(String[] args) 
	{
		/*18) Organização: Sua função deverá receber um vetor e organizar os
		elementos a fim de que os elementos iguais fiquem próximos.*/
		
		// vetor exemplo:
		int vet[] = {1, 2, 3, 1, 2, 3, 4, 5};
		int novo_vet[] = organizar(vet);
		
		System.out.println("O vetor organizado é: ");
		for(int i = 0; i < novo_vet.length; i++)
		{
			System.out.print(novo_vet[i] + " ");
		}
	}

}
