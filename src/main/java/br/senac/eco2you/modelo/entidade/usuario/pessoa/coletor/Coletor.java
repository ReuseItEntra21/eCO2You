package br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 
	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coletor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Deposito> depositos;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Conquista> conquistas = new ArrayList<Conquista>();

	public Coletor() {}
	
	public Coletor(String nome, String sobrenome, String email, String senha, Endereco endereco, String apelido, int idade, String cpf, Date date) {
		super(nome, email, senha, endereco, sobrenome, apelido, idade, cpf, date);
		depositos = new ArrayList<>();
	}
 
	public List<Deposito> getDepositos() {
		return depositos;
	}
 
	public void adicionarPedido(Deposito deposito) {
		this.depositos.add(deposito);
	}
	
	public void removerDeposito(Deposito deposito) {
		this.depositos.remove(deposito);
	}
 
	public List<Conquista> getListaConquistas() {
		return conquistas;
	}
 
	public void inserirConquista(Conquista conquista) {
		this.conquistas.add(conquista);
	}
 
	public void removerConquista(Conquista conquista) {
		this.conquistas.remove(conquista);
	}
}