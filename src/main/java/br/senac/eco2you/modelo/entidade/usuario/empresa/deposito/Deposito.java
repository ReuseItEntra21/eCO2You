package br.senac.eco2you.modelo.entidade.usuario.empresa.deposito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
 
public class Deposito {
 
	private LocalDate data;
	private Armazem armazem;
	private Coletor coletor;
	private List<ItemDeposito> itemDeposito;
 
	public Deposito(LocalDate data, Armazem armazem, Coletor coletor) {
		setData(data);
		setArmazem(armazem);
		setColetor(coletor);
		itemDeposito = new ArrayList<>();
 
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
		return itemDeposito;
	}
 
	public void setItemDeposito(List<ItemDeposito> itemDeposito) {
		this.itemDeposito = itemDeposito;
	}
 
}