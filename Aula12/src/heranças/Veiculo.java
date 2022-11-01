package heranças;

public abstract class Veiculo // classe abstrata: classes que não podem instanciar objetos, servem apenas de molde para outras classes.
{
	public String nome;
	public int id;
	
	public String acelerar()
	{
		String msg = this.nome + " está acelerando. ";
		return msg;
	}
	
	public abstract void verificarId(); // método abstrato: obriga as classes filhas a terem esses métodos. (de forma concreta);
}
