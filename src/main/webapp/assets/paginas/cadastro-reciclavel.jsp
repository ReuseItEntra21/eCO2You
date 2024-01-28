<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
    	<form action="inserir-material" method="post">
	        <h1> Novo Material </h1>
	        <br>
	        <br>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome do reciclável" maxlength="25" size="20">
	        <br>
	        <br>
	        <select name="material">
	        	<c:forEach var="material" items="${materiais}">
	        		<option value="<c:out value="${material.id}"/>"><c:out value="${material.nome}"/><option>
	        	</c:forEach>
	        </select>
	        <br>
	        <br>
	        <input type="number" id="pontos-carbono" name="nome" autofocus placeholder="Quantidade de pontos" maxlength="25"size="20">
	        <br>
	        <br>
	        <input type="number" id="peso" name="peso" autofocus placeholder="Peso do Reciclável" maxlength="25"size="20">
	        <br>
	        <br>
	        <input type="number" id="volume" name="volume" autofocus placeholder="Volume do Reciclável (cm³)" maxlength="25"size="20">
	        <br>
	        <br>
	        <input type="text" id="instrucao-Reciclavel" name="instrucaoReciclavel" autofocus placeholder="Instrução de depósito" maxlength="25" size="20">
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