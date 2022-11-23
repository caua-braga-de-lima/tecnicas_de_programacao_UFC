package apresentacao;

import negocio.Aluno;
import persistencia.AlunoDAO;

public class Main {

	public static void main(String[] args) 
	{
		
		AlunoDAO aluno = new AlunoDAO();
		
	
		for (Aluno a : aluno.listar()) 
		{
			System.out.println(a.getId() + " -  " + a.getNome() + " - " + a.getCPF());
			
		}
		
		
	}

}
