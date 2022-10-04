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
		controle.selecionarCanal(5);
		controle.trocarCanal('+');
		controle.trocarCanal('-');
		controle.selecionarCanal(24);
		controle.trocarCanal('-');
	}

}
