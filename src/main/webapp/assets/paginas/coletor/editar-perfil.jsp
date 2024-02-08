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
	    <a href="home-coletor" id=voltar>Voltar</a>
	    <form action="atualizar-coletor">
			<h1> Informações </h1>
			<br>
		    <input type="text" value="${coletor.nome}" id="nome" name="nome">
		    <input type="text" value="${coletor.sobrenome}" id="sobrenome" name="sobrenome">
		    <br>
		    <input type="text" value="${coletor.cpf}" id="cpf" name="cpf">  
		    <input type="email" value="${coletor.email}" id="email" name="email">
		    <br>
		    <input type="tel" value="${coletor.endereco.telefone}" id="telefone" name="telefone">
		    <input type="text" value="${coletor.endereco.cep}" id="cep" name="cep">
		    <br>
		    <input type="text" value="${coletor.endereco.cidade}" id="cidade" name="cidade" placeholder="Informe a sua Cidade">
		    <input type="text" value="${coletor.endereco.bairro}" id="bairro" name="bairro">
		    <br>
		    <input type="text" value="${coletor.endereco.logradouro}" id="logradouro" name="logradouro">
		    <input type="number" value="${coletor.endereco.numeroEndereco}" id="numeroEndereco" name="numeroEndereco">
		    <br>
		    <input type="text" value="${coletor.endereco.tipoVia}" id="tipoVia" name="tipoVia">
		    <input type="text" value="${coletor.endereco.complemento}" id="complemento" name="complemento">
		    <br>
		    <input type="text" value="${coletor.senha}" id="senha" name="senha">
		    <br>
		    <input type="submit" value="Salvar">
	    </form>
	    <div>
		    <a href="deslogar" id=deslogar>Deslogar</a> 
	    </div>
	</body>
</html>