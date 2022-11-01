package aula13_10_22;

public class B {

	public void b() {
		System.out.println("Classe B");
		A a = new A();
		 try {
		System.out.println(a.a());
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		System.out.println("B");
	}

	public void testeB(boolean poltrona) throws IngressoJaVendido {

		if (poltrona)
			throw new IngressoJaVendido();
	}
}
