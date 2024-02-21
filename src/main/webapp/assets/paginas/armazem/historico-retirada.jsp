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
    	<a href="perfil-armazem" class="dropbtn" id=voltar>Voltar</a>
    	<%@ include file="../../../assets/paginas/armazem/menu.jsp"%>
    	<h1>Histórico de Retirada</h1>
    	<div class="container-retiradas">
			<table border="1" style="width: 99vw;">
				<thead>
					<tr>
						<th>Comprador</th>
						<th>Data</th>
	                    <th>Resumo</th>
					</tr>
				</thead>
				<c:forEach var="retirada" items="${retiradas}">
					<tr>
                    	<td>${retirada.cooperativa.nome}</td>
						<td>${retirada.data}</td>
	                	<td>${itemRetirada.material.nome} ${itemRetirada.material.peso}</td>
					</tr>
				</c:forEach>
			</table>
	    </div>
	</body>
</html>