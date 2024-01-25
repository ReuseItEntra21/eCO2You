package br.senac.eco2you.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senac.eco2you.modelo.dao.usuario.UsuarioDAO;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.eco2you.modelo.entidade.endereco.Endereco;
import br.senac.eco2you.modelo.entidade.usuario.Usuario;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;

@WebServlet("/")
public class Servlet extends HttpServlet{

	private static final long serialVersionUID = 8840029940617992062L;
	
	private UsuarioDAO dao;

	public void init () {
		dao = new UsuarioDAOImpl();
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
				
			case "/cadastroEndereco-coletor":
				mostrarCadastroEnderecoColetor(request, response);
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
				
			case "/atualizar-endereco-coletor":
				atualizarEnderecoColetor(request, response);
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/cadastro-coletor.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarCadastroEnderecoColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/cadastroEndereco-coletor.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarHomeColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/home-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHistoricoDepositosColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/historicoDepositos-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarRankingColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coleotr/ranking-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarDepositosPendentesColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/depositosPendentes-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarPerfilColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/perfil-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarEditarPerfilColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/editarPerfil-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/cadastro-armazem.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarCadastroCooperativa(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cooperativa/cadastro-cooperativa.jsp");
		dispatcher.forward(request, response);
	}

	private void inserirColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		LocalDate dataNascimento = LocalDate.parse(request.getParameter("dataNascimento"));
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		dao.inserirUsuario(new Coletor(nome, sobrenome, cpf, dataNascimento, email, senha));
		Usuario usuario = dao.recuperarUsuarioPorEmail(email);
		request.setAttribute("usuarioId", usuario.getId());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastroEndereco-coletor");
		dispatcher.forward(request, response);
	}
	
	private void atualizarColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		LocalDate dataNascimento = LocalDate.parse(request.getParameter("dataNascimento"));
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		dao.atualizarUsuario(new Coletor(id, nome, sobrenome, cpf, dataNascimento , email, senha));
		response.sendRedirect("/home-coletor");
	}
	
	private void atualizarEnderecoColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		
		Long id = Long.valueOf(request.getParameter("id"));
		Usuario usuario = dao.recuperarUsuarioPorId(id);
		String cep = request.getParameter("cep");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String tipoVia = request.getParameter("tipoVia");
		String logradouro = request.getParameter("logradouro");
		String numeroResidencia = request.getParameter("numeroResidencia");
		String complemento = request.getParameter("complemento");
		String aptoEndereco = request.getParameter("aptoEndereco");
		String blocoEndereco = request.getParameter("blocoEndereco");
		String telefone = request.getParameter("telefone");
		usuario.setEndereco(new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroResidencia, complemento, aptoEndereco, blocoEndereco, telefone));
		dao.atualizarUsuario(usuario);
		response.sendRedirect("/home-coletor");
	}
	
	private void deletarColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = dao.recuperarUsuarioPorId(id);
		dao.deletarUsuario(usuario);
		response.sendRedirect("/home");
		
	}

	private void inserirArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		float capacidadeArmazenagem = Float.valueOf(request.getParameter("capacidadeArmazenagem"));
		LocalTime horarioAbertura = LocalTime.parse(request.getParameter("horarioAbertura"));
		LocalTime horarioFechamento = LocalTime.parse(request.getParameter("horarioFechamento"));
		dao.inserirUsuario(new Armazem(nome, cnpj, email, senha, capacidadeArmazenagem, horarioAbertura, horarioFechamento));
		response.sendRedirect("/eCO2You/home-armazem");
	}
	
	private void atualizarArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		dao.atualizarUsuario(new Armazem(id, nome, cnpj, email, senha));
		response.sendRedirect("/eCO2You/home-armazem");
	}
	
	private void deletarArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = dao.recuperarUsuarioPorId(id);
		dao.deletarUsuario(usuario);
		response.sendRedirect("/home");
		
	}
	
	private void inserirCooperativa(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String cnpj = request.getParameter("cnpj");
		String senha = request.getParameter("senha");
		dao.inserirUsuario(new Cooperativa(nome, cnpj, email, senha));
		response.sendRedirect("/home-cooperativa");
	}
	
	private void atualizarCooperativa(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		dao.atualizarUsuario(new Cooperativa(id, nome, cnpj, email, senha));
		response.sendRedirect("/home-cooperativa");
	}
	
	private void deletarCooperativa(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = dao.recuperarUsuarioPorId(id);
		dao.deletarUsuario(usuario);
		response.sendRedirect("/home");
		
	}
}
