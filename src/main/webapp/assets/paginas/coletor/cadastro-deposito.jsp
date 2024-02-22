<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Cadastro Depósito</title>
		<style><%@include file="../../../assets/css/coletor/cadastro-deposito.css"%></style>
	</head>
	<body>
		<a href="perfil-coletor" id=voltar>Voltar</a>
		<div class="container-cadastro">
			<form action="inserir-deposito">
				<span>Nova Depósito</span>
				<div>
					<label for="deposito">Data de Depósito</label>
					<input type="date" oninput="this.className = ''" name="data" id=deposito>
				</div>
				<div>
					<label for="deposito">Armazém</label>
					<input type="text" value="${armazem.nome}" name="nome">
				</div>
				<div>
					<label> Escolha a Reciclavel </label>
					<select name="reciclavel">
				    	<c:forEach var="reciclavel" items="${reciclaveis}">
				        	<option value="${reciclavel.id}">${reciclavel.nome}</option>
				    	</c:forEach>
			    	</select>
				</div>
				<div>
					<label>Quantidade</label>
					<input type="number" oninput="this.className = ''" name="quantidade-reciclavel" id=deposito>
				</div>
				<div>
					<button type="submit">Agendar</button>
				</div>
			</form>
		</div>
	</body>
</html>
