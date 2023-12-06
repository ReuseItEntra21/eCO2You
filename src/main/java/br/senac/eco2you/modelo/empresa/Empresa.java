package br.senac.eco2you.modelo.empresa;

import br.senac.eco2you.modelo.endereco.Endereco;
import br.senac.eco2you.modelo.usuario.Usuario;

public class Empresa extends Usuario {
	
	private String nome;
	private String cnpj;
	private String horarioFuncionamento;
	private Endereco endereco;
 
	public Empresa(String nome, String cnpj, String horarioFuncionamento, Endereco endereco) {
 
		setNome(nome);
		setCnpj(cnpj);
		setHorarioFuncionamento(horarioFuncionamento);
 
	}
 
	public String getNome() {
		return nome;
	}
 
	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public String getCnpj() {
		return cnpj;
	}
 
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
 
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
 
	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
 
	public Endereco getEndereco() {
		return endereco;
	}
 
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
