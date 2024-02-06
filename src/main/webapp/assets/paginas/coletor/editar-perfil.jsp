<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Perfil</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
    <body>
	    <br>
	    <a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
	    <br>
	    <br>
	    <form action="recuperar-senha">
	    	<button type="submit" name="voltar" id=voltar>Alterar a Senha</button>
	    </form>
	    <form action=".">
	    	<button type="submit" name="voltar" id=voltar>Excluir a Conta</button>
	    </form>
	    <form action="deslogar">
	    	<button type="submit" name="voltar" id=voltar>Deslogar</button>
	    </form>
	    <form action="perfil-coletor">
			<h1> Informações </h1>
		    <input type="text" autofocus placeholder="${usuario.nome}">
		    <br>
		    <input type="email" placeholder="${usuario.email}">
		    <br>
		    <input type="text" placeholder="${usuario.cpf}">
		    <br>
		    <input type="text" placeholder="${usuario.endereco.telefone}">
		    <br>
		    <input type="text" placeholder="${usuario.endereco.cep}">
		    <br>
		    <input type="text" placeholder="${usuario.endereco.bairro}">
		    <br>
		    <input type="text" placeholder="${usuario.endereco.logradouro}">
		    <br>
		    <input type="text" placeholder="${usuario.endereco.cep}">
		    <br>
		    <input type="text" placeholder="${usuario.endereco.numeroEndereco}">
		    <br>
		    <input type="text" placeholder="${usuario.endereco.cidade}">			
		    <br>
		    <input type="text" placeholder="${usuario.endereco.complemento}">
		    <br>
		    <input type="submit" value="Salvar">
	    </form>
	</body>
</html>