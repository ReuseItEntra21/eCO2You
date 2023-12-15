package br.senac.eco2you.modelo.dao.deposito;
 
import java.util.List;
 
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
 
import org.hibernate.Session;
 
import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.deposito.Deposito_;
import br.senac.eco2you.modelo.enumeracao.statusDeposito.StatusDeposito;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;
 
public class DepositoDAOImpl implements DepositoDAO{
	
	private ConexaoFactory fabrica;
 
	public DepositoDAOImpl() {
		fabrica = new ConexaoFactory();
	}
	
	public void inserirDeposito(Deposito deposito) {
 
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.save(deposito);
 
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
 
	public void deletarDeposito(Deposito deposito) {
 
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.delete(deposito);
 
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
 
	public void atualizarDeposito(Deposito deposito) {
 
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.update(deposito);
 
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
 
	public List<Deposito> recuperarDepositos() {
		Session sessao = null;
		List<Deposito> depositos = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
 
			CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
			Root<Deposito> raizCliente = criteria.from(Deposito.class);
 
			criteria.select(raizCliente);
 
			depositos = sessao.createQuery(criteria).getResultList();
 
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
 
		return depositos;
	}
 
	public List<Deposito> buscarRetiradaPeloStatusRetirada(StatusDeposito statusDeposito) {
		
		 Session sessao = null;
		List<Deposito> depositos = null;
 
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
			Root<Deposito> raizDeposito = criteria.from(Deposito.class);
			ParameterExpression<StatusDeposito> statusDeDeposito = construtor.parameter(StatusDeposito.class);
 
			criteria.select(raizDeposito).where(construtor.equal(raizDeposito.get(Deposito_.STATUS_DE_DEPOSITO), statusDeDeposito));
			depositos = sessao.createQuery(criteria).setParameter(statusDeDeposito, statusDeposito).getResultList();
 
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
 
		return depositos;
	}
	
}