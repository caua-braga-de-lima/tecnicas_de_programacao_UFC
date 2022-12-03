package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import business.SweepStake;

/*DAO Data Access Object*/
public class AlunoDAO {

	// MYSQL
	//
	// C cadastrar o dado
	// R pegar o dado
	// U atualizar o dado
	// D apagar o dado

	public ArrayList<SweepStake> listar() 
	{
		ArrayList<SweepStake> aux = new ArrayList<SweepStake>();
		try {
			Connection conexao = new Connector().getConnection();

			ResultSet resultado = 
					conexao.prepareStatement("select * from dadosDoAluno")
					.executeQuery();
			
			SweepStake aluno;
			
			while(resultado.next()) 
			{
				aluno = new SweepStake();
				aluno.setId(resultado.getInt("id"));
				aluno.setName(resultado.getString("nome"));
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
