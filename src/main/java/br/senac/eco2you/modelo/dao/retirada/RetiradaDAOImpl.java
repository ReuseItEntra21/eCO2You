package br.senac.eco2you.modelo.dao.retirada;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.eco2you.modelo.entidade.retirada.Retirada;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;

public class RetiradaDAOImpl implements RetiradaDAO {

	private ConexaoFactory fabrica;

	public RetiradaDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirRetirada(Retirada retirada) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(retirada);

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

	public void deletarRetirada(Retirada retirada) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(retirada);

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

	public void atualizarRetirada(Retirada retirada) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(retirada);

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

	public List<Retirada> buscarRetiradapelaData() {

		Session sessao = null;
		List<Retirada> retiradas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Retirada> criteria = construtor.createQuery(Retirada.class);
			Root<Retirada> raizRetirada = criteria.from(Retirada.class);

			ParameterExpression<LocalDate> dataRetirada = construtor.parameter(LocalDate.class);
			criteria.where(construtor.equal((Retirada_.DATA), dataRetirada));
			criteria.select(raizRetirada);

			retiradas = sessao.createQuery(criteria).setParameter(dataRetirada, data);

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

		return retiradas;

	}

	public List<Retirada> buscarRetiradapelaCooperativa() {

		Session sessao = null;
		List<Retirada> retiradas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Retirada> criteria = construtor.createQuery(Retirada.class);
			Root<Retirada> raizCooperativa = criteria.from(Retirada.class);
			
			Join<Retirada, Cooperativa> juncaoRetiradaCooperativa = raizCooperativa.join(Retirada_.cooperativa);

			ParameterExpression<String> nomeCooperativa = construtor.parameter(String.class);
			criteria.where(construtor.equal(juncaoRetiradaCooperativa.get(Armazem_.NOME), nomeCooperativa));

			retiradas = sessao.createQuery(criteria).setParameter(nomeCooperativa, nome);

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

		return retiradas;

	}
	
	public List<Retirada> buscarRetiradapeloArmazem() {

		Session sessao = null;
		List<Retirada> retiradas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Retirada> criteria = construtor.createQuery(Retirada.class);
			Root<Retirada> raizCooperativa = criteria.from(Retirada.class);
			
			Join<Retirada, Armazem> juncaoRetiradaArmazem = raizCooperativa.join(Retirada_.armazem);

			ParameterExpression<String> nomeArmazem = construtor.parameter(String.class);
			criteria.where(construtor.equal(juncaoRetiradaArmazem.get(Armazem_.NOME), nomeArmazem));

			retiradas = sessao.createQuery(criteria).setParameter(nomeArmazem, nome);

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

		return retiradas;

	}
	
	public List<Retirada> buscarRetiradapeloStatusRetirada() {
		
		Session sessao = null;
		List<Retirada> retiradas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Retirada> criteria = construtor.createQuery(Retirada.class);
			Root<Retirada> raizRetirada = criteria.from(Retirada.class);

			ParameterExpression<StatusRetirada> statusDeRetiradaRetirada = construtor.parameter(StatusRetirada.enum);
			criteria.where(construtor.equal((Retirada_.STATUSDERETIRADA), statusDeRetiradaRetirada));
			criteria.select(raizRetirada);

			retiradas = sessao.createQuery(criteria).setParameter(statusDeRetiradaRetirada, statusDeRetirada);

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

		return retiradas;
		
	}
}