package ex01;

public class Main 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ControleRemoto controle = new ControleRemoto();
		
		controle.consultar();
		
		controle.trocarCanal('+');
		controle.trocarCanal('+');
		controle.trocarCanal('+');
		
		controle.ajustarVolume('+');
	}

}