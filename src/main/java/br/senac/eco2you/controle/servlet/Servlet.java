package br.senac.eco2you.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senac.eco2you.modelo.dao.usuario.UsuarioDAO;
import br.senac.eco2you.modelo.dao.usuario.UsuarioDAOImpl;
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
			
			case "/home":
				mostrarHome(request, response);
				break;
			
			case "/login":
				mostrarTelaLogin(request, response);
				break;
				
			case "/cadastrar-coletor":
				mostrarTelaCadastrarColetor(request, response);
				break;
				
			case "/inserir-coletor":
				inserirColetor(request, response);
				break;
				
			case "/principal-coletor":
				mostrarTelaPrincipalColetor(request, response);
				break;
				
			default:
				mostrarHome(request, response);
				
				break;
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
		
	}
	
	private void mostrarHome(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/home.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarTelaPrincipalColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/principal-coletor.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarTelaLogin(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/login.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarTelaCadastrarColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cadastrar-coletor.jsp");
		dispatcher.forward(request, response);
	}

	private void inserirColetor(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		LocalDate data = LocalDate.parse(request.getParameter("data"));
		String senha = request.getParameter("senha");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		dao.inserirUsuario(new Coletor(nome, sobrenome, data, senha, cpf, email));
		response.sendRedirect("home");
		
	}


























}
