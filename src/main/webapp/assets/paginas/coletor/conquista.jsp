<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Conquistas</title>
		<style><%@include file="../../css/coletor/conquistas.css"%></style>
	</head>
	<body>
	<a href="perfil-coletor" id="voltar">
		<svg>
			<%@include file="../../images/voltar.jsp"%>
		</svg>
	</a>
		<h1>Conquistas</h1>>
		<c:forEach var="conquista" items="${conquistas}">
				<tr>
					<td>${conquista.nome}</td>
					<td>${conquista.descricao}</td>
				</tr>
		</c:forEach>		
	</body>
</html>