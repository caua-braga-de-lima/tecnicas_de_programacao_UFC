package aula25_08_22;

import java.util.Scanner;

public class MainTeste {

	
	public static int primeiroNumero(int numero) {
		return numero;
	}
	
	public static int segundoNumero(int n) {
		return n;
	}
	
	public static String msg( String m) {
		
		return m;
	}
	public static int interacaoComUsuario() {
		System.out.println("Digite um numero");
		Scanner entrada = new Scanner(System.in);
//		System.out.println("Numero informado: " + entrada.nextInt());
		return entrada.nextInt();
	}

	public static void main(String[] args) {

		// for (int i = 1; i < 100; i++) {
		//
		// if (i % 2 == 0)
		// System.out.println("Numero par: " + i);
		// else
		// System.out.println("Numero impar: " + i);
		//
		// }
		// int i = 0;
		//
		// while (i < 100) {
		//
		// if (i % 2 == 0)
		// System.out.println("Numero par: " + i);
		// else
		// System.out.println("Numero impar: " + i);
		//
		// i++;
		// }
		// do {
		//
		// System.out.println("teste");
		//
		//
		// }while(true);

//		interacaoComUsuario();


//		System.out.println("Numero informado"+ interacaoComUsuario());

		System.out.println(msg("Soma: ") +  (primeiroNumero(10) + segundoNumero(20))  );
	}

}
