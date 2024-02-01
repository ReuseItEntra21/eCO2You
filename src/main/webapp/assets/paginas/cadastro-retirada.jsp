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
	        	<button type="button" name="voltar" id=voltar>Voltar</button>
			</form>
    <body>
    	<form action="inserir-retirada" method="post">
	        <h1> Nova Retirada </h1>
	        <br>
	        <br>
	        <h1> Insira a Data da Retirada</h1>
	        <input type="date" id="data" name="data" autofocus placeholder="Data para Depositar" maxlength="25" size="20">
	        <br>
	        <br>
	        <h2> Escolha o Armazem </h2>
	        <select name="armazem">
	        	<c:forEach var="armazem" items="${armazens}">
	        		<option value="<c:out value="${armazens.id}" />"><c:out value="${armazens.nome}" /><option>
	        	</c:forEach>
	        </select>
	        <br>
	        <br>
	        <h2> Escolha o Material </h2>
	        <select name="material">
	        	<c:forEach var="material" items="${materiais}">
	        		<option value="<c:out value="${materiais.id}" />"><c:out value="${materiais.nome}" /><option>
	        	</c:forEach>
	        </select>
	        <br>
	        <br>
	        <h2> Insira o Peso que Deseja Retirar daquele Material</h2>
	        <input type="number" id="peso" name="peso" autofocus placeholder="Peso em Quilogramas" maxlength="25" size="20">
	        <br>
	        <br>
	        <button type="submit" name="depositar" id=depositar class="ButtonEntrar">Fazer Retirada</button>
	        <br>
	        <BR>
	        <h2>Faça parte dessa mudança!</h2>
			<Pre>Conecte-se a uma comunidade<br> comprometida com a <br>sustentabilidade e preservação<br> do meio ambiente.</Pre>
        </form>
    </body>
</html>