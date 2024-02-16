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
import javax.servlet.http.HttpSession;

import br.senac.eco2you.modelo.dao.armazem.ArmazemDAO;
import br.senac.eco2you.modelo.dao.armazem.ArmazemDAOImpl;
import br.senac.eco2you.modelo.dao.conquista.ConquistaDAO;
import br.senac.eco2you.modelo.dao.conquista.ConquistaDAOImpl;
import br.senac.eco2you.modelo.dao.cooperativa.CooperativaDAOImpl;
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
import br.senac.eco2you.modelo.entidade.usuario.Usuario;
import br.senac.eco2you.modelo.entidade.usuario.empresa.armazem.Armazem;
import br.senac.eco2you.modelo.entidade.usuario.empresa.cooperativa.Cooperativa;
import br.senac.eco2you.modelo.entidade.usuario.pessoa.coletor.Coletor;
import br.senac.eco2you.modelo.enumeracao.status.armazem.StatusArmazem;

@WebServlet("/")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 8840029940617992062L;

	private UsuarioDAO usuarioDAO;
	private EnderecoDAO enderecoDAO;
	private MaterialDAO materialDAO;
	private ReciclavelDAO reciclavelDAO;
	private ItemDepositoDAO itemDepositoDAO;
	private DepositoDAO depositoDAO;
	private ConquistaDAO conquistaDAO;
	private ArmazemDAO armazemDAO;
	private RetiradaDAO retiradaDAO;
	private ItemRetiradaDAO itemRetiradaDAO;

	public void init() {
		usuarioDAO = new UsuarioDAOImpl();
		enderecoDAO = new EnderecoDAOImpl();
		materialDAO = new MaterialDAOImpl();
		reciclavelDAO = new ReciclavelDAOImpl();
		itemDepositoDAO = new ItemDepositoDAOImpl();
		depositoDAO = new DepositoDAOImpl();
		conquistaDAO = new ConquistaDAOImpl();
		armazemDAO = new ArmazemDAOImpl();
		new CooperativaDAOImpl();
		retiradaDAO = new RetiradaDAOImpl();
		itemRetiradaDAO = new ItemRetiradaDAOImpl();
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

			case "/landing-page":
				mostrarLandingPage(request, response);
				break;

			case "/login":
				mostrarLogin(request, response);
				break;

			case "/logar":
				logar(request, response);
				break;

			case "/deslogar":
				deslogar(request, response);
				break;

			case "/cadastro-coletor":
				mostrarCadastroColetor(request, response);
				break;
				
			case "/perfil-coletor":
				mostrarPerfilColetor(request, response);
				break;

			case "/home-armazem":
				mostrarHomeArmazem(request, response);
				break;

			case "/home-cooperativa":
				mostrarHomeCooperativa(request, response);
				break;

			case "/historico-depositos-coletor":
				mostrarHistoricoDepositosColetor(request, response);
				break;

			case "/historico-depositos-armazem":
				mostrarHistoricoDepositosArmazem(request, response);
				break;

			case "/historico-retiradas-armazem":
				mostrarHistoricoRetiradasArmazem(request, response);
				break;

			case "/historico-retiradas-cooperativa":
				mostrarHistoricoRetiradasCooperativa(request, response);
				break;

			case "/ranking-coletor":
				mostrarRankingColetor(request, response);
				break;

			case "/depositos-pendentes-coletor":
				mostrarDepositosPendentesColetor(request, response);
				break;

			case "/depositos-agendados-armazem":
				mostrarDepositosAgendadosArmazem(request, response);
				break;

			case "/editar-deposito":
				mostrarEditarDeposito(request, response);
				break;

			case "/retiradas-agendadas-armazem":
				mostrarRetiradasAgendadasArmazem(request, response);
				break;

			case "/retiradas-pendentes-cooperativa":
				mostrarRetiradasPendentesCooperativa(request, response);
				break;

//			case "/perfilDoColetor-armazem":
//				mostrarPerfilColetorArmazem(request, response);
//				break;	
//				
//			case "/perfilDoArmazem-coletor":
//				mostrarPerfilArmazemColetor(request, response);
//				break;	
//				
//			case "/perfilDoArmazem-cooperativa":
//				mostrarPerfilArmazemCooperativa(request, response);
//				break;	

			case "/editar-perfil-coletor":
				mostrarEditarPerfilColetor(request, response);
				break;

			case "/editar-perfil-armazem":
				mostrarEditarPerfilArmazem(request, response);
				break;

			case "/editar-perfil-cooperativa":
				mostrarEditarPerfilCooperativa(request, response);
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

			case "/atualizar-reciclavel":
				atualizarReciclavel(request, response);
				break;

//			case "/deletar-reciclavel":
//				deletarReciclavel(request, response);
//				break;

			case "/cadastro-item-deposito":
				mostrarCadastroItemDeposito(request, response);
				break;

			case "/cadastro-deposito":
				mostrarCadastroDeposito(request, response);
				break;
				
			case "/buscar-armazem":
				mostrarBuscarArmazem(request, response);
				break;

			case "/inserir-deposito":
				inserirDeposito(request, response);
				break;

			case "/atualizar-Deposito":
				atualizarDeposito(request, response);
				break;

//			case "/deletar-Deposito":
//				deletarDeposito(request, response);
//				break;

			case "/cadastro-retirada":
				mostrarCadastroRetirada(request, response);
				break;

			case "/inserir-retirada":
				inserirRetirada(request, response);
				break;

			case "/atualizar-retirada":
				atualizarRetirada(request, response);
				break;

			case "/informacoes-retirada":
				mostrarInformacoesRetirada(request, response);
				break;

			case "/cadastro-conquista":
				mostrarCadastroConquista(request, response);
				break;

			case "/inserir-conquista":
				inserirConquista(request, response);
				break;

			case "/recuperar-senha":
				mostrarRecuperarSenha(request, response);
				break;
				
			case "/procurar-armazem":
				mostrarProcurarArmazem(request, response);
				break;
				
			case "/resultado-procurar-armazem":
				resultadoProcurarArmazem(request, response);
				break;

			default:
				mostrarLandingPage(request, response);
				break;
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}

	}

	private void mostrarLogin(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/login.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarLandingPage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/landing-page.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/cadastro.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarPerfilColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();
		
		Coletor coletor = (Coletor) sessao.getAttribute("usuario");
		request.setAttribute("coletor", coletor);

		List<Deposito> depositos = depositoDAO.buscarDepositoPeloColetor(coletor);
		request.setAttribute("depositos", depositos);

		List<Conquista> conquistas = conquistaDAO.buscarListaConquistaPeloId(coletor.getId());
		request.setAttribute("conquistas", conquistas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/perfil.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHistoricoDepositosColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();

		Coletor coletor = (Coletor) sessao.getAttribute("usuario");
		request.setAttribute("coletor", coletor);

		List<Deposito> depositos = depositoDAO.buscarDepositos();
		request.setAttribute("depositos", depositos);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/historico-depositos.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarEditarDeposito(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Deposito deposito = depositoDAO.buscarDepositoComItemDepositoPorId(Long.parseLong(request.getParameter("id")));
		request.setAttribute("deposito", deposito);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/informacoes-deposito.jsp");
		dispatcher.forward(request, response);

	}

	private void mostrarInformacoesRetirada(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Deposito deposito = depositoDAO
				.buscarDepositoComItemDepositoPorId((Long.parseLong(request.getAttribute("id").toString())));
		request.setAttribute("deposito", deposito);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/informacoes-deposito.jsp");
		dispatcher.forward(request, response);

	}

	private void mostrarHistoricoDepositosArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/historico-deposito.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHistoricoRetiradasArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/historico-retirada.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHistoricoRetiradasCooperativa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cooperativa/historico.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarRankingColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/ranking.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarDepositosPendentesColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/depositos-pendentes.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarRetiradasPendentesCooperativa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("assets/paginas/cooperativa/depositos-pendentes.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarDepositosAgendadosArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/depositos-agendados.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarRetiradasAgendadasArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/retiradas-agendadas.jsp");
		dispatcher.forward(request, response);
	}

//	private void mostrarPerfilColetorArmazem(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		
//		HttpSession sessao = request.getSession();
//		Armazem armazem = (Armazem) sessao.getAttribute("usuario");
//		request.setAttribute("armazem", armazem);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/perfil-coletor.jsp");
//		dispatcher.forward(request, response);
//	}
//	
//	private void mostrarPerfilArmazemColetor(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		
//		HttpSession sessao = request.getSession();
//		Coletor coletor = (Coletor) sessao.getAttribute("usuario");
//		request.setAttribute("coletor", coletor);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/perfil-amarzem.jsp");
//		dispatcher.forward(request, response);
//	}
//	
//	private void mostrarPerfilArmazemCooperativa(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		
//		HttpSession sessao = request.getSession();
//		Cooperativa cooperativa = (Cooperativa) sessao.getAttribute("usuario");
//		request.setAttribute("cooperativa", cooperativa);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cooperativa/perfil-armazem.jsp");
//		dispatcher.forward(request, response);;
//	}

	private void mostrarEditarPerfilColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();
		Coletor coletor = (Coletor) sessao.getAttribute("usuario");
		request.setAttribute("coletor", coletor);
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/editar-perfil.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarEditarPerfilArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();
		Armazem armazem = (Armazem) sessao.getAttribute("usuario");
		request.setAttribute("armazem", armazem);
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/editar-perfil.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarEditarPerfilCooperativa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();
		Cooperativa cooperativa = (Cooperativa) sessao.getAttribute("usuario");
		request.setAttribute("cooperativa", cooperativa);
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cooperativa/editar-perfil.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/cadastro.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHomeArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();

		Armazem armazem = (Armazem) sessao.getAttribute("usuario");
		request.setAttribute("armazem", armazem);

		List<Deposito> depositos = depositoDAO.buscarDepositoPeloArmazem(armazem);
		request.setAttribute("depositos", depositos);

		List<Retirada> retiradas = retiradaDAO.buscarRetiradasPeloArmazem(armazem);
		request.setAttribute("retiradas", retiradas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/armazem/home.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroCooperativa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cooperativa/cadastro.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHomeCooperativa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();

		Cooperativa cooperativa = (Cooperativa) sessao.getAttribute("usuario");

		request.setAttribute("cooperativa", cooperativa);

		List<Retirada> retiradas = retiradaDAO.buscarRetiradasPelaCooperativa(cooperativa);
		request.setAttribute("retiradas", retiradas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cooperativa/home.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroMaterial(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("assets/paginas/administrador/cadastro-material.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroReciclavel(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Material> materiais = materialDAO.buscarMateriais();
		request.setAttribute("materiais", materiais);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("assets/paginas/administrador/cadastro-reciclavel.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroItemDeposito(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Reciclavel> reciclaveis = reciclavelDAO.buscarReciclaveis();
		request.setAttribute("reciclaveis", reciclaveis);
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cadastro-item-deposito.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroDeposito(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Reciclavel> reciclaveis = reciclavelDAO.buscarReciclaveis();
		List<Armazem> armazens = armazemDAO.buscarArmazens();
		List<Material> materiais = materialDAO.buscarMateriais();
		request.setAttribute("reciclaveis", reciclaveis);
		request.setAttribute("materiais", materiais);
		request.setAttribute("armazens", armazens);
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/cadastro-deposito.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarBuscarArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Reciclavel> reciclaveis = reciclavelDAO.buscarReciclaveis();
		List<Armazem> armazens = armazemDAO.buscarArmazens();
		List<Material> materiais = materialDAO.buscarMateriais();
		request.setAttribute("reciclaveis", reciclaveis);
		request.setAttribute("materiais", materiais);
		request.setAttribute("armazens", armazens);
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/coletor/buscar-armazem.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroRetirada(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Armazem> armazens = armazemDAO.buscarArmazens();
		request.setAttribute("armazens", armazens);
		List<Material> materiais = materialDAO.buscarMateriais();
		request.setAttribute("materiais", materiais);
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/cooperativa/cadastro-retirada.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroConquista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("assets/paginas/administrador/cadastro-conquista.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarRecuperarSenha(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/recuperar-senha.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarProcurarArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/procurar-armazem.jsp");
		dispatcher.forward(request, response);
	}

	private void logar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		HttpSession sessao = request.getSession();
		Usuario usuario = usuarioDAO.buscarUsuarioPorEmailESenha(email, senha);
		sessao.setAttribute("usuario", usuario);

		if (usuario instanceof Coletor) {
			Coletor coletor = (Coletor) usuarioDAO.recuperarUsuarioComEnderecoPorId(usuario.getId());
			response.sendRedirect("/eCO2You/home-coletor");
			request.setAttribute("coletor", coletor);

		} else if (usuario instanceof Armazem) {
			Armazem armazem = (Armazem) usuarioDAO.recuperarUsuarioComEnderecoPorId(usuario.getId());
			response.sendRedirect("/eCO2You/home-armazem");
			request.setAttribute("armazem", armazem);

		} else if (usuario instanceof Cooperativa) {
			Cooperativa cooperativa = (Cooperativa) usuarioDAO.recuperarUsuarioComEnderecoPorId(usuario.getId());
			response.sendRedirect("/eCO2You/home-cooperativa");
			request.setAttribute("cooperativa", cooperativa);

		} else {
			response.sendRedirect("/eCO2You/login");

		}
	}

	private void deslogar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();
		sessao.invalidate();
		response.sendRedirect("/eCO2You/landing-page");
	}

	private void inserirColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		LocalDate dataNascimento = LocalDate.parse(request.getParameter("dataNascimento"));
		String cep = request.getParameter("cep");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String tipoVia = request.getParameter("tipoVia");
		String logradouro = request.getParameter("logradouro");
		String numeroEndereco = request.getParameter("numero");
		String complemento = request.getParameter("complemento");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento,
				telefone);
		enderecoDAO.inserirEndereco(endereco);
		usuarioDAO.inserirUsuario(new Coletor(nome, sobrenome, cpf, dataNascimento, email, senha, endereco));

		response.sendRedirect("/eCO2You/login");

	}

	private void atualizarColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Coletor coletor = (Coletor) request.getSession().getAttribute("usuario");
		Long id = coletor.getId();
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		LocalDate dataNascimento = LocalDate.of(2000, 4, 12);
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
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento,
				telefone);
		enderecoDAO.atualizarEndereco(endereco);
		usuarioDAO.atualizarUsuario(new Coletor(id, nome, sobrenome, cpf, dataNascimento, email, senha, endereco));

		HttpSession sessao = request.getSession();
		Usuario usuario = usuarioDAO.buscarUsuarioPorId(id);
		sessao.setAttribute("usuario", usuario);

		response.sendRedirect("/eCO2You/home-coletor");
	}

	private void deletarColetor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = usuarioDAO.buscarUsuarioPorId(id);
		usuarioDAO.deletarUsuario(usuario);
		response.sendRedirect("eCO2You/");

	}

	private void inserirArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

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
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento,
				telefone);
		enderecoDAO.inserirEndereco(endereco);
		usuarioDAO.inserirUsuario(new Armazem(nome, cnpj, email, senha, capacidadeArmazenagem, horarioAbertura,
				horarioFechamento, endereco));

		response.sendRedirect("/eCO2You/login");
	}

	private void atualizarArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Armazem armazem = (Armazem) request.getSession().getAttribute("usuario");
		Long id = armazem.getId();
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
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento,
				telefone);
		enderecoDAO.atualizarEndereco(endereco);
		usuarioDAO.atualizarUsuario(new Armazem(id, nome, cnpj, email, senha, capacidadeArmazenagem, horarioAbertura,
				horarioFechamento, endereco));

		HttpSession sessao = request.getSession();
		Usuario usuario = usuarioDAO.buscarUsuarioPorId(id);
		sessao.setAttribute("usuario", usuario);

		response.sendRedirect("/eCO2You/home-armazem");
	}

	private void deletarArmazem(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		Long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = usuarioDAO.buscarUsuarioPorId(id);
		usuarioDAO.deletarUsuario(usuario);
		response.sendRedirect("eCO2You/");

	}

	private void inserirCooperativa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

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
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento,
				telefone);
		enderecoDAO.inserirEndereco(endereco);
		usuarioDAO.inserirUsuario(
				new Cooperativa(nome, cnpj, horarioAbertura, horarioFechamento, endereco, email, senha));

		response.sendRedirect("/eCO2You/login");
	}

	private void atualizarCooperativa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Cooperativa cooperativa = (Cooperativa) request.getSession().getAttribute("usuario");
		Long id = cooperativa.getId();
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
		Endereco endereco = new Endereco(cep, cidade, bairro, tipoVia, logradouro, numeroEndereco, complemento,
				telefone);
		enderecoDAO.atualizarEndereco(endereco);
		usuarioDAO.atualizarUsuario(
				new Cooperativa(id, nome, cnpj, horarioAbertura, horarioFechamento, endereco, email, senha));

		HttpSession sessao = request.getSession();
		Usuario usuario = usuarioDAO.buscarUsuarioPorId(id);
		sessao.setAttribute("usuario", usuario);

		response.sendRedirect("/eCO2You/home-cooperativa");
	}

	private void deletarCooperativa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Usuario usuario = usuarioDAO.buscarUsuarioPorId(id);
		usuarioDAO.deletarUsuario(usuario);
		response.sendRedirect("eCO2You/");

	}

	private void inserirMaterial(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		materialDAO.inserirMaterial(new Material(nome));
		response.sendRedirect("/eCO2You/home");
	}

	private void atualizarMaterial(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		materialDAO.atualizarMaterial(new Material(id, nome));
		response.sendRedirect("/home");
	}

	private void deletarMaterial(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Material material = materialDAO.buscarMaterialPorId(id);
		materialDAO.deletarMaterial(material);
		response.sendRedirect("/home");

	}

	private void inserirReciclavel(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		Material material = materialDAO.buscarMaterialPorId(Long.parseLong(request.getParameter("material")));
		int pontosCarbono = Integer.parseInt(request.getParameter("pontos-carbono"));
		float peso = Float.parseFloat(request.getParameter("peso"));
		float volume = Float.parseFloat(request.getParameter("volume"));
		String instrucaoReciclavel = request.getParameter("instrucao-reciclavel");
		reciclavelDAO
				.inserirReciclavel(new Reciclavel(nome, material, pontosCarbono, peso, volume, instrucaoReciclavel));
		response.sendRedirect("landing-page");
	}

	private void atualizarReciclavel(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		Material material = materialDAO.buscarMaterialPorId(Long.parseLong(request.getParameter("material")));
		int pontosCarbono = Integer.parseInt(request.getParameter("pontosCarbono"));
		float peso = Float.parseFloat(request.getParameter("peso"));
		float volume = Float.parseFloat(request.getParameter("volume"));
		String instrucaoReciclavel = request.getParameter("instrucaoReciclavel");
		reciclavelDAO.atualizarReciclavel(
				new Reciclavel(id, nome, material, pontosCarbono, peso, volume, instrucaoReciclavel));

	}

//	private void deletarReciclavel(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		
//		long id = Long.parseLong(request.getParameter("id"));
//		Material material = materialDAO.recuperarMaterialPorId(id);
//		materialDAO.deletarMaterial(material);
//		response.sendRedirect("/home");
//	}

	private void inserirDeposito(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

//		Armazem armazem = armazemDAO.buscarArmazemPorId(Long.parseLong(request.getParameter("armazem")));
		Endereco endereco = new Endereco("Blumenau", "Garcia", "49740-390", "Rua", "Amazonas", "2094", "Cooper",
				"(47) 97789-3035");
		enderecoDAO.inserirEndereco(endereco);

		Armazem armazem = new Armazem("Cooper", "cooper@gmail.com", "123458", "", endereco, "29320241000108",
				LocalTime.of(8, 0), LocalTime.of(21, 0), 2000, StatusArmazem.LOTADO);
		usuarioDAO.inserirUsuario(armazem);
		Coletor coletor = (Coletor) request.getSession().getAttribute("usuario");
		LocalDate data = LocalDate.parse(request.getParameter("data"));
		Deposito deposito = new Deposito(data, armazem, coletor);
		depositoDAO.inserirDeposito(deposito);

		Reciclavel reciclavel = reciclavelDAO.buscarReciclavelPorId(Long.parseLong(request.getParameter("reciclavel")));
		int quantidadeReciclaveis = Integer.parseInt(request.getParameter("quantidade-reciclaveis"));
		deposito.inserirItemDeposito(new ItemDeposito(reciclavel, quantidadeReciclaveis));
		itemDepositoDAO.inserirItemDeposito(new ItemDeposito(reciclavel, quantidadeReciclaveis));
		response.sendRedirect("/eCO2You/home-coletor");

	}

	private void atualizarDeposito(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Long id = Long.parseLong(request.getParameter("id"));
		LocalDate data = LocalDate.parse(request.getParameter("data"));
		Armazem armazem = armazemDAO.buscarArmazemPorId(Long.parseLong(request.getParameter("armazem")));
		Coletor coletor = (Coletor) request.getSession().getAttribute("coletor");
		depositoDAO.inserirDeposito(new Deposito(id, data, armazem, coletor));

		Reciclavel reciclavel = reciclavelDAO.buscarReciclavelPorId(Long.parseLong(request.getParameter("reciclavel")));
		int quantidadeReciclaveis = Integer.parseInt(request.getParameter("quantidade-reciclaveis"));
		itemDepositoDAO.inserirItemDeposito(new ItemDeposito(reciclavel, quantidadeReciclaveis));
		response.sendRedirect("/eCO2You/home-coletor");

	}

//	private void deletarDeposito(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		
//		long id = Long.parseLong(request.getParameter("id"));
//		Material material = materialDAO.recuperarMaterialPorId(id);
//		materialDAO.deletarMaterial(material);
//		response.sendRedirect("/home");
//		
//	}

	private void inserirRetirada(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		LocalDate data = LocalDate.parse(request.getParameter("data"));
		Cooperativa cooperativa = (Cooperativa) request.getSession().getAttribute("usuario");
		Armazem armazem = armazemDAO.buscarArmazemPorId(Long.parseLong(request.getParameter("armazem")));
		;
		retiradaDAO.inserirRetirada(new Retirada(data, cooperativa, armazem));

		Material material = materialDAO.buscarMaterialPorId(Long.parseLong(request.getParameter("material")));
		float peso = Float.parseFloat(request.getParameter("peso"));
		itemRetiradaDAO.inserirItemRetirada(new ItemRetirada(material, peso));
		response.sendRedirect("/eCO2You/home-cooperativa");

	}

	private void atualizarRetirada(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Long id = Long.parseLong(request.getParameter("id"));
		LocalDate data = LocalDate.parse(request.getParameter("data"));
		Cooperativa cooperativa = (Cooperativa) request.getSession().getAttribute("usuario");
		Armazem armazem = armazemDAO.buscarArmazemPorId(Long.parseLong(request.getParameter("armazem")));
		;
		retiradaDAO.inserirRetirada(new Retirada(id, data, cooperativa, armazem));

		Material material = materialDAO.buscarMaterialPorId(Long.parseLong(request.getParameter("material")));
		float peso = Float.parseFloat(request.getParameter("peso"));
		itemRetiradaDAO.inserirItemRetirada(new ItemRetirada(material, peso));
		response.sendRedirect("/eCO2You/home-cooperativa");

	}

	private void inserirConquista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		int pontos = Integer.parseInt(request.getParameter("pontos"));
		String descricao = request.getParameter("descricao");
		conquistaDAO.inserirConquista(new Conquista(nome, pontos, descricao));
		response.sendRedirect("landing-page");
	}
	
	public void resultadoProcurarArmazem (HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		
		List<Armazem> armazens = armazemDAO.buscarArmazensPorNome(request.getParameter("pesquisar"));
		request.setAttribute("armazens", armazens);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/paginas/procurar-armazem.jsp");
		dispatcher.forward(request, response);
		
		
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}