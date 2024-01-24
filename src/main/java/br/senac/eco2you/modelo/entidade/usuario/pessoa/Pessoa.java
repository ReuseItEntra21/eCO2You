package br.senac.eco2you.modelo.entidade.usuario.pessoa;
 
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;
 
@Entity
@Table(name = "pessoa")
public abstract class Pessoa extends Usuario implements Serializable {
 
	private static final long serialVersionUID = -4637919020144760089L;

	@Column(name = "sobrenome_pessoa", length = 25, nullable = false)
	private String sobrenome;
 
	@Column(name = "cpf_pessoa", length = 14, nullable = false)
	private String cpf;
 
	@Column(name = "data_nascimento_usuario", nullable = false)
	private LocalDate dataNascimento;
	
	public Pessoa() {}
 
	public Pessoa(String nome, String sobrenome, String cpf, LocalDate dataNascimento, String email, String senha) {
		super(nome, email, senha);
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, String sobrenome, String cpf, LocalDate dataNascimento, String email, String senha, Endereco endereco) {
		super(nome, email, senha, endereco);
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
 
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
 
	public String getCpf() {
		return cpf;
	}
 
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
 
	public LocalDate getDatanascimento() {
		return dataNascimento;
	}
 
	public void setDatanascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}