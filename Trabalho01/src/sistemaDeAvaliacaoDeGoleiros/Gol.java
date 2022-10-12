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
	
	public void setQuadrante(int posicaoX, int posicaoY)
	{
		if(this.secao.equals("GOL") == true)
		{
			for(int i = 2; i < 9; i++)
			{
				for(int j = 2; j < 15; j++)
				{
					if((posicaoX >= 2 && posicaoX < 5) && (posicaoY < 9))
					{
						this.quadrante = 1;
					}
					else if(posicaoX >= 5 && posicaoY < 9)
					{
						this.quadrante = 3;
					}
					else if((posicaoX >= 2 && posicaoX < 5) && posicaoY >= 9 && posicaoY < 15)
					{
						this.quadrante = 2;
					}
					else
					{
						this.quadrante = 4;
					}
				}
			}
		}
		
	}
	
	public int GetQuadrante()
	{
		return this.quadrante;
	}
	
	public void setSecao(int posicaoX, int posicaoY)
	{
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 17; j++)
			{
				if(posicaoX == 0 || posicaoY == 0 || posicaoY == 16)
				{
					this.secao = "FORA";
				}
				else if(posicaoX == 1 || posicaoY == 1 || posicaoY == 15)
				{
					this.secao = "TRAVE";
				}
				else if(posicaoX == 2 && posicaoY == 2)
				{
					this.secao = "ANGULO ESQUERDO";
				}
				else if(posicaoX == 2 && posicaoY == 14)
				{
					this.secao = "ANGULO DIREITO";
				}
				else
				{
					this.secao = "GOL";
				}
			}
		}
		
		
	}
	
	public String getSecao()
	{
		return this.secao;
	}
	
	
}
