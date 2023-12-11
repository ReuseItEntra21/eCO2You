package br.senac.eco2you.modelo.dao.endereco;

import java.util.List;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;

public interface EnderecoDAO {

	void inserirEndereco(Endereco endereco);

	void deletarEndereco(Endereco endereco);

	void atualizarEndereco(Endereco endereco);

	List<Endereco> recuperarEnderecos();
}
