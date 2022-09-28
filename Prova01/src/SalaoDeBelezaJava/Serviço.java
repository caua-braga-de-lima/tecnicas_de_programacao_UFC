package SalaoDeBelezaJava;

public class Serviço 
{
	private int id;
	private String nome;
	private double valor;
	private String descricao;
	
	public int setId(int id)
	{
		if(id > 0)
		{
			this.id = id;
		}
		
		return this.id;
	}
	
	public String setNome(String nome)
	{
		if(nome.length() > 5)
		{
			this.nome = nome;
		}
		
		return this.nome;
	}
	
	public String setDescricao(String descricao)
	{
		if(descricao.length() >= 10)
		{
			this.descricao = descricao;
		}
		
		return this.descricao;
	}
	
	public double setValor(double valor)
	{
		if(valor > 0)
		{
			this.valor = valor;
		}
		
		return this.valor;
	}
	
	public String getServiço()
	{
		return this.nome;
	}
	
	
}
