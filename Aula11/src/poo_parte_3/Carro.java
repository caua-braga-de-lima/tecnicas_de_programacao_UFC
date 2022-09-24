package poo_parte_3;

import java.util.ArrayList;

public class Carro // classe - possui características (atributos) e métodos (funcionalidades)
{
	// atributos primitivos (não são objetos)
	public String placa; // atributo público - visível em todas as classes.
	private int id; // atributo privado - visível somente na sua classe. (ou em outras usando get set)
	protected String modelo; //visível apenas no seu pacote.
	
	//composiçao - objetos como atributos de outros objetos
	
	public Motor motor;
	public Motor listademotores[] = new Motor[10]; // inviável
	public ArrayList<Carro> lista = new ArrayList <Carro>(); 
	
	
	public Carro(int id_, String placa_) // método construtor - para inicializar o objeto. (parâmetro opcional)
	{
		this.id = id_;
		this.placa = placa_; // this opcional, pois o nome dos atributos são diferentes. O this sempre se refere aos atributos iniciais do objeto (os da classe).
	}
	
	public int getId() // permite um atributo privado ou protegido ser visualizado em outra classe por meio dessa função
	{
		return this.id; // this - refere-se ao próprio objeto.
	}
	
	public void setId(int id_) // permite um atributo privado ou protegido ser editado em outra classe por meio dessa função. É importante ter uma validação.
	{
		if(id_ > 0) // validação de segurança.
		id = id_;
	}
	
	
	
}


