<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Perfil Coletor</title>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
		<style><%@include file="../../css/coletor/perfil-externo-coletor.css"%></style>
		<style><%@include file="../../css/coletor/menu.css"%></style>
	</head>
	<body>
		<a href="procurar-coletor" >
			<svg>
				<%@ include file="../../images/voltar.jsp" %>
			</svg>
		</a>
		<div class="container-perfil">
			<div class="item-perfil">
				<img src="" alt="foto coletor" class="perfil-coletor">
				<div class="funcao-perfil">
					<a href="ranking-coletor" id=ranking-button>Primeiro</a>
					<span id="pontos-coletor">859Pts</span>    
				</div>
				<div class="nome-coletor">
					<span>${coletor.nome}</span>
					<span>${coletor.sobrenome}</span>
				</div>
				<div class="endereco-coletor"><span>${coletor.endereco.cidade}, SC</span></div>
			</div>
		</div>			
	</body>
</html>