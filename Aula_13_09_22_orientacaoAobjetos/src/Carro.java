
public class Carro {

	// lista atributos
	public int id;
	public String placa;
	public String nome;
	public int velocidade;

	// metodo construtor
	public Carro(int id_) {
		System.out.println(" 1 p");
		id = id_;
	}

	public Carro(int no, int n) {
		System.out.println(" 2 p");
		
	}

	 public Carro() {
		 System.out.println(" 0 p");
			
	 }
	
	// lista metodos
	public int up(int v) {

		return velocidade += v;
	}

	public int down(int v) {

		return velocidade -= v;
	}

	public int velocidadeAtual() {

		return velocidade;
	}

}
