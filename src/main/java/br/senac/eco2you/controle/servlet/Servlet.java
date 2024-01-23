package br.senac.eco2you.controle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senac.eco2you.modelo.dao.coletor.ColetorDAO;
import br.senac.eco2you.modelo.dao.coletor.ColetorDAOImpl;

@WebServlet("/")
public class Servlet extends HttpServlet{

	private static final long serialVersionUID = 8840029940617992062L;
	
	private ColetorDAO dao;
	
	public void init () {
		dao = new ColetorDAOImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	}
	

}
