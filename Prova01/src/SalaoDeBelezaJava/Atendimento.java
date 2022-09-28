package SalaoDeBelezaJava;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento 
{
	private Cliente clienteAtendido;
	private Calendar data;
	private ArrayList<Serviço>listaDeServiços;
	private Cabeleireiro cabeleireiro;
	 
	
	public Atendimento(Cliente clienteAtendido)
	{
		this.listaDeServiços = new ArrayList<Serviço>();
	}
	
	public Calendar setData(Calendar data)
	{
		this.data = data;
		return this.data;
	}
	
	public ArrayList<Serviço> setListaDeServiços(Serviço listaDeServiços)
	{
		this.listaDeServiços.add(listaDeServiços);
		return this.listaDeServiços;
	}
	
	public Cabeleireiro setCabeleireiro(Cabeleireiro cabeleireiro)
	{
		this.cabeleireiro = cabeleireiro;
		return this.cabeleireiro;
	}
	
	public Cliente getCliente()
	{
		return this.clienteAtendido;
	}
	
	public Calendar getData()
	{
		return this.data;
	}
	
	
}
