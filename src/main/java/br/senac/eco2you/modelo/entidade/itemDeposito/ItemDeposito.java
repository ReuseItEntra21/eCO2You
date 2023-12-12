package br.senac.eco2you.modelo.entidade.itemDeposito;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;

@Entity
@Table(name = "item_deposito")
public class ItemDeposito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_reciclavel")
	private Reciclavel reciclavel;

	@Column(name = "quantidade_reciclaveis")
	private int quantidadeReciclaveis;

	public ItemDeposito() {}
	
	public ItemDeposito(Reciclavel reciclavel, int quantidadeReciclaveis) {
		setReciclavel(reciclavel);
		setQuantidadeReciclaveis(quantidadeReciclaveis);

	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Reciclavel getReciclavel() {
		return reciclavel;
	}

	public void setReciclavel(Reciclavel reciclavel) {
		this.reciclavel = reciclavel;
	}

	public int getQuantidadeReciclaveis() {
		return quantidadeReciclaveis;
	}

	public void setQuantidadeReciclaveis(int quantidadeReciclaveis) {
		this.quantidadeReciclaveis = quantidadeReciclaveis;
	}
}
