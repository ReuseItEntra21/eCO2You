package br.senac.eco2you.modelo.entidade.itemDeposito;

import java.io.Serializable;

import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;

@Entity
@Table(name = "item_deposito")
public class ItemDeposito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_reciclavel")
	private Reciclavel reciclavel;

	@Column(name = "quantidade_reciclaveis")
	private int quantidadeReciclaveis;

	  public ItemDeposito() {}
	
	public ItemDeposito(Reciclavel reciclavel, int quantidadeReciclaveis) {
		setReciclavel(reciclavel);
		setQuantidadeReciclaveis(quantidadeReciclaveis);
		;

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