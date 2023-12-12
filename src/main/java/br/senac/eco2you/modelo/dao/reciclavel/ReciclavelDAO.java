package br.senac.eco2you.modelo.dao.reciclavel;

import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;

public interface ReciclavelDAO {

	void inserirReciclavel(Reciclavel reciclavel);

	void deletarReciclavel(Reciclavel reciclavel);

	void atualizarReciclavel(Reciclavel reciclavel);

}
