package ex02;

public class Main 
{

	public static void main(String[] args) 
	{
		Pessoa albert = new Pessoa("Albert Eistein");
		
		albert.ajustarDatadeNascimento(14, 03, 1879);
		albert.calculaIdade(26, 9, 2022);

	}

}
