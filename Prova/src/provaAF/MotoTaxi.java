package provaAF;

//SUBCLASSE 2 - MOTOTAXI
public class MotoTaxi extends TransporteDePessoas
{
	//2 ATRIBUTOS:
	public int numeroDeAssentos;
	public String placa;

	//PRIMEIRO CONSTRUTOR:
	public MotoTaxi(String nomePassageiro, String destino, String placa) 
	{
		super(nomePassageiro, "Moto", destino);
		this.numeroDeAssentos = 2;
		this.placa = placa;
	}

	//SEGUNDO CONSTRUTOR:
	public MotoTaxi(String nomePassageiro, String destino, Boolean necessidadeEspecial, String placa)
	{
		super(nomePassageiro, "Moto-taxi", destino, 5.00, 1, necessidadeEspecial);
		this.placa = placa;
		this.numeroDeAssentos = 2;
	}
	
	//IMPLEMENTACAO DO PRIMEIRO METODO ABSTRATO:
	public void setNumeroDeAssentos(int numeroDeAssentos) 	{
		this.numeroDeAssentos = numeroDeAssentos;
	}

	//IMPLEMENTACAO DO SEGUNDO METODO ABSTRATO:
	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}

	//IMPLEMENTACAO DO TERCEIRO METODO ABSTRATO:
	public String getPlaca() 
	{
		return this.placa;
	}
	
}
