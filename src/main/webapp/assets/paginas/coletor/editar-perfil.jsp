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
	    <form action="perfil-coletor">
	    	<button type="submit" name="voltar" id=voltar>Voltar</button>
	    </form>
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
		    <input type="text" placeholder="${usuario.telefone}">
		    <br>
		    <input type="text" placeholder="${usuario.cep}">
		    <br>
		    <input type="text" placeholder="${usuario.bairro}">
		    <br>
		    <input type="text" placeholder="${usuario.logradouro}">
		    <br>
		    <input type="text" placeholder="${usuario.cep}">
		    <br>
		    <input type="text" placeholder="${usuario.numeroResidencia}">
		    <br>
		    <input type="text" placeholder="${usuario.cidade}">			
		    <br>
		    <input type="text" placeholder="${usuario.complemento}">
		    <br>
		    <input type="submit" value="Salvar">
	    </form>
	</body>
</html>