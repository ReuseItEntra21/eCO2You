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
    	<form action="inserir-conquista" method="post">
	        <h1> Nova Conquista </h1>
	        <br>
	        <br>
	        <h2> Nome da Conquista </h2>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome da Conquista" maxlength="25"size="15">
	        <br>
	        <br>
	        <h2> Pontos da Conquista </h2>
	        <input type="number" id="pontos" name="pontos" autofocus placeholder="Pontos da Conquista" maxlength="25"size="15">
	        <br>
	        <br>
	        <input type="text" id="descricao" name="descricao" autofocus placeholder="Descrição da Conquista" maxlength="25"size="15">
	        <br>
	        <br>
	        <button type="submit" name="cadastrar" id=cadastrar class="ButtonEntrar">Cadastrar Conquista</button>
        </form>
    </body>
</html>