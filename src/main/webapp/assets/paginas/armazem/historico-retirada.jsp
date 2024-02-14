	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Histórico Retirada</title>
	</head>
	<body>
    	<a href="home-cooperativa" class="dropbtn" id=voltar>Voltar</a>
    	<table border="1" style="width: 99vw;">
			<thead>
				<tr>
					<th>Data</th>
					<th>Cooperativa</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="retirada" items="${retirada}">
					<tr>
						<td>${retirada.data}</td>
						<td>${retirada.cooperativa.cnpj}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>