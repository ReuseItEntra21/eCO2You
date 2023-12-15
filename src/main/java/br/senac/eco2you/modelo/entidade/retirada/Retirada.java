package br.senac.eco2you.modelo.entidade.retirada;
 
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.itemRetirada.ItemRetirada;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.enumeracao.statusRetirada.StatusRetirada;
 
@Entity
@Table(name = "retirada")
public class Retirada implements Serializable{
 
	private static final long serialVersionUID = 1L;
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_retirada")
    private Long id;
    
    @Column(name = "data_retirada", nullable = false, unique = false)
    private LocalDate data;
 
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cooperativa")
    private Cooperativa cooperativa;
 
    @Column(name = "id_armazem", nullable = false)
    private Armazem armazem;
 
    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "retirada_itemRetirada", joinColumns = @JoinColumn(name = "id_retirada"), inverseJoinColumns = @JoinColumn(name = "id_itemRetirada"))
	private List<ItemRetirada> listaItemRetiradas;
    
    @Enumerated(EnumType.STRING)private StatusRetirada statusDeRetirada;
    
    public Retirada() {}
 
    public Retirada(LocalDate data, Cooperativa cooperativa, Armazem armazem, StatusRetirada statusDeRetirada) {
    	setStatusDeRetirada(statusDeRetirada);
        setData(data);
        setCooperativa(cooperativa);
        setArmazem(armazem);
        listaItemRetiradas = new ArrayList<>();
    }
 
    public Long getId() {
		return id;
	}
    
    public void setId(Long id) {
		this.id = id;
	}
    
    public Cooperativa getCooperativa() {
        return cooperativa;
    }
 
    public void setCooperativa(Cooperativa cooperativa) {
        this.cooperativa = cooperativa;
    }
 
    public Armazem getArmazem() {
        return armazem;
    }
 
    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }
 
    public LocalDate getData() {
        return data;
    }
 
    public void setData(LocalDate data) {
        this.data = data;
    }
 
    public List<ItemRetirada> getListaItemRetiradas() {
        return listaItemRetiradas;
    }
 
    public boolean inserirItemRetirada(ItemRetirada itemRetirada) {
        return listaItemRetiradas.add(itemRetirada);
 
    }
 
    public boolean removerItemRetirada(ItemRetirada itemRetirada) {
        return listaItemRetiradas.remove(itemRetirada);
 
    }
 
    public StatusRetirada getStatusDeRetirada() {
		return statusDeRetirada;
	}
    
    public void setStatusDeRetirada(StatusRetirada statusDeRetirada) {
		this.statusDeRetirada = statusDeRetirada;
	}
    
    @Override
    public String toString() {
        return "Retirada [data=" + data + ", cooperativa=" + cooperativa + ", armazem=" + armazem + ", listaItemRetiradas="
                + listaItemRetiradas + "]";
    }
 
}