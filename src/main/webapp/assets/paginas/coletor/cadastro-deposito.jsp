<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../../assets/css/style.css"%></style>
    </head>
    <br>
		<a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
    <body>
    	<%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
    	<form action="inserir-deposito" method="post">
	        <h1> Depósito </h1>
	        <br>
            <h2>Escolha a Data para o Depósito</h2>
	        <input type="date" id="data" name="data" autofocus placeholder="Data para Depositar" maxlength="25" size="20">
	        <br>
	        <br>
	        <h2>Escolha o Armazem</h2>
	        <select name="armazem">
    			<c:forEach var="armazem" items="${armazens}">
        			<option value="${armazem.id}">${armazem.nome}</option>
    			</c:forEach>
			</select>
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
	        <h2>Escolha a Quantidade do Reciclavel</h2>
	        <input type="number" id="quantidade-reciclaveis" name="quantidade-reciclaveis" autofocus placeholder="quantidade" maxlength="25"size="20">
	        <br>
	        <br>
			<button type="submit" name="depositar" id=depositar class="ButtonEntrar">Fazer Deposito</button>
	     </form>
    </body>
</html>