<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Perfil Armazem</title>
		<style>
			<%@includefile="../../../resources/css/coletor/perfil.css"%>
		</style>
	</head>
	<body>
		<div>
			<form action="home-armazem">
				<button type="submit" name="voltar" id=voltar>Voltar</button>
			</form>
			<form action="editarPerfil-armazem">
				<button type="submit" name="editar" id=editar>Editar Perfil</button>
			</form>
			<div>
				<h2> Nome </h2>
				<h3>${armazem.nome}</h3>
				<br>
				<h2> CNPJ </h2>	
				<h3>${armazem.cnpj}</h3>
				<br>
				<h2> Horario de Abertura </h2>
				<h3>${armazem.horarioAbertura}</h3>
				<br>
				<h2> Horario de Fechamento</h2>
				<h3>${armazem.horarioFechamento}</h3>
			</div>
			<div class="informacoes-box">
				<h3># ID</h3>
			</div>
			<div class="informacoes-box">
				<h3>Posição</h3>
			</div>
			<div class="informacoes-box">
				<h3>Pontuação</h3>
			</div>
		</div>
		<div style="position: fixed; left: 38vw; top: 0.75vw;"
			class=conquistas-container>
			<c:forEach var="conquista" items="${conquistas}">
				<div class="image-conquista-box">&#127941; ${conquista.nome}</div>
			</c:forEach>
		</div>
	</body>
</html>