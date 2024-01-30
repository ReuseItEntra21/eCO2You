package br.senac.eco2you.modelo.dao.coletor;

import java.util.Collections;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.deposito.Deposito_;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor_;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;

public class ColetorDAOImpl implements ColetorDAO {

	private ConexaoFactory fabrica;

	public ColetorDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public List<Coletor> buscarColetorPorNome(String nome) {
		Session sessao = null;

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Coletor> criteria = construtor.createQuery(Coletor.class);
			Root<Coletor> raizUsuario = criteria.from(Coletor.class);

			criteria.select(raizUsuario).where(construtor.like(raizUsuario.get("nome"), "%" + nome + "%"));

			return sessao.createQuery(criteria).getResultList();

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

		return Collections.emptyList();

	}

	public Coletor exibirPerfilColetor(String nomeDoColetor) {
		try (Session sessao = fabrica.getConexao().openSession()) {
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Coletor> criteria = construtor.createQuery(Coletor.class);
			Root<Coletor> raizColetor = criteria.from(Coletor.class);

			criteria.select(raizColetor).where(construtor.equal(raizColetor.get(Coletor_.NOME), nomeDoColetor));

			return sessao.createQuery(criteria).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Coletor> buscarPerfilColetorPeloNome(String nome) {
		try (Session sessao = fabrica.getConexao().openSession()) {
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Coletor> criteria = construtor.createQuery(Coletor.class);
			Root<Coletor> raizColetor = criteria.from(Coletor.class);

			Join<Coletor, Deposito> juncaoDeposito = raizColetor.join(Coletor_.DEPOSITOS);
			Join<Deposito, Armazem> juncaoArmazem = juncaoDeposito.join(Deposito_.ARMAZEM);

			ParameterExpression<String> nomeColetorExpression = construtor.parameter(String.class);
			
			criteria.where(construtor.equal(juncaoArmazem.get(Coletor_.NOME), nomeColetorExpression));

			return sessao.createQuery(criteria).setParameter(nomeColetorExpression, nome).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
