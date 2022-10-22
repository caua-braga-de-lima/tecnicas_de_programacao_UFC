package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;

public class Selecao 
{
	//ATRIBUTOS - NOME DA SELECAO E LISTA DE GOLEIROS
	private String nome;
	private ArrayList<Goleiro> listaGoleiros;
	
	//METODO CONSTRUTOR - PERMITE A INSTANCIA DE UMA SELECAO
	public Selecao()
	{
		listaGoleiros = new ArrayList<Goleiro>();
	}
	
	//METODO - ADICIONA UM NOME PARA A SELECAO
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	//METODO - RETORNA O NOME DA SELECAO
	public String getNome()
	{
		return this.nome;
	}
	
	//METODO - RETORNA A LISTA DE GOLEIROS
	public ArrayList<Goleiro> getSelecao()
	{
		return this.listaGoleiros;
	}
	

}