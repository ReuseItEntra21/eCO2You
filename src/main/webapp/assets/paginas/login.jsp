<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<style><%@include file="../css/style.css"%></style>
	</head>
		<body>
		<div>
			<div style="float:left">
			<h1 id="login">Login</h1>
				<form action="logar" method="post">
                	<h4> Email </h4>
					<input type="email" id="email" name="email" placeholder="username@gmail.com" maxlength="25" class="e-mailEsenha">
                    <h4> Senha </h4>
					<input type="password" id="senha" name="senha" placeholder="senha" maxlength="25" class="e-mailEsenha">
					<a href="recuperar-senha" target="_blank" id="esqueceuSenha">Esqueceu a senha?</a>
					<button type="submit" name="entrar" id=entrar class="ButtonEntrar">Confirmar</button>
                    <h5>Não tem um Conta?</h5>
                    <a href="cadastro-coletor" target="_blank" id="cadastrar">Cadastre-se</a>
				</form>
			</div>
			<div style="float:right">
			</div>
		</div>
	</body>
</html>