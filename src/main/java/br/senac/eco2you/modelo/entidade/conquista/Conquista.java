package br.senac.eco2you.modelo.entidade.conquista;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;

@Entity
@Table(name = "conquista")
public class Conquista implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conquista")
	private Long id;
	
	@Column(name = "pontos_conquista", nullable = false)
	private double pontosConquista;
	
	@Column(name = "nome_conquista", nullable = false)
	private String nome;
	
	@Column(name = "descricao_conquista", nullable = false)
	private String descricao;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_deposito", nullable = false, unique = false)
	private Deposito deposito;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_coletor", nullable = false, unique = false)
	private Deposito coletor;
	
	public Conquista() {
	}
	
	public Conquista(float pontosConquista, String descricao, String nome) {
		setPontosConquista(pontosConquista);
		setDescricao(descricao);
		setNome(nome);
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public double getPontosConquista() {
		return pontosConquista;
	}
	
	public void setPontosConquista(double pontosConquista) {
		this.pontosConquista = pontosConquista;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
