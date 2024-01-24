<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Endereço</title>
		<style><%@include file="../../resources/css/style.css"%></style>
	</head>
	<body>
		<div>
			<h1>Endereço</h1>
			<form action="/inserir-coletor" method="post">
				<input type="text" id="estado" name="estado" autofocus placeholder="Estado" required size="30">
				<input type="text" id="cidade" name="cidade" autofocus placeholder="Cidade" required size="30">
				<br>
				<br>
				<input type="text" id="bairro" name="bairro" autofocus placeholder="Bairro" required size="30">
				<input type="text" id="rua" name="rua" autofocus placeholder="Rua"  required size="30">
				<br>
				<br>
				<input type="text" id="numero" name="numero" autofocus placeholder="Número" required size="30">
				<input type="text" id="cep" name="cep" autofocus placeholder="CEP" required size="30">
				<br>
				<br>
				<input type="text" id="complemento" name="complemento" autofocus placeholder="Complemento" required size="64">
				<br>
				<br>
				<a href="./home-coletor">
					<button type="button" class="ButtonEntrar" >Criar Conta</button>
				</a>
			</form>
		</div>
	</body>
</html>