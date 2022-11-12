package exemploStatic;

public class Teste3 {

	public void teste3() {
		Teste teste= Teste.pegarInstancia();
		teste.setNumero(200);
		System.out.println("3: "+teste.getNumero());
	}
}
