package exemploStatic;

public class Teste {

	private static int numero;
    private static Teste instancia;
	
	
	private Teste() {
		numero=100;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static Teste pegarInstancia() {
		if(instancia == null)
			instancia = new Teste();
		
		return instancia;
	}
	
}
