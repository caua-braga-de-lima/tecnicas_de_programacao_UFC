package aula13_10_22;

import java.util.ArrayList;

public class A {
	ArrayList<Integer> lista;

	public ArrayList<Integer> a() {
		System.out.println("Classe A");
		System.out.println("A");

		try {
//			lista = new ArrayList<Integer>();
			lista.add(10);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println(" Executa sempre");
		}

		System.out.println("AAAAA");
		return lista;
	}
}
