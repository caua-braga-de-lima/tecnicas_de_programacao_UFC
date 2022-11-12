package regras;

import java.util.ArrayList;
import cenario.ElementosDoGol;

public class Goleiro {

	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;

	private ArrayList<ElementosDoGol> golsTomados;
	private ArrayList<ElementosDoGol> golsDefendidos;
	private ArrayList<ElementosDoGol> quaseDefesa;

	public Goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca,
			int equilibrio) {
		this.id = id;
		this.nome = nome;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.forca = forca;
		this.equilibrio = equilibrio;
		golsTomados = new ArrayList<ElementosDoGol>();
		golsDefendidos = new ArrayList<ElementosDoGol>();
		quaseDefesa = new ArrayList<ElementosDoGol>();
	}

	public void addGolTomado(ElementosDoGol e) {
		golsTomados.add(e);
	}

	public void addGolDefendido(ElementosDoGol e) {
		golsDefendidos.add(e);
	}

	public void addGolQuaseDefesa(ElementosDoGol e) {
		quaseDefesa.add(e);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public int getFlexibilidade() {
		return flexibilidade;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public int getCoordenacao() {
		return coordenacao;
	}

	public int getForca() {
		return forca;
	}

	public int getEquilibrio() {
		return equilibrio;
	}

	public ArrayList<ElementosDoGol> getGolsTomados() {
		return golsTomados;
	}

	public ArrayList<ElementosDoGol> getGolsDefendidos() {
		return golsDefendidos;
	}

	public String imprimirGolsTomados() {
		String saida = "";
		for (ElementosDoGol elementosDoGol : golsTomados) {
			saida += elementosDoGol.getPosicaoX() + " - " + elementosDoGol.getPosicaoY() + " : "
					+ elementosDoGol.getQuadrante() + "\n";
		}
		return saida;
	}

	public String imprimirGolsDefendidos() {
		String saida = "";
		for (ElementosDoGol elementosDoGol : golsDefendidos) {
			saida += elementosDoGol.getPosicaoX() + " - " + elementosDoGol.getPosicaoY() + " : "
					+ elementosDoGol.getQuadrante() + "\n";
		}
		return saida;
	}

	public String imprimirQuaseDefesa() {
		String saida = "";
		for (ElementosDoGol elementosDoGol : quaseDefesa) {
			saida += elementosDoGol.getPosicaoX() + " - " + elementosDoGol.getPosicaoY() + " : "
					+ elementosDoGol.getQuadrante() + "\n";
		}
		return saida;
	}

	public int quantidadeDeGolsToamdados(ElementosDoGol e) {
		int contador = 0;
		for (ElementosDoGol elementosDoGol : golsTomados) {
			if (elementosDoGol == e)
				contador++;
		}
		return contador;
	}

	public String quadranteMaisGolsTomados() {
		String saida = "";
		for (ElementosDoGol elementosDoGol : golsTomados) {
			saida += elementosDoGol.getPosicaoX() + " - " + elementosDoGol.getPosicaoY() + " : "
					+ quantidadeDeGolsToamdados(elementosDoGol);
		}
		return saida;
	}

	public boolean tomouGol(int linha, int coluna) {
		for (ElementosDoGol e : golsTomados) {
			if (e.getPosicaoX() == linha && e.getPosicaoY() == coluna) {
				return true;
			}
		}
		return false;
	}

	public boolean defendeuGol(int linha, int coluna) {
		for (ElementosDoGol e : golsDefendidos) {
			if (e.getPosicaoX() == linha && e.getPosicaoY() == coluna) {
				return true;
			}
		}
		return false;
	}

	public int areaAtuacaoGoleiro() {
		float aag = ((velocidade * 3) + (flexibilidade * 2) + (agilidade * 3) + (coordenacao * 2) + (forca)
				+ (equilibrio * 2)) / 8;

		return (int) aag;
	}

	public boolean golsNoAngulo(int anguloDireitoX, int anguloDireitoY) {
		boolean gol = false;
		for (ElementosDoGol e : golsTomados) {
			if (e.getPosicaoX() == 2 && e.getPosicaoY() == 2) {
				gol = true;
			}
			if (e.getPosicaoX() == anguloDireitoX && e.getPosicaoY() == anguloDireitoY) {
				gol = true;
			}
		}
		return gol;
	}

}
