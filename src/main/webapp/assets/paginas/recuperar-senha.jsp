<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Recuperar Senha</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
    <br>
		<form action="login">
			<button type="submit" name="voltar" id=voltar>Voltar</button>
		</form>
        <h2> Recuperar senha </h2>
        <input type="email" id="email" name="email" placeholder="Informe seu e-mail">
        <br>
        <br>
        <input type="email" id="email" name="email" placeholder="Confirme seu e-mail">
        <br>
        <br>
        <button type="button" name="recuperar" id=recuperar>Recuperar</button>
        <br>
        <br>
        <button type="button" name="voltar" id=voltar>Voltar</button>
        <br>
        <h2> Recuperar senha </h2>
        <h4> Informe o código que recebeu no e-mail</h4>
        <input type="number" id="digito1" name="digito" min = 0 max = 9>
        <input type="number" id="digito2" name="digito" min = 0 max = 9>
        <input type="number" id="digito3" name="digito" min = 0 max = 9>
        <input type="number" id="digito4" name="digito" min = 0 max = 9>
        <input type="number" id="digito5" name="digito" min = 0 max = 9>
        <input type="number" id="digito6" name="digito" min = 0 max = 9>
        <br>
        <br>
        <button type="button" name="recuperar" id=recuperar>Recuperar</button>
        <br>
        <br>
        <button type="button" name="voltar" id=voltar>Voltar</button>
        <br>
        <h2 id="alterarSenha">RECUPERAR SENHA</h2>
        <input type="password" id="senhaAntiga" name="senha" placeholder="Informe sua senha" maxlength="25" class="recuperarSenhal">
        <br>
        <br>
        <input type="password" id="senhaNova" name="senha" placeholder="Informe sua nova senha" maxlength="25" class="recuperarSenha">
        <br>
        <br>
        <form action="login">
        <button type="button" id="Recuperar" name=recuperar >Recuperar</button>
        </form>	
	</body>
</html>