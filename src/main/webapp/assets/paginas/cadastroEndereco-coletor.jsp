<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Endereço</title>
		<style><%@include file="../../resources/css/style.css"%></style>
	</head>
	<body>
		<div>
		<form action="inserir-armazem" method="post">
          	<input type="submit" value="Voltar">
          	</form>
			<h1>Endereço</h1>
			<form action="cadastroEndereco-coletor" method="post">			
				<input type="hidden" name="id" value="<%=request.getAttribute("usuarioId")%>" />
                <br>
				<input type="text" id="cep" name="cep" autofocus placeholder="CEP" required size="30">
				<input type="text" id="cidade" name="cidade" autofocus placeholder="Cidade" required size="30">
				<br>
				<br>
				<input type="text" id="bairro" name="bairro" autofocus placeholder="Bairro" required size="30">
				<input type="text" id="tipoVia" name="tipoVia" autofocus placeholder="Tipo da Via"  required size="30">
				<br>
				<br>
				<input type="text" id="logradouro" name="logradouro" autofocus placeholder="Logradouro"  required size="30">
				<input type="text" id="numeroResidencia" name="numeroResidencia" autofocus placeholder="Número da Residencia" required size="30">
				<br>
				<br>
				<input type="text" id="complemento" name="complemento" autofocus placeholder="Complemento" required size="66">
				<br>
				<br>
				<input type="text" id="aptoEndereco" name="aptoEndereco" autofocus placeholder="Número do Apartamento" required size="30">
				<input type="text" id="blocoEndereco" name="blocoEndereco" autofocus placeholder="Bloco do Apartamento" required size="30">
				<br>
				<br>
				<input type="text" id="telefone" name="telefone" autofocus placeholder="Telefone" required size="30">
				<br>
				<br>
				<button type="submit" class="ButtonEntrar" >Criar Conta</button>
			</form>
		</div>
	</body>
</html>