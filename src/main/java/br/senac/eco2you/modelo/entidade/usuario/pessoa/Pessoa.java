package br.senac.eco2you.modelo.entidade.usuario.pessoa;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;

public abstract class Pessoa extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa")
	private long id;

	@Column(name = "sobrenome_pessoa", length = 25, nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "apelido_pessoa", length = 10, nullable = true, unique = true)
	private String apelido;

	@Column(name = "idade_pessoa", nullable = false, unique = false)
	private int idade;

	@Column(name = "cpf_pessoa", length = 14, nullable = false, unique = true)
	private String cpf;

	@Column(name = "dataNascimento_usuario", nullable = false, unique = false)
	private Date dataNascimento;

	public Pessoa(String nome, String email, String senha, Endereco endereco, String sobrenome, String apelido,
			int idade, String cpf, Date dataNascimento) {

		super(nome, email, senha, endereco);
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.idade = idade;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Pessoa() {
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDatanascimento() {
		return dataNascimento;
	}

	public void setDatanascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
