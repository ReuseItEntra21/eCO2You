<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
		<nav class="flex-container">
			<a class="flex-item" href="home-coletor"id=home>Home</a>
			<a class="flex-item" href="depositosPendentes-coletor" id=pendentes>Pendentes</a>
	        <a class="flex-item" href="historicoDepositos-coletor" id=historico>Histórico</a>
	        <a class="flex-item" href="ranking-coletor" id=ranking>Ranking</a>
	       	<input class="flex-item" type="search" id="consulta-nome" placeholder="Buscar Usuário">
	        <a class="flex-item" href="perfil-coletor" class="dropbtn" id=perfil>Olá "${usuario.nome}"</a>
    	</nav>	
	</body>
</html>