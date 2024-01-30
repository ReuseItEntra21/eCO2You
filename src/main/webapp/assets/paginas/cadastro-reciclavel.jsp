<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>


<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
    </head>
    <form action="/">
			<br>
	        	<button type="button" name="voltar" id=voltar >Voltar</button>
			</form>
    <body>
    	<form action="inserir-reciclavel" method="post">
	        <h1> Novo Reciclável </h1>
	        <br>
	        <br>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome do reciclável" maxlength="25" size="20">
	        <br>
	        <br>
	        <h2> Escolha o Material  </h2>
	        <br>
	        <br>
	        <select name="material">
    			<c:forEach var="material" items="${materiais}">
        			<option value="${material.id}">${material.nome}</option>
    			</c:forEach>
			</select>
	        <br>
	        <br>
	        <input type="number" id="pontos-carbono" name="pontos-carbono" autofocus placeholder="Quantidade de pontos" maxlength="25"size="20">
	        <br>
	        <br>
	        <input type="number" id="peso" name="peso" autofocus placeholder="Peso do Reciclável" maxlength="25"size="20">
	        <br>
	        <br>
	        <input type="number" id="volume" name="volume" autofocus placeholder="Volume do Reciclável (cm³)" maxlength="25"size="20">
	        <br>
	        <br>
	        <input type="text" id="instrucao-reciclavel" name="instrucao-reciclavel" autofocus placeholder="Instrução de depósito" maxlength="25" size="20">
	        <br>
	        <br>
	        <button type="submit" name="cadastrar" id=cadastrar class="ButtonEntrar">Cadastrar Reciclável</button>
	        <br>
	        <br>
	        <h2>Faça parte dessa mudança!</h2>
			<Pre>Conecte-se a uma comunidade<br> comprometida com a <br>sustentabilidade e preservação<br> do meio ambiente.</Pre>
        </form>
    </body>
</html>