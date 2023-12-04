package br.senac.eco2you.modelo.reciclavel;

public class Reciclavel {

	private String nome;
	private String tipo;
	private double pontosCarbono;
	private double peso;
	private double volume;
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