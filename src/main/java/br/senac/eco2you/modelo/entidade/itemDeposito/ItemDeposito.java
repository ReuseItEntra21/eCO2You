package br.senac.eco2you.modelo.entidade.itemDeposito;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;

@Entity
@Table(name = "item_deposito")
public class ItemDeposito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_reciclavel")
	private List<Reciclavel> reciclaveis;

	@Column(name = "quantidade_reciclaveis")
	private int quantidadeReciclaveis;

	public ItemDeposito() {}
	
	public ItemDeposito( int quantidadeReciclaveis) {
		setQuantidadeReciclaveis(quantidadeReciclaveis);
		reciclaveis = new ArrayList<>();

	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
 
    public boolean inserirReciclavel(Reciclavel reciclavel) {
        return reciclaveis.add(reciclavel);
 
    }
 
    public boolean removerRecilavel(Reciclavel reciclavel) {
        return reciclaveis.remove(reciclavel);
 
    }
	
	public int getQuantidadeReciclaveis() {
		return quantidadeReciclaveis;
	}

	public void setQuantidadeReciclaveis(int quantidadeReciclaveis) {
		this.quantidadeReciclaveis = quantidadeReciclaveis;
	}
}
