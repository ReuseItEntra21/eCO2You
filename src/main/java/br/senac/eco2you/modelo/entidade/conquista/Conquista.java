package br.senac.eco2you.modelo.entidade.conquista;

import java.io.Serializable;
import javax.persistence.*;
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

	@ManyToOne
	@JoinColumn(name = "id_coletor", nullable = false)
	private Coletor coletor;
	
	public Conquista() {
	}
	
	public Conquista(float pontosConquista, String descricao, String nome, Coletor coletor) {
		setPontosConquista(pontosConquista);
		setDescricao(descricao);
		setNome(nome);
		setColetor(coletor);
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

	public Coletor getColetor() { return coletor; }

	public void setColetor(Coletor coletor) { this.coletor = coletor; }

}
