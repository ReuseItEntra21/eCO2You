package br.senac.eco2you.modelo.dao.deposito;
 
import java.time.LocalDate;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.enumeracao.status.deposito.StatusDeposito;
import br.senac.eco2you.modelo.factory.conexao.ConexaoFactory;
 
public class DepositoDAOImpl implements DepositoDAO {
 
	private ConexaoFactory fabrica;
 
	public DepositoDAOImpl() {
		fabrica = new ConexaoFactory();
	}
 
	public void inserirDeposito(Deposito deposito) {
 
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.save(deposito);
 
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
 
	public void deletarDeposito(Deposito deposito) {
 
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.delete(deposito);
 
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
 
	public void atualizarDeposito(Deposito deposito) {
 
		Session sessao = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			sessao.update(deposito);
 
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
 
	public List<Deposito> recuperarDepositos() {
		Session sessao = null;
		List<Deposito> depositos = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
 
			CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
			Root<Deposito> raizCliente = criteria.from(Deposito.class);
 
			criteria.select(raizCliente);
 
			depositos = sessao.createQuery(criteria).getResultList();
 
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
 
		return depositos;
	}
 
	public List<Deposito> buscarDepositoPeloStatusDeposito(StatusDeposito statusDeposito) {
 
		Session sessao = null;
		List<Deposito> depositos = null;
 
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
			Root<Deposito> raizDeposito = criteria.from(Deposito.class);
			ParameterExpression<StatusDeposito> statusDeDeposito = construtor.parameter(StatusDeposito.class);
 
			criteria.select(raizDeposito)
					.where(construtor.equal(raizDeposito.get(Deposito_.STATUS_DE_DEPOSITO), statusDeDeposito));
			depositos = sessao.createQuery(criteria).setParameter(statusDeDeposito, statusDeposito).getResultList();
 
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
 
		return depositos;
	}
 
	public List<Deposito> buscarDepositoPelaData(LocalDate data) {
 
		Session sessao = null;
		List<Deposito> depositos = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
 
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
			Root<Deposito> raizDeposito = criteria.from(Deposito.class);
			ParameterExpression<LocalDate> dataDeposito = construtor.parameter(LocalDate.class);
 
			criteria.select(raizDeposito).where(construtor.equal(raizDeposito, dataDeposito));
 
			depositos = sessao.createQuery(criteria).getResultList();
 
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
 
		return depositos;
 
	}
 
	public List<Deposito> buscarDepositoPeloArmazem(String nome) {
 
		Session sessao = null;
 
		List<Deposito> depositos = null;
 
		try {
 
			sessao = fabrica.getConexao().openSession();
 
			sessao.beginTransaction();
 
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
 
			CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
 
			Root<Deposito> raizArmazem = criteria.from(Deposito.class);
 
			Join<Deposito, Armazem> juncaoRetiradaArmazem = raizArmazem.join(Deposito_.armazem);
 
			ParameterExpression<String> nomeArmazem = construtor.parameter(String.class);
 
			criteria.select(raizArmazem).where(construtor.equal(juncaoRetiradaArmazem.get(Armazem_.NOME), nomeArmazem));
 
			depositos = sessao.createQuery(criteria).setParameter(nomeArmazem, nome).getResultList();
 
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
 
		return depositos;
 
	}
 
	public List<Deposito> buscarDepositoPeloColetor(String nomeDoColetor) {
		try (Session sessao = fabrica.getConexao().openSession()) {
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
			Root<Deposito> raizDeposito = criteria.from(Deposito.class);
 
			criteria.select(raizDeposito)
					.where(construtor.equal(raizDeposito.get(Deposito_.NOME_COLETOR), nomeDoColetor));
 
			return sessao.createQuery(criteria).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
 
	@Override
	public List<Deposito> buscarDepositoPeloColetorEArmazem(String nomeDoColetor, String nomeDoArmazem) {
		        try (Session sessao = fabrica.getConexao().openSession()) {
		            CriteriaBuilder construtor = sessao.getCriteriaBuilder();
		            CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
		            Root<Deposito> raizDeposito = criteria.from(Deposito.class);
		            Join<Deposito, Armazem> juncaoArmazem = raizDeposito.join(Deposito_.armazem);
 
		            criteria.select(raizDeposito)
		                    .where(construtor.and(
		                            construtor.equal(raizDeposito.get(Deposito_.NOME_COLETOR), nomeDoColetor),
		                            construtor.equal(juncaoArmazem.get(Armazem_.NOME), nomeDoArmazem)
		                    ));
 
		            return sessao.createQuery(criteria).getResultList();
		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		    }
	@Override
			public List<Deposito> buscarDepositoPeloColetorEArmazemEStatus(String nomeDoColetor, String nomeDoArmazem, StatusDeposito status) {
        try (Session sessao = fabrica.getConexao().openSession()) {
            CriteriaBuilder construtor = sessao.getCriteriaBuilder();
            CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
            Root<Deposito> raizDeposito = criteria.from(Deposito.class);
            Join<Deposito, Armazem> juncaoArmazem = raizDeposito.join(Deposito_.armazem);
 
            criteria.select(raizDeposito)
                    .where(construtor.and(
                            construtor.equal(raizDeposito.get(Deposito_.NOME_COLETOR), nomeDoColetor),
                            construtor.equal(juncaoArmazem.get(Armazem_.NOME), nomeDoArmazem),
                            construtor.equal(raizDeposito.get(Deposito_.STATUS_DE_DEPOSITO), status)
                    ));
 
            return sessao.createQuery(criteria).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

 
	public List<Deposito> buscarDepositoPeloColetorEArmazemEData(String nomeDoColetor, String nomeDoArmazem, LocalDate data) {
        try (Session sessao = fabrica.getConexao().openSession()) {
            CriteriaBuilder construtor = sessao.getCriteriaBuilder();
            CriteriaQuery<Deposito> criteria = construtor.createQuery(Deposito.class);
            Root<Deposito> raizDeposito = criteria.from(Deposito.class);
            Join<Deposito, Armazem> juncaoArmazem = raizDeposito.join(Deposito_.armazem);
 
            criteria.select(raizDeposito)
                    .where(construtor.and(
                            construtor.equal(raizDeposito.get(Deposito_.NOME_COLETOR), nomeDoColetor),
                            construtor.equal(juncaoArmazem.get(Armazem_.NOME), nomeDoArmazem),
                            construtor.equal(raizDeposito.get(Deposito_.DATA_DEPOSITO), data)
                    ));
 
            return sessao.createQuery(criteria).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}