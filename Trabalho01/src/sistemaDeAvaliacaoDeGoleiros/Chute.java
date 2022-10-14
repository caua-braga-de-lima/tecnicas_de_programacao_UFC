package sistemaDeAvaliacaoDeGoleiros;

public class Chute 
{
	//ATRIBUTOS:
	private int id;
	private int forca;
	private int quadrante;
	private int posicaoX;
	private int posicaoY;
	
	//METODO CONSTRUTOR - PERMITE A INSTANCIA DE UM CHUTE E A INSERCAO DE SEUS ATRIBUTOS
	public Chute(int id, int forca, int quadrante, int posicaoX, int posicaoY)
	{
		this.id = id;
		this.forca = forca;
		this.quadrante = quadrante;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}
	
	// METODO - RETORNA O ID DO CHUTE
	public int getId() 
	{
		return id;
	}
	
	//METODO - RETORNA A FORCA DO CHUTE
	public int getForca() 
	{
		return forca;
	}

	//METODO - RETORNA O QUADRANTE NO QUAL O CHUTE É APLICADO
	public int getQuadrante() 
	{
		return quadrante;
	}

	//METODO - RETORNA A POSICAO X DO CHUTE
	public int getPosicaoChuteX()
	{
		return this.posicaoX;
	}
	
	//METOODO - RETORNA A POSICAO Y DO CHUTE
	public int getPosicaoChuteY()
	{
		return this.posicaoY;
	}
	
}
