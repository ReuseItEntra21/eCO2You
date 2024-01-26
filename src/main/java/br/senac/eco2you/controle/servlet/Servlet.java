package br.senac.eco2you.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senac.eco2you.modelo.dao.material.MaterialDAO;
import br.senac.eco2you.modelo.dao.material.MaterialDAOImpl;
import br.senac.eco2you.modelo.dao.reciclavel.ReciclavelDAO;
import br.senac.eco2you.modelo.dao.reciclavel.ReciclavelDAOImpl;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAO;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.material.Material;
import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;

@WebServlet("/")
public class Servlet extends HttpServlet{

	private static final long serialVersionUID = 8840029940617992062L;
	
	private UsuarioDAO usuarioDAO;
	private MaterialDAO materialDAO;
	private ReciclavelDAO reciclavelDAO;
//	private ItemDepositoDAO itemDepositoDAO;
//	private DepositoDAO DepositoDAO;

	public void init () {
		usuarioDAO = new UsuarioDAOImpl();
		materialDAO = new MaterialDAOImpl();
		reciclavelDAO = new ReciclavelDAOImpl();
//		itemDepositoDAO = new ItemDepositoDAOImpl();
//		DepositoDAO = new DepositoDAOImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			
			switch (action) {
			
			case "/":
				mostrarApresentacao(request, response);
				break;
			
			case "/login":
				mostrarLogin(request, response);
				break;

			case "/cadastro-coletor":
				mostrarCadastroColetor(request, response);
				break;
				
			case "/home-coletor":
				mostrarHomeColetor(request, response);
				break;

			case "/historicoDepositos-coletor":
				mostrarHistoricoDepositosColetor(request, response);
				break;

			case "/ranking-coletor":
				mostrarRankingColetor(request, response);
				break;

			case "/depositosPendentes-coletor":
				mostrarDepositosPendentesColetor(request, response);
				break;

			case "/perfil-coletor":
				mostrarPerfilColetor(request, response);
				break;

			case "/editarPerfil-coletor":
				mostrarEditarPerfilColetor(request, response);
				break;
			
			case "/inserir-coletor":
				inserirColetor(request, response);
				break;
				
			case "/atualizar-coletor":
				atualizarColetor(request, response);
				break;
				
			case "/deletar-coletor":
				deletarColetor(request, response);
				break;
				
			case "/cadastro-armazem":
				mostrarCadastroArmazem(request, response);
				break;
				
			case "/inserir-armazem":
				inserirArmazem(request, response);
				break;
				
			case "/atualizar-armazem":
				atualizarArmazem(request, response);
				break;
				
			case "/deletar-armazem":
				deletarArmazem(request, response);
				break;
				
			case "/cadastro-cooperativa":
				mostrarCadastroCooperativa(request, response);
				break;
				
			case "/inserir-cooperativa":
				inserirCooperativa(request, response);
				break;
				
			case "/atualizar-cooperativa":
				atualizarCooperativa(request, response);
				break;
				
			case "/deletar-cooperativa":
				deletarCooperativa(request, response);
				break;
				
			case "/cadastro-material":
				mostrarCadastroMaterial(request, response);
				break;
				
			case "/inserir-material":
				inserirMaterial(request, response);
				break;
				
			case "/atualizar-material":
				atualizarMaterial(request, response);
				break;
				
			case "/deletar-material":
				deletarMaterial(request, response);
				break;
				
			case "/cadastro-reciclavel":
				mostrarCadastroReciclavel(request, response);
				break;
				
			case "/inserir-reciclavel":
				inserirReciclavel(request, response);
				break;
				
//			case "/atualizar-reciclavel":
//				atualizarReciclavel(request, response);
//				break;
//				
//			case "/deletar-reciclavel":
//				deletarReciclavel(request, response);
//				break;
				
//			case "/inserir-itemDeposito":
//				inserirItemDeposito(request, response);
//				break;
//				
//			case "/atualizar-itemDeposito":
//				atualizarItemDeposito(request, response);
//				break;
//				
//			case "/deletar-itemDeposito":
//				deletarItemDeposito(request, response);
//				break;
//				
//			case "/inserir-Deposito":
//				inserirDeposito(request, response);
//				break;
//				
//			case "/atualizar-Deposito":
//				atualizarDeposito(request, response);
//				break;
//				
//			case "/deletar-Deposito":
//				deletarDeposito(request, response);
//				break;
				
			default:
				mostrarApresentacao(request, response);
				break;
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
		
	}
	
	private void mostrarLogin(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/login.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarApresentacao(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/apresentacao.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/cadastro.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarHomeColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/home.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHistoricoDepositosColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/historico-depositos.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarRankingColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coleotr/ranking.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarDepositosPendentesColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/depositos-pendentes.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarPerfilColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/perfil.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarEditarPerfilColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/editar-perfil.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/cadastro.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarCadastroCooperativa(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cooperativa/cadastro.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarCadastroMaterial(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cadastro-material.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarCadastroReciclavel(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		List<Material> materiais = materialDAO.recuperarTodosMateriais();
		request.setAttribute("materiais", materiais);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cadastro-reciclavel.jsp");
		dispatcher.forward(request, response);
	}

	private void inserirColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		LocalDate dataNascimento = LocalDate.parse(request.getParameter("dataNascimento"));
		String cep = request.getParameter("cep");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String tipoVia = request.getParameter("tipoVia");
		String logradouro = request.getParameter("logradouro");
		String numeroEndereco = request.getParameter("numeroEndereco");
		String complemento = request.getParameter("complemento");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento, telefone);
		usuarioDAO.inserirUsuario(new Coletor(nome, sobrenome, cpf, dataNascimento, email, senha, endereco));
		response.sendRedirect("/eCO2You/home-coletor");
	}
	
	private void atualizarColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		LocalDate dataNascimento = LocalDate.parse(request.getParameter("dataNascimento"));
		String cep = request.getParameter("cep");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String tipoVia = request.getParameter("tipoVia");
		String logradouro = request.getParameter("logradouro");
		String numeroEndereco = request.getParameter("numeroEndereco");
		String complemento = request.getParameter("complemento");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento, telefone);
		usuarioDAO.atualizarUsuario(new Coletor(nome, sobrenome, cpf, dataNascimento , email, senha, endereco));
		response.sendRedirect("/eCO2You/home-coletor");
	}
	
	private void deletarColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = usuarioDAO.recuperarUsuarioPorId(id);
		usuarioDAO.deletarUsuario(usuario);
		response.sendRedirect("/");
		
	}

	private void inserirArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		float capacidadeArmazenagem = Float.parseFloat(request.getParameter("capacidadeArmazenagem"));
		LocalTime horarioAbertura = LocalTime.parse(request.getParameter("horarioAbertura"));
		LocalTime horarioFechamento = LocalTime.parse(request.getParameter("horarioFechamento"));
		String cep = request.getParameter("cep");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String tipoVia = request.getParameter("tipoVia");
		String logradouro = request.getParameter("logradouro");
		String numeroEndereco = request.getParameter("numeroEndereco");
		String complemento = request.getParameter("complemento");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento, telefone);
		usuarioDAO.inserirUsuario(new Armazem(nome, cnpj, email, senha, capacidadeArmazenagem, horarioAbertura, horarioFechamento, endereco));
		response.sendRedirect("/eCO2You/home-armazem");
	}
	
	private void atualizarArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		usuarioDAO.atualizarUsuario(new Armazem(nome, cnpj, email, senha));
		response.sendRedirect("/eCO2You/home-armazem");
	}
	
	private void deletarArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = usuarioDAO.recuperarUsuarioPorId(id);
		usuarioDAO.deletarUsuario(usuario);
		response.sendRedirect("/home");
		
	}
	
	private void inserirCooperativa(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String cnpj = request.getParameter("cnpj");
		String senha = request.getParameter("senha");
		LocalTime horarioAbertura = LocalTime.parse(request.getParameter("horarioAbertura"));
		LocalTime horarioFechamento = LocalTime.parse(request.getParameter("horarioFechamento"));
		String cep = request.getParameter("cep");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String tipoVia = request.getParameter("tipoVia");
		String logradouro = request.getParameter("logradouro");
		String numeroEndereco = request.getParameter("numeroEndereco");
		String complemento = request.getParameter("complemento");
		String telefone = request.getParameter("telefone");
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento, telefone);
		usuarioDAO.inserirUsuario(new Cooperativa(nome, cnpj, email, senha, horarioAbertura, horarioFechamento, endereco));
		response.sendRedirect("/eCO2You/home-cooperativa");
	}
	
	private void atualizarCooperativa(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{


		long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		usuarioDAO.atualizarUsuario(new Cooperativa(nome, cnpj, email, senha));
		response.sendRedirect("/home-cooperativa");
	}
	
	private void deletarCooperativa(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = usuarioDAO.recuperarUsuarioPorId(id);
		usuarioDAO.deletarUsuario(usuario);
		response.sendRedirect("/home");
		
	}
	
	private void inserirMaterial(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		materialDAO.inserirMaterial(new Material(nome));
		response.sendRedirect("/eCO2You/home");
	}
	
	private void atualizarMaterial(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{


		long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		materialDAO.atualizarMaterial(new Material(id, nome));
		response.sendRedirect("/home");
	}
	
	private void deletarMaterial(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Material material = materialDAO.recuperarMaterialPorId(id);
		materialDAO.deletarMaterial(material);
		response.sendRedirect("/home");
		
	}
	
	private void inserirReciclavel(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		Material material = materialDAO.recuperarMaterialPorId(Long.parseLong(request.getParameter("material")));
		int pontosCarbono = Integer.parseInt(request.getParameter("pontos-carbono"));
		float peso = Float.parseFloat(request.getParameter("peso"));
		float volume = Float.parseFloat(request.getParameter("volume"));
		String instrucaoReciclavel = request.getParameter("instrucao-reciclavel");
		reciclavelDAO.inserirReciclavel(new Reciclavel(nome, material, pontosCarbono, peso, volume, instrucaoReciclavel));
		response.sendRedirect("/eCO2You/home");
	}
	
//	private void atualizarReciclavel(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
//
//		long id = Long.parseLong(request.getParameter("id"));
//		String nome = request.getParameter("nome");
//		//Material material = request.getParameter("material");
//		float pontosCarbono = Float.parseFloat(request.getParameter("pontosCarbono"));
//		float peso = Float.parseFloat(request.getParameter("peso"));
//		float volume = Float.parseFloat(request.getParameter("volume"));
//		String instrucaoReciclavel = request.getParameter("instrucaoReciclavel");
//		//reciclavelDAO.inserirReciclavel(new Reciclavel(id, nome, material, pontosCarbono, peso, volume, instrucaoReciclavel));
//		response.sendRedirect("/eCO2You/home");
//	}
//	
//	private void deletarReciclavel(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		
//		long id = Long.parseLong(request.getParameter("id"));
//		Material material = materialDAO.recuperarMaterialPorId(id);
//		materialDAO.deletarMaterial(material);
//		response.sendRedirect("/home");
//	}
//	
//	private void inserirItemDeposito(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
//
//		Reciclavel nome = request.getParameter("reciclavel");
//		int quantidadeReciclaveis = Integer.parseInt("quantidadeReciclaveis");
//		Deposito deposito = request.getParameter("deposito");
//		itemDepositoDAO.inserirItemDeposito(new ItemDeposito(nome, quantidadeReciclaveis, deposito));
//		response.sendRedirect("/eCO2You/home");
//	}
//	
//	private void atualizarItemDeposito(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
//
//		long id = Long.parseLong(request.getParameter("id"));
//		Reciclavel nome = request.getParameter("reciclavel");
//		int quantidadeReciclaveis = Integer.parseInt("quantidadeReciclaveis");
//		Deposito deposito = request.getParameter("deposito");
//		itemDepositoDAO.inserirItemDeposito(new ItemDeposito(id, nome, quantidadeReciclaveis, deposito));
//		response.sendRedirect("/eCO2You/home");
//	}
//	
//	private void deletarItemDeposito(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		
//		long id = Long.parseLong(request.getParameter("id"));
//		Material material = materialDAO.recuperarMaterialPorId(id);
//		materialDAO.deletarMaterial(material);
//		response.sendRedirect("/home");
//		
//	}
//	
//	private void inserirDeposito(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
//
//		LocalDate data = LocalDate.parse(request.getParameter("data"));
//		Armazem armazem = request.getParameter("armazem");
//		Coletor coletor = request.getParameter("coletor");
//		DepositoDAO.inserirDeposito(new Deposito(data, armazem, coletor));
//		response.sendRedirect("/eCO2You/home");
//	}
//	
//	private void atualizarDeposito(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
//
//		long id = Long.parseLong(request.getParameter("id"));
//		LocalDate data = LocalDate.parse(request.getParameter("data"));
//		//Armazem armazem = request.getParameter("armazem");
//		//Coletor coletor = request.getParameter("coletor");
//		//DepositoDAO.inserirDeposito(new Deposito(data, armazem, coletor));
//		response.sendRedirect("/eCO2You/home");;
//	}
//	
//	private void deletarDeposito(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		
//		long id = Long.parseLong(request.getParameter("id"));
//		Material material = materialDAO.recuperarMaterialPorId(id);
//		materialDAO.deletarMaterial(material);
//		response.sendRedirect("/home");
//		
//	}
}
