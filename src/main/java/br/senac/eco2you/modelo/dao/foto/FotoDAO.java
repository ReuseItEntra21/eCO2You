package br.senac.eco2you.modelo.dao.foto;

import java.util.List;

import br.senac.eco2you.modelo.entidade.foto.Foto;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;

public class FotoDAO {

	public interface FotoDAO {

		void inserirFoto(Foto foto);

		void deletarFoto(Foto foto);

		void atualizarFoto(Foto foto);

		Foto recuperarFotoId(Long id);

		Foto recuperarFotoUsuario(Usuario usuario);

		List<Foto> recuperarFotos();

	}
}
