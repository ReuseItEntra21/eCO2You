package br.senac.eco2you.modelo.entidade.empresa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "armazem")
public abstract class Empresa extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_armazem")
	private Long id;
	
	@Column(name = "cnpj_empresa", nullable = false, unique = false)
	private String cnpj;
	
	@Column(name = "horario_funcionamento_empresa", nullable = false, unique = false)
	private String horarioFuncionamento;
 
	public Empresa(String nome,  String email, String senha, Endereco endereco, String cnpj, String horarioFuncionamento) {

		super(nome, email, senha, endereco);
		setCnpj(cnpj);
		setHorarioFuncionamento(horarioFuncionamento);
 
	}
	
	public Empresa() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
