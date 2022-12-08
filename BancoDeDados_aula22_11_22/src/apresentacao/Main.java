package apresentacao;

import negocio.Aluno;
import persistencia.AlunoDAO;

public class Main {

	public static void main(String[] args) {
		
		AlunoDAO alunoDAO = new AlunoDAO();
		
		Aluno al= new Aluno();
//		al.setCPF("000.000.000-00");
//		al.setNome("Daniel");
//		aluno.inserir(al);
//		
		al.setCPF("089.899.899-89");
		al.setNome("Daniel Silva");
		al.setId(106);
		
//		alunoDAO.update(al);
		
		Aluno maria = alunoDAO.selecionarAlunoPorNome("Maria");
		System.out.println(maria.getId() + " -  "+ maria.getNome() + " - "+ maria.getCPF());
		
//		
//		for (Aluno a : alunoDAO.listar()) {
//			System.out.println(a.getId() + " -  "+ a.getNome() + " - "+ a.getCPF());
//			
//		}
		
		
	}

}
