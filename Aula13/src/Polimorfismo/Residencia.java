package Polimorfismo;

import java.util.ArrayList;

public class Residencia 
{
	private ArrayList<Medico> listaDeProfissionais;
	
	public Residencia()
	{
		listaDeProfissionais = new ArrayList<Medico>();
	}
	//POLIMORFISMO - ONDE O PAI PASSA, O FILHO PASSA 
	public void adicionarProfissional(Medico e)
	{
		this.listaDeProfissionais.add(e);
	}
	
	public String mostrarEquipe()
	{
		String msg = "EQUIPE: \n";
		
		for(Medico m : listaDeProfissionais)
		{
			msg += "profissional: " + m.nome() + "\n";
		}
		
		return msg;
	}
}
