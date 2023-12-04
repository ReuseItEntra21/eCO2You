package br.senac.eco2you.modelo.cooperativa;

public class Cooperativa {
	private int capacidadeColeta;
	private List<Retirada> listaRetiradas;
 
	public Cooperativa(int capacidadeColeta, List<Retirada> listRetiradas) {
		setCapacidadeColeta(capacidadeColeta);
		setListaRetiradas(listRetiradas);
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
 
	public void setListaRetiradas(List<Retirada> listaRetiradas) {
		this.listaRetiradas = listaRetiradas;
	}
}
