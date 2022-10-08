package ex06;

public class Main 
{

	public static void main(String[] args) 
	{
		Elevador e = new Elevador();
		
		e.setCapacidade(3);
		e.setTotalAndares(5);
		
		e.entrar();
		
		System.out.println(e.getQuantpessoas());
		
		e.entrar();
		
		System.out.println(e.getQuantpessoas());
		
		e.sobe();
		
		System.out.println(e.getAndarAtual());

	}

}
