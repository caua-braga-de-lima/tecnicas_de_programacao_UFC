package SalaoDeBelezaJava;

import java.util.Calendar;

public class Agendamento 
{
	private int id;
	private Calendar data;
	private Cliente cliente;
	private Calendar hora;
	private Calendar minuto;
	
	public int setId(int id)
	{
		this.id = id;
		return this.id;
	}
	
	public Calendar setData(Calendar data)
	{
		this.data = data;
		return this.data;
	}
	
	public Cliente setCliente(Cliente cliente)
	{
		this.cliente = cliente;
		return this.cliente;
	}
	
	public Calendar setHora(Calendar hora)
	{
		this.hora = hora;
		return this.hora;
	}
	
	public Calendar setMinuto(Calendar minuto)
	{
		this.minuto = minuto;
		return this.minuto;
	}
}
