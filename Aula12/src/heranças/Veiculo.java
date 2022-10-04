package heranças;

public abstract class Veiculo // classe abstrata: classes que não podem instanciar objetos, servem apenas de molde para outras classes.
{
	public String nome;
	public int id;
	
	public void acelerar()
	{
		System.out.println("Veículo acelerando");
	}
	
	public abstract void verificarId(); // método abstrato: obriga as classes filhas a terem esses métodos. (de forma concreta);
}
