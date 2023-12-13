package br.senac.eco2you.modelo.dao.armazem;

import java.util.List;

import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;

public interface ArmazemDAO {

	void inserirArmazem(Armazem armazem);

	void deletarArmazem(Armazem armazem);

	void atualizarArmazem(Armazem armazem);
	
	Armazem buscarArmazemPorNome(String nome);
	
	List<Armazem> buscarArmazemPeloBairro(String bairro);
}
