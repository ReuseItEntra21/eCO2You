<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Histórico</title>
	</head>
	<body>
    	<a href="perfil-coletor" class="dropbtn" id=voltar>Voltar</a>
    	<%@include file="menu.jsp"%>
    	<h1>Histórico de Depósito</h1>
    	<div class="container-depositos">
			<table border="1" style="width: 99vw;">
				<thead>
					<tr>
						<th>Data</th>
						<th>Armazém</th>
	                    <th>Pontuação</th>
	                    <th>Resumo</th>
					</tr>
				</thead>
				<c:forEach var="deposito" items="${depositos}">
					<tr>
						<td>${deposito.data}</td>
						<td>${deposito.armazem.nome}</td>
	                	<td>${deposito.reciclavel.pontosCarbono}</td>
	                	<td>${itemDeposito.quantidadeReciclaveis} ${itemDeposito.reciclavel.nome} ${itemDeposito.reciclavel.volume}</td>
					</tr>
				</c:forEach>
			</table>
	    </div>
	</body>
</html>