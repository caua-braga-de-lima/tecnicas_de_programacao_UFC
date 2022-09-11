package aula03;

import java.util.Scanner; //comando para importar bibliotecas
// tudo que eu não usei em um pacote, preciso importar.

public class comando_scanner // classe scanner da bilbioteca java
{
	public static void main(String[] args) { // a chave em java abre escopos e escopos simbolizam espaços reservados.
												// não pode haver uma mesma variável em escopos diferentes

		Scanner entrada = new Scanner(System.in); // SINTAXE: CLASSE NOME DO OBJETO = BIBLIOTECA QUE CHAMA DO SISTEMA
													// OPERACIONAL
		/*
		 * System.out.print("Informe um número: "); entrada.nextInt(); // comando para
		 * permitir a entrada de inteiros
		 * 
		 * System.out.print("Informe um valor para A: "); int a = entrada.nextInt();
		 * 
		 * System.out.print("Informe um valor para B: "); int b = entrada.nextInt();
		 * 
		 * System.out.println("Valor de A: " + a + " Valor de B: " + b);
		 * 
		 * // System.err.print("TEXTO EM VERMELHO"); entrada.close();
		 */

//		System.out.print("Informe seu nome: ");
//		String nome = entrada.next();
//		
//		System.out.println("Bem-vindo(a), " + nome);
//		entrada.close();
		
//		switch(a)
//		{
//		case 1:
//			System.out.println("a == 1");
//			break;
//		default:
//			System.out.println(" a != 1");
//		}
		
		System.out.println("");
	}

}
