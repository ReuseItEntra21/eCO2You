package br.senac.eco2you.modelo.coletor;

import java.util.List;

import br.senac.eco2you.modelo.deposito.Deposito;
import br.senac.eco2you.modelo.endereco.Endereco;
import br.senac.eco2you.modelo.pessoa.Pessoa;

public class Coletor extends Pessoa {

	private List<Deposito> listaDepositos;
	
	public Coletor(String nome,  String email, String senha, Endereco endereco, String sobrenome, String apelido, int idade,  String cpf, String dataNascimento) {
		super(nome, email, senha, endereco, sobrenome, apelido, idade, cpf, dataNascimento);
	}
	
	public List<Deposito> getListaDepositos() {
		return listaDepositos;
	}
	
	public void setListaDepositos(List<Deposito> listaDepositos) {
		this.listaDepositos = listaDepositos;
	}
}
