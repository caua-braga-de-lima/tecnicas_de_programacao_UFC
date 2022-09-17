package exercicios;

public class ex11 
{
	public static int[] descompactar(String[] vet)
	{
		int elementos[] = new int[vet.length];
		int quantidade[] = new int[vet.length];
		
		for(int i = 0; i < vet.length; i++)
		{
			elementos[i] = Integer.parseInt(String.valueOf(vet[i].charAt(0)));
			quantidade[i] = Integer.parseInt(vet[i].replaceFirst(String.valueOf(vet[i].charAt(0)), ""));
		}
		
		int novo_vet[] = new int[sum(quantidade)];
	}
	private static int sum(int[] quantidade) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) 
	{
		/*11) Descompactação: Sua função deverá receber um vetor e gerar um vetor
		descompactado. O número de repetições devem ser colocadas no novo vetor
		conforme o número indicado.
		Por exemplo: O vetor de entrada está indicado em verde e a saída está
		destacada em azul.*/
		
		// vetor exemplo:
		int vet[] = {09, 18, 016, 13, 12, 17};
		

	}
	/*public static int[] unpack(String[] array){
        int[] packedTerms       = new int[array.length];
        int[] packedTermsAmount = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            packedTerms[i] = Integer.parseInt(String.valueOf(array[i].charAt(0)));
            packedTermsAmount[i] = Integer.parseInt(array[i].replaceFirst(
                    String.valueOf(array[i].charAt(0)), ""));
        }

        int[] unpackedArray = new int[sum(packedTermsAmount)];

        for (int i = 0, j = 0, control = 0; j < packedTermsAmount.length; i++) {

            if (j % 2 == 0){
                unpackedArray[i] = (packedTerms[0] == 1)? 1:0;
            }
            else {
                unpackedArray[i] = (packedTerms[0] == 0)? 1:0;
            }
            control++;
            if (control == packedTermsAmount[j]){
                control = 0;
                j++;
            }

        }

        return unpackedArray;*/
    }
}
