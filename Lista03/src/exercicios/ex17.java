package exercicios;

public class ex17 
{
	public static int[] explodir(int vet[])
	{
		int tamanho = 0;
		for(int i = 0; i < vet.length; i++)
		{
			tamanho += vet[i];
		}
		
		int novo_vet[] = new int[tamanho];
		
		int posicao = 0;
		int aux = 0;
		
		for(int i = 0; i < vet.length; i++)
		{
		
			while(aux < vet[i])
			{
					novo_vet[posicao] = vet[i];
					posicao++;
					aux++;
			}
			aux = 0;
		}
		
		return novo_vet;
	}
	public static void main(String[] args) 
	{
		/*17) Explosão: Sua função deverá receber um vetor e gerar um segundo vetor
		com os dados acrescidos. O número de cada posição do vetor de entrada
		corresponde ao número de elementos que devem ser gerados.*/
		
		// vetor exemplo:
		int vet[] = {2, 3, 2, 4, 3};
		int novo_vet[] = explodir(vet);
		
		System.out.println("O vetor explodido é: ");
		
		for(int i = 0; i < novo_vet.length; i++)
		{
			System.out.print(novo_vet[i] + " ");
		}
	}
}
