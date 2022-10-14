package aula13_10_22;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main");
		A a = new A();

		// a.test1(10);

		B b = new B();
		try {
			b.testeB(true);
		} catch (IngressoJaVendido e) {
			e.printStackTrace();
		}

	}

}
