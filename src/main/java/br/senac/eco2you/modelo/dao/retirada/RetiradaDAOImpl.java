package br.senac.eco2you.modelo.dao.retirada;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.senac.eco2you.modelo.entidade.retirada.Retirada;

public class RetiradaDAOImpl implements RetiradaDAO {

	public void inserirRetirada(Retirada retirada) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
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

			sessao = conectarBanco().openSession();
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

			sessao = conectarBanco().openSession();
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

	public List<Retirada> recuperarRetirada() {

		Session sessao = null;
		List<Retirada> retiradas = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Retirada> criteria = construtor.createQuery(Retirada.class);
			Root<Retirada> raizCliente = criteria.from(Retirada.class);

			criteria.select(raizCliente);

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

	private SessionFactory conectarBanco() {

		Configuration configuracao = new Configuration();

		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.deposito.Deposito.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.endereco.Endereco.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.itemDeposito.ItemDeposito.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.itemRetirada.ItemRetirada.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.retirada.Retirada.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.Usuario.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.empresa.Empresa.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.pessoa.Pessoa.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.enumeracao.statusArmazem.StatusArmazem.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.enumeracao.statusRetirada.StatusRetirada.class);

		configuracao.configure("hibernate.cfg.xml");

		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
				.build();
		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;
	}
}
