package br.senac.eco2you.modelo.dao.cooperativa;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;

public class CooperativaDAOImpl implements CooperativaDAO {

	private ConexaoFactory fabrica;

		public CooperativaDAOImpl() {
		fabrica = new ConexaoFactory();
		}

	public Cooperativa buscarUsuariosPorNome(String nome) {
		Session sessao = null;
		Cooperativa cooperativa = null;

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
			Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);

			criteria.select(raizCooperativa).where(construtor.like(raizCooperativa.get("nome"), "%" + nome + "%"));

			return sessao.createQuery(criteria).uniqueResult();

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

		return null;
	}

	public List<Cooperativa> buscarUsuariosPeloBairro(String nome) {
		Session sessao = null;
		Cooperativa cooperativa = null;

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
			Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);

			

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

		return null;

	}
}
