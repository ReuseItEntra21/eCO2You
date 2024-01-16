package br.senac.eco2you.modelo.entidade.material;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
import br.senac.eco2you.modelo.entidade.item.retirada.ItemRetirada;
import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;
 
@Entity
@Table(name = "material")
public class Material implements Serializable {
	
	private static final long serialVersionUID = 1923621854497536546L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_material")
	private Long id;
	
	@Column(name = "nome_material", length = 25, nullable = false)
	private String nome;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "material", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Reciclavel> reciclaveis = new ArrayList<Reciclavel>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemRetirada> itensRetirados = new ArrayList<ItemRetirada>();
	
	public Material(String nome) {
		setNome(nome);
	}
 
	public Material() {
	}
 
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
 
	public String getNome() {
		return nome;
	}
 
	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public List<Reciclavel> getReciclaveis() {
		return reciclaveis;
	}
 
	public void adicionarReciclavel(Reciclavel reciclavel) {
		this.reciclaveis.add(reciclavel);
	}
	
	public void removerReciclavel(Reciclavel reciclavel) {
		this.reciclaveis.remove(reciclavel);
	}
	
	public List<ItemRetirada> getItemRetirada() {
		return itensRetirados;
	}
 
	public void adicionarItemRetirada(ItemRetirada itemRetirado) {
		this.itensRetirados.add(itemRetirado);
	}
	
	public void removerItemRetirada(ItemRetirada itemRetirado) {
		this.itensRetirados.remove(itemRetirado);
	}
}