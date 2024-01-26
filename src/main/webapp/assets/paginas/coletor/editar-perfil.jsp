<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Perfil</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
    <body>
    <br>
    	<form action="/">
	        <a href="./perfil-coletor">
				<button type="button">Voltar</button>
			</a>
	        <br>
	        <br>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome" maxlength="25" size="46" required><br>
	        <br>
	        <input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" size="46" required><br>
	        <br>
	        <input type="text" id="cpf" name="cpf" placeholder="Cpf" maxlength="14" required size="46">
	        <br>
	        <br>
	        <input type="text" id="telefone" name="telefone" placeholder="Telefone" maxlength="17" required> <input type="text" id="bairro" name="bairro" placeholder="Endereço Bairro" maxlength="25" required><br>
	        <br>
	        <input type="text" id="logradouro" name="logradouro" placeholder="Endereço Rua" maxlength="45" required> <input type="text" id="cidade" name="cidade" placeholder="Cidade" maxlength="25" required> <br>
	        <br>
	        <input type="text" id="numero" name="numeroResidencia" placeholder="Número" required> 				<br>
	        <br>
	        <input type="text" id="complemento" name="complemento" placeholder="Complementos" size="46">
	        <br>
	        <br>
	        <input type="submit" value="Alterar a Senha">
	        <input type="submit" value="Excluir a Conta">
	        <br>
	        <br>
	        <input type="submit" value="Salvar">
    	</form>
    </body>
</html>