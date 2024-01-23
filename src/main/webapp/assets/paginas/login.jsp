<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="style.css">
	<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	<form action="/action_page.php">
		<input type="email" id="email" name="email" placeholder="E-mail" maxlength="25" minlength="8" required>
		<br>
		<br>
		<input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25" minlength="8" required>
		<br>
		<a href="a/b/elenco.html" target="_blank">Esqueceu a senha?</a>
		<br>
		<br>
		<input type="submit" value="Entrar" id="Entrar01">
		<br>
		<a href="a/b/elenco.html" target="_blank">Ainda não tem uma conta?</a>
	</form>
</body>
</html>