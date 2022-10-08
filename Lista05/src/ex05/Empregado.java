package ex05;

import java.util.ArrayList;

public class Empregado 
{
	private int id;
	private String nome;
	private String sobrenome;
	private double salario;
	private Boolean[] frequencia;
	
	public Empregado(String nome, String sobrenome)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		frequencia = new Boolean[30];
	}
	
	public Empregado(String nome, String sobrenome, int id)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.id = id;
		frequencia = new Boolean[30];
	}
	
	public void setSalarioBase(double salario)
	{
		this.salario = salario;
	}
	
	public void setFrequencia(int dias)
	{
		if(dias <= 30)
		{
			int posicao = 0;
			for(int i = 0; i < dias; i++)
			{
				this.frequencia[i] = true;
				posicao++;
			}
			
			while(posicao < this.frequencia.length)
			{
				this.frequencia[posicao] = false;
				posicao++;
			}

		}
	}
	
	public double calcSalario()
	{
		double salario = 0;
		ArrayList<Boolean> verificarFrequencia = new ArrayList<Boolean>();
		for(int i = 0; i < this.frequencia.length; i++)
		{
			if(frequencia[i] == true)
			{
				verificarFrequencia.add(frequencia[i]);
			}
		}
		
		if(verificarFrequencia.size() == 30)
		{
			this.salario += (0.01*this.salario); 
		}
		else if(verificarFrequencia.size() <= 27 && verificarFrequencia.size() >= 25)
		{
			this.salario -= (0.02*this.salario);
		}
		else if(verificarFrequencia.size() <= 24 && verificarFrequencia.size() >= 20)
		{
			for(Boolean f : verificarFrequencia)
			{
				if(f == false)
				{
					this.salario -= (0.03*this.salario);
				}
			}
		}
		else if(verificarFrequencia.size() < 20)
		{
			this.salario *= 0.2;
		}
		
		return this.salario;
		
	}
}
