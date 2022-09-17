package exercicios;

import java.util.Scanner;

public class ex19 
{
	public static void agrupar(int vet[], int agrupamentos)
	{
		int[][] mat = new int[agrupamentos][vet.length/agrupamentos]; 
		int posicao = 0;
		
		for (int i = 0; i < agrupamentos; i++) 
		{
			for (int j = 0; j < vet.length/agrupamentos; j++) 
			{
				mat[i][j] = vet[posicao];
				posicao++;
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		/*19) Agrupamento: Sua função deverá receber o número de agrupamento
		desejado e os elementos devem ser agrupado conforme o número de
		agrupamento informado.*/
		
		// vetor exemplo:
		int vet[] =  {12, 13, 14, 15, 16, 17, 18, 19, 20, -3, -4, -5, -6 ,-7};
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o número de agrupamentos: ");
		int tamanho = input.nextInt();
		
		agrupar(vet, tamanho);
		
		input.close();
	}

}
