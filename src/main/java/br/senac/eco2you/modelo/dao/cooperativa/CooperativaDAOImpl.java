package br.senac.eco2you.modelo.dao.cooperativa;

import java.util.Collections;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import exemplo.modelo.entidade.cliente.Cliente;
import exemplo.modelo.entidade.contato.Contato;
import exemplo.modelo.factory.conexao.ConexaoFactory;

public class CooperativaDAOImpl implements CooperativaDAO{

	private ConexaoFactory fabrica;

	public ClienteDAOImpl() {
		fabrica = new ConexaoFactory();
	
	public List<Cooperativa> buscarUsuariosPorNome(String nome) {
		Session sessao = null;

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
			Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);

			criteria.select(raizCooperativa).where(construtor.like(raizCooperativa.get("nome"), "%" + nome + "%"));

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
	
		public List<Cooperativa> buscarUsuariosPeloBairro(String nome) {
			Session sessao = null;
			Cooperativa cooperativa = null;

			
			try {
				sessao = fabrica.getConexao().openSession();
				sessao.beginTransaction();

				CriteriaBuilder construtor = sessao.getCriteriaBuilder();
				CriteriaQuery<Cooperativa> criteria = construtor.createQuery(Cooperativa.class);
				Root<Cooperativa> raizCooperativa = criteria.from(Cooperativa.class);

				Join<Cooperativa, Endereco> juncaoEndereco = raizCooperativa.join(Cooperativa_.endereco);

				ParameterExpression<String> bairroEndereco = construtor.parameter(String.class);
				criteria.where(construtor.equal(juncaoEndereco.get(Endereco_.BAIRRO), bairroEndereco));
				
				cooperativa = sessao.createQuery(criteria).setParameter(bairroEndereco, endereco.getBairro()).getSingleResult();
				
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

			return cooperativa;
	
	}
}
