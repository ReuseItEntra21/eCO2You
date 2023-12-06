package br.senac.eco2you.modelo.coletor;

import java.util.List;

import br.senac.eco2you.modelo.deposito.Deposito;
import br.senac.eco2you.modelo.pessoa.Pessoa;

public class Coletor extends Pessoa {

	private List<Deposito> listaDepositos;
	
	public Coletor(List<Deposito> listaDepositos) {
		setListaDepositos(listaDepositos);
	}
	
	public List<Deposito> getListaDepositos() {
		return listaDepositos;
	}
	
	public void setListaDepositos(List<Deposito> listaDepositos) {
		this.listaDepositos = listaDepositos;
	}
}
