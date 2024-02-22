<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Cadastro Depósito</title>
		<style><%@include file="../../css/coletor/cadastro-deposito.css"%></style>
	</head>
	<body>
		<a href="landing-page" id=voltar>Voltar</a>
	    <div style="text-align:center;">
			<span class="step"></span>
			<span class="step"></span>
		</div>
		<div class="container-cadastro">
			<form action="inserir-deposito">
				<div id="item-deposito-titulo">
					<span>Depósito</span>
				</div>
				<div class="item-deposito">
					<label for="deposito">Data de Depósito</label>
				</div>
				<div class="item-deposito-input">
					<input type="date" oninput="this.className = ''" name="data" id=deposito>
				</div>
				<div class="item-deposito">
					<label for="deposito">Armazém</label>
				</div>
				<div class="item-deposito-input">
					<input type="text" value="${armazem.nome}" name="nome">
				</div>
				<div class="item-deposito" class="item-deposito-input">
					<label> Escolha a Reciclavel </label>
				</div>
				<div class="item-deposito-input" class="item-deposito">
					<select name="reciclavel">
					    <c:forEach var="reciclavel" items="${reciclaveis}">
					        <option value="${reciclavel.id}">${reciclavel.nome}</option>
					    </c:forEach>
				    </select>
				</div>
				<div class="item-deposito">
					<label>Quantidade</label>
				</div>	
				<div class="item-deposito-input">
					<input type="number" oninput="this.className = ''" name="quantidade-reciclavel" id=deposito>
				</div>
				<div class="item-deposito"  id="recilcavel">
					<button type="submit">Agendar</button>
				</div>
			</form>
		</div>
	</body>
</html>
