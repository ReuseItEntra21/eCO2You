package br.senac.eco2you.modelo.entidade.usuario;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuario")
public abstract class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;

	@Column(name = "Nome_usuario", length = 25, nullable = false)
	private String nome;

	@Column(name = "email_usuario", length = 45, nullable = false)
	private String email;

	@Column(name = "senha_usuario", length = 25, nullable = false)
	private String senha;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
	private Endereco endereco;
	
	public Usuario() {}

	public Usuario(String nome, String email, String senha, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String novoEmail) {
		this.email = novoEmail;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String novaSenha) {
		this.senha = novaSenha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
