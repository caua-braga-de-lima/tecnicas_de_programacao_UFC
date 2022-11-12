package regras;

import java.util.ArrayList;

public class Selecao {

	private ArrayList<Goleiro> listaGoleiro;

	private String nome;
	

	public Selecao() {
		listaGoleiro = new ArrayList<Goleiro>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Goleiro> getListaGoleiro() {
		return listaGoleiro;
	}

	public void addGoleiro(Goleiro g) {
		listaGoleiro.add(g);
	}

	public String mediaGoleiros() {
		int total = 0;
		float media = 0;
		String saida = "";
		for (Goleiro goleiro : listaGoleiro) {

			total = goleiro.getGolsDefendidos().size() + goleiro.getGolsTomados().size();

			if (goleiro.getGolsDefendidos().size() != 0)
				media = total / goleiro.getGolsDefendidos().size();
			else
				media = 0;
			saida += "Goleiro: " + goleiro.getNome() + " (media): " + media + "\n";
		}
		return saida;
	}

	public String mediaGoleirosGolsTomados() {
		int total = 0;
		float media = 0;
		String saida = "";
		for (Goleiro goleiro : listaGoleiro) {

			total = goleiro.getGolsDefendidos().size() + goleiro.getGolsTomados().size();

			if (goleiro.getGolsTomados().size() != 0)
				media = total / goleiro.getGolsTomados().size();
			else
				media = 0;
			saida += "Goleiro: " + goleiro.getNome() + " (media): " + media + "\n";
		}
		return saida;
	}

	public String pontuacaoGoleiros() {
		String saida = "";

		for (Goleiro goleiro : listaGoleiro) {
			saida += goleiro.getNome() + " (pontuação): " + goleiro.getGolsDefendidos().size() + "\n";
		}
		return saida;
	}

	public Goleiro computarMelhorGoleiro() {
		Goleiro melhor = null;
		int maior = 0;
		for (Goleiro goleiro : listaGoleiro) {
			if (goleiro.getGolsDefendidos().size() > maior) {
				maior = goleiro.getGolsDefendidos().size();
				melhor = goleiro;
			}
		}
		return melhor;
	}

}
