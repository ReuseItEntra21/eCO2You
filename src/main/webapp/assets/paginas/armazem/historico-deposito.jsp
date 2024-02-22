<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Histórico de Depósito</title>
</head>
	<body>
		<a href="perfil-armazem" class="dropbtn" id=voltar>Voltar</a>
		<%@include file="menu.jsp"%>
		<h1>Histórico de Depósito</h1>
      	<div class="container-depositos">
			<table border="1" style="width: 99vw;">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Data</th>
	                    <th>Resumo</th>
	                    <th>Ações</th>         
					</tr>
				</thead>
				<c:forEach var="deposito" items="${depositos}">
					<tr>
                    	<td>${deposito.coletor.nome}</td>
						<td>${deposito.data}</td>
	                	<td>${itemDeposito.quantidadeReciclaveis} ${itemDeposito.reciclavel.nome} ${itemDeposito.reciclavel.volume}</td>
	                	<td>${itemDeposito.quantidadeReciclaveis} ${itemDeposito.reciclavel.nome} ${itemDeposito.reciclavel.volume}</td>
	                	<td><a href="editar-deposito?id=<c:out value='${deposito.id}'/>">Editar</a> <a href="deletar?id=<c:out value='${deposito.id}'/>">Deletar</a></td>	
					</tr>
				</c:forEach>
			</table>
	   	</div>
	</body>
</html>