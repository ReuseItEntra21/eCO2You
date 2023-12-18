package br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor;
 
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.Pessoa;
 
@Entity
@Table(name = "Coletor")
public class Coletor extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
 
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "coletor_deposito", joinColumns = @JoinColumn(name = "id_coletor"), inverseJoinColumns = @JoinColumn(name = "id_deposito"))
	private List<Deposito> listaDepositos;
 
	public Coletor(String nome, String sobrenome, String email, String senha, Endereco endereco, String apelido,
			int idade, String cpf, Date dataNascimento) {
		super(nome, email, senha, endereco, sobrenome, apelido, idade, cpf, dataNascimento);
		listaDepositos = new ArrayList<>();
	}
 
	public Coletor() {}
	
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