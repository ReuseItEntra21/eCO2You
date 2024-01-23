package br.senac.eco2you;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

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
import br.senac.eco2you.modelo.dao.material.MaterialDAO;
import br.senac.eco2you.modelo.dao.material.MaterialDAOImpl;
import br.senac.eco2you.modelo.dao.reciclavel.ReciclavelDAO;
import br.senac.eco2you.modelo.dao.reciclavel.ReciclavelDAOImpl;
import br.senac.eco2you.modelo.dao.retirada.RetiradaDAO;
import br.senac.eco2you.modelo.dao.retirada.RetiradaDAOImpl;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAO;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.eco2you.modelo.entidade.conquista.Conquista;
import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.item.deposito.ItemDeposito;
import br.senac.eco2you.modelo.entidade.item.retirada.ItemRetirada;
import br.senac.eco2you.modelo.entidade.material.Material;
import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;
import br.senac.eco2you.modelo.entidade.retirada.Retirada;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
import br.senac.eco2you.modelo.enumeracao.status.armazem.StatusArmazem;
import br.senac.eco2you.modelo.enumeracao.status.deposito.StatusDeposito;
import br.senac.eco2you.modelo.enumeracao.status.retirada.StatusRetirada;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");


		// =============================================================================================================
//		
		Endereco endereco01 = new Endereco(
				"Blumenau",
				"Ponta Aguda",
				"89746-390",
				"Avenida",
				"Rio Branco",
				610,
				"SENAC",
				"0",
				"0",
				"(47) 97689-0035"
		);
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco01);

		// =============================================================================================================
 
		Conquista conquista01 = new Conquista(
				100,
				"Primeiro Depósito",
				"Conquista 100"
		);	
		ConquistaDAO conquistaDAO = new ConquistaDAOImpl();
		conquistaDAO.inserirConquista(conquista01);
		
		// =============================================================================================================

		
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
		coletor01.inserirConquista(conquista01);
		usuarioDAO.atualizarUsuario(coletor01);
		
		// =============================================================================================================
		
		Endereco endereco02 = new Endereco(
				"Blumenau",
				"Nova Russia",
				"85646-390",
				"Rua",
				"Santa Maria",
				8940,
				"casa",
				"0",
				"0",
				"(47) 97009-0035"
		);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco02);

		// =============================================================================================================
 
		Conquista conquista02 = new Conquista(
				200,
				"Segundo Depósito",
				"Conquista 200"
				);
		ConquistaDAO conquistaDAO2 = new ConquistaDAOImpl();
		conquistaDAO2.inserirConquista(conquista02);

		// =============================================================================================================
		
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
		coletor02.inserirConquista(conquista02);
		usuarioDAO.atualizarUsuario(coletor02);
		
		// =============================================================================================================
		
		Endereco endereco03 = new Endereco(
				"Blumenau",
				"Centro",
				"82336-670",
				"Avenida",
				"Beira Rio",
				824,
				"casa amarela",
				"0",
				"0",
				"(47) 92909-0035"
		);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco03);

		// =============================================================================================================
 		
		Conquista conquista03 = new Conquista(
				300,
				"Terceiro Depósito",
				"Conquista 300"
				);
		ConquistaDAO conquistaDAO3 = new ConquistaDAOImpl();
		conquistaDAO3.inserirConquista(conquista03);
		
		// =============================================================================================================
		
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
		coletor03.inserirConquista(conquista03);
		usuarioDAO.atualizarUsuario(coletor03);
		
		// =============================================================================================================

		Endereco endereco04 = new Endereco(
				"Blumenau",
				"Itoupava",
				"89936-670",
				"Rua",
				"Doutor Pedro Zimmermann",
				2504,
				"casa",
				"0",
				"0",
				"(47) 95509-0035"
		);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco04);
 
		// =============================================================================================================
		
		Conquista conquista04 = new Conquista(
				1000,
				"Mil latinhas recicladas",
				"Conquista Mil Latinhas"
				);
		conquistaDAO.inserirConquista(conquista04);
		
		// =============================================================================================================
		
		Coletor coletor04 = new Coletor(
				"Roberto",
				"Da Silva",
				"carlos.silva@gmail.com",
				"123456",
				endereco04,
				"Mano Brown",
				21,
				"100.456.987-01",
				formatoData.parse("02/07/2002")
		);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(coletor04);
		coletor04.inserirConquista(conquista04);
		usuarioDAO.atualizarUsuario(coletor04);
		
		// =============================================================================================================	

		Endereco endereco05 = new Endereco(
				"Blumenau",
				"Vila Nova",
				"36936-090",
				"Rua",
				"Joinvile",
				504,
				"Prédio ao lado da Cooper",
				"0",
				"0",
				"(47) 95534-9035"
		);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco05);
 
		// =============================================================================================================	
		
		Conquista conquista05 = new Conquista(
				1000,
				"100 Garrafas Pet Recicladas",
				"Conquista 300"
				);
		conquistaDAO.inserirConquista(conquista05);
		// =============================================================================================================	
		
		Coletor coletor05 = new Coletor(
				"Isabelle",
				"Cardoso",
				"isabele.cardoso@gmail.com",
				"123456",
				endereco05,
				"Isa",
				28,
				"100.456.987-01",
				formatoData.parse("09/10/1995")
		);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(coletor05);
		coletor05.inserirConquista(conquista05);
		usuarioDAO.atualizarUsuario(coletor05);
		
		// =============================================================================================================	
		
		Endereco endereco06 = new Endereco(
				"Blumenau",
				"Victor Konder",
				"89896-334",
				"Rua",
				"São Paulo",
				2508,
				"SENAI",
				"0",
				"0",
				"(47) 97689-5535"
				);
		enderecoDAO.inserirEndereco(endereco06);

		// =============================================================================================================
		
		Armazem armazem01 = new Armazem(
				"Giassi",
				"giassi@gmail.com",
				"123456",
				"",
				endereco02,
				"29320241000108",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0),
				1000,
				StatusArmazem.LIVRE);
		usuarioDAO.inserirUsuario(armazem01);

		// =============================================================================================================
 
		Endereco endereco07 = new Endereco(
				"Blumenau",
				"Itoupava Central",
				"86746-102",
				"Rua",
				"Jose Spengler",
				1097,
				"casa",
				"0",
				"0",
				"(47) 97645-0135"
				);
		enderecoDAO.inserirEndereco(endereco07);

		// =============================================================================================================
		
		Armazem armazem02 = new Armazem(
				"Angeloni",
				"angeloni@gmail.com",
				"123457",
				"",
				endereco03,
				"29320233300108",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0),
				1111,
				StatusArmazem.LOTADO);
		usuarioDAO.inserirUsuario(armazem02);

		// =============================================================================================================
 
		Endereco endereco08 = new Endereco(
				"Blumenau",
				"Garcia",
				"49740-390",
				"Rua",
				"Amazonas",
				2094,
				"Cooper",
				"0",
				"0",
				"(47) 97789-3035"
				);
		enderecoDAO.inserirEndereco(endereco08);

		// =============================================================================================================
 
		Armazem armazem03 = new Armazem(
				"Cooper",
				"cooper@gmail.com",
				"123458",
				"",
				endereco04,
				"29320241000108",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0),
				2000,
				StatusArmazem.LOTADO);
		usuarioDAO.inserirUsuario(armazem03);

		// =============================================================================================================
		
		Endereco endereco09 = new Endereco(
				"Blumenau",
				"Garcia",
				"41040-399",
				"Rua",
				"Amazonas",
				900,
				"Quanta Coisa",
				"0",
				"0",
				"(47) 97259-3900"
				);
		enderecoDAO.inserirEndereco(endereco09);
 
		// =============================================================================================================
		
		Armazem armazem04 = new Armazem(
				"Quanta Coisa",
				"quanta.coisa@gmail.com",
				"123458",
				"",
				endereco09,
				"43.015.860/0001-01",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0),
				2500,
				StatusArmazem.LIVRE);
		usuarioDAO.inserirUsuario(armazem04);
 
		// =============================================================================================================
		
		Endereco endereco10 = new Endereco(
				"Blumenau",
				"Centro",
				"92840-373",
				"Rua",
				"7 de Setembro",
				763,
				"Shopping Neumarkt",
				"0",
				"0",
				"(47) 93589-4430"
				);
		enderecoDAO.inserirEndereco(endereco10);
 
		Armazem armazem05 = new Armazem(
				"Shopping Neumarkt",
				"neumarkt@gmail.com",
				"123458",
				"",
				endereco10,
				"26.725.912/0001-14",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0),
				12000,
				StatusArmazem.LIVRE);
		usuarioDAO.inserirUsuario(armazem05);
 
		// =============================================================================================================
	
		Endereco endereco11 = new Endereco(
				"Blumenau",
				"Agua Verde",
				"29746-399",
				"Rua",
				"Senador Rocha",
				396,
				"Fábrica",
				"0",
				"0",
				"(47) 93389-0035"
				);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco11);

		// =============================================================================================================
 
		Cooperativa cooperativa01 = new Cooperativa(
				"Coaca-Cola",
				"coca.cola@gmail.com",
				"123456",
				"",
				endereco07,
				"12.345.678/9012-34",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0)
				);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa01);

		// =============================================================================================================
		
		Endereco endereco012 = new Endereco(
				"Blumenau",
				"Vila Nova",
				"09746-390",
				"Rua",
				"Garibaldi",
				5867,
				"Mercado",
				"0",
				"0",
				"(47) 92048-0035"
				);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco012);

		// =============================================================================================================
 
		Cooperativa cooperativa02 = new Cooperativa(
				"Supermercado Carol",
				"supermercado.carol@gmail.com",
				"123456",
				"",
				endereco08,
				"12.309.678/9043-34",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0)
				);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa02);

		// =============================================================================================================
		
		Endereco endereco13 = new Endereco(
				"Blumenau",
				"Progresso",
				"89746-211",
				"Rua",
				"Rui Barbosa",
				1578,
				"Fábrica",
				"0",
				"0",
				"(47) 90089-5035"
				);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco13);

		// =============================================================================================================
 
		 Cooperativa cooperativa03 = new Cooperativa(
				"Coteminas",
				"coteminas@gmail.com",
				"123456",
				"",
				endereco09,
				"12.990.678/9012-34",
				 LocalTime.of(8, 0),
				 LocalTime.of(21, 0)
				);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa03);

		// =============================================================================================================
		
		Endereco endereco14 = new Endereco(
				"Blumenau",
				"Nova Russia",
				"89746-601",
				"Rua",
				"Santa Maria",
				14000,
				"Galpão",
				"0",
				"0",
				"(47) 98389-9837"
				);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco14);
 
		 Cooperativa cooperativa04 = new Cooperativa(
				"Recicla Tudo",
				"recicla.tudo@gmail.com",
				"123456",
				"",
				endereco14,
				"41.533.850/0001-32",
				 LocalTime.of(8, 0),
				 LocalTime.of(21, 0)
				);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa04);
 
		// =============================================================================================================
		
		Endereco endereco15 = new Endereco(
				"Blumenau",
				"Agua Branca",
				"02746-731",
				"Rua",
				"Igarapé",
				274,
				"Saturno Ambiental",
				"0",
				"0",
				"(47) 98809-2238"
				);
		enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco15);
 
		 Cooperativa cooperativa05 = new Cooperativa(
				"Saturno Ambiental",
				"saturno.ambiental@gmail.com",
				"123456",
				"",
				endereco15,
				"44.511.898/0001-38",
				 LocalTime.of(8, 0),
				 LocalTime.of(21, 0)
				);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa05);
		
		// =============================================================================================================

		Material aluminio = new Material (
				"Alumínio"
				);
		MaterialDAO materialDAO = new MaterialDAOImpl();
		materialDAO.inserirMaterial(aluminio);
		
		Material plastico = new Material (
				"Plástico"
				);
		materialDAO.inserirMaterial(plastico);
		
		// =============================================================================================================

		Reciclavel reciclavel01 = new Reciclavel(
				"Garrafa PET",
				plastico,
				0.05,
				0.2,
				0.5,
				"Limpe antes de reciclar"
		);
		ReciclavelDAO reciclavelDAO = new ReciclavelDAOImpl();
		reciclavelDAO.inserirReciclavel(reciclavel01);

		// =============================================================================================================
		
		Reciclavel reciclavel02 = new Reciclavel(
				"Garrafa PET",
				aluminio,
				0.1,
				0.5,
				0.8,
				"Limpe antes de reciclar"
		);
		ReciclavelDAO reciclavelDAO02 = new ReciclavelDAOImpl();
		reciclavelDAO02.inserirReciclavel(reciclavel02);
		
		// =============================================================================================================
		
		Reciclavel reciclavel03 = new Reciclavel(
				"Garrafa PET",
				aluminio,
				0.1,
				0.5,
				0.8,
				"Limpe antes de reciclar"
		);
		ReciclavelDAO reciclavelDAO03 = new ReciclavelDAOImpl();
		reciclavelDAO03.inserirReciclavel(reciclavel03);
		
		// =============================================================================================================

		Reciclavel reciclavel04 = new Reciclavel(
				"Garrafa PET",
				plastico,
				0.4,
				0.6,
				0.9,
				"Limpe antes de reciclar"
		);
		ReciclavelDAO reciclavelDAO04 = new ReciclavelDAOImpl();
		reciclavelDAO04.inserirReciclavel(reciclavel04);
		
		// =============================================================================================================
		
		Reciclavel reciclavel05 = new Reciclavel(
				"Garrafa PET",
				aluminio,
				0.3,
				0.7,
				0.10,
				"Limpe antes de reciclar"
		);
		ReciclavelDAO reciclavelDAO05 = new ReciclavelDAOImpl();
		reciclavelDAO05.inserirReciclavel(reciclavel05);
		
		// =============================================================================================================

		Deposito deposito01 = new Deposito(
			armazem01,
			coletor01,
			StatusDeposito.CONCLUIDO,
			LocalDate.of(1333, 12, 2)
		);
		
		DepositoDAO depositoDAO = new DepositoDAOImpl();
		depositoDAO.inserirDeposito(deposito01);
		armazem01.inserirDeposito(deposito01);
		
		
		
		ItemDeposito itemDeposito01 = new ItemDeposito(
				reciclavel01,
				7,
				deposito01
				);
		ItemDepositoDAO itemDepositoDAO = new ItemDepositoDAOImpl();
		itemDepositoDAO.inserirItemDeposito(itemDeposito01);
		deposito01.inserirItemDeposito(itemDeposito01);
		depositoDAO.atualizarDeposito(deposito01);
		usuarioDAO.atualizarUsuario(armazem01);

		// =============================================================================================================
		
		Deposito deposito02 = new Deposito(
				armazem02,
				coletor02,
				StatusDeposito.PENDENTE,
				LocalDate.of(1333, 12, 2)
			);
			
			DepositoDAO depositoDAO02 = new DepositoDAOImpl();
			depositoDAO02.inserirDeposito(deposito02);
			armazem02.inserirDeposito(deposito02);
			
			
			
			ItemDeposito itemDeposito02 = new ItemDeposito(
					reciclavel01,
					4,
					deposito02
					);
			ItemDepositoDAO itemDepositoDAO02 = new ItemDepositoDAOImpl();
			itemDepositoDAO02.inserirItemDeposito(itemDeposito02);
			deposito02.inserirItemDeposito(itemDeposito02);
			depositoDAO02.atualizarDeposito(deposito02);
			usuarioDAO.atualizarUsuario(armazem02);
		
		// =============================================================================================================

		Deposito deposito03 = new Deposito(
				armazem03,
				coletor03,
				StatusDeposito.CONCLUIDO,
				LocalDate.of(1333, 12, 2)
			);
				
			DepositoDAO depositoDAO03 = new DepositoDAOImpl();
			depositoDAO03.inserirDeposito(deposito03);
			armazem03.inserirDeposito(deposito03);
				
				
				
			ItemDeposito itemDeposito03 = new ItemDeposito(
					reciclavel01,
					10,
					deposito03
					);
			ItemDepositoDAO itemDepositoDAO03 = new ItemDepositoDAOImpl();
			itemDepositoDAO03.inserirItemDeposito(itemDeposito03);
			deposito03.inserirItemDeposito(itemDeposito03);
			depositoDAO03.atualizarDeposito(deposito03);
			usuarioDAO.atualizarUsuario(armazem03);			
	
			
		// =============================================================================================================
				
		Deposito deposito04 = new Deposito(
				armazem04,
				coletor04,
				StatusDeposito.CONCLUIDO,
				LocalDate.of(1333, 12, 2)
			);
				
			DepositoDAO depositoDAO04 = new DepositoDAOImpl();
			depositoDAO04.inserirDeposito(deposito04);
			armazem04.inserirDeposito(deposito04);
				
				
				
			ItemDeposito itemDeposito04 = new ItemDeposito(
					reciclavel01,
					3,
					deposito04
					);
			ItemDepositoDAO itemDepositoDAO04 = new ItemDepositoDAOImpl();
			itemDepositoDAO04.inserirItemDeposito(itemDeposito04);
			deposito04.inserirItemDeposito(itemDeposito04);
			depositoDAO04.atualizarDeposito(deposito04);
			usuarioDAO.atualizarUsuario(armazem04);			
			
		// =============================================================================================================
			
		Deposito deposito05 = new Deposito(
				armazem05,
				coletor05,
				StatusDeposito.CONCLUIDO,
				LocalDate.of(1333, 12, 2)
			);
				
			DepositoDAO depositoDAO05 = new DepositoDAOImpl();
			depositoDAO05.inserirDeposito(deposito05);
			armazem05.inserirDeposito(deposito05);
				
				
				
			ItemDeposito itemDeposito05 = new ItemDeposito(
					reciclavel01,
					2,
					deposito05
					);
			ItemDepositoDAO itemDepositoDAO05 = new ItemDepositoDAOImpl();
			itemDepositoDAO05.inserirItemDeposito(itemDeposito05);
			deposito05.inserirItemDeposito(itemDeposito05);
			depositoDAO05.atualizarDeposito(deposito05);
			usuarioDAO.atualizarUsuario(armazem05);			
			
			// =============================================================================================================
			
		Retirada retirada01 = new Retirada(
				LocalDate.of(1333, 5, 2),
				cooperativa01,
				armazem01,
				StatusRetirada.CONCLUIDO
			);
			
			RetiradaDAO retiradaDAO = new RetiradaDAOImpl();
			retiradaDAO.inserirRetirada(retirada01);
			
			ItemRetirada itemRetirada01 = new ItemRetirada(
					aluminio,
					500,
					retirada01
					);
			ItemRetiradaDAO itemRetiradaDAO = new ItemRetiradaDAOImpl();
			itemRetiradaDAO.inserirItemRetirada(itemRetirada01);
			retirada01.inserirItemRetirada(itemRetirada01);
			retiradaDAO.atualizarRetirada(retirada01);	

			
		// =============================================================================================================

		Retirada retirada02 = new Retirada(
				LocalDate.of(1333, 5, 2),		
				cooperativa02,
				armazem02,
				StatusRetirada.CONCLUIDO
			);
				
			RetiradaDAO retiradaDAO02 = new RetiradaDAOImpl();
			retiradaDAO02.inserirRetirada(retirada02);
				
			ItemRetirada itemRetirada02 = new ItemRetirada(
					aluminio,
					500,
					retirada01
					);
			ItemRetiradaDAO itemRetiradaDAO02 = new ItemRetiradaDAOImpl();
			itemRetiradaDAO02.inserirItemRetirada(itemRetirada02);
			retirada02.inserirItemRetirada(itemRetirada02);
			retiradaDAO02.atualizarRetirada(retirada02);	

		// =============================================================================================================
		
		Retirada retirada03 = new Retirada(
				LocalDate.of(1333, 5, 2),		
				cooperativa03,
				armazem03,
				StatusRetirada.CONCLUIDO
			);
					
			RetiradaDAO retiradaDAO03 = new RetiradaDAOImpl();
			retiradaDAO03.inserirRetirada(retirada03);
				
			ItemRetirada itemRetirada03 = new ItemRetirada(
					aluminio,
					500,
					retirada03
					);
			ItemRetiradaDAO itemRetiradaDAO03 = new ItemRetiradaDAOImpl();
			itemRetiradaDAO03.inserirItemRetirada(itemRetirada03);
			retirada03.inserirItemRetirada(itemRetirada03);
			retiradaDAO03.atualizarRetirada(retirada03);	
			
			
		// =============================================================================================================

		Retirada retirada04 = new Retirada(
				LocalDate.of(1333, 5, 2),		
				cooperativa04,
				armazem04,
				StatusRetirada.CONCLUIDO
			);
						
			RetiradaDAO retiradaDAO04 = new RetiradaDAOImpl();
			retiradaDAO04.inserirRetirada(retirada04);
					
			ItemRetirada itemRetirada04 = new ItemRetirada(
					aluminio,
					500,
					retirada04
					);
			ItemRetiradaDAO itemRetiradaDAO04 = new ItemRetiradaDAOImpl();
			itemRetiradaDAO04.inserirItemRetirada(itemRetirada04);
			retirada04.inserirItemRetirada(itemRetirada04);
			retiradaDAO04.atualizarRetirada(retirada04);	
		
		// =============================================================================================================
		
		Retirada retirada05 = new Retirada(
				LocalDate.of(1333, 5, 2),		
				cooperativa05,
				armazem05,
				StatusRetirada.CONCLUIDO
			);
							
			RetiradaDAO retiradaDAO05 = new RetiradaDAOImpl();
			retiradaDAO05.inserirRetirada(retirada05);
						
			ItemRetirada itemRetirada05 = new ItemRetirada(
					aluminio,
					500,
					retirada05
					);
			ItemRetiradaDAO itemRetiradaDAO05 = new ItemRetiradaDAOImpl();
			itemRetiradaDAO05.inserirItemRetirada(itemRetirada05);
			retirada05.inserirItemRetirada(itemRetirada05);
			retiradaDAO05.atualizarRetirada(retirada05);	
			
	}
}
