package SalaoDeBelezaJava;

public class Cliente 
{
	private int id;
	private String nome;
	private String cpf;
	
	public Cliente(String cpf)
	{
		this.cpf = cpf;
	}
	
	public int setId(int id)
	{
		if(id > 0)
		{
			this.id = id;
		}
		
		return this.id;
	}
	
	public void setNome(String nome)
	{
		if(nome.length() >= 3)
		{
			this.nome = nome;
		}
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public int getId()
	{
		return this.id;
	}
}
