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
				p[i][j].setSecao(i, j);
				p[i][j].setQuadrante(i, j);
				
				if(p[i][j].getSecao().equals("FORA") == true)
				{
					System.out.print(" F ");
				}
				else if(p[i][j].getSecao().equals("TRAVE") == true)
				{
					System.out.print(" T ");
				}
				else
				{
					System.out.print(" G ");
				}
			}
			System.out.println(" ");
		}
		
		System.out.println(p[6][12].GetQuadrante());
	}

}
