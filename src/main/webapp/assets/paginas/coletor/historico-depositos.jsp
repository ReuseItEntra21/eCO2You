<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Histórico</title>
		<style><%@include file="../../css/coletor/historico-depositos.css"%></style>
	</head>
	<body>
    	<a href="perfil-coletor" class="dropbtn" id=voltar>
			<svg>
				<%@include file="../../images/voltar.jsp"%>
			</svg>
		</a>
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
	                	<td>12</td>
	                	<td>${itemDeposito.quantidadeReciclaveis} ${itemDeposito.reciclavel.nome} ${itemDeposito.reciclavel.volume}</td>
					</tr>
				</c:forEach>
			</table>
	    </div>
	</body>
</html>