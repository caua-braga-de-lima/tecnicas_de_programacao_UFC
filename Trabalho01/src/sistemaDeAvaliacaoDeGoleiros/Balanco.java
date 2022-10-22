package sistemaDeAvaliacaoDeGoleiros;

public class Balanco 
{
	//ATRIBUTO - GOL ANALISADO
	private Gol analiseDoGol;
	
	//METODO CONSTRUTOR - RECEBE UM GOL PARA ANALISAR E REALIZA OS CHUTES A GOL PARA TODOS OS GOLEIROS:
	public Balanco(Gol gol)
	{
		this.analiseDoGol = gol;
		
		for(Selecao s : this.analiseDoGol.getListaSelecao())
		{
			for(Goleiro g : s.getSelecao())
			{
				this.analiseDoGol.chuteAGol(g);
			}
		}
	}
	
	//QUESTAO 01 - RETORNA A MEDIA DE CHUTES DE CADA GOLEIRO:
	public String calcularMedia()
	{
		
		String msg = "MEDIA DE CHUTES DE CADA GOLEIRO (EM PORCENTAGEM): \n";
		
		for(Selecao s : this.analiseDoGol.getListaSelecao())
		{
			for(Goleiro g : s.getSelecao())
			{
				msg += "SELECAO " + s.getNome() + ": \n" + "GOLEIRO " + g.getNome() + ": " + (g.getPontuacao() *100)/30 + "% \n"; 
			}
		}
		
		return msg;
	}
	
	//QUESTAO 02 - RETORNA A PONTUACAO DE CADA GOLEIRO E O TITULAR DE CADA SELECAO:
	public String calcularTitular()
	{
		String msg = "PONTUACAO DE CADA GOLEIRO: \n";
		String titular1 = "";
		String titular2 = "";
		String titular3 = "";
		String titular4 = "";
		String titular5 = "";
		
		for(Selecao s : this.analiseDoGol.getListaSelecao())
		{
			for(Goleiro g : s.getSelecao())
			{
				msg += "GOLEIRO " + g.getNome() + ": " + g.getPontuacao() + " \n";
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1; j < 5; j++)
			{
				if(this.analiseDoGol.getListaSelecao().get(0).getSelecao().get(i).getPontuacao() < this.analiseDoGol.getListaSelecao().get(0).getSelecao().get(j).getPontuacao())
				{
					titular1 = this.analiseDoGol.getListaSelecao().get(0).getSelecao().get(j).getNome();
				}
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1; j < 5; j++)
			{
				if(this.analiseDoGol.getListaSelecao().get(1).getSelecao().get(i).getPontuacao() < this.analiseDoGol.getListaSelecao().get(1).getSelecao().get(j).getPontuacao())
				{
					titular2 = this.analiseDoGol.getListaSelecao().get(1).getSelecao().get(j).getNome();
				}
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1; j < 5; j++)
			{
				if(this.analiseDoGol.getListaSelecao().get(2).getSelecao().get(i).getPontuacao() < this.analiseDoGol.getListaSelecao().get(2).getSelecao().get(j).getPontuacao())
				{
					titular3 = this.analiseDoGol.getListaSelecao().get(2).getSelecao().get(j).getNome();
				}
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1; j < 5; j++)
			{
				if(this.analiseDoGol.getListaSelecao().get(3).getSelecao().get(i).getPontuacao() < this.analiseDoGol.getListaSelecao().get(3).getSelecao().get(j).getPontuacao())
				{
					titular4 = this.analiseDoGol.getListaSelecao().get(3).getSelecao().get(j).getNome();
				}
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1; j < 5; j++)
			{
				if(this.analiseDoGol.getListaSelecao().get(4).getSelecao().get(i).getPontuacao() < this.analiseDoGol.getListaSelecao().get(4).getSelecao().get(j).getPontuacao())
				{
					titular5 = this.analiseDoGol.getListaSelecao().get(4).getSelecao().get(j).getNome();
				}
			}
		}
		
		msg += "\nTITULARES DE CADA SELECAO: \n";
		msg += "SELECAO 1: " + titular1 + "\n";
		msg += "SELECAO 2: " + titular2 + "\n";
		msg += "SELECAO 3: " + titular3 + "\n";
		msg += "SELECAO 4: " + titular4 + "\n";
		msg += "SELECAO 5: " + titular5 + "\n";
		
		return msg;
	}
	
	//QUESTAO 03 - RETORNA O NUMERO DE GOLS TOMADOS POR CADA GOLEIRO:
	public String calcularGols()
	{
		String msg = "GOLS TOMADOS PELOS GOLEIROS: \n";
		
		for(Selecao s : this.analiseDoGol.getListaSelecao())
		{
			for(Goleiro g : s.getSelecao())
			{
			msg += "GOLEIRO " + g.getNome() + ": " + (30 - g.getPontuacao()) + "\n";
			}
		}
		
		return msg;
	}
	
	//QUESTAO 04 - RETORNA QUAIS CHUTES BATERAM EM CADA SECAO DO GOL:
	public String analiseDeChutes()
	{
		String msg = "ANALISE DOS CHUTES: \n";
		int chutesFora = 0;
		int chutesTraveEsquerda = 0;
		int chutesTraveCentral = 0;
		int chutesTraveDireita = 0;
		
		for(Selecao s : this.analiseDoGol.getListaSelecao())
		{
			for(Goleiro g : s.getSelecao())
			{
				for(Chute ch : g.getListaDeChutes())
				{
					if(ch.getPosicaoChuteX() == 0 || ch.getPosicaoChuteY() == 0 || ch.getPosicaoChuteY() == 16)
					{
						chutesFora++;
					}
					else if(ch.getPosicaoChuteX() <= 1 && ch.getPosicaoChuteY() == 1)
					{
						chutesTraveEsquerda++;
					}
					else if(ch.getPosicaoChuteX() == 1 && ch.getPosicaoChuteY() < 15)
					{
						chutesTraveCentral++;
					}
					else if(ch.getPosicaoChuteX() >= 1 && ch.getPosicaoChuteY() == 15)
					{
						chutesTraveDireita++;
					}
				}
			}
		}
		
		msg += "CHUTES FORA: " + chutesFora + " \n";
		msg += "CHUTES NA TRAVE ESQUERDA: " + chutesTraveEsquerda + " \n";
		msg += "CHUTES NA TRAVE DIREITA: " + chutesTraveDireita + " \n";
		msg += "CHUTES NA TRAVE CENTRAL: " + chutesTraveCentral + " \n";
	
		return msg;	
	}
	
	//QUESTAO 05 - RETORNA O NUMERO DE CHUTES NOS ANGULOS DO GOL:
	public String chutesAnguloGol()
	{
		String msg = "CHUTES NO ANGULO DO GOL: \n";
		
		int chutesAnguloEsquerdo = 0;
		int chutesAnguloDireito = 0;
		
		for(Selecao s : this.analiseDoGol.getListaSelecao())
		{
			for(Goleiro g : s.getSelecao())
			{
				for(Chute ch : g.getListaDeChutes())
				{
					if(ch.getPosicaoChuteX() == 2 && ch.getPosicaoChuteY() == 2)
					{
						chutesAnguloEsquerdo++;
					}
					else if(ch.getPosicaoChuteX() == 2 && ch.getPosicaoChuteY() == 14)
					{
						chutesAnguloDireito++;
					}
				}
			}
		}
		
		msg += "ANGULO DIREITO: " + chutesAnguloDireito + "\n";
		msg += "ANGULO ESQUERDO: " + chutesAnguloEsquerdo + "\n";
		
		return msg;
	}
	
	//QUESTAO 08 - RETORNA OS DADOS DE CADA GOLEIRO:
	public String analiseGoleiros()
	{
		String msg = "ANALISE DOS GOLEIROS: \n\n";
		
		for(Selecao s : this.analiseDoGol.getListaSelecao())
		{
			msg += "\nSELECAO " + s.getNome() + ": \n";
			for(Goleiro g : s.getSelecao())
			{
				msg += "NOME: " + g.getNome() + ": \n";
				msg += "AREA DE ATUACAO: " + g.calcAAG() + " \n";
				msg += "GOLS DEFENDIDOS: " + g.getPontuacao() + "\n";
				msg += "GOLS TOMADOS: " + (30 - g.getPontuacao()) + "\n";
			}
		}
		
		return msg;
	}
	
	//QUESTAO 09 - RECEBE UM ID DE UM GOLEIRO E RETORNA O QUADRANTE QUE ELE MAIS TOMOU GOL:
	public String informarQuadrante(int id)
	{
		String msg = "";
		for(Selecao s : this.analiseDoGol.getListaSelecao())
		{
			for(Goleiro g : s.getSelecao())
			{
				if(g.getId() == id)
				{
					msg += "ID - " + id + " - GOLEIRO " + g.getNome() + " \n";

					for(int i = 0; i < this.analiseDoGol.chuteAGol(g).size(); i++)
					{
						if(this.analiseDoGol.chuteAGol(g).get(i) == 0)
						{
							 msg += "QUADRANTE QUE MAIS TOMOU GOL: " + g.getListaDeChutes().get(i).getQuadrante() + " \n";
							 break;
						}
					}
				}	
			}	
		}
		
		return msg;
	}
}

