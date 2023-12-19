package br.senac.eco2you.modelo.entidade.itemRetirada;

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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;

@Entity
@Table(name = "item_retirada")
public class ItemRetirada implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item_retirada")
	private Long id;
	
	@Column(name = "material_item_retirada", length = 25, nullable = false)
	private String material;
	
	@Column(name = "peso_item_retirada", nullable = false)
	private double peso;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "item_retirada_reciclavel", joinColumns = @JoinColumn(name = "id_item_retirada"), inverseJoinColumns = @JoinColumn(name = "id_reciclavel"))
	private List<Reciclavel> reciclaveis = new ArrayList<Reciclavel>();

	public ItemRetirada(String material, double peso) {
		this.material = material;
		this.peso = peso;
	}
	
	public ItemRetirada() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public List<Reciclavel> getReciclavel() {
		return reciclaveis;
	}

	public void inserirReciclavel(Reciclavel reciclavel) {
		this.reciclaveis.add(reciclavel);
	}
 
    public void removerRecilavel(Reciclavel reciclavel) {
        this.reciclaveis.remove(reciclavel);
 
    }

}