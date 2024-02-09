<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<style><%@include file="../../resources/css/style.css"%></style>
	</head>
		<body>
		<div>
			<div style="float:left">
			<a href="landing-page" class="dropbtn" id=voltar>Voltar</a>
			<h1 id="login">Login</h1>
				<form action="logar" method="post">
					<input type="email" id="email" name="email" placeholder="E-mail" maxlength="25" class="e-mailEsenha">
					<br>
					<br>
					<input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25" class="e-mailEsenha">
					<br>
					<a href="recuperar-senha" target="_blank" id="esqueceuSenha">Esqueceu a senha?</a>
					<br>
					<br>
					<button type="submit" name="entrar" id=entrar class="ButtonEntrar">Entrar</button>
				</form>
			</div>
		</div>
	</body>
</html>