package sistemaDeAvaliacaoDeGoleiros;

public class Main
{
	public static void instancias()
	{
		
	}
	public static void main(String[] args) 
	{
		Gol p[][] = new Gol[9][17];
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 17; j++)
			{
				p[i][j] = new Gol(); 
				p[i][j].setPosicaoX(i);
				p[i][j].setPosicaoY(j);
			}
		}
		
		System.out.println(p[1][16].getPosicaoY());

	}

}
