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
		<style><%@include file="../../css/menu.css"%></style>
		<style><%@include file="../../css/coletor/perfil.css"%></style>
	</head>
	<body>
		<%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
		<nav>
				<img src="../../images/eCO2You.svg" alt="logo eco2you" class="eco2you-logo">
				<div class="link-nav-div">
				<a href="" class="link-nav">Menu</a>
				<a href="" class="link-nav">Coletas</a>
				<a href="" class="link-nav">Ranking</a>
				<a href="" class="link-nav">Cadastra-se</a>
				<a href="" class="link-nav">Entrar</a>
				<div class="user-icon"><i class="fa-regular fa-user"></i></div>
			</div>
		</nav>
		<div class="tresPontos-icon"><i class="fa-solid fa-ellipsis"></i></div>
		<div class="container-perfil">
			<div class="item-perfil">
				<img src="../../images/perfil-coletor.svg" alt="foto coletor" class="perfil-coletor">
				<div class="funcao-perfil">
					<a href="/editar-perfil-coletor" id=editarPerfil>Editar Perfil</a>
					<div class="relogio-icon"><i class="fa-regular fa-clock"></i></div>
					<a href="/ranking-coletor" id=ranking>Primeiro</a>
					<span id="pontos-coletor">859Pts</span>    
				</div>
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
		    <span class="Próximo-Depósito">Próximo Depósito</span>
		    <span class="Historico">Histórico</span>
		    <span class="Pendentes">Pendentes</span>
		    <span class="Conquistas">Conquistas</span>
	    </div>
		
	    <div class="container-armazens">
			
			<c:forEach var="armazem" items="${armazens}">
		    	<div class="item-armazens">
					<img src="Mask group.svg" alt="foto armazem" class="armazem-logo">
					<br>
					<div class="posicao-informacao-armazem">
						<span class="informacao-armazem">${armazem.endereco.cep}</span>
						<span class="informacao-armazem" id="endereco-amarzem-numero">${armazem.endereco.numero}</span>
						<br>
						<span class="informacao-armazem">${armazem.endereco.cidade}</span>
						<span class="informacao-armazem" id="endereco-amarzem-bairro">${armazem.endereco.bairro}</span>
						<br>
						<span class="informacao-armazem">${armazem.endereco.tipoVia}</span>
						<span  class="informacao-armazem" id="nome-reciclavel">${itemDeposito.reciclavel.nome}</span>
						<br>
						<span class="informacao-armazem">${armazem.endereco.logradouro}</span>
						<span class="informacao-armazem" id="volume-reciclavel">${itemDeposito.reciclavel.volume}</span>
					</div>
					<div class="nome-armazem"><span>${armazem.nome}</span></div>
		    	</div>
	    	</c:forEach>
	    </div>
	</body>
</html>
