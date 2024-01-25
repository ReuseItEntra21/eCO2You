<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
    </head>
    <form action="/">
			<br>
	        	<button type="button">Voltar</button>
			</form>
    <body>
    	<form action="inserir-cooperativa" method="post">
	        <h1> Nova Conta </h1>
	        <br>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome da Cooperativa" maxlength="25" required size="35">
	        <br>
	        <br>
	        <input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" size="35" required>
	        <br>
	        <br>
	        <input type="text" id="cnpj" name="cnpj" placeholder="Cnpj" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25" size="35" required>
	        <br>
	        <br>
	        <input type="time" id="horarioAbertura" name="horarioAbertura" required size="17">
            <br>
            <br>
            <input type="time" id="horarioFechamento" name="horarioFechamento" required size="17">          
            <br>
            <br>
            <input type="text" id="cep" name="cep" placeholder="cep" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="text" id="cidade" name="cidade" placeholder="cidade" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="text" id="bairro" name="bairro" placeholder="bairro" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="text" id="tipoVia" name="tipoVia" placeholder="tipoVia" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="text" id="logradouro" name="logradouro" placeholder="logradouro" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="text" id="numeroEndereco" name="numeroEndereco" placeholder="numeroEndereco" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="text" id="complemento" name="complemento" placeholder="complemento" maxlength="18" required size="35">
	        <br>
	        <br>
	        <input type="text" id="telefone" name="telefone" placeholder="telefone" maxlength="18" required size="35">
	        <br>
	        <br>
	        <button type="submit" class="ButtonEntrar">Fazer Parte</button>
	        <br>
	        <br>
	        <h2>Faça parte dessa mudança!</h2>
			<Pre>Conecte-se a uma comunidade<br> comprometida com a <br>sustentabilidade e preservação<br> do meio ambiente.</Pre>
        </form>
    </body>
</html>