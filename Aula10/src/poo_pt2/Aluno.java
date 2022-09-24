package poo_pt2;

public class Aluno 
{
	// atributo
	public int matricula;
	private double ira; // um atributo ou método privado não é visível fora da sua classe;
	public String nome;
	
	//método construtor - método executado quando o objeto nasce. 
	public Aluno(int mat) 
	{
		matricula = mat;
		System.out.print("O aluno foi cadastrado.");
	}
	
	//método construtor 2 - passando o nome como parâmetro
	public Aluno(String nome_)
	{
		nome = nome_;
		System.out.println("O aluno " + nome + " foi cadastrado.");
	}

	public double getIra() { // permite mostrar o atributo em outra classe
		return ira;
	}

	public void setIra(double ira) { // permite passar o atributo como parametro em outra classe
		this.ira = ira;
	}
	
	
}