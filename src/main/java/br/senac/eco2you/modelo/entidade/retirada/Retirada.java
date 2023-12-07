package br.senac.eco2you.modelo.entidade.retirada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.senac.eco2you.modelo.entidade.itemRetirada.ItemRetirada;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;

public class Retirada {

	private LocalDate data;
	private Cooperativa cooperativa;
	private Armazem armazem;
	private List<ItemRetirada> listaItemRetiradas;

	public Retirada(LocalDate data, Cooperativa cooperativa, Armazem armazem) {
		this.data = data;
		this.cooperativa = cooperativa;
		this.armazem = armazem;
		listaItemRetiradas = new ArrayList<>();
		
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Cooperativa getCooperativa() {
		return cooperativa;
	}

	public void setCooperativa(Cooperativa cooperativa) {
		this.cooperativa = cooperativa;
	}

	public Armazem getArmazem() {
		return armazem;
	}

	public void setArmazem(Armazem armazem) {
		this.armazem = armazem;
	}

	public List<ItemRetirada> getListaItemRetiradas() {
		return listaItemRetiradas;
	}

	public boolean inserirItemRetirada(ItemRetirada itemRetirada) {
		return listaItemRetiradas.add(itemRetirada);

	}

	public boolean removerDeposito(ItemRetirada itemRetirada) {
		return listaItemRetiradas.remove(itemRetirada);

	}

}
