package exercicios;

public class ex06 
{
	public static void inverter(int vet[])
	{
		int tamanho = vet.length;
		int novo_vetor[] = new int[tamanho];
		for(int i = tamanho, index1 = 0; i > 0; i--, index1++)
		{
			novo_vetor[index1] = vet[i - 1];
		}
		
		for(int i = 0; i < novo_vetor.length; i++)
		{
			System.out.print(novo_vetor[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		/*6) Inversão de ordem: Sua função deverá retornar um vetor de ordem inversa.
		Desta forma, o primeiro elemento passa ser o último elemento do vetor, o
		segundo elemento passa ser o penúltimo, assim, sucessivamente;*/
		
		// vetor exemplo:
		int vet[] =  {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		
		System.out.println("O vetor na ordem inversa é: ");
		inverter(vet);
		

	}

}
