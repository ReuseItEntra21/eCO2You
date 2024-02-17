<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Perfil Coletor</title>
		<style><%@include file="../../css/menu.css"%></style>
		<style><%@include file="../../css/coletor/perfil.css"%></style>
	</head>
	<body>
		<%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
		<div class="container-perfil">
			<div class="item-perfil">
				<img src="#" alt="Imagem Perfil" name="imagem" id=imagem1>
				<span>${coletor.nome}</span>
				<span>${coletor.sobrenome}</span>
				<span>${coletor.id}</span>
				<span>${coletor.endereco.cidade}, SC</span>
				<span>${coletor.endereco.bairro}</span>
			</div>
			<div class="item-perfil">
				<a href="/editar-perfil-coletor" id=editarPerfil>Editar Perfil</a>
			    <img src="#" name=imagem id=imagem2>
			    <a href="/ranking-coletor" id=ranking>Primeiro</a>
			    <span>859Pts</span>    
			</div>
		</div>
	    <div class="container-select">
		    <div class="item-select"> Próximo Depósito </div>
		    <div class="item-select"> Histórico </div>
		    <div class="item-select"> Pendentes </div>
		    <div class="item-select"> Conquistas </div>
	    </div>
	    <div class="container-armazens">
			<c:forEach var="armazem" items="${armazens}">
		    	<div class="item-armazens">
		    		<img alt="Imagem Armazem" src="" id=imagem2.5>
		    		<span>${armazem.nome}</span>
					<span>${armazem.endereco.cep}</span>
					<span>${armazem.endereco.cidade}</span>
					<span>${armazem.endereco.tipoVia}</span>
					<span>${armazem.endereco.logradouro}</span>
					<span>Número:</span>
					<span>${armazem.endereco.numero}</span>
					<span>${armazem.endereco.bairro}</span>
					<c:forEach var="itemDeposito" items="${armazens}">
						<span>${itemDeposito.quantidadeReciclavel}</span>
						<span>${itemDeposito.reciclavel.nome}</span>
						<span>${itemDeposito.reciclavel.volume}</span>
	            	</c:forEach> 
		    	</div>
	    	</c:forEach>
	    </div>
	</body>
</html>
