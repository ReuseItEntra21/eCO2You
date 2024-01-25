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
			<form action="/">
			<br>
	        	<input type="submit" value="Voltar">
			</form>
			<h1>Login</h1>
				<form action="home-coletor">
					<input type="email" id="email" name="email" placeholder="E-mail" maxlength="25" required>
					<br>
					<br>
					<input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25"  required>
					<br>
					<a href="a/b/elenco.html" target="_blank">Esqueceu a senha?</a>
					<br>
					<br>
					<a href="./home-coletor">
						<button type="submit" class="ButtonEntrar">Entrar</button>
					</a>
				</form>
			</div>
			<div style="float:right">
            	<br>
                <br>
				<h1>Crie sua Conta</h1>
				<br>
				<h2>Seja parte da mudança que o mundo precisa!</h2>
				<br>
				<a href="./cadastro-coletor">
					<button type="submit" class="ButtonCriarConta">Coletor</button>
				</a>
				<br>
				<a href="./cadastro-armazem">
					<button type="submit" class="ButtonCriarConta">Armazem</button>
				</a>
				<br>
				<a href="./cadastro-cooperativa">
					<button type="submit" class="ButtonCriarConta">Cooperativa</button>
				</a>
			</div>
		</div>
	</body>
</html>