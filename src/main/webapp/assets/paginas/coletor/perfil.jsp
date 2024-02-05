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
		<div>
		    <form action="home-coletor">
		   		<button type="submit" name="voltar" id=voltar>Voltar</button>
		    </form>
		    <form action="editarPerfil-coletor">
		   		<button type="submit" name="editar" id=editar>Editar Perfil</button>
		    </form>
		    <div>
		    	<h2> Nome </h2>
				<h3>${coletor.nome}</h3>
				<br>
				<h2> Sobrenome </h2>	
				<h3>${coletor.sobrenome}</h3>
				<br>
				<h2> CPF </h2>
				<h3>${coletor.cpf}</h3>
				<br>
				<h2> Data de Nascimento </h2>
				<h3>${coletor.dataNascimento}</h3>
				
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