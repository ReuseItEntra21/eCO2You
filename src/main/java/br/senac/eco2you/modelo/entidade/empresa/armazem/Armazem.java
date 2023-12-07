package br.senac.eco2you.modelo.entidade.empresa.armazem;

import java.util.ArrayList;
import java.util.List;

import br.senac.eco2you.modelo.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.empresa.Empresa;
import br.senac.eco2you.modelo.entidade.usuario.empresa.deposito.Deposito;
import br.senac.eco2you.modelo.enumeracao.statusArmazem.StatusArmazem;

public class Armazem extends Empresa {
	private long capacidadeArmazenagem;
	private StatusArmazem statusArmazem;
	private List<Deposito> listaDepositos;

	public Armazem(String nome, String email, String senha, Endereco endereco, String cnpj, String horarioFuncionamento,
			long capacidadeArmazem, StatusArmazem statusArmazem) {

		super(nome, email, senha, endereco, cnpj, horarioFuncionamento);
		setCapacidadeArmazenagem(capacidadeArmazem);
		setStatusArmazem(statusArmazem);
		listaDepositos = new ArrayList<>();

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

	public boolean inserirDeposito(Deposito deposito) {
		return listaDepositos.add(deposito);

	}

	public boolean removerDeposito(Deposito deposito) {
		return listaDepositos.remove(deposito);

	}

}
