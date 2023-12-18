package br.senac.eco2you;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

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

	public static void main(String[] args) {

		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

		//=============================================================================================================
		Endereco endereco01 = new Endereco("89050-000", "Av. Brasil", 610, "SENAC", "(47) 93035-9999", "Ponta Aguda",
				"Blumenau", "Brasil", "0", "0");
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco01);

		Coletor coletor01 = new Coletor("João", null, null, null, endereco01, null, 0, null, formatoData.parse("12/05/2020"));
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.inserirUsuario(coletor01);
		
		//=============================================================================================================
		Endereco endereco02 = new Endereco("88050-000", "Av. USA", 8934, "SENAI", "(47) 1234-9999", "Vorstad",
				"Blumenau", "Brasil", "0", "0");
		enderecoDAO.inserirEndereco(endereco02);

		Armazem armazem01 = new Armazem("Giassi", "giassi@gmail.com", "123456",endereco02 ,
				"12.345.678/9012-34", "Segunda a sexta-feira, das 8h às 18h", 1000, StatusArmazem.LIVRE);
		usuarioDAO.inserirUsuario(armazem01);
		
		//=============================================================================================================
		
		Endereco endereco03 = new Endereco("88050-999", "Av. Beira Rio", 8934, "prédio", "(47) 9876-9999", "Vorstad",
				"Blumenau", "Brasil", "0", "0");
		enderecoDAO.inserirEndereco(endereco03);

		Cooperativa cooperativa01 = new Cooperativa("Coaca-Cola", "coca.cola@gmail.com", "123456", endereco03, "12.345.678/9012-34", "Segunda a sexta-feira, das 8h às 18h", 100);
		usuarioDAO.inserirUsuario(cooperativa01);
		

	}
}
