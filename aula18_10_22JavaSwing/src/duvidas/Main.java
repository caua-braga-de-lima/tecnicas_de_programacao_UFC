package duvidas;

public class Main {

	public static void exemplo() {

		int vet[] = new int[11];

		for (int i = 0; i <= 10; i++) {
			try {
				vet[i] = i;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("fim");
			}
			System.out.println(i);
		}
	}

	public static void teste(int numero) throws NumeroNaoPermitido {
		if (numero < 0)
			throw new NumeroNaoPermitido();
	}

	public static void main(String[] args) {
		// exemplo();
		try {
			teste(-1);
		} catch (NumeroNaoPermitido e) {
			e.printStackTrace();
		}finally {
			
		}

	}

}
