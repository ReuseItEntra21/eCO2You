package br.senac.eco2you;
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAO;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.eco2you.modelo.entidade.conquista.Conquista;
import br.senac.eco2you.modelo.entidade.deposito.Deposito;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.item.deposito.ItemDeposito;
import br.senac.eco2you.modelo.entidade.item.retirada.ItemRetirada;
import br.senac.eco2you.modelo.entidade.material.Material;
import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
import br.senac.eco2you.modelo.enumeracao.status.armazem.StatusArmazem;
import br.senac.eco2you.modelo.enumeracao.status.deposito.StatusDeposito;
 
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
 
		// =============================================================================================================
 
		// =============================================================================================================

		Endereco endereco04 = new Endereco(
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
		enderecoDAO.inserirEndereco(endereco04);
 
		// =============================================================================================================
 

		// =============================================================================================================

		Armazem armazem01 = new Armazem(
				"Giassi",
				"giassi@gmail.com",
				"123456",
				endereco02,
				"29320241000108",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0),
				1000,
				StatusArmazem.LIVRE);
		usuarioDAO.inserirUsuario(armazem01);

		// =============================================================================================================
 
		// =============================================================================================================
 
		Endereco endereco05 = new Endereco(
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
		enderecoDAO.inserirEndereco(endereco05);

    // =============================================================================================================
		
		Armazem armazem02 = new Armazem(
				"Angeloni",
				"angeloni@gmail.com",
				"123457",
				endereco03,
				"29320233300108",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0),
				1111,
				StatusArmazem.LOTADO);
		usuarioDAO.inserirUsuario(armazem02);

		// =============================================================================================================
 
		// =============================================================================================================
 
		Endereco endereco06 = new Endereco(
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
		enderecoDAO.inserirEndereco(endereco06);

		// =============================================================================================================
 
		// =============================================================================================================
 
		Armazem armazem03 = new Armazem(
				"Cooper",
				"cooper@gmail.com",
				"123458",
				endereco04,
				"29320241000108",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0),
				2000,
				StatusArmazem.LOTADO);
		usuarioDAO.inserirUsuario(armazem03);
 
		// =============================================================================================================
		
		Endereco endereco07 = new Endereco(
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
		enderecoDAO.inserirEndereco(endereco07);

		// =============================================================================================================
 
		// =============================================================================================================
 
		Cooperativa cooperativa01 = new Cooperativa(
				"Coaca-Cola",
				"coca.cola@gmail.com",
				"123456",
				endereco07,
				"12.345.678/9012-34",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0)
				);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa01);

    // =============================================================================================================
		
		Endereco endereco08 = new Endereco(
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
		enderecoDAO.inserirEndereco(endereco08);

		// =============================================================================================================
 
		// =============================================================================================================
 
		Cooperativa cooperativa02 = new Cooperativa(
				"Supermercado Carol",
				"supermercado.carol@gmail.com",
				"123456",
				endereco08,
				"12.309.678/9043-34",
				LocalTime.of(8, 0),
				LocalTime.of(21, 0)
				);
		usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(cooperativa02);
 
		// =============================================================================================================
		
		Endereco endereco09 = new Endereco(
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
		enderecoDAO.inserirEndereco(endereco09);

		// =============================================================================================================
 
		// =============================================================================================================
 
		 Cooperativa cooperativa03 = new Cooperativa(
				"Coteminas",
				"coteminas@gmail.com",
				"123456",
				endereco09,
				"12.990.678/9012-34",
				 LocalTime.of(8, 0),
				 LocalTime.of(21, 0)
				);
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
 
		// =============================================================================================================
 
		Conquista conquista02 = new Conquista(
				200,
				"Segundo Depósito",
				"Conquista 200"
				);
		ConquistaDAO conquistaDAO2 = new ConquistaDAOImpl();
		conquistaDAO2.inserirConquista(conquista02);

		// =============================================================================================================

		Conquista conquista03 = new Conquista(
				300,
				"Terceiro Depósito",
				"Conquista 300"
				);
		ConquistaDAO conquistaDAO3 = new ConquistaDAOImpl();
		conquistaDAO3.inserirConquista(conquista03);
 
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

		Deposito deposito01 = new Deposito(
			armazem01,
			coletor01,
			StatusDeposito.CONCLUIDO
		);
		
		DepositoDAO depositoDAO = new DepositoDAOImpl();
		depositoDAO.inserirDeposito(deposito01);
		
		ItemDeposito itemDeposito01 = new ItemDeposito(
				reciclavel01,
				10,
				deposito01
				);
		ItemDepositoDAO itemDepositoDAO = new ItemDepositoDAOImpl();
		itemDepositoDAO.inserirItemDeposito(itemDeposito01);
		deposito01.inserirItemDeposito(itemDeposito01);

		// =============================================================================================================
		
		Retirada retirada01 = new Retirada(
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

	}
}