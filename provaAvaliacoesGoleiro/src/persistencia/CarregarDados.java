package persistencia;

import java.util.ArrayList;

import regras.Goleiro;
import regras.Chute;

public class CarregarDados {

	private ArrayList<Goleiro> listaGoleiros;
	private ArrayList<Chute> listaChute;

	public CarregarDados() {
		listaGoleiros = new ArrayList<Goleiro>();
		listaChute = new ArrayList<Chute>();
		this.cargarChutes();
		this.cargarGoleiros();
	}

	public ArrayList<Goleiro> getListaGoleiros() {
		return listaGoleiros;
	}

	public ArrayList<Chute> getListaChute() {
		return listaChute;
	}

	public void cargarGoleiros() {
		listaGoleiros.add(new Goleiro(0, "fake", 10, 10, 10, 10, 10, 10));

		listaGoleiros.add(new Goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		listaGoleiros.add(new Goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10));
		listaGoleiros.add(new Goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7));
		listaGoleiros.add(new Goleiro(4, "Ajani Harding", 6, 6, 5, 8, 7, 6));
		listaGoleiros.add(new Goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10));
		listaGoleiros.add(new Goleiro(6, "Tristan Karns", 9, 7, 10, 7, 7, 6));
		listaGoleiros.add(new Goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8));
		listaGoleiros.add(new Goleiro(8, "Derwyn Devers", 10, 7, 9, 5, 9, 5));
		listaGoleiros.add(new Goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6));
		listaGoleiros.add(new Goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5));
		listaGoleiros.add(new Goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8));
		listaGoleiros.add(new Goleiro(12, "Rishley Snyder", 6, 5, 6, 5, 7, 6));
		listaGoleiros.add(new Goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9));
		listaGoleiros.add(new Goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7));
		listaGoleiros.add(new Goleiro(15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6));
		listaGoleiros.add(new Goleiro(16, "Mungo Spangler", 8, 10, 9, 8, 9, 5));
		listaGoleiros.add(new Goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9, 10));
		listaGoleiros.add(new Goleiro(18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7));
		listaGoleiros.add(new Goleiro(19, "Ridgley Leo", 8, 8, 8, 9, 9, 9));
		listaGoleiros.add(new Goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10));
		listaGoleiros.add(new Goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7));
		listaGoleiros.add(new Goleiro(22, "Delling Herndon", 7, 5, 5, 8, 9, 9));
		listaGoleiros.add(new Goleiro(23, "Senichi Iorio", 7, 7, 5, 8, 10, 5));
		listaGoleiros.add(new Goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9));
		listaGoleiros.add(new Goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5));
		listaGoleiros.add(new Goleiro(26, "Clement Fleisher", 10, 9, 10, 5, 7, 8));
	}

	public void cargarChutes() {
		listaChute.add(new Chute(1, 2, 1, 4, 7));
		listaChute.add(new Chute(2, 6, 1, 3, 6));
		listaChute.add(new Chute(3, 9, 2, 4, 15));
		listaChute.add(new Chute(4, 5, 4, 6, 11));
		listaChute.add(new Chute(5, 3, 4, 8, 13));
		listaChute.add(new Chute(6, 3, 3, 6, 4));
		listaChute.add(new Chute(7, 4, 4, 5, 8));
		listaChute.add(new Chute(8, 7, 4, 7, 14));
		listaChute.add(new Chute(9, 8, 4, 7, 14));
		listaChute.add(new Chute(10, 4, 4, 6, 12));
		listaChute.add(new Chute(11, 2, 4, 5, 15));
		listaChute.add(new Chute(12, 7, 3, 6, 4));
		listaChute.add(new Chute(13, 3, 3, 8, 2));
		listaChute.add(new Chute(14, 9, 4, 7, 10));
		listaChute.add(new Chute(15, 10, 4, 7, 12));
		listaChute.add(new Chute(16, 5, 1, 4, 2));
		listaChute.add(new Chute(17, 3, 4, 5, 13));
		listaChute.add(new Chute(18, 10, 2, 4, 16));
		listaChute.add(new Chute(19, 10, 4, 5, 16));
		listaChute.add(new Chute(20, 10, 2, 3, 14));
		listaChute.add(new Chute(21, 9, 2, 1, 8));
		listaChute.add(new Chute(22, 4, 4, 8, 16));
		listaChute.add(new Chute(23, 8, 4, 6, 14));
		listaChute.add(new Chute(24, 7, 4, 7, 11));
		listaChute.add(new Chute(25, 6, 1, 0, 3));
		listaChute.add(new Chute(26, 5, 3, 6, 7));
		listaChute.add(new Chute(27, 3, 3, 8, 4));
		listaChute.add(new Chute(28, 4, 3, 6, 7));
		listaChute.add(new Chute(29, 10, 2, 2, 13));
		listaChute.add(new Chute(30, 7, 3, 5, 3));
	}
}
