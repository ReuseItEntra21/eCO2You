package br.senac.eco2you.modelo.dao.reciclavel;
 
import java.util.List;
 
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
 
import org.hibernate.Session;
 
import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;
 
public class ReciclavelDAOImpl implements ReciclavelDAO {
 
	private ConexaoFactory fabrica;
	
	public ReciclavelDAOImpl() {
		fabrica = new ConexaoFactory();
	}
	
	public void inserirReciclavel(Reciclavel reciclavel) {
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.save(reciclavel);
 
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
	}
 
	public void deletarReciclavel(Reciclavel reciclavel) {
 
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.delete(reciclavel);
 
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
 
	}
 
	public void atualizarReciclavel(Reciclavel reciclavel) {
 
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.update(reciclavel);
 
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
	}
 
	public List<Reciclavel> buscarReciclavelPeloNome(String nome) {
 
		Session sessao = null;
		List<Reciclavel> reciclaveis = null;
 
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
 
			CriteriaQuery<Reciclavel> criteria = construtor.createQuery(Reciclavel.class);
			Root<Reciclavel> raizReciclavel = criteria.from(Reciclavel.class);
 
			ParameterExpression<String> nomeReciclavel = construtor.parameter(String.class);
			criteria.select(raizReciclavel).where(construtor.equal((Reciclavel_.NOME), nomeReciclavel));
 
			reciclaveis = sessao.createQuery(criteria).setParameter(nomeReciclavel, nome);
 
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
 
		return reciclaveis;
	}
 
}