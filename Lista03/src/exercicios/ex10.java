package exercicios;

public class ex10 
{
	public static void compactar(int vet[])
	{
		int cont = 0;
		for(int i = 0; i < vet.length; i++)
		{
			if(vet[i] == 1)
			{
				cont++;
			}
		}
		
		int novo_vet[] = new int[cont];
		
		for(int i = 0; i < cont; i++)
		{
			
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
		

	}

}
