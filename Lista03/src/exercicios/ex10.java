package exercicios;

public class ex10 
{
	public static void compactar(int vet[])
	{
		int tamanho = 0;
		for(int i = 0; i < (vet.length - 1); i++)
		{
			if(vet[i] != vet[i+1])
			{
				tamanho++;
			}
		}
		
		int novo_vet[] = new int[tamanho];
		int elemento = 0;
		
		for(int i = 0, indice = 0; i < (vet.length - 1); i++)
		{
			if(vet[i] == vet[i + 1])
			{
				elemento++;
			}
			else
			{
				novo_vet[indice] = elemento;
				elemento = 1;
				indice++;
			}
			if(i == vet.length - 2)
			{
				novo_vet[indice - 1] = elemento;
			}
		}
		
		System.out.println("O vetor compactado é: ");
		
		for(int i = 0; i < tamanho; i++)
		{
			if(i == 0)
			{
				System.out.print(novo_vet[i] + 1);
			}
			else
			{
				System.out.print(novo_vet[i]);
			}
			
			if(i % 2 == 0)
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print("1 ");
			}
		}
	}
	public static void main(String[] args) 
	{
		/*10) Compactação: Sua função deverá receber um vetor composto com uma
		sequência de zeros e uns e gerar um novo vetor compactado.
		A quantidade dos elementos repetidos devem ser contados e o número de
		ocorrências deve ser colocado logo após o elemento.*/
		
	   // vetor exemplo:
		int vet[] = {0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1,1};
		
		compactar(vet);

	}

}
