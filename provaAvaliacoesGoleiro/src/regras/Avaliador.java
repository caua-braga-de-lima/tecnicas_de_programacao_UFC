package regras;

import java.util.ArrayList;
import cenario.ElementosDoGol;
import cenario.ForaDoGol;
import cenario.Gol;
import cenario.TraveDireita;
import cenario.TraveEsquerda;
import cenario.TraveSuperior;
import persistencia.CarregarDados;

public class Avaliador {

	private ArrayList<Goleiro> listaGoleiros;
	private ArrayList<Chute> listaChute;
	private Gol gol;
	private Copa copa;

	public Avaliador(int numeroLinhas, int numeroColunas) {
		CarregarDados dados = new CarregarDados();
		listaGoleiros = dados.getListaGoleiros();
		listaChute = dados.getListaChute();
		copa = new Copa();
		gol = new Gol(numeroLinhas, numeroColunas);
	}

	public Copa getCopa() {
		return copa;
	}

	public Gol getGol() {
		return gol;
	}

	public String estatisticaDeChute() {
		int fora = 0;
		int ladoEsquerdo = 0;
		int ladoDireito = 0;
		int traveSuperior = 0;

		for (ElementosDoGol e : gol.getListaElementos()) {

			if (e instanceof ForaDoGol)
				fora++;
			else if (e instanceof TraveEsquerda)
				ladoEsquerdo++;
			else if (e instanceof TraveDireita)
				ladoDireito++;
			else if (e instanceof TraveSuperior)
				traveSuperior++;
		}
		return "Bolas foras: " + fora + "  | Lado esquerdo: " + ladoEsquerdo + " | Lado direito: " + ladoDireito
				+ " | Trave superior: " + traveSuperior;
	}

	public void listarGoleiros() {

		int cont = 1;
		int contSelecao = 1;
		Selecao selecao = new Selecao();
		for (Goleiro goleiro : listaGoleiros) {
			computarChutePraGoleiro(goleiro);

			if (cont == 5) {
				copa.addSelecao(selecao);
				selecao.setNome("Seleção-" + contSelecao);
				selecao = new Selecao();
				cont = 0;
				contSelecao++;
			}
			cont++;
			selecao.addGoleiro(goleiro);
		}
	}

	public void computarChutePraGoleiro(Goleiro goleiro) {

		for (Chute chute : listaChute) {
			gerarAlcanceGoleiro(chute, goleiro);
			marcarPeriferia();
			computarGols(chute, goleiro);
			goleiro.imprimirGolsTomados();
			goleiro.imprimirGolsDefendidos();
			resetarAreaDeAlcanceEPerifereia();
		}
	}

	private void resetarAreaDeAlcanceEPerifereia() {
		for (ElementosDoGol e : gol.getListaElementos()) {
			// e.setDefesa(false);
			e.setPeriferia(false);
		}
	}

	public void computarGols(Chute chute, Goleiro goleiro) {
		ElementosDoGol e = getELementoDoGol(chute.getPosicaoX(), chute.getPosicaoY());

		if (e != null) {
			if (!e.isDefesa()) {
				goleiro.addGolTomado(e);
			} else if (e.isPeriferia()) {
				if (goleiro.getForca() <= chute.getForca()) {
					goleiro.addGolTomado(e);
					goleiro.addGolQuaseDefesa(e);
				} else {
					goleiro.addGolDefendido(e);
				}
			} else {
				goleiro.addGolTomado(e);
			}
		}
	}

	public void gerarAlcanceGoleiro(Chute chute, Goleiro goleiro) {

		int AAG = goleiro.areaAtuacaoGoleiro();
		int contaPosicoesMarcadas = 0;
		for (int j = chute.getPosicaoY(); j < gol.getNumeroColunas(); j++) {
			int vertical = 0;
			for (int i = chute.getPosicaoX(); vertical < 4; i--, vertical++) {
				if (i > 0)
					marcarComoDefendido(i, j);
				contaPosicoesMarcadas++;
				if (contaPosicoesMarcadas == AAG)
					return;
			}
		}
	}

	public void marcarComoDefendido(int x, int y) {

		for (ElementosDoGol elementosDoGol : gol.getListaElementos()) {
			if (elementosDoGol.getPosicaoX() == x && elementosDoGol.getPosicaoY() == y) {
				elementosDoGol.setDefesa(true);
				return;
			}
		}
	}

	private int quantidadeElementosPorQuadrante(int quadrante) {
		int contador = 0;
		for (ElementosDoGol elementosDoGol : gol.getListaElementos()) {
			if (elementosDoGol.getQuadrante() == quadrante) {
				contador++;
			}
		}
		return contador;
	}

	private int sortearNumero(int quadrante) {
		int quantidadeElementosPorQuadrante = gol.getListaElementos().size() / 4;
		int quantidade = quantidadeElementosPorQuadrante(quadrante);
		int sorteado = 0;
		do {
			sorteado = (int) ((Math.random() * quantidadeElementosPorQuadrante) - 0);
		} while (sorteado > quantidade);
		return sorteado;
	}

	public ElementosDoGol sortePosicao(int quadrante) {

		int numeroSorteado = sortearNumero(quadrante);
		int contador = 0;
		ElementosDoGol aux = null;
		for (ElementosDoGol elementosDoGol : gol.getListaElementos()) {
			if (elementosDoGol.getQuadrante() == quadrante) {
				if (contador == numeroSorteado) {
					return elementosDoGol;
				}
				contador++;
				aux = elementosDoGol;
			}
		}
		return aux;
	}

	private boolean verificaVizinhacaIndividual(int auxX, int auxY) {

		ElementosDoGol e = getELementoDoGol(auxX, auxY);
		if (e != null && e.isDefesa()) {
			return true;
		}
		return false;
	}

	public ElementosDoGol getELementoDoGol(int x, int y) {
		for (ElementosDoGol elemento : gol.getListaElementos()) {
			if (elemento.getPosicaoX() == x && elemento.getPosicaoY() == y)
				return elemento;
		}
		return null;
	}

	public boolean verificaVizinhacaGeral(ElementosDoGol aux) {
		int auxX = aux.getPosicaoX();
		int auxY = aux.getPosicaoY();

		if (!verificaVizinhacaIndividual(auxX - 1, auxY))
			return false;

		else if (!verificaVizinhacaIndividual(auxX + 1, auxY))
			return false;

		else if (!verificaVizinhacaIndividual(auxX, auxY + 2))
			return false;

		else
			return true;
	}

	public void marcarPeriferia() {
		for (ElementosDoGol elementosDoGol : gol.getListaElementos()) {
			if (elementosDoGol.isDefesa()) {
				boolean saida = verificaVizinhacaGeral(elementosDoGol);
				elementosDoGol.setPeriferia(saida);
			}
		}
	}

	public String impressaomatrizGol(Goleiro goleiro) {
		String saida = "";
		for (int i = 0; i < gol.getNumeroLinhas(); i++) {
			for (int j = 0; j < gol.getNumeroColunas(); j++) {
				saida += getELementoDoGol(i, j).getSimbolo() + " ";
				if (goleiro.defendeuGol(i, j)) {
					saida += "X";
				} else if (goleiro.tomouGol(i, j)) {
					saida += "*";
				} else {
					saida += " ";
				}
			}
			saida+="\n";
		}
		return saida;
	}
}