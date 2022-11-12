package exemploStatic;

public class Main {

	public static void main(String[] args) {
		 
		
		Teste teste= Teste.pegarInstancia();		
		System.out.println("1: "+ teste.getNumero());
		
		Teste2 t2 = new Teste2();
		t2.testar();
		
		Teste3 t3 = new Teste3();
		t3.teste3();
		
		System.out.println("1: " +teste.getNumero());
	    t2.testar();
		
	}

}
