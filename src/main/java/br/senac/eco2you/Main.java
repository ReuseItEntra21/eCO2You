package br.senac.eco2you;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.senac.eco2you.modelo.dao.conquista.ConquistaDAO;
import br.senac.eco2you.modelo.dao.conquista.ConquistaDAOImpl;
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
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
import br.senac.eco2you.modelo.enumeracao.statusArmazem.StatusArmazem;
import br.senac.eco2you.modelo.enumeracao.statusDeposito.StatusDeposito;
import br.senac.eco2you.modelo.enumeracao.statusRetirada.StatusRetirada;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");


//		// =============================================================================================================
//		Endereco endereco01 = new Endereco(
//				"89050-000",
//				"Av. Brasil",
//				610,
//				"SENAC",
//				"(47) 93035-9999",
//				"Ponta Aguda",
//				"Blumenau",
//				"Brasil",
//				"0",
//				"0"
//		);
//		
//		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
//		enderecoDAO.inserirEndereco(endereco01);
//
//		Coletor coletor01 = new Coletor(
//				"Carlos",
//				"Matos",
//				"joao.silva@gmail.com",
//				"123456",
//				endereco01,
//				"Carlão",
//				30,
//				"123.456.789-01",
//				formatoData.parse("02/08/1970")
//		);
//		
//		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
//		usuarioDAO.inserirUsuario(coletor01);
//
//		// =============================================================================================================
//		Endereco endereco02 = new Endereco(
//				"88050-000",
//				"Av. USA",
//				8934,
//				"SENAI",
//				"(47) 1234-9999",
//				"Vorstad",
//				"Blumenau",
//				"Brasil",
//				"0",
//				"0"
//		);
//		enderecoDAO.inserirEndereco(endereco02);
//
//		Armazem armazem01 = new Armazem(
//			"Giassi", 
//			"giassi@gmail.com", 
//			"123456", 
//			endereco02, 
//			"29320241000108",
//			"Segunda a sexta-feira, das 8h às 18h", 
//			100,
//			StatusArmazem.LIVRE);
//		usuarioDAO.inserirUsuario(armazem01);
//
//		// =============================================================================================================

		Conquista conquista01 = new Conquista(100, "Primeiro Depósito", "Conquista 100");
		ConquistaDAO conquistaDAO = new ConquistaDAOImpl();
		conquistaDAO.inserirConquista(conquista01);
 
		Conquista conquista02 = new Conquista(200, "Segundo Depósito", "Conquista 200");
		ConquistaDAO conquistaDAO2 = new ConquistaDAOImpl();
		conquistaDAO2.inserirConquista(conquista02);
 
		Conquista conquista03 = new Conquista(300, "Terceiro Depósito", "Conquista 300");
		ConquistaDAO conquistaDAO3 = new ConquistaDAOImpl();
		conquistaDAO3.inserirConquista(conquista03);
		
		
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(coletor01);

		// =============================================================================================================
		Endereco endereco02 = new Endereco(
				"88050-000",
				"Av. USA",
				8934,
				"SENAI",
				"(47) 1234-9999",
				"Vorstad",
				"Blumenau",
				"Brasil",
				"0",
				"0"
		);
		enderecoDAO.inserirEndereco(endereco02);

		Armazem armazem01 = new Armazem(
			"Giassi", 
			"giassi@gmail.com", 
			"123456", 
			endereco02, 
			"29320241000108",
			"Segunda a sexta-feira, das 8h às 18h", 
			100,
			StatusArmazem.LIVRE);
		usuarioDAO.inserirUsuario(armazem01);

		// =============================================================================================================

		Endereco endereco03 = new Endereco(
			"88050-999",
			"Av. Beira Rio",
			8934,
			"prédio",
			"(47) 9876-9999",
			"Centro",
			"Blumenau",
			"Brasil",
			"0",
			"0"
			);
		enderecoDAO.inserirEndereco(endereco03);

		Cooperativa cooperativa01 = new Cooperativa(
			"Coaca-Cola",
			"coca.cola@gmail.com",
			"123456", endereco03,
			"12.345.678/9012-34",
			"Segunda a sexta-feira, das 8h às 18h",
			100
		);
		usuarioDAO.inserirUsuario(cooperativa01);

		// =============================================================================================================

		Reciclavel reciclavel01 = new Reciclavel(
			"Garrafa PET", 
			"Plástico", 
			0.05, 
			0.2, 
			0.5, 
			"Limpe antes de reciclar"
			);
		ReciclavelDAO reciclavelDAO = new ReciclavelDAOImpl();
		reciclavelDAO.inserirReciclavel(reciclavel01);

		ItemDeposito itemDeposito01 = new ItemDeposito(10);
		itemDeposito01.inserirReciclavel(reciclavel01);
		ItemDepositoDAO itemDepositoDAO = new ItemDepositoDAOImpl();
		itemDepositoDAO.inserirItemDeposito(itemDeposito01);

		Deposito deposito01 = new Deposito(
			armazem01,
			coletor01,
			StatusDeposito.CONCLUIDO
		);
		deposito01.inserirItemDeposito(itemDeposito01);
		DepositoDAO depositoDAO = new DepositoDAOImpl();
		depositoDAO.inserirDeposito(deposito01);

		// =============================================================================================================

		ItemRetirada itemRetirada = new ItemRetirada(
			"plástico",
			5.2
		);
		ItemRetiradaDAO itemRetiradaDAO = new ItemRetiradaDAOImpl();
		itemRetiradaDAO.inserirItemRetirada(itemRetirada);

		Retirada retirada = new Retirada(
			cooperativa01,
			armazem01,
			StatusRetirada.EM_ANDAMENTO
			);
		retirada.inserirItemRetirada(itemRetirada);
		
		RetiradaDAO retiradaDAO = new RetiradaDAOImpl();
		retiradaDAO.inserirRetirada(retirada);

	}
}
