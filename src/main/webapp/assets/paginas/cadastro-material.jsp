<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
    </head>
    <form action="apresentacao">
		<button type="submit" name="voltar" id=voltar>Voltar</button>
	</form>
    <body>
    	<form action="inserir-material" method="post">
	        <h1> Novo Material </h1>
	        <br>
	        <br>
	        <h2> Nome do Material </h2>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome do material" maxlength="25"size="35">
	        <br>
	        <br>
	        <button type="submit" name="cadastrar" id=cadastrar class="ButtonEntrar">Cadastrar Material</button>
        </form>
    </body>
</html>