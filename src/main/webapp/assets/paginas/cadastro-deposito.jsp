<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
    </head>
    <form action="apresentacao">
		<button type="submit" name="voltar" id=voltar>Voltar</button>
	</form>
    <body>
    	<form action="inserir-deposito" method="post">
	        <h1> Novo Depósito </h1>
	        <br>
	        <br>
	        <input type="date" id="data" name="data" autofocus placeholder="Data para Depositar" maxlength="25" size="20">
	        <br>
	        <br>
	        <select name="reciclavel">
	        	<c:forEach var="reciclavel" items="${reciclaveis}">
	        		<option value="<c:out value="${reciclavel.id}" />"><c:out value="${reciclavel.nome}" /><option>
	        	</c:forEach>
	        </select>
	        <br>
	        <br>
	        <select name="armazem">
	        	<c:forEach var="armazem" items="${armazens}">
	        		<option value="<c:out value="${armazens.id}" />"><c:out value="${armazens.nome}" /><option>
	        	</c:forEach>
	        </select>
	        <br>
	        <br>
	        <input type="number" id="quantidade-reciclaveis" name="quantidade-reciclaveis" autofocus placeholder="quantidade" maxlength="25"size="20">
	        <br>
	        <br>
	        <button type="submit" name="depositar" id=depositar class="ButtonEntrar">Fazer Deposito</button>
	        <br>
	        <BR>
	        <h2>Faça parte dessa mudança!</h2>
			<Pre>Conecte-se a uma comunidade<br> comprometida com a <br>sustentabilidade e preservação<br> do meio ambiente.</Pre>
        </form>
    </body>
</html>