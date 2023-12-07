package br.senac.eco2you.modelo.entidade.empresa;

import br.senac.eco2you.modelo.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;

public abstract class Empresa extends Usuario {
	
	private String cnpj;
	private String horarioFuncionamento;
 
	public Empresa(String nome,  String email, String senha, Endereco endereco, String cnpj, String horarioFuncionamento) {

		super(nome, email, senha, endereco);
		setCnpj(cnpj);
		setHorarioFuncionamento(horarioFuncionamento);
 
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
 
}
