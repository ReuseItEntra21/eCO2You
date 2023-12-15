package br.senac.eco2you.modelo.entidade.deposito;
 
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
import br.senac.eco2you.modelo.entidade.itemDeposito.ItemDeposito;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
import br.senac.eco2you.modelo.enumeracao.statusDeposito.StatusDeposito;
 
 
@Entity
@Table(name = "deposito")
public class Deposito implements Serializable{
 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_deposito")
	private Long id;
	@Column(name = "data_deposito", nullable = false)
	private Date data;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_armazem",  nullable = false, unique = true)
	private Armazem armazem;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_coletor", nullable = false, unique = true)
	private Coletor coletor;
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "deposito_item_deposito", joinColumns = @JoinColumn(name = "id_deposito"), inverseJoinColumns = @JoinColumn(name = "id_item_deposito"))	
	private List<ItemDeposito> listaItemDeposito;
 
	@Enumerated(EnumType.STRING)private StatusDeposito statusDeDeposito;
	public Deposito() {}
 
	public Deposito(LocalDate data, Armazem armazem, Coletor coletor, StatusDeposito statusDeDeposito) {
		setData(getData());;
		setArmazem(armazem);
		setColetor(coletor);
		setStatusDeDeposito(statusDeDeposito);
		listaItemDeposito = new ArrayList<>();
 
	}
 
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public Coletor getColetor() {
		return coletor;
	}
 
	public void setColetor(Coletor coletor) {
		this.coletor = coletor;
	}
 
	public Armazem getArmazem() {
		return armazem;
	}
 
	public void setArmazem(Armazem armazem) {
		this.armazem = armazem;
	}
 
	public Date getData() {
		return data;
	}
 
	public void setData(Date data) {
		this.data = data;
	}
 
	public List<ItemDeposito> getItemDeposito() {
		return listaItemDeposito;
	}
 
	public boolean inserirItemDeposito(ItemDeposito itemDeposito) {
		return listaItemDeposito.add(itemDeposito);
 
	}
 
	public boolean removerDeposito(ItemDeposito itemDeposito) {
		return listaItemDeposito.remove(itemDeposito);
 
	}
 
	public StatusDeposito getStatusDeDeposito() {
		return statusDeDeposito;
	}
	public void setStatusDeDeposito(StatusDeposito statusDeDeposito) {
		this.statusDeDeposito = statusDeDeposito;
	}
}