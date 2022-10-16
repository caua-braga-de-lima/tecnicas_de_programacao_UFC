package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;
import java.util.Random;

public class Gol 
{
	//ATRIBUTOS:
	private int posicaoX;
	private int posicaoY;
	private int quadrante;
	private String secao;
	private ArrayList<Selecao> listaDeSelecoes;
	
	//METODO CONSTRUTOR - PERMITE A INSTANCIA DO GOL E DA SUA LISTA DE SELECOES
	public Gol(Selecao s1, Selecao s2, Selecao s3, Selecao s4, Selecao s5)
	{
		this.listaDeSelecoes = new ArrayList<Selecao>();
		this.listaDeSelecoes.add(s1);
		this.listaDeSelecoes.add(s2);
		this.listaDeSelecoes.add(s3);
		this.listaDeSelecoes.add(s4);
		this.listaDeSelecoes.add(s5);
	}
	
	//METODO - RETORNA A LISTA DE SELECOES
	public ArrayList<Selecao> getListaSelecao()
	{
		return this.listaDeSelecoes;
	}
	
	//METODO - INSERIR A POSICAO X DA CELULA DO GOL
	public void setPosicaoX(int posicaoX)
	{
		this.posicaoX = posicaoX;
	}
	
	//METODO - RETORNAR A POSICAO X DA CELULA DO GOL
	public int getPosicaoX()
	{
		return this.posicaoX;
	}
	
	//METODO - INSERIR A POSICAO Y DA CELULA DO GOL
	public void setPosicaoY(int posicaoY)
	{
		this.posicaoY = posicaoY;
	}
	
	//METODO - RETORNAR A POSICAO Y DA CELULA DO GOL
	public int getPosicaoY()
	{
		return this.posicaoY;
	}
	
	//METODO - MAPEAR OS QUADRANTES DO GOL
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
	
	//METODO - RETORNAR O QUADRANTE DE UMA CELULA DO GOL
	public int GetQuadrante()
	{
		return this.quadrante;
	}
	
	//METODO - MAPEAR AS SECOES DO GOL
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
				else if(posicaoY == 1 && posicaoX <= 1)
				{
					this.secao = "TRAVE ESQUERDA";
				}
				else if(posicaoX == 1 && posicaoY < 15)
				{
					this.secao = "TRAVE CENTRAL";
				}
				else if(posicaoY == 15 && posicaoX >= 1) //!
				{
					this.secao = "TRAVE DIREITA";
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
	
	//METODO - RETORNAR A SECAO DE UMA CELULA DO GOL
	public String getSecao()
	{
		return this.secao;
	}
	
	//METODO - DINAMICA DE CHUTE A GOL - RECEBE UM GOLEIRO E RETORNA A PONTUACAO
	public ArrayList<Boolean> chuteAGol(Goleiro goleiro)
	{
		Random gerador = new Random();
		
		//SORTEAR POSICAO INICIAL DO GOLEIRO COM BASE NO QUADRANTE DE CADA CHUTE:
		int posicaoDefesaX = 0;
		int posicaoDefesaY = 0;
		
		for(Selecao s : this.listaDeSelecoes)
		{
			for(Goleiro g : s.getSelecao())
			{
				for(Chute ch : g.getListaDeChutes())
				{
					if(ch.getQuadrante() == 1)
					{
						posicaoDefesaX = gerador.nextInt(3) + 2; 
						posicaoDefesaY = gerador.nextInt(7) + 2;
					}
					else if(ch.getQuadrante() == 2)
					{
						posicaoDefesaX = gerador.nextInt(3) + 2;
						posicaoDefesaY = gerador.nextInt(6) + 9;
					}
					else if(ch.getQuadrante() == 3)
					{
						posicaoDefesaX = gerador.nextInt(4) + 5;
						posicaoDefesaY = gerador.nextInt(7) + 2;
					}
					else
					{
						posicaoDefesaX = gerador.nextInt(4) + 5;
						posicaoDefesaY = gerador.nextInt(6) + 9;
					}
				}
			}
		}
		
		//CRIAR MATRIZ DE DEFESA DO GOLEIRO:
		
		int linhasDefesa = 0;
		int colunasDefesa = 0;
		
		if(Math.sqrt(goleiro.calcAAG()) % 1 == 0)
		{
			linhasDefesa = (int) Math.sqrt(goleiro.calcAAG());
			colunasDefesa = linhasDefesa;
		}
		else
		{
			linhasDefesa = (int) (Math.sqrt(goleiro.calcAAG()) + 1);
			colunasDefesa = linhasDefesa - 1;
		}
		
		int defesa[][] = new int[linhasDefesa][colunasDefesa];
		
		// COMPARAR AS COORDENADAS DO CHUTE COM AS COORDENADAS DO GOLEIRO E CONTABILIZAR OS PONTOS:
		
		ArrayList<Boolean> listaDeGols = new ArrayList<Boolean>();
		
		for(int i = posicaoDefesaX; i < linhasDefesa; i++)
		{
			for(int j = posicaoDefesaY; j < colunasDefesa; j++)
			{
				for(Chute ch : goleiro.getListaDeChutes())
				{
					if(ch.getPosicaoChuteX() == i && ch.getPosicaoChuteY() == j)
					{
						goleiro.setPontuacao(1);
						listaDeGols.add(true);
					}
					else if((ch.getPosicaoChuteY() == colunasDefesa && ch.getPosicaoChuteX() == linhasDefesa) || (ch.getPosicaoChuteX() == posicaoDefesaX && ch.getPosicaoChuteY() == posicaoDefesaY) || (ch.getPosicaoChuteX() == linhasDefesa && ch.getPosicaoChuteY() == posicaoDefesaY) || (ch.getPosicaoChuteX() == posicaoDefesaX && ch.getPosicaoChuteY() == colunasDefesa))
					{
						if(goleiro.getForca() >= ch.getForca())
						{
							goleiro.setPontuacao(1);
							listaDeGols.add(true);
						}
					}
					else
					{
						listaDeGols.add(false);
					}
				}
			}
		}
		return listaDeGols;
	}
	
	
}

