<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<style><%@ include file="../css/login.css" %></style>
</head>
	<body>
	<div class="box-login">
		<h1 id="login">Login</h1>
			<form action="logar" method="post">
				<div>
					<p>Email</p>
					<input type="email" id="email" name="email" placeholder="username@gmail.com" maxlength="25" class="e-mailEsenha">
				</div>
				<div>
					<p>Senha</p>
					<input type="password" id="senha" name="senha" placeholder="senha" maxlength="25" class="e-mailEsenha">
					<a href="recuperar-senha" target="_blank" id="esqueceuSenha">Esqueceu a senha?</a>
				</div>
				<div>
					<button type="submit" >Confirmar</button>
            		<a href="cadastro-coletor" id="cadastrar">Não tem um Conta?</a>
				</div>
			</form>
		</div>
	</body>
</html>