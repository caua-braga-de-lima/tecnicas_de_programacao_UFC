package ex04;

public class Produto 
{
	public String nome;
	public double precoCusto;
	public double lucro;
	public double precoVenda;
	public double despesas;
	
	public Produto(String nome)
	{
		this.nome = nome;
	}
	
	public double calcMargemLucro()
	{
		double margemLucro = ((precoVenda - (precoCusto + despesas)) / precoVenda) * 100;
		this.lucro = margemLucro;
		return this.lucro;
	}
}
