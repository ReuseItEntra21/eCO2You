package br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.retirada.Retirada;
import br.senac.eco2you.modelo.entidade.usuario.empresa.Empresa;

@Entity
@Table(name = "cooperativa")
public class Cooperativa extends Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "capacidade_retirada_cooperativa", length = 25, nullable = false)
	private int capacidadeColeta;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "cooperativa_retirada", joinColumns = @JoinColumn(name = "id_cooperativa"), inverseJoinColumns = @JoinColumn(name = "id_retirada"))
	private List<Retirada> listaRetiradas;
	
	public Cooperativa () {}

	public Cooperativa(String nome, String email, String senha, Endereco endereco, String cnpj, String horarioFuncionamento, int capacidadeColeta) {
		super(nome, email, senha, endereco, cnpj, horarioFuncionamento);
		setCapacidadeColeta(capacidadeColeta);
		listaRetiradas = new ArrayList<>();
	}

	public int getCapacidadeColeta() {
		return capacidadeColeta;
	}

	public void setCapacidadeColeta(int capacidadeColeta) {
		this.capacidadeColeta = capacidadeColeta;
	}

	public List<Retirada> getListaRetiradas() {
		return listaRetiradas;
	}

	public boolean inserirRetirada(Retirada retirada) {
		return listaRetiradas.add(retirada);

	}

	public boolean removerRetirada(Retirada retirada) {
		return listaRetiradas.remove(retirada);

	}

}
