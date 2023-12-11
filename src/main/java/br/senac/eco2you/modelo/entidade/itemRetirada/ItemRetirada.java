package br.senac.eco2you.modelo.entidade.itemRetirada;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_retirada")
public class ItemRetirada implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item_retirada")
	private Long id;
	
	@Column(name = "material_item_retirada", length = 25, nullable = false, unique = false)
	private String material;
	
	@Column(name = "peso_item_retirada", nullable = false, unique = false)
	private double peso;

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

}