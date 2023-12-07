package br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa;

import java.util.ArrayList;
import java.util.List;

import br.senac.eco2you.modelo.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.empresa.Empresa;
import br.senac.eco2you.modelo.entidade.retirada.Retirada;

public class Cooperativa extends Empresa {
	private int capacidadeColeta;
	private List<Retirada> listaRetiradas;

	public Cooperativa(String nome, String email, String senha, Endereco endereco, String cnpj,
			String horarioFuncionamento, int capacidadeColeta) {
		super(nome, email, senha, endereco, cnpj, horarioFuncionamento);
		setCapacidadeColeta(capacidadeColeta);
		listaRetiradas = new ArrayList<>();

	}

	public int getCapacidadeColeta() {
		return capacidadeColeta;
	}

	public void setCapacidadeColeta(int capacidadeColeta) {
		this.capacidadeColeta = capacidadeColeta;
	}

	public List<Retirada> getListaRetiradas() {
		return listaRetiradas;
	}

	public boolean inserirRetirada(Retirada retirada) {
		return listaRetiradas.add(retirada);

	}

	public boolean removerRetirada(Retirada retirada) {
		return listaRetiradas.remove(retirada);

	}

}
