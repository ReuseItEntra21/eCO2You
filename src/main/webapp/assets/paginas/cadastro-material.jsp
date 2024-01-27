<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
    </head>
    <form action="/">
			<br>
	        	<button type="button">Voltar</button>
			</form>
    <body>
    	<form action="inserir-material" method="post">
	        <h1> Novo Material </h1>
	        <br>
	        <br>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome do material" maxlength="25"size="35">
	        <br>
	        <br>
	        <button type="submit" class="ButtonEntrar">Fazer Parte</button>
	        <br>
	        <br>
	        <h2>Faça parte dessa mudança!</h2>
			<Pre>Conecte-se a uma comunidade<br> comprometida com a <br>sustentabilidade e preservação<br> do meio ambiente.</Pre>
        </form>
    </body>
</html>