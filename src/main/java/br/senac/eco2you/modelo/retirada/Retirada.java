package br.senac.eco2you.modelo.retirada;
 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
 
import br.senac.eco2you.modelo.entidade.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.itemRetirada.ItemRetirada;
 
public class Retirada {
 
	private LocalDate data;
	private Cooperativa cooperativa;
	private Armazem armazem;
	private List<ItemRetirada> listaItensRetirada;
 
	public Retirada(LocalDate data, Cooperativa cooperativa, Armazem armazem) {
		this.data = data;
		this.cooperativa = cooperativa;
		this.armazem = armazem;
		listaItensRetirada = new ArrayList<>();
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
 
	public List<ItemRetirada> getListaItensRetirada() {
		return listaItensRetirada;
	}
 
	public boolean inserirItensRetirada(ItemRetirada itemRetirada) {
		return listaItensRetirada.add(itemRetirada);
 
	}
 
	public boolean removerItensRetirada(ItemRetirada itemRetirada) {
		return listaItensRetirada.remove(itemRetirada);
 
	}
 
}