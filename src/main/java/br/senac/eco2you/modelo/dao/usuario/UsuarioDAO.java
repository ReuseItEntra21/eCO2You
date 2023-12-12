package br.senac.eco2you.modelo.dao.usuario;

import br.senac.eco2you.modelo.entidade.usuario.Usuario;

public interface UsuarioDAO {

    void inserirUsuario(Usuario usuario);

    void deletarUsuario(Usuario usuario);

    void atualizarUsuario(Usuario usuario);

    Usuario buscarPorId(Long id);

}