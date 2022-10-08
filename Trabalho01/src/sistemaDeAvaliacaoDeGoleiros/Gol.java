package sistemaDeAvaliacaoDeGoleiros;

public class Gol 
{
	private int posicaoX;
	private int posicaoY;
	private int quadrante;
	private String secao;
	
	public void setPosicaoX(int posicaoX)
	{
		this.posicaoX = posicaoX;
	}
	
	public int getPosicaoX()
	{
		return this.posicaoX;
	}
	
	public void setPosicaoY(int posicaoY)
	{
		this.posicaoY = posicaoY;
	}
	
	public int getPosicaoY()
	{
		return this.posicaoY;
	}
	
//	public void setQuadrante(int posicaoX, int posicaoY)
//	{
//		
//	}
	
	public int GetQuadrante()
	{
		return this.quadrante;
	}
	
	public void setSecao(int posicaoX, int posicaoY)
	{
		if(posicaoX == 0 || posicaoY == 0 || posicaoY == 16)
		{
			this.secao = "FORA";
		}
		
		else if(posicaoX >= 1 && (posicaoY >= 1 && posicaoY <= 15))
		{
			if(posicaoX == 1 || (posicaoY == 2 && ))
			{
					
			}
		}
		
		
	}
	
	public String GetSecao()
	{
		return this.secao;
	}
	
	
}
