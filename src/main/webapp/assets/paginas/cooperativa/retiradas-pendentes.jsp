<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Pendentes</title>
	    <style><%@include file="../../css/cooperativa/retiradas-pendentes.css"%></style>
	</head>
	<body>
	<a href="perfil-cooperativa" id="voltar">
		<svg>
			<%@include file="../../images/voltar.jsp"%>
		</svg>
	</a>
	<form action="principal-cooperativa">
	    <h2>RETIRADAS A SEREM ACEITAS</h2>
	    <c:forEach var="retirada" items="${listaRetiradasAceitas}">
	        <div>
	            <input type="image" src="caminho/da/imagem.jpg" name="imagem" id="imagem1">
	            <p>${retirada.itemRetirada.peso}x ${retirada.itemRetirada.material.nome}</p>
	            <p>${retirada.data}</p>
	            <p>${retirada.armazem}</p>
	        </div>
	    </c:forEach>
	    <h2>RETIRADAS AGENDADAS</h2>
	    <c:forEach var="retirada" items="${listaRetiradasAgendadas}">
	        <div>
	            <p>${retirada.itemRetirada.peso}x ${retirada.itemRetirada.material.nome}</p>
	            <p>${retirada.data}</p>
	            <p>${retirada.armazem}</p>
	        </div>
	    </c:forEach>
	</form>
	<a href="cadastro-retirada" class="dropbtn" id="voltar">Criar Retirada</a>
	</body>
</html>
