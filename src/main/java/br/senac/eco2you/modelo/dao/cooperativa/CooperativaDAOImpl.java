package br.senac.eco2you.modelo.dao.cooperativa;

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
import br.senac.eco2you.modelo.entidade.retirada.Retirada;
import br.senac.eco2you.modelo.entidade.retirada.Retirada_;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem_;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa_;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;

public class CooperativaDAOImpl implements CooperativaDAO {

	private ConexaoFactory fabrica;

	public CooperativaDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public List<Cooperativa> buscarCooperativaPorNome(String nome) {
		Session sessao = null;
		List<Cooperativa> cooperativas = new ArrayList<Cooperativa>();

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
			Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);

			criteria.select(raizCooperativa).where(construtor.like(raizCooperativa.get(nome), "%" + nome + "%"));

			cooperativas = sessao.createQuery(criteria).getResultList();

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

		return cooperativas;
	}

	public List<Cooperativa> buscarCooperativasPeloBairro(String bairro) {
		Session sessao = null;
		List<Cooperativa> cooperativas = new ArrayList<>();

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
			Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);

			Join<Cooperativa, Endereco> juncaoEndereco = raizCooperativa.join(Cooperativa_.endereco);

			ParameterExpression<String> bairroEndereco = construtor.parameter(String.class);
			criteria.where(construtor.equal(juncaoEndereco.get(Endereco_.BAIRRO), bairroEndereco));

			cooperativas = sessao.createQuery(criteria).setParameter(bairroEndereco, bairro).getResultList();

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

		return cooperativas;

	}

	public List<Cooperativa> buscarCooperativasPelaCidade(String cidade) {
		Session sessao = null;
		List<Cooperativa> cooperativas = new ArrayList<>();

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
			Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);

			Join<Cooperativa, Endereco> juncaoEndereco = raizCooperativa.join(Cooperativa_.endereco);

			ParameterExpression<String> cidadeEndereco = construtor.parameter(String.class);
			criteria.where(construtor.equal(juncaoEndereco.get(Endereco_.CIDADE), cidadeEndereco));

			cooperativas = sessao.createQuery(criteria).setParameter(cidadeEndereco, cidade).getResultList();

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

		return cooperativas;
	}

	public Cooperativa exibirPerfilCooperativa(String nomeDaCooperativa) {
		try (Session sessao = fabrica.getConexao().openSession()) {
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
			Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);

			criteria.select(raizCooperativa)
					.where(construtor.equal(raizCooperativa.get(Cooperativa_.NOME), nomeDaCooperativa));

			return sessao.createQuery(criteria).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
//	public Cooperativa buscarPerfilCooperativaPeloNome(String nome) {
//		try (Session sessao = fabrica.getConexao().openSession()) {
//			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
//			CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
//			Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);
//
//			Join<Cooperativa, Retirada> juncaoRetirada = raizCooperativa.join(Cooperativa_.retiradas);
//			Join<Retirada, Armazem> juncaoArmazem = raizCooperativa.join(Retirada_.armazem);
//			
//			
//			ParameterExpression<String> idRetirada = construtor.parameter(String.class);
//			criteria.where(construtor.equal(juncaoRetirada.get(Retirada_.id), idRetirada));
//			
//			ParameterExpression<String> armazemRetirada = construtor.parameter(String.class);
//			criteria.where(construtor.equal(juncao.get(Armazem_.RETIRADAS), idRetirada));
//			
//			coperativas = sessao.createQuery(criteria).setParameter(idRetirada, Retirada.getId());
//						
//			sessao.getTransaction().commit();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	return cooperativas;
//}
}