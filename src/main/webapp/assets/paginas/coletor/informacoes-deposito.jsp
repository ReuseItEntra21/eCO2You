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
		<form>
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
					<td>
						<label for="data" class="informacao-cadastro">Data</label>
						<input type="date" value="${deposito.data}" oninput="this.className = ''" name="data" id=data>
					</td>					
					<td>
						<label for="armazem" class="informacao-cadastro">Armazem</label>
						<input type="text" value="${deposito.armazem.id}" oninput="this.className = ''" name="armazem" id=data >
					</td>
					<td><c:out value="${deposito.statusDeDeposito}" /></td>
					<c:forEach var="itemDeposito" items="${deposito.itensDeposito}">		
							<td><c:out value="${itemDeposito.reciclavel.nome}" /></td>				
					</c:forEach>
					<td>
						<input type="submit" value="Salvar" oninput="this.className = ''" name="salvar" id=salvar >
					</td>
				</tr>
			</tbody>
		</table>
		</form>
	</body>
</html>