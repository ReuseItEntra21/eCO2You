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
    <br>
		<a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
    <body>
    	<nav>
    	<ul>
    		<li>
			<a href="home-coletor" class="dropbtn" id=home>Home</a>
			</li>
        </ul>
        <ul>
        	<li>
			<a href="depositosPendentes-coletor" class="dropbtn" id=pendentes>Pendentes</a>
			</li>
        </ul>
        <ul>
        	<li>
            <a href="ranking-coletor" class="dropbtn" id=ranking>Ranking</a>
            </li>
        </ul>
        <ul>
        	<li>
            <a href="historicoDepositos-coletor" class="dropbtn" id=historico>Histórico</a>
        	</li>
        </ul>
        <ul>
        	<li>
        	<input type="search" id="consulta-nome" name= lupa placeholder="Buscar Usuário por nome">
        	</li>
        </ul>
        <ul>
        	<li>
            <a href="perfil-coletor" class="dropbtn" id=perfil>Perfil</a>
            </li>
        </ul>    
        <br>
    </nav>
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