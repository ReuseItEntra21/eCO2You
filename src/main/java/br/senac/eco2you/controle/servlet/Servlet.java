package br.senac.eco2you.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senac.eco2you.modelo.dao.usuario.UsuarioDAO;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;

@WebServlet("/")
public class Servlet extends HttpServlet{

	private static final long serialVersionUID = 8840029940617992062L;
	
	private UsuarioDAO dao;
	
	SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

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
				
			case "/cadastro-armazem":
				mostrarCadastroArmazem(request, response);
				break;
			
			case "/inserir-coletor":
				inserirColetor(request, response);
				break;
				
			case "/atualizar-coletor":
				atualizarColetor(request, response);
				break;
				
			case "/inserir-armazem":
				inserirArmazem(request, response);
				break;
				
			case "/atualizar-armazem":
				atualizarArmazem(request, response);
				break;
				
			default:
				mostrarApresentacao(request, response);
				break;
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
		
	}
	
	private void mostrarApresentacao(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/apresentacao.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cadastro-coletor.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarCadastroEnderecoColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cadastroEndereco-coletor.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarLogin(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/login.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarHomeColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/home-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHistoricoDepositosColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/historicoDepositos-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarRankingColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/ranking-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarDepositosPendentesColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/depositosPendentes-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarPerfilColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/perfil-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarEditarPerfilColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/editarPerfil-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cadastro-armazem.jsp");
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
		response.sendRedirect("/home-coletor");
	}
	
	private void atualizarColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		LocalDate dataNascimento = LocalDate.parse(request.getParameter("dataNascimento"));
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		dao.atualizarUsuario(new Coletor(nome, sobrenome, cpf, dataNascimento, email, senha));
		response.sendRedirect("/home-coletor");
	}

	private void inserirArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String cnpj = request.getParameter("cnpj");
		String senha = request.getParameter("senha");
		dao.inserirUsuario(new Armazem(nome, email, cnpj, senha));
		response.sendRedirect("/home");
	}
	
	private void atualizarArmazem(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String cnpj = request.getParameter("cnpj");
		String senha = request.getParameter("senha");
		dao.atualizarUsuario(new Armazem(nome, email, cnpj, senha));
		response.sendRedirect("/home");
	}
}
