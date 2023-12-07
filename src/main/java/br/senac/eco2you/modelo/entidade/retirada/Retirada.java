package br.senac.eco2you.modelo.entidade.retirada;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.senac.eco2you.modelo.entidade.itemRetirada.ItemRetirada;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;

@Entity
@Table(name = "retiradas")
public class Retirada implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    private Long id;
    
    @Column(name = "data", nullable = false)
    private LocalDate data;
 
    @Column(name = "cooperativa_id", nullable = false)
    private Integer cooperativaId;
 
    @Column(name = "armazem_id", nullable = false)
    private Integer armazemId;
 
    @OneToMany(mappedBy = "retirada")
    private List<ItemRetirada> listaItemRetiradas;
 
    public Retirada(LocalDate data, Cooperativa cooperativa, Armazem armazem) {
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
 
    public boolean removerDeposito(ItemRetirada itemRetirada) {
        return listaItemRetiradas.remove(itemRetirada);
 
    }
 
    @Override
    public String toString() {
        return "Retirada [data=" + data + ", cooperativa=" + cooperativa + ", armazem=" + armazem + ", listaItemRetiradas="
                + listaItemRetiradas + "]";
    }
 
}
