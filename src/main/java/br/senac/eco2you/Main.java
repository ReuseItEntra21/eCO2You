package br.senac.eco2you;

import java.time.LocalDate;
import java.util.Date;

import br.senac.eco2you.modelo.dao.armazem.ArmazemDAO;
import br.senac.eco2you.modelo.dao.armazem.ArmazemDAOImpl;
import br.senac.eco2you.modelo.dao.coletor.ColetorDAO;
import br.senac.eco2you.modelo.dao.coletor.ColetorDAOImpl;
import br.senac.eco2you.modelo.dao.conquista.ConquistaDAO;
import br.senac.eco2you.modelo.dao.conquista.ConquistaDAOImpl;
import br.senac.eco2you.modelo.dao.cooperativa.CooperativaDAO;
import br.senac.eco2you.modelo.dao.cooperativa.CooperativaDAOImpl;
import br.senac.eco2you.modelo.dao.deposito.DepositoDAO;
import br.senac.eco2you.modelo.dao.deposito.DepositoDAOImpl;
import br.senac.eco2you.modelo.dao.endereco.EnderecoDAO;
import br.senac.eco2you.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.eco2you.modelo.dao.itemDeposito.ItemDepositoDAO;
import br.senac.eco2you.modelo.dao.itemDeposito.ItemDepositoDAOImpl;
import br.senac.eco2you.modelo.dao.itemRetirada.ItemRetiradaDAO;
import br.senac.eco2you.modelo.dao.itemRetirada.ItemRetiradaDAOImpl;
import br.senac.eco2you.modelo.dao.reciclavel.ReciclavelDAO;
import br.senac.eco2you.modelo.dao.reciclavel.ReciclavelDAOImpl;
import br.senac.eco2you.modelo.dao.retirada.RetiradaDAO;
import br.senac.eco2you.modelo.dao.retirada.RetiradaDAOImpl;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAO;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.eco2you.modelo.entidade.conquista.Conquista;
import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.itemDeposito.ItemDeposito;
import br.senac.eco2you.modelo.entidade.itemRetirada.ItemRetirada;
import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;
import br.senac.eco2you.modelo.entidade.retirada.Retirada;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;
import br.senac.eco2you.modelo.entidade.usuario.empresa.Empresa;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.Pessoa;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
import br.senac.eco2you.modelo.enumeracao.statusArmazem.StatusArmazem;
import br.senac.eco2you.modelo.enumeracao.statusDeposito.StatusDeposito;
import br.senac.eco2you.modelo.enumeracao.statusRetirada.StatusRetirada;

public class Main {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("89050-000", "Av. Brasil", 610, "SENAC", "(47) 93035-9999", "Ponta Aguda",
				"Blumenau", "Brasil", "0", "0");
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco);
		System.out.println(endereco.getCidade());

		Conquista conquista = new Conquista(100, new Deposito(), "Conquistar 100 pontos", "Conquista 100");
		ConquistaDAO conquistaDAO = new ConquistaDAOImpl();
		conquistaDAO.inserirConquista(conquista);

		Deposito deposito = new Deposito(LocalDate.now(), new Armazem(), new Coletor(), StatusDeposito.LIVRE);
		DepositoDAO depositoDAO = new DepositoDAOImpl();
		depositoDAO.inserirDeposito(deposito);

		ItemDeposito itemDeposito = new ItemDeposito(10);
		ItemDepositoDAO itemDepositoDAO = new ItemDepositoDAOImpl();
		itemDepositoDAO.inserirItemDeposito(itemDeposito);

		ItemRetirada itemRetirada = new ItemRetirada("plástico", 5.2);
		ItemRetiradaDAO itemRetiradaDAO = new ItemRetiradaDAOImpl();
		itemRetiradaDAO.inserirItemRetirada(itemRetirada);

		Reciclavel reciclavel = new Reciclavel("Garrafa PET", "Plástico", 0.05, 0.2, 0.5, "Limpe antes de reciclar");
		ReciclavelDAO reciclavelDAO = new ReciclavelDAOImpl();
		reciclavelDAO.inserirReciclavel(reciclavel);

		Retirada retirada = new Retirada(LocalDate.of(2023, 12, 20), new Cooperativa(), new Armazem(),
				StatusRetirada.EM_ANDAMENTO);
		RetiradaDAO retiradaDAO = new RetiradaDAOImpl();
		retiradaDAO.inserirRetirada(retirada);

		Usuario usuario = new Usuario("João da Silva", "joao.silva@example.com", "123456", new Endereco());
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(usuario);

		Empresa empresa = new Empresa("Empresa ABC", "empresa.abc@example.com", "123456", new Endereco(),
				"12.345.678/9012-34", "Segunda a sexta-feira, das 8h às 18h");
		 
		Armazem armazem = new Armazem("Armazém ABC", "armazem.abc@example.com", "123456", new Endereco("89050-000", "Av. Brasil", 610, "SENAC", "(47) 93035-9999", "Ponta Aguda",
				"Blumenau", "Brasil", "0", "0"), "12.345.678/9012-34", "Segunda a sexta-feira, das 8h às 18h", 1000, StatusArmazem.LIVRE);
		ArmazemDAO armazemDAO = new ArmazemDAOImpl();
		
        Cooperativa cooperativa = new Cooperativa("Cooperativa ABC", "cooperativa.abc@example.com", "123456", new Endereco(), "12.345.678/9012-34", "Segunda a sexta-feira, das 8h às 18h", 100);
        CooperativaDAO CooperativaDAO = new CooperativaDAOImpl();
		
        Pessoa pessoa = new Pessoa("João da Silva", "joao.silva@example.com", "123456", new Endereco(), "Silva", "Joãozinho", 30, "123.456.789-01", new java.sql.Date(93,9,1));
	
        Coletor coletor = new Coletor("João da Silva", "joao.silva@example.com", "123456", new Endereco(), "Silva", "Joãozinho", 30, "123.456.789-01", new java.sql.Date(93, 0, 1));
        ColetorDAO coletorDAO = new ColetorDAOImpl();
		
        
		
	}
}
