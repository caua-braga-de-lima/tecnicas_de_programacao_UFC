package heranças;

public class Main 
{

	public static void main(String[] args) 
	{

		v.id = 0;
		Moto m = new Moto();
		Carro c = new Carro();
		
		c.nome = "carrinho";
		
		System.out.println("id: " + v.id + " nome: " + v.nome);
		System.out.println("MOTO: " + m.id + " nome: " + m.nome);
		System.out.println("CARRO: " + c.id + " nome: " + c.nome);
		
		c.acelerar();
		

	}

}
