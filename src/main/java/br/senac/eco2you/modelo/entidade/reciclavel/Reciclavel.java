package br.senac.eco2you.modelo.entidade.reciclavel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reciclavel")
public class Reciclavel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome_reciclavel", length = 25, nullable = false, unique = false)
	private String nome;

	@Column(name = "tipo_reciclavel", length = 25, nullable = false, unique = false)
	private String tipo;

	@Column(name = "pontos_de_carbono", nullable = false, unique = false)
	private double pontosCarbono;

	@Column(name = "peso", nullable = false, unique = false)
	private double peso;

	@Column(name = "volume", nullable = false, unique = false)
	private double volume;

	@Column(name = "nome_reciclavel", length = 200, nullable = false, unique = false)
	private String instrucaoReciclavel;
	
	public Reciclavel() {
	}

	public Reciclavel(String nome, String tipo, double pontosCarbono, double peso, double volume,
			String instrucaoReciclavel) {
		this.nome = nome;
		this.tipo = tipo;
		this.pontosCarbono = pontosCarbono;
		this.peso = peso;
		this.volume = volume;
		this.instrucaoReciclavel = instrucaoReciclavel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrucaoReciclavel() {
		return instrucaoReciclavel;
	}

	public void setInstrucaoReciclavel(String instrucaoReciclavel) {
		this.instrucaoReciclavel = instrucaoReciclavel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPontosCarbono() {
		return pontosCarbono;
	}

	public void setPontosCarbono(double pontosCarbono) {
		this.pontosCarbono = pontosCarbono;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
}