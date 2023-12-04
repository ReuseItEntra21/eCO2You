package br.senac.eco2you.modelo.pessoa;


public class Pessoa {

	private String sobrenome;
	private String apelido;
	private String cpf;
	private String datanascimento;

	public Pessoa(String nome, int idade, String endereco, String datanascimento, String cpf, String apelido) {
		this.sobrenome = nome;
		this.apelido = apelido;
		this.cpf = cpf;
		this.datanascimento = datanascimento;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
}
