<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

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
	        <h2> Insira a Data do Depósito </h2>    
	        <input type="date" id="data" name="data" autofocus placeholder="Data para Depositar" maxlength="25" size="20">
	        <br>
	        <br>
	        <h2>Escolha o Reciclável</h2>
	        <select name="reciclavel">
    			<c:forEach var="reciclavel" items="${reciclaveis}">
        			<option value="${reciclavel.id}">${reciclavel.nome}</option>
    			</c:forEach>
			</select>
	        <br>
	        <br>
	        <h2>Escolha o Armazem</h2>
	        <select name="armazem">
    			<c:forEach var="armazem" items="${armazens}">
        			<option value="${armazem.getId()}">${usuario.nome}</option>
    			</c:forEach>
			</select>
	        <br>
	        <br>
	        <h2>Escolha a Quantidade do Reciclavel</h2>
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