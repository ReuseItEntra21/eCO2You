package br.senac.eco2you.modelo.dao.coletor;

import java.util.Collections;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.eco2you.modelo.entidade.usuario.Usuario;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
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

	public Usuario buscarPorId(Long id) {

		return null;
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
}