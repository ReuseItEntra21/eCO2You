package br.senac.eco2you.modelo.entidade.reciclavel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reciclavel")
public class Reciclavel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reciclavel")
	private Long id;

	@Column(name = "nome_reciclavel", length = 25, nullable = false)
	private String nome;

	@Column(name = "tipo_reciclavel", length = 25, nullable = false)
	private String tipo;

	@Column(name = "pontos_carbono_reciclavel", nullable = false)
	private double pontosCarbono;

	@Column(name = "peso_reciclavel", nullable = false)
	private double peso;

	@Column(name = "volume_reciclavel", nullable = false)
	private double volume;

	@Column(name = "instrucao_reciclavel", length = 200, nullable = false)
	private String instrucaoReciclavel;

	public Reciclavel(String nome, String tipo, double pontosCarbono, double peso, double volume,
			String instrucaoReciclavel) {
		this.nome = nome;
		this.tipo = tipo;
		this.pontosCarbono = pontosCarbono;
		this.peso = peso;
		this.volume = volume;
		this.instrucaoReciclavel = instrucaoReciclavel;
	}

	public Reciclavel() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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