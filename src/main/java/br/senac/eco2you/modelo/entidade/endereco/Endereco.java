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

@Table(
	name = "endereco",
	uniqueConstraints = {
		@UniqueConstraint(columnNames = {
			"cidade_endereco",
			"bairro_endereco",
			"tipo_via_endereco",
			"logradouro_endereco",
			"numero_endereco"
			}
		)
	}
)
public class Endereco implements Serializable {

	private static final long serialVersionUID = -4670801511598712280L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long id;

	@Column(name = "cep_endereco", length = 9, nullable = true)
	private String cep;

	@Column(name = "tipo_via_endereco", length = 45, nullable = true)
	private String tipoVia;

	@Column(name = "numero_endereco", nullable = true)
	private int numeroResidencia;

	@Column(name = "complemento_endereco", length = 45)
	private String complemento;

	@Column(name = "telefone_endereco", length = 15)
	private String telefone;

	@Column(name = "bairro_endereco", length = 25, nullable = true)
	private String bairro;

	@Column(name = "cidade_endereco", length = 25, nullable = true)
	private String cidade;

	@Column(name = "logradouro_endereco", length = 45, nullable = true)
	private String logradouro;

	@Column(name = "apto_endereco", length = 25)
	private String aptoEndereco;

	@Column(name = "bloco_endereco", length = 25)
	private String blocoEndereco;

	public Endereco(String cidade, String bairro, String cep, String tipoVia, String logradouro, int numeroResidencia, String complemento,  
			 String aptoEndereco, String blocoEndereco, String telefone) {
		this.cep = cep;
		this.tipoVia = tipoVia;
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

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
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