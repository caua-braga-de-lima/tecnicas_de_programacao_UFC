package ex06;

public class Elevador 
{
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int quantPessoas; 
	
	public Elevador()
	{
		this.andarAtual = 0;
	}
	
	public void setCapacidade(int capacidade)
	{
		this.capacidade = capacidade;
	}
	
	public int getCapacidade()
	{
		return this.capacidade;
	}
	
	public void setTotalAndares(int totalAndares)
	{
		this.totalAndares = totalAndares;
	}
	
	public int getTotalAndares()
	{
		return this.totalAndares;
	}
	
	public int getQuantpessoas()
	{
		return this.quantPessoas;
	}
	
	public int getAndarAtual()
	{
		return this.andarAtual;
	}

	public  void inicializar()
	{
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
	}
	
	public void entrar()
	{
		if(this.quantPessoas < capacidade)
		{
			this.quantPessoas++;
		}
	}
	
	public void sobe() 
	{
		if(andarAtual != totalAndares)
		{
			this.andarAtual++;
		}
	}
	
	public void desce()
	{
		if(andarAtual != 0)
		{
			this.andarAtual--;
		}
	}
	
	
}

