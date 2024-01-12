package br.senac.eco2you.modelo.dao.deposito;
 
import java.time.LocalDate;
import java.util.List;

import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.enumeracao.status.deposito.StatusDeposito;
 
public interface DepositoDAO {
 
    void inserirDeposito(Deposito deposito);
 
    void deletarDeposito(Deposito deposito);
 
    void atualizarDeposito(Deposito deposito);
 
    List<Deposito> recuperarDepositos();
 
    List<Deposito> buscarDepositoPeloStatusDeposito(StatusDeposito statusDeDeposito);
 
    List<Deposito> buscarDepositoPelaData(LocalDate data);
 
    List<Deposito> buscarDepositoPeloArmazem(String nome);
 
    
    List<Deposito> buscarDepositoPeloColetor(String nomeDoColetor);
 
    
    List<Deposito> buscarDepositoPeloColetorEArmazem(String nomeDoColetor, String nomeDoArmazem);
 
    
    List<Deposito> buscarDepositoPeloColetorEArmazemEStatus(String nomeDoColetor, String nomeDoArmazem, StatusDeposito status);
 
    
    List<Deposito> buscarDepositoPeloColetorEArmazemEData(String nomeDoColetor, String nomeDoArmazem, LocalDate data);
}