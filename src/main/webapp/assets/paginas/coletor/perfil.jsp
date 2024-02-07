<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Perfil Coletor</title>
		<style><%@include file="../../../resources/css/coletor/perfil.css"%></style>
	</head>
	<body>
        <a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
        <div>
        	<div>
        		<img alt="Imagem do Usuário" src="">
        	</div>
        	<div>
        		<h3>${coletor.nome} ${coletor.sobrenome}</h3>
        	</div>
		    <div class="informacoes-box">
				<h3># ID</h3>
			</div>
			<div class="informacoes-box">
				<h3> Posição </h3>
			</div>
			<div class="informacoes-box">
				<h3> Pontuação </h3>
			</div>
		</div>
        <div style="position: fixed; left: 38vw; top: 0.75vw;" class=conquistas-container>
        	<c:forEach var="conquista" items="${conquistas}">
	        	<div class="image-conquista-box">
					&#127941;
					${conquista.nome}
				</div>
    		</c:forEach>
       	</div>
	</body>
</html>