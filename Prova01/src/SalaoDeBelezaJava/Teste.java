package SalaoDeBelezaJava;

import java.util.Calendar;
import java.util.Scanner;

public class Teste 
{
	public static void divisao()
	{
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public static Scanner carrega
	public static void main(String[] args) 
	{
		// 1) Instância de todas as classes:
		
		Cliente cliente1 = new Cliente("123.567.890-10");
		cliente1.setId(13);
		cliente1.setNome("Billy");
		
		
		Cliente cliente2 = new Cliente("345.567.897-11");
		cliente2.setId(15);
		cliente2.setNome("Jenny");
		
		Cliente cliente3 = new Cliente("213.698.322-25");
		cliente3.setId(19);
		cliente3.setNome("Inez");
	
		
		Serviço serviço1 = new Serviço();
		serviço1.setId(235);
		serviço1.setDescricao("Será feito um corte de cabelo degradê.");
		serviço1.setNome("Corte de cabelo degradê");
		serviço1.setValor(20);
		
		Serviço serviço2 = new Serviço();
		serviço2.setId(236);
		serviço2.setDescricao("Será feito um tingimento da cor roxa.");
		serviço2.setNome("Tingimento roxo");
		serviço2.setValor(45);
		
		Serviço serviço3 = new Serviço();
		serviço3.setId(237);
		serviço3.setDescricao("Será feita uma lavagem no cabelo.");
		serviço3.setNome("Lavagem de cabelo");
		serviço3.setValor(30);
		
		Agendamento agendamento1 = new Agendamento();
		agendamento1.setCliente(cliente1);
		agendamento1.setId(148);
		Calendar data1_ = Calendar.getInstance();
		data1_.set(2022, 9, 13, 13, 30);
		agendamento1.setData(data1_);
		
		Agendamento agendamento2 = new Agendamento();
		agendamento2.setCliente(cliente2);
		agendamento2.setId(149);
		Calendar data2_ = Calendar.getInstance();
		data2_.set(2022, 9, 13, 13, 30);
		agendamento1.setData(data2_);
		
		Agendamento agendamento3 = new Agendamento();
		agendamento3.setCliente(cliente3);
		agendamento3.setId(150);
		Calendar data3_ = Calendar.getInstance();
		data3_.set(2022, 9, 13, 13, 30);
		agendamento1.setData(data3_);
		
		Cabeleireiro cabeleireiro1 = new Cabeleireiro("789.155.283-00", "Melanie");
		Cabeleireiro cabeleireiro2 = new Cabeleireiro("567.923.555-67", "August");
		Cabeleireiro cabeleireiro3 = new Cabeleireiro("816.962.485.37", "Jordan");
		
		Atendimento atendimento1 = new Atendimento(cliente1);
		Calendar data1 = Calendar.getInstance();
		data1.set(2022, 8, 13, 13, 30);
		atendimento1.setData(data1);
		atendimento1.setListaDeServiços(serviço1);
		atendimento1.setCabeleireiro(cabeleireiro1);
		
		Atendimento atendimento2 = new Atendimento(cliente2);
		Calendar data2 = Calendar.getInstance();
		data2.set(2022, 9, 13, 13, 30);
		atendimento2.setData(data2);
		atendimento2.setListaDeServiços(serviço2);
		atendimento2.setCabeleireiro(cabeleireiro2);
		
		Atendimento atendimento3 = new Atendimento(cliente3);
		Calendar data3 = Calendar.getInstance();
		data3.set(2022, 9, 13, 13, 30);
		atendimento3.setData(data1);
		atendimento3.setListaDeServiços(serviço3);
		atendimento3.setCabeleireiro(cabeleireiro3);
		
		//2) CRIAÇÃO DE NOVOS OBJETOS PELO USUÁRIO: 
		
		Scanner input = new Scanner(System.in);
		
		//CLIENTE
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("Insira o CPF: ");
		String cpf = input.next();
		Cliente cliente4 = new Cliente(cpf);
		System.out.print("Insira o nome: ");
		cliente4.setNome(input.next());
		
		
		
		divisao();
		
		//SERVIÇO:
		
		System.out.println("CADASTRO DE SERVIÇO: ");
		System.out.print("Insira o ID do serviço: ");
		int id = input.nextInt();
		Serviço serviço4 = new Serviço();
		serviço4.setId(id);
		
		divisao();
		
		//ATENDIMENTO: 
		System.out.println("CADASTRO DE ATENDIMENTO PARA O CLIENTE CADASTRADO: ");
		Atendimento atendimento4 = new Atendimento(cliente4);
		System.out.println("Insira um serviço: ");
		Serviço serviço5 = new Serviço();
		serviço5.setNome(input.next());
		atendimento4.setListaDeServiços(serviço5);
		
		divisao();
		
		//AGENDAMENTO:
		System.out.println("CADASTRO DE AGENDAMENTO: ");
		System.out.print("Insira o ID do agendamento: ");
		int idd = input.nextInt();
		Agendamento agendamento4 = new Agendamento();
		agendamento4.setId(idd);
		
		divisao();
		
		//CABELEIREIRO:
		System.out.println("CADASTRO DE CABELEIREIRO: ");
		System.out.println("Insira o nome do cabeleireiro: ");
		String nome2 = input.next();
		System.out.println("Insira o CPF do cabeleireiro: ");
		String cpf2 = input.next();
		Cabeleireiro cabeleireiro4 = new Cabeleireiro(cpf2, nome2);
		
		divisao();
		
		
		// 3) MOSTRAR TODOS OS DADOS CADASTRADOS:
		
		System.out.println("DADOS CADASTRADOS: ");
		
		divisao();
		
		System.out.println("CLIENTES / ID:");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getId());
		System.out.println(cliente3.getNome());
		System.out.println(cliente3.getId());
		System.out.println(cliente4.getNome());
		System.out.println(cliente4.getId());
		
		divisao();
		
		System.out.println("CABELEIREIROS:");
		System.out.println(cabeleireiro1.getNome());
		System.out.println(cabeleireiro2.getNome());
		System.out.println(cabeleireiro3.getNome());
		System.out.println(cabeleireiro4.getNome());
		
		divisao();
		
		System.out.println("SERVIÇOS");
		System.out.println(serviço1.getServiço());
		System.out.println(serviço2.getServiço());
		System.out.println(serviço3.getServiço());
		System.out.println(serviço4.getServiço());
		
		divisao();
		
		System.out.println("ATENDIMENTOS: (CLIENTE / DATA) ");
		System.out.println(atendimento1.getCliente());
		System.out.println(atendimento1.getData());
		System.out.println(atendimento2.getCliente());
		System.out.println(atendimento2.getData());
		System.out.println(atendimento3.getCliente());
		System.out.println(atendimento3.getData());
		System.out.println(atendimento4.getCliente());
		System.out.println(atendimento4.getData());
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
