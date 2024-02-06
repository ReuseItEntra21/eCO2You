<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Histórico de Depósitos</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
	<br>	
			<a href="home-armazem" class="dropbtn" id=voltar>Voltar</a>
			<form action="historicoDepositos-armazem">
			<h1>Histórico de Depositos</h1>
            <h2>Nome</h2>
			<button type="button" name="flecha" id=flecha1>Flecha</button>
			<p>Nome 1</p>
			<p>Nome 2</p>
            <p>Nome 3</p>
            <h2>Data</h2>
            <button type="button" name="flecha" id=flecha2>Flecha</button>
			<p>Data 1</p>
			<p>Data 2</p>
            <p>Data 3</p>
            <h2>Resumo</h2>
			<button type="button" name="flecha" id=flecha3>Flecha</button>
			<p>Quantidade do item, tipo de item, peso 1</p>
			<p>Quantidade do item, tipo de item, peso 2</p>
            <p>Quantidade do item, tipo de item, peso 3</p>
		</form>
	</body>
</html>