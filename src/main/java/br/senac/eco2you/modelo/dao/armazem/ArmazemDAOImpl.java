package br.senac.eco2you.modelo.dao.armazem;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;

public class ArmazemDAOImpl implements ArmazemDAO{
	
	private ConexaoFactory fabrica;
	 
	public ArmazemDAOImpl() {
	fabrica = new ConexaoFactory();
	}
	
	public void inserirArmazem(Armazem armazem) {
		
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(armazem);

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

	public void deletarArmazem(Armazem armazem) {
		
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(armazem);

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

	public void atualizarArmazem(Armazem armazem) {
		
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(armazem);;

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

public Armazem buscarArmazemPorNome(String nome) {
	Session sessao = null;
	Armazem armazem = null;

	try {
		sessao = fabrica.getConexao().openSession();
		sessao.beginTransaction();

		CriteriaBuilder construtor = sessao.getCriteriaBuilder();
		CriteriaQuery<Armazem> criteria = construtor.createQuery(Armazem.class);
		Root<Armazem> raizCooperativa = criteria.from(Armazem.class);

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

public List<Armazem> buscarArmazemPeloBairro(String bairro) {
	Session sessao = null;
	Armazem armazem = null;

	try {
		sessao = fabrica.getConexao().openSession();
		sessao.beginTransaction();

		CriteriaBuilder construtor = sessao.getCriteriaBuilder();
		CriteriaQuery<Armazem> criteria = construtor.createQuery(Armazem.class);
		Root<Armazem> raizCooperativa = criteria.from(Armazem.class);

		Join<Armazem, Endereco> juncaoEndereco = raizCooperativa.join(Armazem_.endereco);

		ParameterExpression<String> bairroEndereco = construtor.parameter(String.class);
		criteria.where(construtor.equal(juncaoEndereco.get(Endereco_.BAIRRO), bairroEndereco));

		armazem = sessao.createQuery(criteria).setParameter(bairroEndereco, bairro);

		
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
