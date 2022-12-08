package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.Aluno;

/*DAO Data Access Object*/
public class AlunoDAO 
{

	// MYSQL
	//
	// C cadastrar o dado
	// R pegar o dado
	// U atualizar o dado
	// D apagar o dado

	/*
	 * Aluno a = new Aluno(); a.setId(1); a.setCPF("089.899.556-40");
	 * a.setNome("Joao"); Aluno a2 = new Aluno(); a2.setId(2);
	 * a.setCPF("040.040.040-89"); a.setNome("Maria");
	 * 
	 * Aluno a3 = new Aluno(); a3.setCPF("070.894.894-85"); a3.setNome("Marcos");
	 * a3.setId(3);
	 * 
	 * ArrayList<Aluno> alunos= new ArrayList<Aluno>(); alunos.add(a);
	 * alunos.add(a2); alunos.add(a3);
	 * 
	 * 
	 * 
	 */

	public Aluno selecionarAlunoPorNome(String nome) {

		Aluno aluno = null;

		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement resultado = 
		 conexao.prepareStatement("select * from aluno where nome =?");
           
			resultado.setString(1, nome);
			ResultSet resposta= resultado.executeQuery();
			
			while (resposta.next()) {
				aluno = new Aluno();
				aluno.setId(resposta.getInt("id"));
				aluno.setNome(resposta.getString("nome"));
				aluno.setCPF(resposta.getString("cpf"));
			}
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aluno;

	}

	public void update(Aluno a) {

		try {
			Connection conexao = new Conexao().getConexao();
			PreparedStatement up = conexao.prepareStatement("update aluno set nome=?, cpf=? where nome=?");
			up.setString(1, a.getNome());
			up.setString(2, a.getCPF());
			up.setInt(3, a.getId());

			up.executeUpdate();

			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void inserir(Aluno a) 
	{
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir = conexao.prepareStatement("insert into aluno (nome, cpf) values (?, ?)");
			inserir.setString(1, a.getNome());
			inserir.setString(2, a.getCPF());
			inserir.executeUpdate();

			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Aluno> listar() {
		ArrayList<Aluno> aux = new ArrayList<Aluno>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from aluno").executeQuery();

			Aluno aluno;
			while (resultado.next()) {
				aluno = new Aluno();
				aluno.setId(resultado.getInt("id"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setCPF(resultado.getString("cpf"));
				aux.add(aluno);
			}
			conexao.close();
		} catch (Exception e) {

		}
		return aux;
	}

}
