	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %><!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Pendentes</title>
	</head>
	<body>		
			<h2> Depósitos agendados </h2>
			
			<c:forEach var="deposito" items="${deposito}">
					<tr>
						<td>${deposito.data}</td>
						<td>${deposito.armazem.nome}</td>
						<td><a href="deletar?id=<c:out value='${deposito.id}'/>">Excluir</a></td>							
					</tr>
			</c:forEach>
			<h2> Depósitos à serem aceitos </h2>	
			<c:forEach var="deposito" items="${deposito}">
					<tr>
						<td>${deposito.data}</td>
						<td>${deposito.armazem.nome}</td>
						<td><a href="deletar?id=<c:out value='${deposito.id}'/>">Excluir</a></td>							
					</tr>
			</c:forEach>			
	</body>
</html>