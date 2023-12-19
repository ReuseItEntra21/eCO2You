package br.senac.eco2you.modelo.entidade.usuario.empresa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "empresa")
public abstract class Empresa extends Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "cnpj_empresa", length = 18, nullable = false, unique = false)
	private String cnpj;
	
	@Column(name = "horario_funcionamento_empresa", length = 25, nullable = false, unique = false)
	private String horarioFuncionamento;
 
	public Empresa(String nome,  String email, String senha, Endereco endereco, String cnpj, String horarioFuncionamento) {

		super(nome, email, senha, endereco);
		setCnpj(cnpj);
		setHorarioFuncionamento(horarioFuncionamento);
 
	}
	
	public Empresa() {}
 
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
