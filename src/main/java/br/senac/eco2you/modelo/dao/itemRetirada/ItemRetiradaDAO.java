package br.senac.eco2you.modelo.dao.itemRetirada;

import java.util.List;

import br.senac.eco2you.modelo.entidade.itemRetirada.ItemRetirada;

public interface ItemRetiradaDAO {

	void inserirItemRetirada(ItemRetirada itemRetirada);

	void deletarItemRetirada(ItemRetirada itemRetirada);

	void atualizarItemRetirada(ItemRetirada itemRetirada);

	List<ItemRetirada> recuperarItensRetirada();
}
