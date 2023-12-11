package br.senac.eco2you.modelo.entidade.usuario.empresa.armazem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.empresa.Empresa;
import br.senac.eco2you.modelo.enumeracao.statusArmazem.StatusArmazem;

@Entity
@Table(name = "armazem")
public class Armazem extends Empresa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_empresa")
	private Long id;
	
	@Column(name = "capacidade_armazenagem_armazem", nullable = false, unique = false)
	private long capacidadeArmazenagem;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_armazem")
	@Enumerated(EnumType.STRING)private StatusArmazem statusArmazem;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "armazem_deposito", joinColumns = @JoinColumn(name = "id_armazem"), inverseJoinColumns = @JoinColumn(name = "id_deposito"))
	private List<Deposito> listaDepositos;

	public Armazem(String nome, String email, String senha, Endereco endereco, String cnpj, String horarioFuncionamento,
			long capacidadeArmazem, StatusArmazem statusArmazem) {

		super(nome, email, senha, endereco, cnpj, horarioFuncionamento);
		setCapacidadeArmazenagem(capacidadeArmazem);
		setStatusArmazem(statusArmazem);
		listaDepositos = new ArrayList<>();

	}
	
	public Armazem () {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getCapacidadeArmazenagem() {
		return capacidadeArmazenagem;
	}

	public void setCapacidadeArmazenagem(long capacidadeArmazenagem) {
		this.capacidadeArmazenagem = capacidadeArmazenagem;
	}

	public StatusArmazem getStatusArmazem() {
		return statusArmazem;
	}

	public void setStatusArmazem(StatusArmazem statusArmazem) {
		this.statusArmazem = statusArmazem;
	}

	public List<Deposito> getListaDepositos() {
		return listaDepositos;
	}

	public boolean inserirDeposito(Deposito deposito) {
		return listaDepositos.add(deposito);

	}

	public boolean removerDeposito(Deposito deposito) {
		return listaDepositos.remove(deposito);

	}

}
