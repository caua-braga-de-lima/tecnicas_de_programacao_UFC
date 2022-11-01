package heranças;

public class Main 
{

	public static void main(String[] args) 
	{
		Moto m = new Moto();
		Carro c = new Carro();
		Caminhao cacamba = new Caminhao();
		
		cacamba.nome = "caçamba";
		cacamba.id = 13;
		System.out.println(cacamba.acelerar());
		
		c.nome = "carrinho";
		m.nome = "motinha";
		
		System.out.println("MOTO: " + m.id + " nome: " + m.nome);
		System.out.println("CARRO: " + c.id + " nome: " + c.nome);
		System.out.println("CAMINHAO: " + cacamba.id + " nome: " + cacamba.nome);
		
		System.out.println(c.acelerar());
		

	}

}
