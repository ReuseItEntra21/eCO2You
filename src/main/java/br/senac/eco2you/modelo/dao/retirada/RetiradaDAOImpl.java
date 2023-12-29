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
import br.senac.eco2you.modelo.entidade.retirada.Retirada_;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem_;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.enumeracao.status.retirada.StatusRetirada;
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

	public List<Retirada> buscarRetiradaPelaData(LocalDate data) {
		
		Session sessao = null;
		List<Retirada> retiradas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Retirada> criteria = construtor.createQuery(Retirada.class);
			Root<Retirada> raizRetirada = criteria.from(Retirada.class);
			ParameterExpression<LocalDate> dataRetirada = construtor.parameter(LocalDate.class);

			criteria.select(raizRetirada).where(construtor.equal(raizRetirada, dataRetirada));

			retiradas = sessao.createQuery(criteria).getResultList();

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

	public List<Retirada> buscarRetiradaPelaCooperativa(String nome) {

		Session sessao = null;

		List<Retirada> retiradas = null;

		try {

			sessao = fabrica.getConexao().openSession();

			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Retirada> criteria = construtor.createQuery(Retirada.class);

			Root<Retirada> raizRetirada = criteria.from(Retirada.class);

			Join<Retirada, Cooperativa> juncaoRetiradaCooperativa = raizRetirada.join(Retirada_.cooperativa);

			ParameterExpression<String> nomeCooperativa = construtor.parameter(String.class);

			criteria.select(raizRetirada).where(construtor.like(juncaoRetiradaCooperativa.get(Armazem_.nome), nomeCooperativa));

			retiradas = sessao.createQuery(criteria).setParameter(nomeCooperativa, nome).getResultList();

			
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

	public List<Retirada> buscarRetiradaPeloArmazem(String nome) {

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

			criteria.select(raizCooperativa)
					.where(construtor.equal(juncaoRetiradaArmazem.get(Armazem_.NOME), nomeArmazem));

			retiradas = sessao.createQuery(criteria).setParameter(nomeArmazem, nome).getResultList();

			
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

public List<Retirada> buscarRetiradaPeloStatusRetirada(StatusRetirada statusRetirada) {

		Session sessao = null;
		List<Retirada> retiradas = null;

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Retirada> criteria = construtor.createQuery(Retirada.class);
			Root<Retirada> raizRetirada = criteria.from(Retirada.class);
			ParameterExpression<StatusRetirada> statusDeRetirada = construtor.parameter(StatusRetirada.class);

			criteria.select(raizRetirada).where(construtor.equal(raizRetirada.get(Retirada_.STATUS_DE_RETIRADA), statusDeRetirada));
			retiradas = sessao.createQuery(criteria).setParameter(statusDeRetirada, statusRetirada).getResultList();

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