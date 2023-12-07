package br.senac.eco2you.modelo.entidade.retirada;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.eco2you.modelo.entidade.itemRetirada.ItemRetirada;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;

@Entity
@Table(name = "retirada")
public class Retirada implements Serializable{
 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_retirada")
    private Long id;
    
    @Column(name = "data", nullable = false, unique = false)
    private String data;
 
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cooperativa")
    private Cooperativa cooperativa;
 
    @Column(name = "id_armazem", nullable = false)
    private Armazem armazem;
 
    @OneToMany(mappedBy = "retirada")
    private List<ItemRetirada> listaItemRetiradas;
    
    public Retirada() {}
 
    public Retirada(String data, Cooperativa cooperativa, Armazem armazem) {
        setData(data);
        setCooperativa(cooperativa);
        setArmazem(armazem);
        listaItemRetiradas = new ArrayList<>();
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
 
    public String getData() {
        return data;
    }
 
    public void setData(String data) {
        this.data = data;
    }
 
    public List<ItemRetirada> getListaItemRetiradas() {
        return listaItemRetiradas;
    }
 
    public boolean inserirItemRetirada(ItemRetirada itemRetirada) {
        return listaItemRetiradas.add(itemRetirada);
 
    }
 
    public boolean removerDeposito(ItemRetirada itemRetirada) {
        return listaItemRetiradas.remove(itemRetirada);
 
    }
 
    @Override
    public String toString() {
        return "Retirada [data=" + data + ", cooperativa=" + cooperativa + ", armazem=" + armazem + ", listaItemRetiradas="
                + listaItemRetiradas + "]";
    }
 
}
