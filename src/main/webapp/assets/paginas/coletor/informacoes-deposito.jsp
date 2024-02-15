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
		<a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
		<table id="tabela-contato">
			<thead>
				<tr>
					<th>Data</th>
					<th>Local</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><c:out value="${deposito.data}" /></td>					
					<td><c:out value="${deposito.armazem}" /></td>
					<td><c:out value="${deposito.status}" /></td>
				</tr>
				
			</tbody>
		</table>
	</body>
</html>