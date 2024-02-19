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
	    <%@ include file="../../../assets/paginas/cooperativa/menu.jsp"%>
	    <div class="text-box">
	    	<span> Armazéns</span>
		    <span>Encontre o melhor ponto de entrega para você</span>
	    </div>
	    <form class="container-search-armazem" action="resultado-procurar-armazem">
	    	<div class="item-search-armazem">
		    	<input type="text" placeholder="Pesquisar Armazém" oninput="this.className = ''" name="pesquisar" id=pesquisar>
		    </div>
		    <div class="button-search-armazem">
		    	<input type="submit">
		    </div>
		</form>
	    <div class="container-armazem">
			<c:forEach var="armazem" items="${armazens}">
				<div class="item-armazem">
			    	<div id="image-armazem">
				    	<img alt="Imagem" src="">
			    	</div>
					<span id="nome-armazem">${armazem.nome}</span>
					<span>${armazem.endereco.cidade}</span>
			    	<span>${armazem.endereco.bairro}</span>
			    	<p>${armazem.endereco.tipoVia} ${armazem.endereco.logradouro} ${armazem.endereco.numeroEndereco}</p>
			    	<a href="cadastro-deposito">Faça um Depósito</a>
		    	</div>
			</c:forEach>
		</div>
		<%@ include file="../footer.jsp"%>
    </body>
</html>