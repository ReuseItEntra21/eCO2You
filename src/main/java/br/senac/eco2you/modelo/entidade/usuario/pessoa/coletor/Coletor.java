package br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor;

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

import br.senac.eco2you.modelo.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.Pessoa;

@Entity
@Table(name = "Coletor")
public class Coletor extends Pessoa implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_coletor")
	private Long id;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "coletor_deposito", joinColumns = @JoinColumn(name = "id_coletor"), inverseJoinColumns = @JoinColumn(name = "id_deposito"))
	private List<Deposito> listaDepositos;

	public Coletor(String nome, String email, String senha, Endereco endereco, String sobrenome, String apelido,
			int idade, String cpf, String dataNascimento) {
		super(nome, email, senha, endereco, sobrenome, apelido, idade, cpf, dataNascimento);
		listaDepositos = new ArrayList<>();
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
