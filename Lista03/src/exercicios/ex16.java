package exercicios;

public class ex16 
{
	public static int[] polarizar(int vet[])
	{
		int tamanho = vet.length;
		int novo_vet[] = new int[tamanho];
		int posicao = 0;
		
		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i] % 2 != 0)
			{
				novo_vet[posicao] = vet[i];
				posicao++;
			}
		}
		
		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i] % 2 == 0)
			{
				novo_vet[posicao] = vet[i];
				posicao++;
			}
		}
		return novo_vet;
	}
	public static void main(String[] args) 
	{
		/*16) Polarização: Sua função deverá receber um vetor com números aleatórios.
		Os números ímpares devem ficar nas posições iniciais do vetor e os números
		pares nas posições finais.*/
		
		//vetor exemplo:
		int vet[] =  {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		int tamanho = vet.length;
		int novo_vet[] = new int[tamanho];
		novo_vet = polarizar(vet);
		
		System.out.println("O vetor polarizado é: ");
		for(int i = 0; i < tamanho; i++)
		{
			System.out.print(novo_vet[i] + " ");
		}
	}
}
