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
			<h1>Login</h1>
				<form action="logar" method="post">
					<input type="email" id="email" name="email" placeholder="E-mail" maxlength="25">
					<br>
					<br>
					<input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25">
					<br>
					<a href="recuperar-senha" target="_blank">Esqueceu a senha?</a>
					<br>
					<br>
					<button type="submit" name="entrar" id=entrar class="ButtonEntrar">Entrar</button>
				</form>
			</div>
			<div style="float:right">
            	<br>
                <br>
				<h1>Crie sua Conta</h1>
				<br>
				<h2>Seja parte da mudança que o mundo precisa!</h2>
				<br>
				<form action="cadastro-coletor">
					<button type="submit" name="cadastrar" id=coletor class="ButtonCriarConta">Coletor</button>
				</form>
				<br>
				<form action="cadastro-armazem">
					<button type="submit" name="cadastrar" id=armazem class="ButtonCriarConta">Armazem</button>
				</form>
				<br>
				<form action="cadastro-cooperativa">
					<button type="submit" name="cadastrar" id=cooperativa class="ButtonCriarConta">Cooperativa</button>
				</form>
			</div>
		</div>
	</body>
</html>