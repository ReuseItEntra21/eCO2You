<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Pendentes</title>
	    <style><%@include file="../../css/coletor/depositos-pendentes.css"%></style>
	</head>
	<body>
	<a href="perfil-coletor" id="voltar">
		<svg>
			<%@include file="../../images/voltar.jsp"%>
		</svg>
	</a>
	<form action="principal-coletor">
	    <h2>DEPÓSITOS A SEREM ACEITOS</h2>
	    <c:forEach var="deposito" items="${listaDepositosAceitos}">
	        <div>
	            <input type="image" src="caminho/da/imagem.jpg" name="imagem" id="imagem1">
	            <p>${deposito.quantidade}x ${deposito.tipo}</p>
	            <p>${deposito.data}"</p>
	            <p>${deposito.empresa}"</p>
	        </div>
	    </c:forEach>
	    <h2>DEPÓSITOS AGENDADOS</h2>
	    <c:forEach var="deposito" items="${listaDepositosAgendados}">
	        <div>
	            <input type="image" src="caminho/da/imagem.jpg" name="imagem" id="imagem1">
	            ${deposito.quantidade}x ${deposito.tipo}
	            <input type="date" id="data" name="dataDeposito" value="${deposito.data}">
	            <input type="text" placeholder="Empresa" name="empresa" id="empresa" value="${deposito.empresa}">
	        </div>
	    </c:forEach>
	</form>
	<a href="cadastro-deposito" class="dropbtn" id="voltar">Criar Depósito</a>
	</body>
</html>
