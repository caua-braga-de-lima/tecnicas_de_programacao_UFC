package business;
import javax.swing.ImageIcon;

public class SoccerTeam 
{
	private String name;
	private ImageIcon flag;
	private int score;
	
	public SoccerTeam(String name, ImageIcon flag, int score)
	{
		this.name = name;
		this.flag = flag;
		this.score = score;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public ImageIcon getFlag() 
	{
		return flag;
	}

	public void setFlag(ImageIcon flag) 
	{
		this.flag = flag;
	}

	public int getScore() 
	{
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}
}
