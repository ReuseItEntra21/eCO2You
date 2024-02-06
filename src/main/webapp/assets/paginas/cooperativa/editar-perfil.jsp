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
      <form action="atualizar-cooperativa">
			<h1> Informações </h1>
			<br>
		    <input type="text" value="<c:out value='${cooperativa.nome}' />" id="nome" name="nome" autofocus placeholder="Informe o seu Nome">
		    <br>
		    <input type="text" value="<c:out value='${cooperativa.cnpj}' />" id="cnpj" name="cnpj" placeholder="Informe o seu CNPJ">  
		    <br>
		    <input type="email" value="<c:out value='${cooperativa.email}' />" id="email" name="email" placeholder="Informe o seu Email">
		    <br>
		    <input type="time" value="<c:out value='${cooperativa.horarioAbertura}' />" id="horarioAbertura" name="horarioAbertura" placeholder="Informe o seu Horario de Abertura">  
		    <br>
		    <input type="time" value="<c:out value='${cooperativa.horarioFechamento}' />" id="horarioFechamento" name="horarioFechamento" placeholder="Informe o seu Horario de Fechamento">  
		    <br>
		    <input type="tel" value="<c:out value='${cooperativa.endereco.telefone}' />" id="telefone" name="telefone" placeholder="Informe o seu Telefone">
		    <br>
		    <input type="number" value="<c:out value='${cooperativa.endereco.cep}' />" id="cep" name="cep" placeholder="Informe o seu CEP">
		    <br>
		    <input type="text" value="<c:out value='${cooperativa.endereco.cidade}' />" id="cidade" name="cidade" placeholder="Informe a sua Cidade">
		    <br>
		    <input type="text" value="<c:out value='${cooperativa.endereco.bairro}' />" id="bairro" name="bairro" placeholder="Informe o seu Bairro">
		    <br>
		    <input type="text" value="<c:out value='${cooperativa.endereco.logradouro}' />" id="logradouro" name="logradouro" placeholder="Informe o Logradouro">
		    <br>
		    <input type="number" value="<c:out value='${cooperativa.endereco.numeroEndereco}' />" id="numeroEndereco" name="numeroEndereco" placeholder="Informe o Número">
		    <br>
		    <input type="text" value="<c:out value='${cooperativa.endereco.complemento}' />" id="complemento" name="complemento" placeholder="Informe o complemento">
		    <br>
		    <input type="text" value="<c:out value='${cooperativa.senha}' />" id="senha" name="senha" placeholder="Informe a Senha">
		    <br>
		    <input type="submit" value="Salvar">
	    </form>
    </body>
</html>