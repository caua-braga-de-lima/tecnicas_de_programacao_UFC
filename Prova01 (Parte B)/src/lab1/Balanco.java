package lab1;

import java.util.ArrayList;

public class Balanco 
{
	private ArrayList<Atendimento> listaDeAtendimentos;
	private ArrayList<String> listaDeCabeleireiros;
	
	public Balanco(Atendimento a)
	{
		listaDeAtendimentos = new ArrayList<Atendimento>();
		listaDeCabeleireiros = new ArrayList<String>();
		listaDeAtendimentos.add(a);
	}
	
	public void adAtendimento(Atendimento a)
	{
		listaDeAtendimentos.add(a);
	}
	

	public String getMelhorCabeleireiro()
	{
		for(int i = 0; i < listaDeAtendimentos.size(); i++)
		{
			for(int j = i + 1; j < listaDeAtendimentos.size(); j++)
			{
				if(listaDeAtendimentos.get(i).getCabeleireiro().getNome().equals(listaDeAtendimentos.get(j).getCabeleireiro().getNome()) == true)
				{
					this.listaDeCabeleireiros.add(listaDeAtendimentos.get(i).getCabeleireiro().getNome());
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
		
		int maior = 0;
		for(int i = 1; i < instancias.length; i++)
		{
			if(instancias[i] < instancias[maior])
			{
				maior = i;
			}
		}
		
		return listaDeCabeleireiros.get(instancias[maior]);
	}
	
	public String getMelhorCliente()
	{
		String melhorCliente = null;
		for(int i = 0; i < listaDeAtendimentos.size(); i++)
		{
			for(int j = (i+1); j < listaDeAtendimentos.size(); j++)
			{
				if(listaDeAtendimentos.get(i).getValorServicos() < listaDeAtendimentos.get(j).getValorServicos())
				{
					melhorCliente = listaDeAtendimentos.get(j).getCliente().getNome();
				}
			}
		}
		
		return melhorCliente;
	}
	
	public int getServicosGratuitos()
	{
		int cont = 1;
		for(int i = 0; i < listaDeAtendimentos.size(); i++)
		{
			if(listaDeAtendimentos.get(i).getServico(i).getValor() == 0)
			{
				cont++;
			}
		}
		
		return cont;
	}
	
	public String buscarServico(String servico)
	{
		String nome = null;
		for(int i = 0; i < listaDeAtendimentos.size(); i++)
		{
			if(listaDeAtendimentos.get(i).getServico(i).getNome().equals(servico))
			{
				nome = listaDeAtendimentos.get(i).getServico(i).getNome();
			}
			
			if(servico.equals("n"))
			{
				return "ok";
			}
		}
		if(nome.equals(null) == false)
		{
			return "Serviço encontrado: " + nome;
		}
		else
		{
			return "Serviço não encontrado";
		}
		
	}
	
	public int getQuantAtendimentos(int id)
	{
		for(int i = 0; i < listaDeAtendimentos.size(); i++)
		{
			
		}
	}
	

}
