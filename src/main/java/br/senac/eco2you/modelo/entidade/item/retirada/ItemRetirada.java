package br.senac.eco2you.modelo.entidade.item.retirada;
 
import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
import br.senac.eco2you.modelo.entidade.material.Material;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_material")
	private Material material;
 
	public ItemRetirada(Material material, double peso) {
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
 
	public Material getMaterial() {
		return material;
	}
 
	public void setMaterial(Material material) {
		this.material = material;
	}
 
	public double getPeso() {
		return peso;
	}
 
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}