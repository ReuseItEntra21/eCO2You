package br.senac.eco2you.modelo.retirada;

import java.time.LocalDate;
import java.util.List;

public class Retirada {

	private LocalDate data;
	private Cooperativa cooperativa;
	private Armazem armazem;
	private List<ItemRetirada> listaItemRetiradas;

	public Retirada(LocalDate data, Cooperativa cooperativa, Armazem armazem, List<ItemRetirada> listaItemRetiradas) {
		this.data = data;
		this.cooperativa = cooperativa;
		this.armazem = armazem;
		this.listaItemRetiradas = listaItemRetiradas;
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

	public void setListaItemRetiradas(List<ItemRetirada> listaItemRetiradas) {
		this.listaItemRetiradas = listaItemRetiradas;
	}

}
