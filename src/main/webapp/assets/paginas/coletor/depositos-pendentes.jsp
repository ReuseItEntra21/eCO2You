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
		<a href="perfil-coletor" id="voltar"><svg><%@include file="../../images/voltar.jsp"%></svg></a>
		<div>
			<div class="container-deposito-pendente">
				<span>Depósitos Pendentes</span>
				<c:forEach var="deposito" items="${depositos}">
					<div class="item-deposito-agendado">
						<span>${deposito.itemDeposito.quantidade}x ${deposito.itemDeposito.reciclavel.nome}</span>
						<span>${deposito.data}"</span>
						<span>${deposito.armazem}"</span>
					</div>
				</c:forEach>
			</div>
			<div class="container-deposito-agendado">
				<span>Depósitos Agendados</span>
				<c:forEach var="deposito" items="${listaDepositosAgendados}">
					<div class="item-deposito-agendado">
						<p>${deposito.itemDeposito.quantidadeReciclaveis}x ${deposito.itemDeposito.reciclavel.nome}</p>
						<p>${deposito.data}</p>
						<p>${deposito.armazem}</p>
					</div>
				</c:forEach>
				<a href="editar-deposito?id=<c:out value='${deposito.id}'/>">Editar</a>
				<a href="deletar?id=<c:out value='${deposito.id}'/>">Deletar</a>
			</div>
		</div>
	</body>
</html>
