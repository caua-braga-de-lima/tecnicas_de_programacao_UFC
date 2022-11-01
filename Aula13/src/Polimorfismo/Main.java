package Polimorfismo;

public class Main {

	public static void main(String[] args) 
	{
		Residencia r = new Residencia();
		Enfermeiro e = new Enfermeiro();
		Medico m = new Medico();
		
		r.adicionarProfissional(e);
		r.adicionarProfissional(m);
	
		System.out.println(r.mostrarEquipe());
		
	}

}
