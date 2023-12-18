package br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private List<Deposito> listaDepositos;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coletor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Conquista> listaConquistas;

	public Coletor(String nome, String sobrenome, String email, String senha, Endereco endereco, String apelido,
			int idade, String cpf, Date date) {
		super(nome, email, senha, endereco, sobrenome, apelido, idade, cpf, date);
		listaDepositos = new ArrayList<>();
		listaConquistas = new ArrayList<>();
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
	public List<Conquista> getListaConquistas() {
		return listaConquistas;
	}
	public boolean inserirConquista(Conquista conquista) {
		return listaConquistas.add(conquista);
	}
	public boolean removerConquista(Conquista conquista) {
		return listaConquistas.remove(conquista);
	}
}