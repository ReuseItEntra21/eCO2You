package br.senac.eco2you.modelo.entidade.conquista;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conquista")
public class Conquista implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conquista")
	private Long id;
	@Column(name = "ponto_deposito", nullable = false)
	private double pontosDeposito;
	
	public Conquista() {
	}
	
	public Conquista(double pontosDeposito) {
		setPontosDeposito(pontosDeposito);
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public double getPontosDeposito() {
		return pontosDeposito;
	}
	
	public void setPontosDeposito(double pontosDeposito) {
		this.pontosDeposito = pontosDeposito;
	}
}
