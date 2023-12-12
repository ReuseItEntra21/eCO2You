package br.senac.eco2you.modelo.dao.cooperativa;

import java.util.List;

import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;

public interface CooperativaDAO {

	Cooperativa buscarUsuariosPorNome(String nome);
	 List<Cooperativa> buscarUsuariosPeloBairro(String nome);
	
}
