<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../resources/css/style.css"%></style>
    </head>
			<br>
	        	<button type="button">Voltar</button>
    <body>
    	<form action="inserir-cooperativa" method="post">
	        <h1> Nova Conta </h1>
	        <br>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome do Armázem" maxlength="25"required size="35">
	        <br>
	        <br>
	        <input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" size="35" required>
	        <br>
	        <br>
	        <input type="text" id="cnpj" name="cnpj" placeholder="Cnpj" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="text" id="cep" name="cep" placeholder="Cep" required size="35">
	        <br>
	        <br>
	        <input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25" size="35" required>
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