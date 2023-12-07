package br.senac.eco2you.modelo.armazem;
import java.util.List;

import br.senac.eco2you.modelagem.enumeracao.statusArmazem.StatusArmazem;
import br.senac.eco2you.modelo.deposito.Deposito;
import br.senac.eco2you.modelo.empresa.Empresa;
import br.senac.eco2you.modelo.endereco.Endereco;

public class Armazem extends Empresa{
	private long capacidadeArmazenagem;
	private StatusArmazem statusArmazem;
	private List<Deposito> listaDepositos;
	
	public Armazem(String nome,  String email, String senha, Endereco endereco, String cnpj, String horarioFuncionamento, long capacidadeArmazem, StatusArmazem statusArmazem) {

		super(nome,email, senha, endereco, cnpj, horarioFuncionamento);
		setCapacidadeArmazenagem(capacidadeArmazem);
		setStatusArmazem(statusArmazem);
		
	}
	
	public long getCapacidadeArmazenagem() {
		return capacidadeArmazenagem;
	}
	
	public void setCapacidadeArmazenagem(long capacidadeArmazenagem) {
		this.capacidadeArmazenagem = capacidadeArmazenagem;
	}
	
	public StatusArmazem getStatusArmazem() {
		return statusArmazem;
	}
	
	public void setStatusArmazem(StatusArmazem statusArmazem) {
		this.statusArmazem = statusArmazem;
	}
	
	public List<Deposito> getListaDepositos() {
		return listaDepositos;
	}
	
}
