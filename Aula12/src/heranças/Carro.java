package heranças;

public class Carro extends Veiculo
{
	public void acelerar()
	{
		super.acelerar(); // herda o comportamento do pai
		System.out.println(this.nome + " acelerando mais.");
	}

	@Override
	public void verificarId() {
		// TODO Auto-generated method stub
		
	}
}
