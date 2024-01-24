<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../resources/css/style.css"%></style>
	</head>
	<body>
		<div>
			<div style="float:left">
			<h2>
				Faça parte dessa mudança!
			</h2>
			Conecte-se a uma comunidade comprometida com a sustentabilidade e preservação do meio ambiente
			</div>
			<div style="float:right">
				<h1>Nova Conta</h1>
				<form action="/inserir-coletor" method="post">
					<input type="text" id="nome" name="nome" autofocus placeholder="Nome" required size="35">
					<br>
					<br>
					<input type="text" id="sobrenome" name="sobrenome" autofocus placeholder="Sobrenome" required size="35">
					<br>
					<br>
					<input type="date" id="data" name="data" required size="17">
					<br>
					<br>
					<input type="password" id="senha" name="senha" placeholder="Senha" size="35" required>
					<br>
					<br>
					<input type="text" id="cpf" name="cpf" placeholder="Cpf" required size="35">
					<br>
					<br>
					<input type="email" id="email" name="email" placeholder="E-mail" size="35" required>
					<br>
					<br>
					<a href="./cadastroEndereco-coletor">
						<button type="button" class="ButtonEntrar" >Fazer Parte</button>
					</a>
				</form>
			</div>
		</div>
	</body>
</html>