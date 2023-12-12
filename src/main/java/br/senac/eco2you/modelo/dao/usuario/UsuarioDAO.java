package br.senac.eco2you.modelo.dao.usuario;

import java.util.List;

import br.senac.eco2you.modelo.entidade.usuario.Usuario;

public interface UsuarioDAO {

    void salvarUsuario(Usuario usuario);

    void deletarUsuario(Usuario usuario);

    void atualizarUsuario(Usuario usuario);

    Usuario buscarPorId(Long id);

    List<Usuario> recuperarUsuarios();
}