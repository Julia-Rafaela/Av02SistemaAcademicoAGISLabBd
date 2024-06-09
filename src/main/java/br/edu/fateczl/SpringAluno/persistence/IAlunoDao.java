package br.edu.fateczl.SpringAluno.persistence;

import java.sql.SQLException;
import java.util.List;

import br.edu.fateczl.SpringAluno.model.Aluno;

public interface IAlunoDao {
	
	public String iudAluno (String acao, Aluno a) throws SQLException, ClassNotFoundException;
	public List<Aluno> listarAluno() throws SQLException, ClassNotFoundException;

}
