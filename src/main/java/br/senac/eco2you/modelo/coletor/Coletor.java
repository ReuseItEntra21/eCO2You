package br.senac.eco2you.modelo.coletor;
public class Coletor {

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
