	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %><!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Proximo Depósito</title>
		<style><%@include file="../../css/coletor/proximos-depositos.css"%></style>	
	</head>
	<body>
	<a href="perfil-coletor" id="voltar">
		<svg>
			<%@include file="../../images/voltar.jsp"%>
		</svg>
	</a>
	<h1>Próximos Depósitos</h1>
		<c:forEach var="deposito" items="${deposito}">
				<tr>
					<td>${deposito.armazem.nome}</td>
					<td>${deposito.armazem.endereco.cep}</td>
					<td>${deposito.armazem.endereco.cidade}</td>
					<td>${deposito.armazem.endereco.tipoVia}</td>
					<td>${deposito.armazem.endereco.numeroEndereco}</td>
					<td>${deposito.armazem.endereco.complemento}</td>
				</tr>
		</c:forEach>			
	</body>
	</html>