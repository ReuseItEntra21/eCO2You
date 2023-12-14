package br.senac.eco2you.modelo.dao.cooperativa;

import java.util.List;

import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;

public interface CooperativaDAO {

	List<Cooperativa> buscarCooperativaPorNome(String nome);

	List<Cooperativa> buscarCooperativasPeloBairro(String nome);

}