<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Histórico</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
    	<a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
    	<table border="1" style="width: 99vw;">
			<thead>
				<tr>
					<th>Data</th>
					<th>Armazem</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="deposito" items="${depositos}">
					<tr>
						<td>${deposito.data}</td>
						<td>${deposito.armazem.nome}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>