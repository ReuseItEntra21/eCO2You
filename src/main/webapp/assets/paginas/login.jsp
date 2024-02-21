<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<style><%@ include file="../css/login.css" %></style>
	</head>
	<body>
		<a href="landing-page" class=""> Voltar</a>
		<div class="container-login">
			<span>Login</span>
			<form action="logar" method="post">
				<div class="item-login">
					<p>Email</p>
					<input type="email" id="email" name="email" placeholder="username@gmail.com" maxlength="65" class="e-mailEsenha">
				</div>
				<div class="item-login">
					<p>Senha</p>
					<input type="password" id="senha" name="senha" placeholder="senha" maxlength="25" class="e-mailEsenha">
					<div class="esqueceuSenha"><a href="recuperar-senha" target="_blank" id="esqueceuSenha">Esqueceu a senha?</a></div>
				</div>
				<div class="item-login">
					<button type="submit">Entrar</button>
	            	<div class="registrar">
                        <p>Não tem um Conta? <a href="cadastro-coletor">Registre-se</a></p>
                    </div>
				</div>
			</form>
		</div>
	</body>
</html>
