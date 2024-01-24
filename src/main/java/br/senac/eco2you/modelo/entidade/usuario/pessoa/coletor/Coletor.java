package br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor;
 
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.conquista.Conquista;
import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.Pessoa;
 
@Entity
@Table(name = "coletor")
public class Coletor extends Pessoa implements Serializable {
 
	private static final long serialVersionUID = -7208351556519329959L;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coletor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Deposito> depositos;

	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "coletor_conquista", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_conquista"))
	private List<Conquista> conquistas = new ArrayList<Conquista>();

	public Coletor() {}
	
	public Coletor(String nome, String sobrenome, String cpf, LocalDate dataNascimento, String email, String senha) {
		super(nome, sobrenome, cpf, dataNascimento, email, senha);
		depositos = new ArrayList<>();
	}
 
	public Coletor(String nome, String sobrenome, String cpf, LocalDate dataNascimento, String email, String senha, Endereco endereco) {
		super(nome, sobrenome, cpf, dataNascimento, email, senha, endereco);
		depositos = new ArrayList<>();
	
	}
	
	public List<Deposito> getDepositos() {
		return depositos;
	}
 
	public void adicionarDeposito(Deposito deposito) {
		this.depositos.add(deposito);
	}
	
	public void removerDeposito(Deposito deposito) {
		this.depositos.remove(deposito);
	}
 
	public List<Conquista> getConquistas() {
		return conquistas;
	}
 
	public void inserirConquista(Conquista conquista) {
		this.conquistas.add(conquista);
	}
 
	public void removerConquista(Conquista conquista) {
		this.conquistas.remove(conquista);
	}
}