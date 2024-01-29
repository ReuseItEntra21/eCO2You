<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
    	<br>
		 <button type="button" name="voltar" id=voltar>Voltar</button>
        <h2 id="alterarSenha">RECUPERAR SENHA</h2>
        <input type="email" id="email1" name="email" placeholder="Informe seu E-mail" maxlength="25" class="recuperarSenhaEmail">
        <br>
        <br>
        <input type="email" id="email2" name="email" placeholder="Confirme o seu E-mail" maxlength="25" class="recuperarSenhaEmail">
        <br>
        <br>
        <button type="button" id="Recuperar">Recuperar</button>
	</body>
</html>