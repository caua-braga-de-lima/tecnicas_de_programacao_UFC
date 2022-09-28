package ex02;

public class Main 
{

	public static void main(String[] args) 
	{
		Pessoa albert = new Pessoa("Albert Eistein");
		
		albert.ajustarDatadeNascimento(14, 03, 1879);
		albert.calculaIdade(27, 9, 2022);
		
		Pessoa isaac = new Pessoa("Isaac Newton");
		
		isaac.ajustarDatadeNascimento(4, 1, 1643);
		isaac.calculaIdade(27, 9, 2022);
	}

}
