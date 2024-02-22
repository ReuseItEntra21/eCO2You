<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Informações Deposito</title>
	</head>
	<body>
	<br>
		<a href="perfil-coletor" class="dropbtn" id=voltar>Voltar</a>
		<table id="tabela-contato">
			<thead>
				<tr>
					<th>Data</th>
					<th>Local</th>
					<th>Status</th>
					<th>Reciclavel</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><c:out value="${deposito.data}" /></td>					
					<td><c:out value="${deposito.armazem.nome}" /></td>
					<td><c:out value="${deposito.statusDeDeposito}" /></td>
					<c:forEach var="itemDeposito" items="${deposito.itensDeposito}">		
							<td><c:out value="${itemDeposito.reciclavel.nome}" /></td>				
					</c:forEach>
				</tr>
				
			</tbody>
		</table>
	</body>
</html>