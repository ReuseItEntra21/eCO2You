package br.senac.eco2you.modelo.dao.armazem;
 
import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
 
import org.hibernate.Session;
 
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.endereco.Endereco_;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem_;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;
 
public class ArmazemDAOImpl implements ArmazemDAO{
	private ConexaoFactory fabrica;
	public ArmazemDAOImpl() {
	fabrica = new ConexaoFactory();
	}

 
public List<Armazem> buscarArmazensPorNome(String nome) {
	Session sessao = null;
	List<Armazem> armazens = new ArrayList<Armazem>();
 
	try {
		sessao = fabrica.getConexao().openSession();
		sessao.beginTransaction();
 
		CriteriaBuilder construtor = sessao.getCriteriaBuilder();
		CriteriaQuery<Armazem> criteria = construtor.createQuery(Armazem.class);
		Root<Armazem> raizArmazem= criteria.from(Armazem.class);
 
		criteria.select(raizArmazem).where(construtor.like(raizArmazem.get(nome), "%" + nome + "%"));
		armazens = sessao.createQuery(criteria).getResultList();
 
	} catch (Exception sqlException) {
 
		sqlException.printStackTrace();
		if (sessao.getTransaction() != null) {
			sessao.getTransaction().rollback();
		}
 
	} finally {
		if (sessao != null) {
			sessao.close();
		}
	}
	return armazens;
 
	
}
 
public List<Armazem> buscarArmazemPeloBairro(String bairro) {
	Session sessao = null;
	List<Armazem> armazens = null;
 
	try {
		sessao = fabrica.getConexao().openSession();
		sessao.beginTransaction();
 
		CriteriaBuilder construtor = sessao.getCriteriaBuilder();
		CriteriaQuery<Armazem> criteria = construtor.createQuery(Armazem.class);
		Root<Armazem> raizArmazem = criteria.from(Armazem.class);
 
		Join<Armazem, Endereco> juncaoEndereco = raizArmazem.join(Armazem_.endereco);
		ParameterExpression<String> bairroEndereco = construtor.parameter(String.class);
		criteria.where(construtor.equal(juncaoEndereco.get(Endereco_.BAIRRO), bairroEndereco));
		armazens = sessao.createQuery(criteria).setParameter(bairroEndereco, bairro).getResultList();
 
		
		sessao.getTransaction().commit();
 
	} catch (Exception sqlException) {
 
		sqlException.printStackTrace();
		if (sessao.getTransaction() != null) {
			sessao.getTransaction().rollback();
		}
 
	} finally {
		if (sessao != null) {
			sessao.close();
		}
	}
 
	return armazens;
 
}
 
}