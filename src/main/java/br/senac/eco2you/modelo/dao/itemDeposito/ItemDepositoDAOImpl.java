package br.senac.eco2you.modelo.dao.itemDeposito;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.senac.eco2you.modelo.entidade.item.deposito.ItemDeposito;

public class ItemDepositoDAOImpl implements ItemDepositoDAO {

	public void inserirItemDeposito(ItemDeposito itemDeposito) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.save(itemDeposito);

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

	public void deletarItemDeposito(ItemDeposito itemDeposito) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.delete(itemDeposito);

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

	public void atualizarItemDeposito(ItemDeposito itemDeposito) {

		Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(itemDeposito);

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

	public List<ItemDeposito> recuperarItensDeposito() {

		Session sessao = null;
		List<ItemDeposito> clientes = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<ItemDeposito> criteria = construtor.createQuery(ItemDeposito.class);
			Root<ItemDeposito> raizCliente = criteria.from(ItemDeposito.class);

			criteria.select(raizCliente);

			clientes = sessao.createQuery(criteria).getResultList();

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

		return clientes;
	}

	private SessionFactory conectarBanco() {

		Configuration configuracao = new Configuration();

		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.deposito.Deposito.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.endereco.Endereco.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.item.deposito.ItemDeposito.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.item.retirada.ItemRetirada.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.retirada.Retirada.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.Usuario.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.empresa.Empresa.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.pessoa.Pessoa.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.enumeracao.status.armazem.StatusArmazem.class);
		configuracao.addAnnotatedClass(br.senac.eco2you.modelo.enumeracao.status.retirada.StatusRetirada.class);

		configuracao.configure("hibernate.cfg.xml");

		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
				.build();
		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;
	}

}
