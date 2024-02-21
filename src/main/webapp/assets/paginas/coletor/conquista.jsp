<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Conquistas</title>
		
	</head>
	<body>
		<h1>Conquistas</h1>>
		<c:forEach var="conquista" items="${conquistas}">
				<tr>
					<td>${conquista.nome}</td>
					<td>${conquista.descricao}</td>
				</tr>
		</c:forEach>		
	</body>
</html>