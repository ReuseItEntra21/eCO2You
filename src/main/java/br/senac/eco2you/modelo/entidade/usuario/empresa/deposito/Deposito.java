package br.senac.eco2you.modelo.entidade.usuario.empresa.deposito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.senac.eco2you.modelo.entidade.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
import br.senac.eco2you.modelo.itemDeposito.ItemDeposito;

public class Deposito {

	private LocalDate data;
	private Armazem armazem;
	private Coletor coletor;
	private List<ItemDeposito> listaItemDeposito;

	public Deposito(LocalDate data, Armazem armazem, Coletor coletor) {
		setData(data);
		setArmazem(armazem);
		setColetor(coletor);
		listaItemDeposito = new ArrayList<>();

	}

	public Coletor getColetor() {
		return coletor;
	}

	public void setColetor(Coletor coletor) {
		this.coletor = coletor;
	}

	public Armazem getArmazem() {
		return armazem;
	}

	public void setArmazem(Armazem armazem) {
		this.armazem = armazem;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<ItemDeposito> getItemDeposito() {
		return listaItemDeposito;
	}

	public boolean inserirItemDeposito(ItemDeposito itemDeposito) {
		return listaItemDeposito.add(itemDeposito);

	}

	public boolean removerDeposito(ItemDeposito itemDeposito) {
		return listaItemDeposito.remove(itemDeposito);

	}

}