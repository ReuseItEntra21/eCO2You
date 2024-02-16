<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../css/coletor/buscar-armazem.css"%></style>
		<style><%@include file="../../css/menu.css"%></style>
		<style><%@include file="../../css/footer.css"%></style>
    </head>
    <body>
	    <%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
	    <div class="text-box">
	    	<span> Armazéns</span>
		    <span>Encontre o melhor ponto de entrega para você</span>
	    </div>
	    <div class="search-armazem">
	    	<input type=search id=search name=search>
	        <span id=resultados>número de resultados</span>
	    </div>
	    <div>
	    	<span>Aceitam</span>
	        <c:forEach var="reciclavel" items="${reciclaveis}">
				    <label>
	        			<input type="checkbox" name="quantidade" value="reciclavel">${reciclavel.nome}
	        		</label>
			</c:forEach>
	    </div>
	    <div class="container-armazem">
			<c:forEach var="armazem" items="${armazens}">
		    	<div class="item-armazem">
		    		<div id="image-armazem">
		    			<img alt="Imagem" src="">
		    		</div>
			    	<span id="nome-armazem">${armazem.nome}</span>
		            <span>${armazem.endereco.tipoVia}</span>
			    	<span>${armazem.endereco.logradouro}</span>
		            <span>${armazem.endereco.bairro}</span>
		            <a href="/cadastro-deposito">Faça um Depósito</a>
		    	</div>
			</c:forEach>
		</div>
		 <%@ include file="../footer.jsp"%>
    </body>
</html>