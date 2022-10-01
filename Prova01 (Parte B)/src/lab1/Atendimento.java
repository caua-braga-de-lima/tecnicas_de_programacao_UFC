package lab1;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento 
{

	private Cliente cliente;
	private ArrayList<Servico> listaServico;
	private Calendar data;
	private Cabeleireiro cabeleireiro;
	private int instanciaDeCabeleireiro;

	public Atendimento(Cliente cliente, Cabeleireiro cabeleireiro) 
	{
		this.cliente = cliente;
		this.data = Calendar.getInstance();
		this.cabeleireiro = cabeleireiro;
		listaServico = new ArrayList<Servico>();
	}
	
	public Cabeleireiro getCabeleireiro()
	{
		return this.cabeleireiro;
	}

	public void setListServico(ArrayList<Servico> lista) 
	{
		listaServico= lista;
	}
	
	public void addServico(Servico serv) 
	{
		listaServico.add(serv);
	}
	
	public int getNumdeServicos()
	{
		return this.listaServico.size();
	}
	
	
	public double getValorServicos()
	{
		double soma = 0;
		for(int i = 0; i < listaServico.size(); i++)
		{
			soma += this.listaServico.get(i).getValor();
		}
		
		return soma;
	}
	
	public Servico getServico(int indice)
	{
		return this.listaServico.get(indice);
	}
	
	public int getMesmoNome()
	{
		int aux = 0;
		if(this.cliente.getNome().equals(cabeleireiro.getNome()) == true)
		{
			aux = 1;
		}
		
		return aux;
	}
	
	public Cliente getCliente()
	{
		return this.cliente;
	}
	
	
	public String imprimir() 
	{
		String saida = "";

		saida += "----------------------------------------------------\n";
		saida += "\n******* Cliente:  *******";
		saida += "\n id: " + this.cliente.getId();
		saida += "\n Nome: " + this.cliente.getNome();
		saida += "\n CPF:  " + this.cliente.getCPF();
		saida += "\n Numero de servicos requisitados: " + this.getNumdeServicos() + "\n";
		saida += " id do cliente: " + this.cliente.getId();
		saida += "\n\n*******  Cabeleiro:  *******  ";
		saida += "\n id: " + this.cabeleireiro.getId();
		saida += "\n Nome: " + this.cabeleireiro.getNome();
		saida += "\n CPF:  " + this.cabeleireiro.getCpf();

		saida += "\n\n*******  Servicos:  *******  ";
		double valorTotal = 0;
		for (Servico servico : listaServico) 
		{
			saida += "\n id: " + servico.getId();
			saida += "\n nome: " + servico.getNome();
			saida += "\n descricao: " + servico.getDescricao();
			saida += "\n valor: " + servico.getValor() + "\n";
			valorTotal += servico.getValor();
		}
		
		saida += "\n VALOR TOTAL: R$" + valorTotal + "\n";
		if(this.getMesmoNome() == 1)
		{
			saida += "\n CURIOSIDADE: HA CLIENTE COM MESMO NOME QUE O CABELEIREIRO.\n ";
		}
		
		saida += "\nEsse atendimento possui " + this.getNumdeServicos() + " serviços.\n";
		saida += "----------------------------------------------------";

		return saida;
	}

}
