package br.senac.eco2you.modelo.dao.coletor;

import br.senac.eco2you.modelo.entidade.usuario.Usuario;

public interface ColetorDAO {

	Usuario buscarPorId(Long id);
}
