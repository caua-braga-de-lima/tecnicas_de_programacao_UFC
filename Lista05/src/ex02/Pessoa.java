package ex02;

public class Pessoa 
{
	public int idade;
	public int dia;
	public int mes;
	public int ano;
	String nome;
	
	public Pessoa(String nome_)
	{
		this.nome = nome_;
	}
	
	public void ajustarDatadeNascimento(int dia_, int mes_, int ano_)
	{
		this.dia = dia_;
		this.mes = mes_;
		this.ano = ano_;
		
		System.out.println("Data de nascimento gravada com sucesso!");
	}
	
	
	public void calculaIdade(int dia_, int mes_, int ano_)
	{
		int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(dia > dia_)
		{
			dia_ += meses[mes - 1];
			mes_--;
		}
		
		if(mes > mes_) 
		{
			ano_ --;
			mes_ += 12;
		}
		
		int dias_idade = dia_ - dia;
		int meses_idade = mes_ - mes;
		int anos_idade = ano_ - ano;
		
		this.idade = anos_idade;
		
		System.out.println(this.nome + " tem " + idade + " anos, " + meses_idade + " meses e " + dias_idade + " dias de idade." );
	}
	
}
