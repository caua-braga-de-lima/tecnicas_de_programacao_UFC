package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.Aluno;

/*DAO Data Access Object*/
public class AlunoDAO {

	// MYSQL
	//
	// C cadastrar o dado
	// R pegar o dado
	// U atualizar o dado
	// D apagar o dado

	public ArrayList<Aluno> listar() 
	{
		ArrayList<Aluno> aux = new ArrayList<Aluno>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = 
					conexao.prepareStatement("select * from dadosDoAluno")
					.executeQuery();
			
			Aluno aluno;
			
			while(resultado.next()) 
			{
				aluno = new Aluno();
				aluno.setId(resultado.getInt("id"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setCPF(resultado.getString("cpf"));
				aux.add(aluno);
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aux;
	}

}
