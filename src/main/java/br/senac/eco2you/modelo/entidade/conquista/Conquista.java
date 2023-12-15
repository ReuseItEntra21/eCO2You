package br.senac.eco2you.modelo.entidade.conquista;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.deposito.Deposito;

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
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_deposito", nullable = false, unique = true)
	private Deposito deposito;
	
	
	public Conquista() {
	}
	
	public Conquista(double pontosDeposito, Deposito deposito) {
		setPontosDeposito(pontosDeposito);
		setDeposito(deposito);
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
	
	public Deposito getDeposito() {
		return deposito;
	}
	
	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}
}
