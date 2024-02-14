<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		 <script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
		<style><%@include file="../../css/administrador/cadastro-reciclavel.css"%></style>
    </head>
    <form action="apresentacao">
		<button type="submit" name="voltar" id="voltar"><i class="fa-solid fa-arrow-left" aria-hidden="true"></i></button>
	</form>
    <body>
    	<div class="container">
    		<form action="inserir-reciclavel" method="post">
	        <h1 id="titulo01"> Novo Reciclável </h1>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome do reciclável" class="recursosReciclavel">
			<input type="number" id="peso" name="peso" autofocus placeholder="Peso do Reciclável" class="recursosReciclavel">
	        <select name="material" id="material">
    			<c:forEach var="material" items="${materiais}">
        			<option value="${material.id}">${material.nome}</option>
    			</c:forEach>
			</select>
			<input type="number" autofocus placeholder="Volume do Reciclável (ml)">
			<input type="number" autofocus placeholder="Quantidade de pontos">
	        <input type="text" autofocus placeholder="Instrução de depósito">
	        <button type="submit" >Cadastrar Reciclável</button>
        </form>
    	</div>
    </body>
</html>