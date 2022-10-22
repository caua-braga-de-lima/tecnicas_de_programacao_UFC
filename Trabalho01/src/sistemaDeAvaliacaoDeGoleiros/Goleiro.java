package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;

public class Goleiro 
{
	//ATRIBUTOS:
	private String nome;
	private int id;
	private int flexibilidade;
	private int velocidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	private int pontuacao;
	private ArrayList<Chute> listaDeChutes;
	
	//METODO CONSTRUTOR - PERMITE A INSTANCIA DE UM GOLEIRO E A INSERCAO DE SEUS ATRIBUTOS
	public Goleiro(String nome, int id, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio)
	{
		this.nome = nome;
		this.id = id;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.equilibrio = equilibrio;
		this.flexibilidade = flexibilidade;
		this.forca = forca;
		this.velocidade = velocidade;
		this.pontuacao = 0;
		listaDeChutes = new ArrayList<Chute>();
	}
	
	//METODO - RETORNA O ID DO GOLEIRO:
	public int getId()
	{
		return this.id;
	}
	
	//METODO - RETORNA O NOME DO GOLEIRO:
	public String getNome()
	{
		return this.nome;
	}
	
	//METODO - RETORNA A VELOCIDADE
	public int getVelocidade()
	{
		return this.flexibilidade;
	}
	
	//METODO - RETORNA A AGILIDADE
	public int getAgilidade()
	{
		return this.agilidade;
	}
	
	// METODO - RETORNA A FLEXIBILIDADE
	public int getFlexibilidade()
	{
		return this.flexibilidade;
	}
	
	// METODO - RETORNA A COORDENACAO
	public int getCoordenacao()
	{
		return this.coordenacao;
	}
	
	// METODO - RETORNA A FORCA
	public int getForca()
	{
		return this.forca;
	}
	
	// METODO - RETORNA O EQUILIBRIO
	public int getEquilibrio()
	{
		return this.equilibrio;
	}
	
	//METODO - ADICIONA A LISTA DE 30 CHUTES 
	public void adListaDeChutes(ArrayList<Chute> listadeChutes)
	{
		for(Chute ch : listadeChutes)
		{
			this.listaDeChutes.add(ch);
		}
	}
	
	//METODO - RETORNA A LISTA DE 30 CHUTES
	public ArrayList<Chute> getListaDeChutes()
	{
		return this.listaDeChutes;
	}
	
	// METODO - CALCULA A AREA DE ATUACAO DO GOLEIRO (AAG)
	public int calcAAG()
	{
		int AAG = ((this.velocidade*3) + (this.flexibilidade*2) + (this.agilidade*3) + (this.coordenacao*2) + this.forca + (this.equilibrio*2))/8;
		
		if(AAG >= 1 && AAG <= 16)
		{
			return AAG;
		}
		return 0;
	}
	
	//METODO - INSERE A PONTUACAO DO GOLEIRO (NUMERO DE GOLS MARCADOS)
	public void setPontuacao()
	{
		this.pontuacao++;
	}
	
	//METODO - RETORNA A PONTUACAO DO GOLEIRO
	public int getPontuacao()
	{
		return this.pontuacao;
	}	
	
}

