package br.senac.eco2you.modelo.dao.cooperativa;

import java.util.Collections;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;

public class CooperativaDAOImpl implements CooperativaDAO{

	public List<Cooperativa> buscarUsuariosPorNome(String nome) {
		Session sessao = null;

		try {
			sessao = conectarBanco().openSession();
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
