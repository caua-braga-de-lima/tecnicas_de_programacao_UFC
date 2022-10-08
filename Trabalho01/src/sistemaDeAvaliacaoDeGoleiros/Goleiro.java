package sistemaDeAvaliacaoDeGoleiros;

public class Goleiro 
{
	private String nome;
	private int id;
	private int flexibilidade;
	private int velocidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	
	public Goleiro(String nome, int id)
	{
		this.nome = nome;
		this.id = id;
	}
	
	public void setVelocidade(int velocidade)
	{
		this.flexibilidade = velocidade;
	}
	
	public int getVelocidade()
	{
		return this.flexibilidade;
	}
	
	public void setAgilidade(int agilidade)
	{
		this.agilidade = agilidade;
	}
	
	public int getAgilidade()
	{
		return this.agilidade;
	}
	
	public void setFlexibilidade(int flexibilidade)
	{
		this.flexibilidade = flexibilidade;
	}
	
	public int getFlexibilidade()
	{
		return this.flexibilidade;
	}
	
	public void setCoordenacao(int coordenacao)
	{
		this.coordenacao = coordenacao;
	}
	
	public int getCoordenacao()
	{
		return this.coordenacao;
	}
	
	public void setForca(int forca)
	{
		this.forca = forca;
	}
	
	public int getForca()
	{
		return this.forca;
	}
	
	public void setEquilibrio(int equilibrio)
	{
		this.equilibrio = equilibrio;
	}
	
	public int getEquilibrio()
	{
		return this.equilibrio;
	}
	
	public int calcAAG()
	{
		int AAG = ((this.velocidade*3) + (this.flexibilidade*2) + (this.agilidade*3) + (this.coordenacao*2) + this.forca + (this.equilibrio*2))/8;
		
		return AAG;
	}
}

