package provaAF;

//SUBCLASSE 1 - UBER
public class Uber extends TransporteDePessoas
{
	//2 ATRIBUTOS:
	public int numeroDeAssentos;
	public String placa;
	
	//PRIMEIRO CONSTRUTOR:
	public Uber(String nomePassageiro, String veiculo, String destino, String placa) 
	{
		super(nomePassageiro, "Carro", destino);
		this.numeroDeAssentos = 4;
		this.placa = placa;
	}
	
	//SEGUNDO CONSTRUTOR:
	public Uber(String veiculo, String nomePassageiro, String placa, String destino, int numeroDeAcompanhantes, Boolean necessidadeEspecial)
	{
		super(nomePassageiro, "Carro", destino, 7.50, numeroDeAcompanhantes, necessidadeEspecial);
		this.placa = placa;
		this.numeroDeAssentos = 4;
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
