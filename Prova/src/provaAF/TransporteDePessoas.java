package provaAF;
import java.util.ArrayList;

//SUPERCLASSE - TRANSPORTE DE PESSOAS
public abstract class TransporteDePessoas 
{
	//6 ATRIBUTOS:
	public String nomePassageiro;
	public double valorPassagem;
	public String veiculo;
	public String destino;
	public int numeroDeAcompanhantes;
	public Boolean necessidadeEspecial;
	
	//PRIMEIRO CONSTRUTOR:
	public TransporteDePessoas(String nomePassageiro, String veiculo, String destino)
	{
		this.nomePassageiro = nomePassageiro;
		this.veiculo = veiculo;
		this.destino = destino;
	}
	
	//SEGUNDO CONSTRUTOR:
	public TransporteDePessoas(String nomePassageiro, String veiculo, String destino, double valorPassagem, int numeroDeAcompanhantes, Boolean necessidadeEspecial)
	{
		this.nomePassageiro = nomePassageiro;
		this.veiculo = veiculo;
		this.destino = destino;
		this.valorPassagem = valorPassagem;
		this.numeroDeAcompanhantes = numeroDeAcompanhantes;
		this.necessidadeEspecial = necessidadeEspecial;
	}
	
	//PRIMEIRO METODO ABSTRATO:
	public abstract void setNumeroDeAssentos(int numeroDeAssentos);
	
	//SEGUNDO METODO ABSTRATO:
	public abstract void setPlaca(String placa);
	
	//TERCEIRO METODO ABSTRATO:
	public abstract String getPlaca();
	
}
