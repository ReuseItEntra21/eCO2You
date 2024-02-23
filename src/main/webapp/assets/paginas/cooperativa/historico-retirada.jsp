	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Histórico Retirada</title>
		<style><%@include file="../../css/cooperativa/historico-retirada.css"%></style>
	</head>
	<body>
    	<a href="perfil-cooperativa" id="voltar">
			<svg>
				<%@include file="../../images/voltar.jsp"%>
			</svg>
		</a>
    	<h1>Histórico de Retirada</h1>
    	<div class="container-retiradas">
			<table border="1" style="width: 99vw;">
				<thead>
					<tr>
						<th>Armazém</th>
						<th>Data</th>
	                    <th>Resumo</th>
					</tr>
				</thead>
				<c:forEach var="retirada" items="${retiradas}">
					<tr>
                    	<td>${retirada.armazem.nome}</td>
						<td>${retirada.data}</td>
	                	<td>${itemRetirada.material.nome} ${itemRetirada.peso}</td>
					</tr>
				</c:forEach>
			</table>
	    </div>
	</body>
</html>