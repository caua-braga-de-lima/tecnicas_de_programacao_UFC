package apresentacao;

import java.util.Scanner;

import regras.Avaliador;
import regras.Selecao;
import regras.Goleiro;

public class Menu {

	public void iniciarAvaliacao(int linha, int coluna) {

		Avaliador avaliador = new Avaliador(linha, coluna);
		avaliador.listarGoleiros();
		apresentarMenuDeOpcaoes(avaliador);
	}

	public void listarFuncionalidades() {
		System.out.println("\n*** Avaliação de Goleiros **** \n " + "\nEscolha uma operação:"
				+ "\n1) Média de chute por goleiro" + "\t2) Pontuação dos goleiros"
				+ "\t3) Média de gols levados por seleção" + "\t4) Estatísticas dos chutos "
				+ "\t5) Gols feitos no ângulo" + "\t6) Melhores goleiros" + "\t7) Goleiro com pouca força"
				+ "\t8) Informações dos goleiros" + "\t9) Pesquisar goleiro" + "\t10) Impressão do gol \n");
	}

	public void apresentarMenuDeOpcaoes(Avaliador a) {
		int questao = 0;
		do {
			listarFuncionalidades();
			questao = interacaoUsuario("Escolha a funcionalidade desejada: ");
			switch (questao) {

			case 1:
				mediaChutesDefendidos(a);
				break;
			case 2:
				pontuacaoGoleiro(a);
				break;
			case 3:
				mediaGolsLevados(a);
				break;
			case 4:
				estatisticaChutes(a);
				break;
			case 5:
				golsFeitosNoAngulo(a);
				break;
			case 6:
				melhoresGoleiros(a);
				break;
			case 7:
				quaseGol(a);
				break;
			case 8:
				estatisticaGoleiro(a);
				break;
			case 9:
				quadranteGolsMaisTomadosGoleiroPorId(a, interacaoUsuario("Informe o ID do goleiro: "));
				break;
			case 10:
				impressaoMatrizGol(a, interacaoUsuarioLerString("Informe o nome do goleiro desejado: "));
				break;

			}
		} while (questao != 0);
	}

	private void impressaoMatrizGol(Avaliador a, String nomeGoleiro) {

		for (Selecao selecao : a.getCopa().getSelecoes()) {
			for (Goleiro g : selecao.getListaGoleiro()) {
				if (g.getNome().equals(nomeGoleiro)) {
					System.out.println(a.impressaomatrizGol(g));
				}
			}
		}
	}

	private void quadranteGolsMaisTomadosGoleiroPorId(Avaliador a, int idPesquisa) {
		for (Selecao selecao : a.getCopa().getSelecoes()) {
			for (Goleiro g : selecao.getListaGoleiro()) {
				if (g.getId() == idPesquisa) {
					System.out.println(g.quadranteMaisGolsTomados());
				}
			}

		}
	}

	private void estatisticaGoleiro(Avaliador a) {
		for (Selecao selecao : a.getCopa().getSelecoes()) {
			System.out.println(selecao.getNome() + ": ");
			for (Goleiro g : selecao.getListaGoleiro()) {
				System.out.println("Gols tomados");
				g.imprimirGolsTomados();
				System.out.println("Gols defendidos");
				g.imprimirGolsDefendidos();
				System.out.println("AAG");
				g.areaAtuacaoGoleiro();
			}

		}
	}

	private void quaseGol(Avaliador a) {
		for (Selecao selecao : a.getCopa().getSelecoes()) {
			for (Goleiro g : selecao.getListaGoleiro()) {
				System.out.println(g.getNome() + ": \n" + g.imprimirQuaseDefesa());
			}
		}
	}

	private void melhoresGoleiros(Avaliador a) {
		for (Selecao selecao : a.getCopa().getSelecoes()) {
				System.out.println(selecao.getNome() + " = " + selecao.computarMelhorGoleiro().getNome());
		}
	}

	private void golsFeitosNoAngulo(Avaliador a) {
		for (Selecao selecao : a.getCopa().getSelecoes()) {
			for (Goleiro g : selecao.getListaGoleiro()) {
				System.out.print("\n " + g.getNome());
				if (g.golsNoAngulo(a.getGol().getNumeroLinhas(), a.getGol().getNumeroColunas()))
					System.out.print("\t Levou gol no Angulo");
				else
					System.out.print("\t Não levou gol no Angulo");
			}
		}
		System.out.println("\n");
	}

	private void mediaGolsLevados(Avaliador a) {
		System.out.println(a.estatisticaDeChute());
	}

	private void estatisticaChutes(Avaliador a) {
		System.out.println("Funcionalidade 3: média de gols levados:");
		for (Selecao selecao : a.getCopa().getSelecoes()) {
			System.out.println(selecao.getNome() + ": ");
			System.out.println(selecao.mediaGoleirosGolsTomados());
		}
	}

	private void pontuacaoGoleiro(Avaliador a) {
		System.out.println("Funcionalidade 2: pontos dos goleiros: ");

		for (Selecao selecao : a.getCopa().getSelecoes()) {
			System.out.println(selecao.getNome() + ": ");
			System.out.println(selecao.pontuacaoGoleiros());
		}
	}

	private void mediaChutesDefendidos(Avaliador a) {
		System.out.println("Funcionalidade 1: média de gols defendidos:");
		for (Selecao selecao : a.getCopa().getSelecoes()) {
			System.out.println(selecao.getNome() + ": ");
			System.out.println(selecao.mediaGoleiros());
		}
	}

	public int interacaoUsuario(String msg) {
		Scanner ler = new Scanner(System.in);
		System.out.print(msg);
		return ler.nextInt();
	}

	public String interacaoUsuarioLerString(String msg) {
		Scanner ler = new Scanner(System.in);
		System.out.print(msg);
		return ler.nextLine();
	}
}
