package exercicios;

public class ex13 
{
	public static void descriptografar(String [] vet)
	{
		for(int i = 0; i < vet.length; i++)
		{
			switch(vet[i])
			{
			case "%":
				vet[i] = "a";
				break;
			case "*":
				vet[i] = "b";
				break;
			case "(":
				vet[i] = "c";
				break;
			case "-":
				vet[i] = "d";
				break;
			case "+":
				vet[i] = "e";
				break;
			case "@":
				vet[i] = "f";
				break;
			case "#":
				vet[i] = "g";
				break;
			case "1":
				vet[i] = "h";
				break;
			case "2":
				vet[i] = "i";
				break;
			case "3":
				vet[i] = "k";
				break;
			case "4":
				vet[i] = "l";
				break;
			case "5":
				vet[i] = "m";
				break;
			case "6":
				vet[i] = "n";
				break;
			case "7":
				vet[i] = "o";
				break;
			case "8":
				vet[i] = "p";
				break;
			case "9":
				vet[i] = "q";
				break;
			case "{":
				vet[i] = "r";
				break;
			case "}":
				vet[i] = "s";
				break;
			case "!":
				vet[i] = "t";
				break;
			case "&":
				vet[i] = "u";
				break;
			case "$":
				vet[i] = "v";
				break;
			case "?":
				vet[i] = "x";
				break;
			case ":":
				vet[i] = "z";
				break;
			default:
				vet[i] = ";";
			}
		}
			
			System.out.println(" O vetor descriptografado é: ");
			for(int i = 0; i < vet.length; i++)
			{
				System.out.print(vet[i] + " ");
			}
	}
	public static void main(String[] args) 
	{
		/*13) Descritografia. Sua função deverá descriptografar os caracteres do vetor
		de strings segundo a lista apresentada na questão anterior.*/
		
		// vetor exemplo:
		String vet[] = {"8", "{", "7", "#", "{", "%", "5", "%", "{", "+", "1", "4", "+", "#", "%", "4"};
		
		descriptografar(vet);
	}

}
