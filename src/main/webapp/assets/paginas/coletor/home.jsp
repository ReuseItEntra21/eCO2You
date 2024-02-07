<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
	<header>
		<nav class="flex-container">
			<a class="flex-item" href="home-coletor"id=home>Home</a>
			<a class="flex-item" href="depositosPendentes-coletor" id=pendentes>Pendentes</a>
	        <a class="flex-item" href="historicoDepositos-coletor" id=historico>Histórico</a>
	        <a class="flex-item" href="ranking-coletor" id=ranking>Ranking</a>
	       	<input class="flex-item" type="search" id="consulta-nome" placeholder="Buscar Usuário">
	        <a class="flex-item" href="perfil-coletor" class="dropbtn" id=perfil>Olá ${usuario.nome}</a>
    	</nav>	
	</header>
        <h2>Conquistas Recentes </h2>
        
        <c:forEach var="deposito" items="${depositos}">
        			<h3>Armazem:</h3>
        			<p>${deposito.armazem}</p>
        			<br>
        			<h3>Data:</h3>
        			<p>${deposito.data}</p>
        			<br>
        			<h3>Reciclavel:</h3>
        			<p>${deposito.reciclavel}</p>
        			<br>
        			<h3>Quantidade do Reciclavel:</h3>
        			<p>${deposito.quantidadeReciclaveis}</p>
    	</c:forEach>
	</body>
</html>