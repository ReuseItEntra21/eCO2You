package br.senac.eco2you.modelo.dao.coletor;

import java.util.List;

import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;

public interface ColetorDAO {

	Coletor buscarColetorPeloNome(String nomeDoColetor);
	
	List <Coletor> buscarListaColetorPeloNomeParcial(String nome);

	List<Coletor> buscarListaColetorPeloNome(String nome); 
	
	List<Coletor> buscarColetores();
	   
}
