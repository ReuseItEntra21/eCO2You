package br.senac.eco2you.modelo.dao.armazem;
 
import java.util.List;

import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
 
public interface ArmazemDAO {
	List<Armazem> buscarArmazensPorNome(String nome);
	List<Armazem> buscarArmazemPeloBairro(String bairro);
}