<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
    </head>
    <br>
   <a href="perfil-cooperativa" class="dropbtn" id=voltar>Voltar</a>
    <body>
	        <span> Nova Retirada </span>
	        <span> Insira a Data da Retirada</span>
	        <input type="date" id="data" name="data" autofocus placeholder="Data para Depositar" maxlength="25" size="20">
	        <span> Escolha o Armazem </span>
	        <select name="armazem">
    			<c:forEach var="armazem" items="${armazens}">
        			<option value="${armazem.id}">${armazem.nome}</option>
    			</c:forEach>
			</select>
			<span> Escolha o Material </span>
    					<c:forEach var="material" items="${materiais}">
        					<input type="radio" name="material">${material.nome}
    					</c:forEach>
	        <span> Insira o Peso que Deseja Retirar daquele Material</span>
	        <input type="number" id="peso" name="peso" autofocus placeholder="Peso em Quilogramas" maxlength="25" size="20">
	    <form action="inserir-retirada" method="post">
	        <button type="submit" name="depositar" id=depositar class="ButtonEntrar">Fazer Retirada</button>
        </form>
    </body>
</html>