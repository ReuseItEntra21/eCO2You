package br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor;

import java.util.ArrayList;
import java.util.List;

import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.Pessoa;

public class Coletor extends Pessoa {

	private List<Deposito> listaDepositos;

	public Coletor(String nome, String email, String senha, Endereco endereco, String sobrenome, String apelido,
			int idade, String cpf, String dataNascimento) {
		super(nome, email, senha, endereco, sobrenome, apelido, idade, cpf, dataNascimento);
		listaDepositos = new ArrayList<>();
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
