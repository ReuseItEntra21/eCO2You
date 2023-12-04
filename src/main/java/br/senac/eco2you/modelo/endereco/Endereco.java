package br.senac.eco2you.modelo.endereco;

public class Endereco {
	 
	private String cep;
	private String rua;
	private int numeroResidencia;
	private String complemento;
	private String telefone;
	private String bairro;
	private String cidade;
	private String logradouro;
	private String aptoEndereco;
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