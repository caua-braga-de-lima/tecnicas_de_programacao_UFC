package lab1;

import java.util.ArrayList;

public class Balanco 
{
	private ArrayList<Atendimento> listaDeAtendimentos;
	private ArrayList<Cabeleireiro> listaDeCabeleireiros;
	
	public Balanco(Atendimento a)
	{
		listaDeAtendimentos = new ArrayList<Atendimento>();
		listaDeCabeleireiros = new ArrayList<Cabeleireiro>();
		listaDeAtendimentos.add(a);
	}
	
	public void adAtendimento(Atendimento a)
	{
		listaDeAtendimentos.add(a);
	}
	

	public Cabeleireiro getMelhorCabeleireiro()
	{
		for(int i = 0; i < listaDeAtendimentos.size(); i++)
		{
			for(int j = i + 1; j < listaDeAtendimentos.size(); j++)
			{
				if(listaDeAtendimentos.get(i).getCabeleireiro().equals(listaDeAtendimentos.get(j).getCabeleireiro()) == true)
				{
					this.listaDeCabeleireiros.add(listaDeAtendimentos.get(i).getCabeleireiro());
				}
			}
		}
		
		int instancias[] = new int[listaDeCabeleireiros.size()];
		for(int i = 0; i < listaDeCabeleireiros.size(); i++)
		{
			for(int j = i + 1; j < listaDeCabeleireiros.size(); j++)
			{
				if(listaDeCabeleireiros.get(i).equals(listaDeCabeleireiros.get(j) )== true)
				{
					instancias[i]++;
				}
			}
		}
		
		int maior = 1;
		for(int i = 0; i < instancias.length; i++)
		{
			if(instancias[i] < instancias[maior])
			{
				maior = i;
			}
		}
		
		return listaDeCabeleireiros.get(instancias[maior]);
	}
}
