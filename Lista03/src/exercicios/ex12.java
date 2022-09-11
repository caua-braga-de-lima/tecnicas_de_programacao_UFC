package exercicios;

public class ex12 
{
	public static void criptografar(String [] vet)
	{
		for(int i = 0; i < vet.length; i++)
		{
			switch(vet[i])
			{
			case "a":
				vet[i] = "%";
				break;
			case "b":
				vet[i] = "*";
				break;
			case "c":
				vet[i] = "(";
				break;
			case "d":
				vet[i] = "-";
				break;
			case "e":
				vet[i] = "+";
				break;
			case "f":
				vet[i] = "@";
				break;
			case "g":
				vet[i] = "#";
				break;
			case "h":
				vet[i] = "1";
				break;
			case "i":
				vet[i] = "2";
				break;
			case "j":
				vet[i] = "3";
				break;
			case "l":
				vet[i] = "4";
				break;
			case "m":
				vet[i] = "5";
				break;
			case "n":
				vet[i] = "6";
				break;
			case "o":
				vet[i] = "7";
				break;
			case "p":
				vet[i] = "8";
				break;
			case "q":
				vet[i] = "9";
				break;
			case "r":
				vet[i] = "{";
				break;
			case "s":
				vet[i] = "}";
				break;
			case "t":
				vet[i] = "!";
				break;
			case "u":
				vet[i] = "&";
				break;
			case "v":
				vet[i] = "$";
				break;
			case "x":
				vet[i] = "?";
				break;
			case "z":
				vet[i] = ":";
				break;
			default:
				vet[i] = ";";
			}
		}
		
		System.out.println(" O vetor criptografado é: ");
		for(int i = 0; i < vet.length; i++)
		{
			System.out.print(vet[i] + " ");
		}
		
	}
	public static void main(String[] args) 
	{
		/*12) Criptografia: Sua função deverá criptografar os caracteres do vetor de
		strings segundo a lista abaixo. Desta forma todas as palavras no vetor deverão
		ser criptografadas.*/
		
		// vetor exemplo:
		String vet[] = {"p", "r", "o", "g", "r", "a", "m", "a", "r",  "e", "h",  "l", "e", "g", "a", "l"};
		
		criptografar(vet);
	}
}
