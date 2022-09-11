package exercicios;

public class ex14 
{
	public static void contar(String [] vet)
	{
		int tamanho = vet.length;
		String repetidos[] = new String[tamanho];
		int cont[] = new int[tamanho];
		
		fora:
		for(int i = 0; i < vet.length; i++)
		{
			int j = 0;
			for(j = i + 1; j < vet.length; j++)
			{
				if(vet[i] == vet[j])
				{
					repetidos[i] = vet[i];
					cont[i]++;
					continue fora;
				}
			}
		}
			
			for(int i = 0; i < tamanho; i++)
			{
				if(repetidos[i] != null)
				{
					System.out.println("O elemento " + repetidos[i] + " se repete " + cont[i] + " vezes.");
				}
				
			}
		
		
	}
	public static void main(String[] args)
	{
		/*14) Contagem de caracteres: Sua função deverá contar os caracteres que
		aparecem no vetor. Os caracteres podem ser qualquer letra ou número do
		alfabeto.*/
		
		// vetor exemplo:
		String vet[] = {"a", "a", "b","c","3","3","5","a","c"};
		
		contar(vet);

	}

}
