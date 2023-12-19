package br.senac.eco2you.modelo.entidade.itemDeposito;

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
@Table(name = "item_deposito")
public class ItemDeposito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item_deposito")
	private Long id;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "item_deposito_reciclavel", joinColumns = @JoinColumn(name = "id_item_deposito"), inverseJoinColumns = @JoinColumn(name = "id_reciclavel"))
	private List<Reciclavel> reciclaveis = new ArrayList<Reciclavel>();
	
	@Column(name = "quantidade_reciclaveis")
	private int quantidadeReciclaveis;

	public ItemDeposito() {}
	
	public ItemDeposito( int quantidadeReciclaveis) {
		setQuantidadeReciclaveis(quantidadeReciclaveis);
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public int getQuantidadeReciclaveis() {
		return quantidadeReciclaveis;
	}

	public void setQuantidadeReciclaveis(int quantidadeReciclaveis) {
		this.quantidadeReciclaveis = quantidadeReciclaveis;
	}
}
