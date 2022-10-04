package ex05;

public class Main 
{

	public static void main(String[] args) 
	{
		Empregado e = new Empregado("Cauã", "Braga", 13);
		e.setSalarioBase(900);
		e.setFrequencia(24);
		
		System.out.println("O salário é: " + e.calcSalario());
		
		

	}

}
