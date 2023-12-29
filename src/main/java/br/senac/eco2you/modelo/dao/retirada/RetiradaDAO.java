package br.senac.eco2you.modelo.dao.retirada;
 
import java.time.LocalDate;
import java.util.List;
 
import br.senac.eco2you.modelo.entidade.retirada.Retirada;
import br.senac.eco2you.modelo.enumeracao.status.retirada.StatusRetirada;
 
public interface RetiradaDAO {
 
	void inserirRetirada(Retirada retirada);
 
	void deletarRetirada(Retirada retirada);
 
	void atualizarRetirada(Retirada retirada);
 
	List<Retirada> buscarRetiradaPelaData(LocalDate data);
 
	List<Retirada> buscarRetiradaPelaCooperativa(String nome);
 
	List<Retirada> buscarRetiradaPeloArmazem(String nome);
 
	List<Retirada> buscarRetiradaPeloStatusRetirada(StatusRetirada statusDeRetirada);
}