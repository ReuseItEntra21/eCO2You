<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Histórico</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
            <a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
            <form action="historicoDepositos-coletor">
			<h1>Histórico de Depositos</h1>
            <h2>Data</h2>
            <button type="button" name="flecha" id=flecha1>Flecha</button>
			<p>Data 1</p>
			<p>Data 2</p>
            <p>Data 3</p>
			<h2>Armazém</h2>
			<button type="button" name="flecha" id=flecha2>Flecha</button>
			<p>Armazém 1</p>
			<p>Armazém 2</p>
            <p>Armazém 3</p>
			<h2>Pontuação</h2>
			<button type="button" name="flecha" id=flecha3>Flecha</button>
			<p>Pontos Obtidos 1</p>
			<p>Pontos Obtidos 2</p>
            <p>Pontos Obtidos 3</p>
            <h2>Resumo</h2>
			<button type="button" name="flecha" id=flecha4>Flecha</button>
			<p>Quantidade do item, tipo de item, peso 1</p>
			<p>Quantidade do item, tipo de item, peso 2</p>
            <p>Quantidade do item, tipo de item, peso 3</p>
		</form>
	</body>
</html>