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


		// =============================================================================================================
//		
		Endereco endereco01 = new Endereco(
				"89050-000",
				"Av. Brasil",
				610,
				"SENAC",
				"(47) 93035-9999",
				"Ponta Aguda",
				"Blumenau",
				"Brasil",
				"0",
				"0"
		);
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco01);
 
		Coletor coletor01 = new Coletor(
				"José",
				"Albuquerque",
				"jose.albuquerque@gmail.com",
				"123456",
				endereco01,
				"Seu Zé",
				56,
				"321.456.789-01",
				formatoData.parse("02/08/1960")
		);
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(coletor01);
		
		Endereco endereco02 = new Endereco(
				"89050-111",
				"Rua São Paulo",
				209,
				"casa",
				"(47) 93035-000",
				"Vorstad",
				"Blumenau",
				"Brasil",
				"0",
				"0"
		);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco02);
 
		Coletor coletor02 = new Coletor(
				"Carlos",
				"Matos",
				"joao.silva@gmail.com",
				"123456",
				endereco02,
				"Carlão",
				30,
				"123.456.789-01",
				formatoData.parse("02/08/1970")
		);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(coletor02);
		
		Endereco endereco03 = new Endereco(
				"89050-222",
				"Rua 7 de Setembro",
				2970,
				"Shopping",
				"(47) 93765-9999",
				"Centro",
				"Blumenau",
				"Brasil",
				"0",
				"0"
		);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco03);
 
		Coletor coletor03 = new Coletor(
				"Beatriz",
				"Krauser",
				"beatriz.krauser@gmail.com",
				"123456",
				endereco03,
				"BK",
				23,
				"123.456.987-01",
				formatoData.parse("02/08/2000")
		);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(coletor03);

////		// =============================================================================================================
//		
		Endereco endereco04 = new Endereco(
				"88050-000",
				"Av. USA",
				8934,
				"SENAI",
				"(47) 1234-9999",
				"Água Verde",
				"Blumenau",
				"Brasil",
				"0","0");
		enderecoDAO.inserirEndereco(endereco04);
//		
		Armazem armazem01 = new Armazem(
				"Giassi",
				"giassi@gmail.com",
				"123456",
				endereco02,
				"29320241000108",
				"09-08",
				1000,
				StatusArmazem.LIVRE);
		usuarioDAO.inserirUsuario(armazem01);
 
		Endereco endereco05 = new Endereco(
				"55555-000",
				"Av. BR",
				9999,
				"Sebrae",
				"(47) 1234-8888",
				"Escola Agricula",
				"Blumenau",
				"Brasil",
				"0","0");
		enderecoDAO.inserirEndereco(endereco05);
		
		Armazem armazem02 = new Armazem(
				"Angeloni",
				"angeloni@gmail.com",
				"123457",
				endereco03,
				"29320233300108",
				"07-09",
				1111,
				StatusArmazem.LOTADO);
		usuarioDAO.inserirUsuario(armazem02);
 
		Endereco endereco06 = new Endereco(
				"77777-000",
				"Av. PA",
				2999,
				"Seasa",
				"(47) 1234-7777",
				"Escola Do Jordao",
				"Blumenau",
				"Brasil",
				"0", "0");
		enderecoDAO.inserirEndereco(endereco06);
 
		Armazem armazem03 = new Armazem(
				"Cooper",
				"cooper@gmail.com",
				"123458",
				endereco04,
				"29320241000108",
				"04-08",
				2000,
				StatusArmazem.LOTADO);
		usuarioDAO.inserirUsuario(armazem03);

		// =============================================================================================================
		
		Endereco endereco07 = new Endereco(
				"88050-999",
				"Av. Beira Rio",
				8934, "prédio",
				"(47) 9876-9999",
				"Badenfurt",
				"Blumenau",
				"Brasil",
				"0",
				"0");
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco07);
 
		Cooperativa cooperativa01 = new Cooperativa(
				"Coaca-Cola",
				"coca.cola@gmail.com",
				"123456",
				endereco07,
				"12.345.678/9012-34",
				"Segunda a sexta-feira, das 8h às 18h",
				100);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa01);
		
		Endereco endereco08 = new Endereco(
				"88050-678",
				"Rua Santa Maria",
				6384,
				"prédio",
				"(47) 9890-9999",
				"Jordão",
				"Blumenau",
				"Brasil",
				"0",
				"0");
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco08);
 
		Cooperativa cooperativa02 = new Cooperativa(
				"Supermercado Carol",
				"siupermercado.carol@gmail.com",
				"123456",
				endereco08,
				"12.309.678/9043-34",
				"Segunda a sexta-feira, das 8h às 18h",
				100);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa02);
		
		Endereco endereco09 = new Endereco(
				"87850-561",
				"Rua Amazonas",
				8934, "prédio",
				"(47) 3376-0999",
				"Garcia",
				"Blumenau",
				"Brasil",
				"0",
				"0");
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco09);
 
		 Cooperativa cooperativa03 = new Cooperativa(
				"Coteminas",
				"coteminas@gmail.com",
				"123456",
				endereco09,
				"12.990.678/9012-34",
				"Segunda a sexta-feira, das 8h às 18h",
				100);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa03);
		
		// =============================================================================================================
		
		Conquista conquista01 = new Conquista(
				100,
				"Primeiro Depósito",
				"Conquista 100"
		);
		ConquistaDAO conquistaDAO = new ConquistaDAOImpl();
		conquistaDAO.inserirConquista(conquista01);

		Conquista conquista02 = new Conquista(
				200,
				"Segundo Depósito",
				"Conquista 200"
				);
		ConquistaDAO conquistaDAO2 = new ConquistaDAOImpl();
		conquistaDAO2.inserirConquista(conquista02);

		Conquista conquista03 = new Conquista(
				300,
				"Terceiro Depósito",
				"Conquista 300"
				);
		ConquistaDAO conquistaDAO3 = new ConquistaDAOImpl();
		conquistaDAO3.inserirConquista(conquista03);

//		// =============================================================================================================

//		ItemDeposito itemDeposito01 = new ItemDeposito(10);
//		ItemDepositoDAO itemDepositoDAO = new ItemDepositoDAOImpl();
//		itemDepositoDAO.inserirItemDeposito(itemDeposito01);
//
//		Reciclavel reciclavel01 = new Reciclavel(
//				"Garrafa PET",
//				"Plástico",
//				0.05,
//				0.2,
//				0.5,
//				"Limpe antes de reciclar",
//				itemDeposito01
//		);
//		ReciclavelDAO reciclavelDAO = new ReciclavelDAOImpl();
//		reciclavelDAO.inserirReciclavel(reciclavel01);
//
//		itemDeposito01.inserirReciclavel(reciclavel01);
//
//
//		Deposito deposito01 = new Deposito(
//			armazem01,
//			coletor01,
//			StatusDeposito.CONCLUIDO
//		);
//		deposito01.inserirItemDeposito(itemDeposito01);
//		DepositoDAO depositoDAO = new DepositoDAOImpl();
//		depositoDAO.inserirDeposito(deposito01);

//		// =============================================================================================================
//
//		ItemRetirada itemRetirada = new ItemRetirada(
//			"plástico",
//			5.2
//		);
//		ItemRetiradaDAO itemRetiradaDAO = new ItemRetiradaDAOImpl();
//		itemRetiradaDAO.inserirItemRetirada(itemRetirada);
//
//		Retirada retirada = new Retirada(
//			cooperativa01,
//			armazem01,
//			StatusRetirada.EM_ANDAMENTO
//			);
//		retirada.inserirItemRetirada(itemRetirada);
//
//		RetiradaDAO retiradaDAO = new RetiradaDAOImpl();
//		retiradaDAO.inserirRetirada(retirada);

	}
}
