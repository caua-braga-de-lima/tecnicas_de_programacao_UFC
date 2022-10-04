package ex01;

public class ControleRemoto 
{
	public static int volume;
	public static int canal;
	
	public ControleRemoto()
	{
		System.out.println("CLICK! O Controle está funcionando!");
	}
	
	public void ajustarVolume(char volume_)
	{
		if(volume_ == '+')
		{
			volume++;
		}
		else if(volume_ == '-')
		{
			volume--;
		}
		
		if(volume < 0)
		{
			volume = 0;
		}
		System.out.println(" ");
		System.out.println("VOLUME: " + volume + "%");
		System.out.println(" ");
	}
	
	public void trocarCanal(char canal_)
	{
		if(canal_ == '+')
		{
			canal++;
		}
		else if(canal_ == '-')
		{
			canal--;
		}
		
		if(canal <= 0)
		{
			canal = 1;
		}
		
		if(canal < 10)
		{
			System.out.println(" ");
			System.out.println("CANAL: 0" + canal);
			System.out.println(" ");
		}
		else
		{
			System.out.println(" ");
			System.out.println("CANAL: " + canal);
			System.out.println(" ");
		}
		
	}
	
	public void selecionarCanal(int canal)
	{
		this.canal = canal;
	
		if(canal <= 0)
		{
			System.out.println("CANAL: 0" + this.canal );
		}
		else
		{
			System.out.println("CANAL: " + this.canal);
		}
		
	}
	
	public static void consultar()
	{
		System.out.println(" ");
		System.out.println("STATUS:");
		System.out.println("VOLUME: " + volume);
		System.out.println("CANAL: " + canal);
		System.out.println(" ");
	}
}
