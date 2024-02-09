<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		 <script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
		<style><%@include file="../../../resources/css/style.css"%></style>
    </head>
    <form action="apresentacao">
		<button type="submit" name="voltar" id="voltar"><i class="fa-solid fa-arrow-left" aria-hidden="true"></i></button>
	</form>
    <body>
    	<form action="inserir-reciclavel" method="post">
	        <h1 id="titulo01"> Novo Reciclável </h1>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome do reciclável" maxlength="25" size="20" class="recursosReciclavel">
			<input type="number" id="peso" name="peso" autofocus placeholder="Peso do Reciclável" maxlength="25"size="20" class="recursosReciclavel">
			<br>
			<br>
	        <select name="material" id="material">
    			<c:forEach var="material" items="${materiais}">
        			<option value="${material.id}">${material.nome}</option>
    			</c:forEach>
			</select>
			<input type="number" id="volume" name="volume" autofocus placeholder="Volume do Reciclável (cm³)" maxlength="25"size="20" class="recursosReciclavel">
			<br>
			<br>
			<input type="number" id="pontos-carbono" name="pontos-carbono" autofocus placeholder="Quantidade de pontos" maxlength="25"size="20" class="recursosReciclavel">
	        <input type="text" id="instrucao-reciclavel" name="instrucao-reciclavel" autofocus placeholder="Instrução de depósito" maxlength="25" size="20" class="recursosReciclavel">
			<br>
			<br>
	        <button type="submit" name="cadastrar" id=cadastrar class="ButtonEntrar">Cadastrar Reciclável</button class="recursosReciclavel">
        </form>
    </body>
</html>