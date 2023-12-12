package br.senac.eco2you.modelo.dao.retirada;

import java.util.List;

import br.senac.eco2you.modelo.entidade.retirada.Retirada;

public interface RetiradaDAO {

	void inserirRetirada(Retirada retirada);

	void deletarRetirada(Retirada retirada);

	void atualizarRetirada(Retirada retirada);

	List<Retirada> recuperarRetirada();
	
}
