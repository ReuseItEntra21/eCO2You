<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro</title>
	</head>
	<body>
		<h1>Nova Conta</h1>
		<form action="/action_page.php">
			<input type="text" id="nome" name="nome" autofocus placeholder="Nome" maxlength="15" required size="35">
			<br>
			<br>
			<input type="text" id="sobrenome" name="sobrenome" autofocus placeholder="Nome" maxlength="15" required size="35">
			<br>
			<br>
			<input type="date" id="data" name="data" required size="17">
			<br>
			<br>
			<input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25" size="35" required>
			<br>
			<br>
			<input type="text" id="cpf" name="cpf" placeholder="Cpf" maxlength="14" required size="35">
			<br>
			<br>
			<input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" size="35" required>
			<br>
			<br>
			<input type="text" id="cep" name="cep" placeholder="Cep" required size="35">
			<br>
			<br>
			<input type="submit" value="Entrar">
			<br>
			<br>
			<h2>Faça parte dessa mudança!</h2>
			<Pre>Conecte-se a uma comunidade<br> comprometida com a <br>sustentabilidade e preservação<br> do meio ambiente.</Pre>
		</form>
	</body>
</html>