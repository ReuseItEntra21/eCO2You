package br.senac.eco2you.modelo.entidade.item.retirada;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.material.Material;
import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;

@Entity
@Table(name = "item_retirada")
public class ItemRetirada implements Serializable {

	private static final long serialVersionUID = -2137699780453738023L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item_retirada")
	private Long id;
	
	@Column(name = "peso_item_retirada", nullable = false)
	private double peso;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_material")
	private Material material;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "item_retirada_reciclavel", joinColumns = @JoinColumn(name = "id_item_retirada"), inverseJoinColumns = @JoinColumn(name = "id_reciclavel"))
	private List<Reciclavel> reciclaveis = new ArrayList<Reciclavel>();

	public ItemRetirada() {}

	public ItemRetirada(Material id, double peso) {
		setPeso(peso);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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