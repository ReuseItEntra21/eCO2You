<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Perfil Coletor</title>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
		<style><%@include file="../../css/coletor/perfil.css"%></style>
		<style><%@include file="../../css/coletor/menu.css"%></style>
	</head>
	<body>
		<%@include file="menu.jsp"%>
		<div class="container-perfil">
			<div class="item-perfil">
				<img src="" alt="foto coletor" class="perfil-coletor">
				<div class="nome-coletor">
					<span>${coletor.nome}</span>
					<span>${coletor.sobrenome}</span>
				</div>
				<div class="id-coletor"><span>${coletor.id}</span></div>
				<div class="endereco-coletor"><span>${coletor.endereco.cidade}, SC</span></div>
				<div class="coletor-bairro"><span>${coletor.endereco.bairro}</span></div>
			</div>
		</div>
	    <div class="container-select">
		    <a href="proximos-depositos">Próximo Depósito</a>
		    <a href="historico-depositos-coletor">Histórico</a>
		    <a href="depositos-pendentes-coletor">Pendente</a>
		    <a href="conquistas-coletor">Conquista</a>
	    </div>
	</body>
</html>
