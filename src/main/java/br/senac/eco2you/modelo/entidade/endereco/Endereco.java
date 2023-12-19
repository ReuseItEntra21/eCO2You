package br.senac.eco2you.modelo.entidade.endereco;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "endereco"/*, uniqueConstraints = {
		@UniqueConstraint(columnNames = { "logradouro_endereco", "numero_endereco" }) }*/)
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long id;

	@Column(name = "cep_endereco", length = 9, nullable = false, unique = false)
	private String cep;

	@Column(name = "rua_endereco", length = 45, nullable = false, unique = false)
	private String rua;

	@Column(name = "numero_endereco", nullable = false, unique = false)
	private int numeroResidencia;

	@Column(name = "complemento_endereco", length = 45, nullable = true, unique = false)
	private String complemento;

	@Column(name = "telefone_endereco", length = 15, nullable = true, unique = false)
	private String telefone;

	@Column(name = "bairro_endereco", length = 25, nullable = false, unique = false)
	private String bairro;

	@Column(name = "cidade_endereco", length = 25, nullable = false, unique = false)
	private String cidade;

	@Column(name = "logradouro_endereco", length = 45, nullable = false)
	private String logradouro;

	@Column(name = "apto_endereco", length = 25, nullable = true, unique = false)
	private String aptoEndereco;

	@Column(name = "bloco_endereco", length = 25, nullable = true, unique = false)
	private String blocoEndereco;

	public Endereco(String cep, String rua, int numeroResidencia, String complemento, String telefone, String bairro,
			String cidade, String logradouro, String aptoEndereco, String blocoEndereco) {
		this.cep = cep;
		this.rua = rua;
		this.numeroResidencia = numeroResidencia;
		this.complemento = complemento;
		this.telefone = telefone;
		this.bairro = bairro;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.aptoEndereco = aptoEndereco;
		this.blocoEndereco = blocoEndereco;
	}

	public Endereco() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroResidencia() {
		return numeroResidencia;
	}

	public void setNumeroResidencia(int numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getAptoEndereco() {
		return aptoEndereco;
	}

	public void setAptoEndereco(String aptoEndereco) {
		this.aptoEndereco = aptoEndereco;
	}

	public String getBlocoEndereco() {
		return blocoEndereco;
	}

	public void setBlocoEndereco(String blocoEndereco) {
		this.blocoEndereco = blocoEndereco;

	}

}