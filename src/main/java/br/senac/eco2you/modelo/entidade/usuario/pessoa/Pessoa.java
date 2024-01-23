package br.senac.eco2you.modelo.entidade.usuario.pessoa;
 
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

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
 
	@Column(name = "apelido_pessoa", length = 10)
	private String apelido;
 
	@Column(name = "idade_pessoa", nullable = false)
	private int idade;
 
	@Column(name = "cpf_pessoa", length = 14, nullable = false)
	private String cpf;
 
	@Column(name = "data_nascimento_usuario", nullable = false)
	private Date dataNascimento;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String email, String senha, Endereco endereco, String sobrenome, String apelido,int idade, String cpf, Date dataNascimento) {
		super(nome, email, senha, endereco);
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.idade = idade;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
 
	public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String senha, String cpf, String email) {
		super(nome, email, senha);
		this.sobrenome = sobrenome;
		this.cpf = cpf;
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