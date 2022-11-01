package heranças;

public class Carro extends Veiculo
{
	public String acelerar()
	{
		super.acelerar(); // herda o comportamento do pai
		String msg = this.nome + "está acelerando";
		return msg;
	}

	@Override
	public void verificarId() {
		// TODO Auto-generated method stub
		
	}
}
