package Polimorfismo;

public class Medico // classe abstrata - não pode ser instanciada. serve apenas de modelo para outras classes.
{
	public void receitarMedicamento()
	{
		System.out.println("Receitando medicamento");
	}
	
	public void aferirSinais()
	{
		System.out.println("Aferir sinais");
	}
	
	public String nome()
	{
		String msg = "sou um profissional";
		return msg;
	}

	
}