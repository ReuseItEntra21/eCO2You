package br.senac.eco2you.modelo.dao.retirada;

import java.time.LocalDate;
import java.util.List;

import br.senac.eco2you.modelo.entidade.retirada.Retirada;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.enumeracao.status.retirada.StatusRetirada;

public interface RetiradaDAO {

	List<Retirada> recuperarRetiradas();
	
	void inserirRetirada(Retirada retirada);

	void deletarRetirada(Retirada retirada);

	void atualizarRetirada(Retirada retirada);

	List<Retirada> buscarRetiradaPelaData(LocalDate data);
	
	List<Retirada> buscarProximaRetirada(StatusRetirada statusRetirada, LocalDate data, Long cooperativaId);

	List<Retirada> buscarRetiradaPelaCooperativa(String nome);
	
	List<Retirada> buscarRetiradasPelaCooperativa(Cooperativa cooperativa);

	List<Retirada> buscarRetiradaPeloArmazem(String nome);
	
	List<Retirada> buscarRetiradasPeloArmazem(Armazem armazem);

	List<Retirada> buscarRetiradaPeloStatusRetirada(StatusRetirada statusDeRetirada);

	List<Retirada> buscarRetiradaPeloArmazemECooperativa(String nomeDoArmazem, String nomeDaCooperativa);

	List<Retirada> buscarRetiradaPeloArmazemECooperativaEStatus(String nomeDoArmazem, String nomeDaCooperativa,
			StatusRetirada status);

	List<Retirada> buscarRetiradaPeloArmazemECooperativaEData(String nomeDoArmazem, String nomeDaCooperativa,
			LocalDate data);

	List<Retirada> buscarRetiradaPelaCooperativaEArmazem(String nomeDaCooperativa, String nomeDoArmazem);

	List<Retirada> buscarRetiradaPelaCooperativaEArmazemEStatus(String nomeDaCooperativa, String nomeDoArmazem,
			StatusRetirada status);

	List<Retirada> buscarRetiradaPelaCooperativaEArmazemEData(String nomeDaCooperativa, String nomeDoArmazem,
			LocalDate data);

}