package br.senac.eco2you.modelo.dao.retirada;
 
import java.time.LocalDate;
import java.util.List;
 
import br.senac.eco2you.modelo.entidade.retirada.Retirada;
import br.senac.eco2you.modelo.enumeracao.statusRetirada.StatusRetirada;
 
public interface RetiradaDAO {
 
	void inserirRetirada(Retirada retirada);
 
	void deletarRetirada(Retirada retirada);
 
	void atualizarRetirada(Retirada retirada);
 
	List<Retirada> buscarRetiradapelaData(LocalDate dat);
 
	List<Retirada> buscarRetiradapelaCooperativa(String nome);
 
	List<Retirada> buscarRetiradapeloArmazem(String nome);
 
	List<Retirada> buscarRetiradapeloStatusRetirada(StatusRetirada statusDeRetirada);
}