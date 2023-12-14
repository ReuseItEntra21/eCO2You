package br.senac.eco2you.modelo.dao.coletor;

import java.util.List;

import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;

public interface ColetorDAO {

	List <Coletor> buscarColetorPorNome(String nome);
	}
