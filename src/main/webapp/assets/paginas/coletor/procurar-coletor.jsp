<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../css/coletor/buscar-coletor.css"%></style>
		<style><%@include file="../../css/coletor/menu.css"%></style>
		<style><%@include file="../../css/footer.css"%></style>
    </head>
    <body>
	    <%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
	    <form class="container-search-coletor" action="resultado-procurar-coletor">
	    	<div class="item-search-coletor">
		    	<input type="text" placeholder="Pesquisar Coletor" oninput="this.className = ''" name="pesquisar" id=pesquisar>
		    </div>
		    <div class="button-search-coletor">
		    	<input type="submit">
		    </div>
		</form>
	    <div class="container-coletor">
			<c:forEach var="coletor" items="${coletores}">
				<div class="item-coletor">
			    	<div id="image-coletor">
				    	<img alt="Imagem" src="">
			    	</div>
					<span>${coletor.nome}</span>
					<span>{coletor.pontos} pontos</span>
			    	<a href="perfil-coletor">Ver Perfil</a>
		    	</div>
			</c:forEach>
		</div>
		<%@ include file="../footer.jsp"%>
    </body>
</html>