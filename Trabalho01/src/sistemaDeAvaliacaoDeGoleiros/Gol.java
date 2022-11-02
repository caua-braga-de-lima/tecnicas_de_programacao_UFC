package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;
import java.util.Random;

public class Gol 
{
	//ATRIBUTOS:
	private int posicaoX[];
	private int posicaoY[];
	private int quadrante[][];
	private String secao[][];
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
		
		this.posicaoX = new int[9];
		this.posicaoY = new int[17];
		this.secao = new String[9][17];
		this.quadrante = new int[7][13];
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 17; j++)
			{
				this.posicaoX[i] = i;
				this.posicaoY[j] = j;
			}
		}
		
	}

	
	//METODO - RETORNA A LISTA DE SELECOES
	public ArrayList<Selecao> getListaSelecao()
	{
		return this.listaDeSelecoes;
	}
	
	
	//METODO - MAPEAR AS SECOES DO GOL
	public void setSecao()
	{
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 17; j++)
			{
				if(posicaoX[i] == 0 || posicaoY[i] == 0 || posicaoY[j] == 16)
				{ 
					this.secao[i][j] = "FORA";
				}
				else if(posicaoY[j] == 1 && posicaoX[i] <= 1)
				{
					this.secao[i][j] = "TRAVE ESQUERDA";
				}
				else if(posicaoX[i] == 1 && posicaoY[j] < 15)
				{
					this.secao[i][j] = "TRAVE CENTRAL";
				}
				else if(posicaoY[j] == 15 && posicaoX[i] >= 1) //!
				{
					this.secao[i][j] = "TRAVE DIREITA";
				}
				else if(posicaoX[i] == 2 && posicaoY[j] == 2)
				{
					this.secao[i][j] = "ANGULO ESQUERDO";
				}
				else if(posicaoX[i] == 2 && posicaoY[j] == 14)
				{
					this.secao[i][j] = "ANGULO DIREITO";
				}
				else
				{
					this.secao[i][j] = "GOL";
				}
			}
		}
	}
	
	//METODO - MAPEAR OS QUADRANTES DO GOL
	public void setQuadrante()
	{
		if(this.secao.equals("GOL") == true)
		{
			for(int i = 2; i < 9; i++)
			{
				for(int j = 2; j < 15; j++)
				{
					if((posicaoX[i] >= 2 && posicaoX[i] < 5) && (posicaoY[j] < 9))
					{
						this.quadrante[i][j] = 1;
					}
					else if(posicaoX[i] >= 5 && posicaoY[j] < 9)
					{
						this.quadrante[i][j] = 3;
					}
					else if((posicaoX[i] >= 2 && posicaoX[i] < 5) && posicaoY[j] >= 9 && posicaoY[j] < 15)
					{
						this.quadrante[i][j] = 2;
					}
					else
					{
						this.quadrante[i][j] = 4;
					}
				}
			}
		}
		
	}
	
	//METODO - RETORNAR O QUADRANTE DE UMA CELULA DO GOL
	public int GetQuadrante(int posicaoX, int posicaoY)
	{
		return this.quadrante[posicaoX][posicaoY];
	}
	
	
	//METODO - RETORNAR A SECAO DE UMA CELULA DO GOL
	public String getSecao(int posicaoX, int posicaoY)
	{
		return this.secao[posicaoX][posicaoY];
	}
	
	//METODO - SORTEIA A POSICAO INICIAL X DO GOLEIRO COM BASE NO QUADRANTE DO CHUTE INFORMADO
	public int sortearPosicaoX(Chute ch)
	{
		int posicaoDefesaX = 0;
		Random gerador = new Random();
		
		if(ch.getQuadrante() == 1)
		{
			posicaoDefesaX = gerador.nextInt(2, 4); 
		}
		else if(ch.getQuadrante() == 2)
		{
			posicaoDefesaX = gerador.nextInt(2, 4);
		}
		else if(ch.getQuadrante() == 3)
		{
			posicaoDefesaX = gerador.nextInt(5, 8);
		}
		else
		{
			posicaoDefesaX = gerador.nextInt(5, 8);
		}
		
		return posicaoDefesaX;
	}
	
	//METODO - SORTEIA A POSICAO INICIAL Y DO GOLEIRO COM BASE NO QUADRANTE DO CHUTE INFORMADO
	public int sortearPosicaoY(Chute ch)
	{
		int posicaoDefesaY = 0;
		Random gerador = new Random();
		
		if(ch.getQuadrante() == 1)
		{
			posicaoDefesaY = gerador.nextInt(2, 8);
		}
		else if(ch.getQuadrante() == 2)
		{
			posicaoDefesaY = gerador.nextInt(9, 14);
		}
		else if(ch.getQuadrante() == 3)
		{
			posicaoDefesaY = gerador.nextInt(2, 8);
		}
		else
		{
			posicaoDefesaY = gerador.nextInt(9, 15);
		}
		
		return posicaoDefesaY;
	}
	
	//METODO - DINAMICA DE CHUTE A GOL - RECEBE UM GOLEIRO E RETORNA A PONTUACAO
	public ArrayList<Integer> chuteAGol(Goleiro goleiro)
	{
		int posicaoDefesaX = 0;
		int posicaoDefesaY = 0;
		
		ArrayList<Integer> listaDeGols = new ArrayList<Integer>();
		
		for(Chute ch : goleiro.getListaDeChutes())
		{
			posicaoDefesaX = sortearPosicaoX(ch);
			posicaoDefesaY = sortearPosicaoY(ch);
		
			//CRIAR MATRIZ DE DEFESA DO GOLEIRO:
			
			int contAAG = 0;
			int auxi = posicaoDefesaX;
			int auxj = posicaoDefesaY;
			
			criarMatrizDefesa(goleiro, posicaoDefesaX, listaDeGols, ch, contAAG, auxi, auxj);		
	  }
		return listaDeGols;
	
	
	}


	private void criarMatrizDefesa(Goleiro goleiro, int posicaoDefesaX, ArrayList<Integer> listaDeGols, Chute ch,
			int contAAG, int auxi, int auxj) 
	{
		do
		{
			while(auxi >= posicaoDefesaX-4)
			{
				if(auxi == ch.getPosicaoChuteX() && auxj == ch.getPosicaoChuteY())
				{
					goleiro.setPontuacao();
					listaDeGols.add(1);
					return;
				}
				auxi--;
			}
			auxj++;
			contAAG += 4;
			auxi = posicaoDefesaX;
			listaDeGols.add(0);
		}while(contAAG <= goleiro.calcAAG());
	}
}

