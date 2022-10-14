package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;

public class Selecao 
{
	//ATRIBUTO - LISTA DE GOLEIROS
	private ArrayList<Goleiro> listaGoleiros;
	
	//METODO CONSTRUTOR - PERMITE A INSTANCIA DE UMA SELECAO
	public Selecao()
	{
		listaGoleiros = new ArrayList<Goleiro>();
	}
	
	//METODO - RETORNA A LISTA DE GOLEIROS
	public ArrayList<Goleiro> getSelecao()
	{
		return this.listaGoleiros;
	}

}