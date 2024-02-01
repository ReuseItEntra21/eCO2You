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
    <form action="apresentacao">
		<button type="submit" name="voltar" id=voltar>Voltar</button>
	</form>
    <body>
    	  <form action="inserir-reciclavel" method="post">
    <h1 class="h1-font-60"> Novo Reciclável </h1>
    <br>
    <br>
    <h2 class="h2-mini-name"> Nome do Reciclável </h2>
    <input type="text" id="nomeReciclável" name="nome" autofocus placeholder="Nome do reciclável" maxlength="25" size="20">
    <br>
    <br>
    <h2 class="h2-mini-name"> Escolha o Material  </h2>
    <select name="material" id="escolher-material">
    <c:forEach var="material" items="${materiais}">
        <option value="${material.id}">${material.nome}</option>
    </c:forEach>
</select>
    <br>
    <br>
    <h2 class="h2-mini-name"> Pontos do Reciclável </h2>
    <input type="number" id="pontos-carbono" name="pontos-carbono" autofocus placeholder="Quantidade de pontos" maxlength="25"size="20">
    <br>
    <br>
    <h2 class="h2-mini-name"> Peso do Reciclável </h2>
    <input type="number" id="peso-reciclavel" name="peso" autofocus placeholder="Peso do Reciclável" maxlength="25"size="20">
    <br>
    <br>
    <h2 class="h2-mini-name"> Volume do Reciclável </h2>
    <input type="number" id="volume-reciclavel" name="volume" autofocus placeholder="Volume do Reciclável (cm³)" maxlength="25"size="20">
    <br>
    <br>
    <h2 class="h2-mini-name"> Instrução Para o Depósito </h2>
    <input type="text" id="instrucao-reciclavel" name="instrucao-reciclavel" autofocus placeholder="Instrução de depósito" maxlength="25" size="20">
    <br>
    <br>
    <br>
    <br>
    <button type="submit" name="cadastrar" id="cadastrar-reciclavel" class="ButtonEntrar">Cadastrar Reciclável</button>
  </form>
    </body>
</html>