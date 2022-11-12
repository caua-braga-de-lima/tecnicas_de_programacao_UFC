package cenario;

import java.util.ArrayList;

public class Gol {

	private ArrayList<ElementosDoGol> listaElementos;
	private int numeroLinhas;
	private int numeroColunas;

	public Gol(int numeroLinhas, int numeroColunas) {
		this.numeroLinhas = numeroLinhas;
		this.numeroColunas = numeroColunas;
		listaElementos = new ArrayList<ElementosDoGol>();
		fabricaDeGol();
	}

	public int getNumeroLinhas() {
		return numeroLinhas;
	}

	public int getNumeroColunas() {
		return numeroColunas;
	}

	public void fabricaDeGol() {
		criarTraveEsquerda();
		criarTraveDiretira();
		criarTraveSuperior();
		criarPosicoesForaDoGol();
		criarPosicoesDentroDoGol();
		criarGaveta();
	}

	private void criarTraveEsquerda() {
		int quadrante = 0;

		for (int i = 1; i < numeroLinhas; i++) {
			if (i < numeroLinhas / 2)
				quadrante = 1;
			else
				quadrante = 3;
			listaElementos.add(new TraveEsquerda(i, 1, quadrante));
		}
	}

	private void criarTraveDiretira() {
		int quadrante = 0;

		for (int i = 1; i < numeroLinhas; i++) {
			if (i < numeroLinhas / 2)
				quadrante = 2;
			else
				quadrante = 4;
			listaElementos.add(new TraveDireita(i, numeroColunas - 2, quadrante));
		}
	}

	private void criarTraveSuperior() {
		int quadrante = 0;

		for (int i = 1; i < numeroColunas - 1; i++) {
			if (i < numeroColunas / 2)
				quadrante = 1;
			else
				quadrante = 2;
			listaElementos.add(new TraveSuperior(1, i, quadrante));
		}
	}

	private void criarPosicoesForaDoGol() {
		int quadrante = 0;

		// lado esquerdo
		for (int i = 0; i < numeroLinhas; i++) {
			if (i < numeroLinhas / 2)
				quadrante = 1;
			else
				quadrante = 3;
			listaElementos.add(new ForaDoGol(i, 0, quadrante));
		}
		// lado direito
		for (int i = 0; i < numeroLinhas; i++) {
			if (i < numeroLinhas / 2)
				quadrante = 2;
			else
				quadrante = 4;
			listaElementos.add(new ForaDoGol(i, numeroColunas - 1, quadrante));
		}

		// superior
		for (int i = 0; i < numeroColunas; i++) {
			if (i < numeroLinhas / 2)
				quadrante = 1;
			else
				quadrante = 2;
			listaElementos.add(new ForaDoGol(0, i, quadrante));
		}
	}

	private void criarPosicoesDentroDoGol() {
		int quadrante = 1;
		for (int i = 2; i < numeroLinhas; i++) {
			for (int j = 2; j < numeroColunas - 2; j++) {

				if (i < numeroLinhas / 2 && j < numeroColunas / 2)
					quadrante = 1;

				else if (i >= numeroLinhas / 2 && j < numeroColunas / 2)
					quadrante = 3;

				else if (i < numeroLinhas / 2 && j >= numeroColunas / 2)
					quadrante = 2;

				else
					quadrante = 4;
				listaElementos.add(new DentroDoGol(i, j, quadrante));
			}
		}
	}

	public void criarGaveta() {
		int cont = 0;
		for (ElementosDoGol elementosDoGol : listaElementos) {

			if (elementosDoGol.posicaoX == 2 && elementosDoGol.posicaoY == 2) {
				listaElementos.set(cont, new Gaveta(2, 2, 1));
			}
			if (elementosDoGol.posicaoX == 2 && elementosDoGol.posicaoY == (numeroColunas - 3)) {
				listaElementos.set(cont, new Gaveta(2, (numeroColunas - 3), 2));
			}
			cont++;
		}
	}

	public ArrayList<ElementosDoGol> getListaElementos() {
		return listaElementos;
	}

	public String imprimirGol() {
		String saida = "";
		for (ElementosDoGol elementosDoGol : listaElementos) {
			if (elementosDoGol.quadrante == 1)
				saida += elementosDoGol.getClass() + "[" + elementosDoGol.posicaoX + "," + elementosDoGol.posicaoY + "]"
						+ elementosDoGol.quadrante + "\n";
		}
		return saida;
	}

}
