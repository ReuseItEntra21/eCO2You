package br.senac.eco2you.modelo.armazem;
import java.util.List;

import StatusArmazem;

public class Armazem {
	private long capacidadeArmazenagem;
	private StatusArmazem statusArmazem;
	private List<deposito> listaDepositos;
	
	public Armazem(long capacidadeArmazem, StatusArmazem statusArmazem, List<deposito> listaDepositos) {

		setCapacidadeArmazenagem(capacidadeArmazem);
		setStatusArmazem(statusArmazem);
		setListaDepositos(listaDepositos);
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
	
	public List<deposito> getListaDepositos() {
		return listaDepositos;
	}
	
	public void setListaDepositos(List<deposito> listaDepositos) {
		this.listaDepositos = listaDepositos; 
	}
}
