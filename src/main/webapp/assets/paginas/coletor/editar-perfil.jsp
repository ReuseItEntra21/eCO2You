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
	    <form action="atualizar-coletor">
			<h1> Informações </h1>
			<br>
		    <input type="text" value="<c:out value='${coletor.nome}' />" id="nome" name="nome" autofocus placeholder="Informe o seu Nome">
		    <br>
		    <input type="text" value="<c:out value='${coletor.sobrenome}' />" id="sobrenome" name="sobrenome" autofocus placeholder="Informe o seu Nome">
		    <br>
		    <input type="text" value="<c:out value='${coletor.cpf}' />" id="cpf" name="cpf" placeholder="Informe o seu CPF">  
		    <br>
		    <input type="email" value="<c:out value='${coletor.email}' />" id="email" name="email" placeholder="Informe o seu Email">
		    <br>
		    <input type="tel" value="<c:out value='${coletor.endereco.telefone}' />" id="telefone" name="telefone" placeholder="Informe o seu Telefone">
		    <br>
		    <input type="number" value="<c:out value='${coletor.endereco.cep}' />" id="cep" name="cep" placeholder="Informe o seu CEP">
		    <br>
		    <input type="text" value="<c:out value='${coletor.endereco.cidade}' />" id="cidade" name="cidade" placeholder="Informe a sua Cidade">
		    <br>
		    <input type="text" value="<c:out value='${coletor.endereco.bairro}' />" id="bairro" name="bairro" placeholder="Informe o seu Bairro">
		    <br>
		    <input type="text" value="<c:out value='${coletor.endereco.logradouro}' />" id="logradouro" name="logradouro" placeholder="Informe o Logradouro">
		    <br>
		    <input type="number" value="<c:out value='${coletor.endereco.numeroEndereco}' />" id="numeroEndereco" name="numeroEndereco" placeholder="Informe o Logradouro">
		    <br>
		    <input type="text" value="<c:out value='${coletor.endereco.complemento}' />" id="complemento" name="complemento" placeholder="Informe o complemento">
		    <br>
		    <input type="text" value="<c:out value='${coletor.senha}' />" id="senha" name="senha" placeholder="Informe a Senha">
		    <br>
		    <input type="submit" value="Salvar">
	    </form>
	</body>
</html>