package lab1;

import java.util.ArrayList;
import java.util.Calendar;

public class Agenda 
{
	private ArrayList<Agendamento> listaDeAgendamentos;
	
	public Agenda(Agendamento agendamento)
	{
		listaDeAgendamentos = new ArrayList<Agendamento>();
		listaDeAgendamentos.add(agendamento);
	}
	
	public void adAgendamento(Agendamento agendamento)
	{
		listaDeAgendamentos.add(agendamento);
		
	}
	
//	public Agendamento getAgendamento(int id)
//	{
//		return listaDeAgendamentos.get(id)
//	}
	
	public Calendar buscarAgendamento(Calendar data)
	{
		Calendar dataEncontrada = null;
		for(int i = 0; i < listaDeAgendamentos.size(); i++)
		{
			if(listaDeAgendamentos.get(i).getData() == data)
			{
				dataEncontrada = listaDeAgendamentos.get(i).getData();
			}
		}
		
		return dataEncontrada;
	}
	
	public void buscarHorarioCabeleireiro(int id)
	{
		String saida = "";
		for(int i = 0; i < listaDeAgendamentos.size(); i++)
		{
			if(listaDeAgendamentos.get(i).getCabeleireiro().getId() == id)
			{
				saida += "A agenda do cabeleireiro " + listaDeAgendamentos.get(i).getCabeleireiro().getNome() + " é: \n";
				saida += listaDeAgendamentos.get(i).getData();
			}
		}
	}
	
	public void buscarHorarioCliente(int id)
	{
		String saida = "";
		for(int i = 0; i < listaDeAgendamentos.size(); i++)
		{
			if(listaDeAgendamentos.get(i).getCliente().getId() == id)
			{
				saida += " O horário do cliente informado é:  " + listaDeAgendamentos.get(i).getCliente().getNome() + " é: \n";
				saida += listaDeAgendamentos.get(i).getData();
			}
		}
	}
	
}

