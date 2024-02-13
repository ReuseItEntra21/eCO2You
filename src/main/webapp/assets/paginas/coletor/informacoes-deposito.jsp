<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Informações Deposito</title>
		<style><%@include file="../../../resources/css/style.css"%></style>		
	</head>
	<body>
	<br>
		<a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
            <form action="informacoes-deposito">
			<h1>Informações deposito</h1>
            <br>
            <h2>Armazem</h2>
            <h3>${deposito.armazem.nome}</h3>
            <br>
            <h2>Data</h2>
            <h3>${deposito.data}</h3>
            <br>
            <h2>Coletor</h2>
            <h3>${deposito.coletor.nome}</h3>
			<br>	
			<h2>reciclavel</h2>
			<h3></h3>
			<br>
			<h2>Quantidade do Reciclável</h2>
			<h3></h3>
			<br>
		</form>
	</body>
</html>