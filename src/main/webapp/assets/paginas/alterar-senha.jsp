<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
    	<form action="apresentacao">
			<button type="submit" name="voltar" id=voltar>Voltar</button>
		</form>
        <h2 id="alterarSenha">RECUPERAR SENHA</h2>
        <input type="password" id="senhaAntiga" name="senha" placeholder="Informe sua senha" maxlength="25" class="recuperarSenhal">
        <br>
        <br>
        <input type="password" id="senhaNova" name="senha" placeholder="Informe sua nova senha" maxlength="25" class="recuperarSenha">
        <br>
        <br>
        <button type="button" id="Recuperar" name=recuperar >Recuperar</button>
	</body>
</html>