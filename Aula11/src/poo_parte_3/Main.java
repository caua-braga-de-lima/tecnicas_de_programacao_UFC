package poo_parte_3;

public class Main 
{
	public static void main(String[] args) 
	{
		Carro ferrari = new Carro(12, "ABC");
		
		ferrari.getId();
		
		ferrari.setId(10);
		
		System.out.println(ferrari.getId());
		
		ferrari.motor.nome = "V8"; // ORDEM HIERÁRQUICA - nome do motor do carro.
		

	}

}
