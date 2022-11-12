package cenario;

public abstract class ElementosDoGol 
{

	protected int posicaoX;
	protected int posicaoY;
	protected int quadrante;
	protected boolean defesa;
	protected boolean periferia;
	protected String simbolo;

	public ElementosDoGol(int posicaoX, int posicaoY, int quadrante) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.quadrante = quadrante;
	}

	public boolean isPeriferia() {
		return periferia;
	}

	public void setPeriferia(boolean periferia) {
		this.periferia = periferia;
	}

	public boolean isDefesa() {
		return defesa;
	}

	public void setDefesa(boolean defesa) {
		this.defesa = defesa;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public String getSimbolo() {
		return simbolo;
	}
	

}
