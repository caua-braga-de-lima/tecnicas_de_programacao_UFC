package exercicios;

public class ex08 
{
	public static void priorizar(int vet[])
	{
		int soma = 0;
		for(int i = 0; i < vet.length; i++)
		{
			soma += vet[i];
		}
		
		int media = soma / vet.length;
		int tamanho = vet.length;
		int novo_vet[] = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++)
		{
			if(vet[i] > media)
			{
				novo_vet[i] = vet[i];
			}
		}
		
		System.out.println("VETOR 1:");
		
		for(int i = 0; i < vet.length; i++)
		{
			System.out.print(vet[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("VETOR 2: ");
		
		for(int i = 0; i < tamanho; i++)
		{
			System.out.print(novo_vet[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		/*8) Priorização: Sua função deverá receber um vetor e pegar os elementos do
		vetor e colocar em um segundo vetor. Os novos elementos devem ser
		colocados no segundo vetor apenas quando eles contribuam para a média
		dos segundo vetor aumentar.*/
		
		// vetor exemplo:
		int vet[] =  {1, 2, 3, 4, 5};
		
		priorizar(vet);
		
		
	}

}
