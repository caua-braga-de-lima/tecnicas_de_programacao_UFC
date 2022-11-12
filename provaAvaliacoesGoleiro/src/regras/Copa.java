package regras;

import java.util.ArrayList;

public class Copa {

	public ArrayList<Selecao> listaSelecao;

	public Copa() {
		listaSelecao = new ArrayList<Selecao>();
	}

	public ArrayList<Selecao> getSelecoes() {
		return listaSelecao;
	}

	public void addSelecao(Selecao selecao) {
		listaSelecao.add(selecao);
	}

	public Selecao procurarGoleiro(Goleiro g) {
		for (Selecao selecao : listaSelecao) {
			for (Goleiro goleiro : selecao.getListaGoleiro()) {
				if (goleiro == g)
					return selecao;
			}
		}
		return null;
	}

}
