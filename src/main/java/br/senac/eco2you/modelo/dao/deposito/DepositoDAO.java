package br.senac.eco2you.modelo.dao.deposito;

import java.util.List;

import br.senac.eco2you.modelo.entidade.deposito.Deposito;

public interface DepositoDAO {
	
	void inserirDeposito(Deposito deposito);

	void deletarDeposito(Deposito deposito);

	void atualizarDeposito(Deposito deposito);

	List<Deposito> recuperarDepositos();

}
