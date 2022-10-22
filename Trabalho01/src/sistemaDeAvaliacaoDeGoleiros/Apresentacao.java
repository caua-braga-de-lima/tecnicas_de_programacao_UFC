package sistemaDeAvaliacaoDeGoleiros;

import java.util.ArrayList;
import java.util.Scanner;

public class Apresentacao
{
	public static void divisao()
	{
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("SISTEMA DE AVALIAÇÃO DE GOLEIROS");
		divisao();
		
		// INSTANCIAS DOS GOLEIROS E DIVISAO DE SELECOES:
		
		Selecao s1 = new Selecao();
		s1.setNome("1");
		Goleiro g1 = new Goleiro("Patrick Skaggs", 1, 5, 7, 8, 9, 6, 6);
		Goleiro g2 = new Goleiro("Uehudah Hack", 2, 5, 7, 8, 9, 6, 6);
		Goleiro g3 = new Goleiro("Edison Drye", 3, 5, 8, 5, 8, 10, 7);
		Goleiro g4 = new Goleiro("Ajani Harding", 4, 6, 6, 5, 8, 7, 6);
		Goleiro g5 = new Goleiro("Orazio Hart", 5, 8, 7, 9, 9, 9, 10);
		s1.getSelecao().add(g1);
		s1.getSelecao().add(g2);
		s1.getSelecao().add(g3);
		s1.getSelecao().add(g4);
		s1.getSelecao().add(g5);
		
		Selecao s2 = new Selecao();
		s2.setNome("2");
		Goleiro g6 = new Goleiro("Tristan Karns", 6, 9, 7, 10, 7, 7, 6);
		Goleiro g7 = new Goleiro("Niven Glaser", 7, 10, 9, 7, 6, 5, 8);
		Goleiro g8 = new Goleiro("Derwyn Devers", 8, 10, 7, 9, 5, 9, 5);
		Goleiro g9 = new Goleiro("Tod Phan", 9, 10, 7, 7, 5, 5, 6);
		Goleiro g10 = new Goleiro("Eddie Hulse", 10, 7, 6, 5, 9, 7, 5);
		s2.getSelecao().add(g6);
		s2.getSelecao().add(g7);
		s2.getSelecao().add(g8);
		s2.getSelecao().add(g9);
		s2.getSelecao().add(g10);
		
		Selecao s3 = new Selecao();
		s3.setNome("3");
		Goleiro g11 = new Goleiro("Welford Yepez", 11, 5, 8, 8, 7, 7, 8);
		Goleiro g12 = new Goleiro("Rishley Snyder", 12, 6, 5, 6, 5, 7, 6);
		Goleiro g13 = new Goleiro("Milo Mccurdy", 13, 10, 9, 8, 6, 10, 9);
		Goleiro g14 = new Goleiro("Carden Justus", 14, 8, 5, 8, 5, 10, 7);
		Goleiro g15 = new Goleiro("Carlyon Gorby", 15, 8, 5, 8, 8, 8, 6);
		s3.getSelecao().add(g11);
		s3.getSelecao().add(g12);
		s3.getSelecao().add(g13);
		s3.getSelecao().add(g14);
		s3.getSelecao().add(g15);
		
		Selecao s4 = new Selecao();
		s4.setNome("4");
		Goleiro g16 = new Goleiro("Mungo Spangler", 16, 8, 10, 9, 8, 9, 5);
		Goleiro g17 = new Goleiro("Whitmore Squires", 17, 9, 10, 7, 9, 9, 10);
		Goleiro g18 = new Goleiro("Pedrog Mccurdy", 18, 8, 5, 10, 5, 7, 7);
		Goleiro g19 = new Goleiro("Ridgley Leo", 19, 8, 8, 8, 9, 9, 9);
		Goleiro g20 = new Goleiro("Bolton Tarin", 20, 9, 8, 7, 6, 9, 10);
		s4.getSelecao().add(g16);
		s4.getSelecao().add(g17);
		s4.getSelecao().add(g18);
		s4.getSelecao().add(g19);
		s4.getSelecao().add(g20);
		
		Selecao s5 = new Selecao();
		s5.setNome("5");
		Goleiro g21 = new Goleiro("Edison Loy", 21, 7, 7, 5, 10, 10, 7);
		Goleiro g22 = new Goleiro("Delling Herndon", 22, 7, 5, 5, 8, 9, 9);
		Goleiro g23 = new Goleiro("Senichi Iorio", 23, 7, 7, 5, 8, 10, 5);
		Goleiro g24 = new Goleiro("Albin Kerner", 24, 6, 7, 8, 8, 9, 9);
		Goleiro g25 = new Goleiro("Jivin Justus", 25, 9, 10, 8, 7, 7, 5);
		s5.getSelecao().add(g21);
		s5.getSelecao().add(g22);
		s5.getSelecao().add(g23);
		s5.getSelecao().add(g24);
		s5.getSelecao().add(g25);
		
		//INSTANCIAS DE CHUTES:
		
		Chute c1 = new Chute(1, 2, 1, 4, 7);
		Chute c2 = new Chute(2, 6, 1, 3, 6);
		Chute c3 = new Chute(3, 9, 2, 4, 15);
		Chute c4 = new Chute(4, 5, 4, 6, 11);
		Chute c5 = new Chute(5, 3, 4, 8, 13);
		Chute c6 = new Chute(6, 3, 3, 6, 4);
		Chute c7 = new Chute(7, 4, 4, 5, 8);
		Chute c8 = new Chute(8, 7, 4, 7, 14);
		Chute c9 = new Chute(9, 8, 4, 7, 14);
		Chute c10 = new Chute(10, 4, 4, 6, 12);
		Chute c11 = new Chute(11, 2, 4, 5, 15);
		Chute c12 = new Chute(12, 7, 3, 6, 4);
		Chute c13 = new Chute(13, 3, 3, 8, 2);
		Chute c14 = new Chute(14, 9, 4, 7, 10);
		Chute c15 = new Chute(15, 10, 4, 7, 12);
		Chute c16 = new Chute(16, 5, 1, 4, 2);
		Chute c17 = new Chute(17, 3, 4, 5, 13);
		Chute c18 = new Chute(18, 10, 2, 4, 16);
		Chute c19 = new Chute(19, 10, 4, 5, 16);
		Chute c20 = new Chute(20, 10, 2, 3, 14);
		Chute c21 = new Chute(21, 9, 2, 1, 8);
		Chute c22 = new Chute(22, 4, 4, 8, 16);
		Chute c23 = new Chute(23, 8, 4, 6, 14);
		Chute c24 = new Chute(24, 7, 4, 7, 11);
		Chute c25 = new Chute(25, 6, 1, 0, 3);
		Chute c26 = new Chute(26, 5, 3, 6, 7);
		Chute c27 = new Chute(27, 3, 3, 8, 4);
		Chute c28 = new Chute(28, 4, 3, 6, 7);
		Chute c29 = new Chute(29, 10, 2, 2, 13);
		Chute c30 = new Chute(30, 7, 3, 5, 3);
		
		ArrayList<Chute> listaDeChutes = new ArrayList<Chute>();
		listaDeChutes.add(c1);
		listaDeChutes.add(c2);
		listaDeChutes.add(c3);
		listaDeChutes.add(c4);
		listaDeChutes.add(c5);
		listaDeChutes.add(c6);
		listaDeChutes.add(c7);
		listaDeChutes.add(c8);
		listaDeChutes.add(c9);
		listaDeChutes.add(c10);
		listaDeChutes.add(c11);
		listaDeChutes.add(c12);
		listaDeChutes.add(c13);
		listaDeChutes.add(c14);
		listaDeChutes.add(c15);
		listaDeChutes.add(c15);
		listaDeChutes.add(c16);
		listaDeChutes.add(c17);
		listaDeChutes.add(c18);
		listaDeChutes.add(c19);
		listaDeChutes.add(c20);
		listaDeChutes.add(c21);
		listaDeChutes.add(c22);
		listaDeChutes.add(c23);
		listaDeChutes.add(c24);
		listaDeChutes.add(c25);
		listaDeChutes.add(c26);
		listaDeChutes.add(c27);
		listaDeChutes.add(c28);
		listaDeChutes.add(c29);
		listaDeChutes.add(c30);	
		
		
		Gol gol = new Gol(s1, s2, s3, s4, s5);
		gol.setQuadrante();
		gol.setSecao();
		
		
		//ADICIONA A LISTA DE 30 CHUTES PARA CADA GOLEIRO:
		
		for(Selecao s : gol.getListaSelecao())
		{
			for(Goleiro g : s.getSelecao())
			{
				g.adListaDeChutes(listaDeChutes);
			}
		}
		
		Balanco b = new Balanco(gol);

		//QUESTIONARIO:
		
		/*1) O sistema deverá mostrar a média de quantos chutes os 		goleiros de cada seleção
		conseguiram pegar.*/
		
		System.out.println(b.calcularMedia());
		
		divisao();
		
		/*2) O sistema deverá gerar a pontuação dos goleiros de cada 		seleção e informar qual é
		o goleiro mais indicado para ser o titular.*/
		
		System.out.println(b.calcularTitular());
		
		divisao();
		
		/*3) O sistema deverá mostrar a média de quantos gols os goleiros de cada seleção
		levou.*/
		
		System.out.println(b.calcularGols());
		
		/*4) O sistema deverá mostrar para a lista de chutes, quantos chutes foram para fora,
		quantos acertaram a trave do lado esquerdo, quantos acertaram a trave do lado
		direito e quantos acertaram a trave do lado direito. obs: essa computação é feita
		apenas uma vez, a lista de chutes é a mesma para cada goleiro.*/
		
		System.out.println(b.analiseDeChutes());
		
		divisao();
		
		/*5) O sistema deverá mostrar os gols feitos no ângulo do 		gol.*/
		
		System.out.println(b.chutesAnguloGol());
		
		divisao();
		
		/*8) O sistema deverá imprimir para cada goleiro as seguintes 		informações:
		Nome, seleção, gols defendidos, gols tomados e AAG.*/
		
		System.out.println(b.analiseGoleiros());
		
		divisao();
		
		/*9) O sistema deverá permitir para um determinado goleiro informado pelo id seja
		indicado o quadrante em que ele tomou mais gols.*/
		
		System.out.print("INFORME O ID DE UM GOLEIRO: ");
		Scanner input = new Scanner(System.in);
		System.out.println(b.informarQuadrante(input.nextInt()));
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


	

	
}
