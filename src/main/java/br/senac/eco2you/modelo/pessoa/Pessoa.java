package br.senac.eco2you.modelo.pessoa;

import br.senac.eco2you.modelo.endereco.Endereco;
import br.senac.eco2you.modelo.usuario.Usuario;

public abstract class Pessoa extends Usuario{

	private String sobrenome;
	private String apelido;
	private int idade;
	private String cpf;
	private String dataNascimento;

	public Pessoa(String nome,  String email, String senha, Endereco endereco, String sobrenome, String apelido, int idade,  String cpf, String dataNascimento) {
		
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

	public String getDatanascimento() {
		return dataNascimento;
	}

	public void setDatanascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
