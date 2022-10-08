package Polimorfismo;

public class Enfermeiro extends Medico implements Obrigaçoes // uma classe filha nunca pode fazer mais do que a classe pai!
{

	public void realizarConsultas() 
	{
		System.out.println("realizando consultas");
	}
	
}
