package br.senac.eco2you.modelo.dao.itemDeposito;

import java.util.List;

import br.senac.eco2you.modelo.entidade.itemDeposito.ItemDeposito;

public interface ItemDepositoDAO {

	void inserirItemDeposito(ItemDeposito itemDeposito);

	void deletarItemDeposito(ItemDeposito itemDeposito);

	void atualizarItemDeposito(ItemDeposito itemDeposito);

	List<ItemDeposito> recuperarItensDeposito();
}
