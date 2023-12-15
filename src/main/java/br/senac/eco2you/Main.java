package br.senac.eco2you;

import br.senac.eco2you.modelo.dao.endereco.EnderecoDAO;
import br.senac.eco2you.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;

public class Main {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("89050-000", "Av. Brasil", 610, "SENAC", "(47) 93035-9999", "Ponta Aguda",
				"Blumenau", "Brasil", "0", "0");

		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.inserirEndereco(endereco);

		System.out.println(endereco.getCidade());

	}
}
