package br.senac.eco2you.modelo.dao.conquista;

import java.util.List;

import br.senac.eco2you.modelo.entidade.conquista.Conquista;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;

public interface ConquistaDAO {

	void inserirConquista(Conquista conquista);

	void deletarConquista(Conquista conquista);

	void atualizarConquista(Conquista conquista);
	
	List<Conquista> buscarConquistaUsuario(Usuario usario);
	
}
