<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Perfil Armazem</title>
		<style><%@ include file="../../css/armazem/menu.css"%></style>
		<style><%@ include file="../../css/armazem/perfil.css"%></style>
	</head>
	<body>
		<%@ include file="../../../assets/paginas/armazem/menu.jsp"%>
			<div>
				<div class="item-perfil">
						<svg id="foto-armazem">
							<%@include file="../../images/perfil.jsp"%>
						</svg>
						<div class="vl"></div>
					<div class="nome-armazem">
						<span>${armazem.nome}</span>
					</div>
					<div id="item-horario"><span>${armazem.horarioAbertura} - ${armazem.horarioFechamento}</span></div>
					<div id="item-logradouro"><span>${armazem.endereco.tipoVia} ${armazem.endereco.logradouro}</span></div>
					<div id="item-bairro"><span>${armazem.endereco.bairro}</span></div>
					<div id="item-numeroEndereco"><span>${armazem.endereco.numeroEndereco}</span></div>
					<div id="item-cidade"><span>${armazem.endereco.cidade}, SC </span></div>
					<div id="item-status"><span>${armazem.statusArmazem}</span></div>
			</div>
			<div class="container-depositos">
				<span> Depósitos á serem aceitos </span>
				<c:forEach var="deposito" items="${depositos}">
					<img src="#" alt="Imagem ItemDeposito" name="imagem" id=imagem7>
					<c:forEach var="itemDeposito" items="${itemDepositos}">
						<span>${itemDeposito.quantidadeReciclaveis}</span>
						<span>${itemDeposito.reciclavel.nome}</span>
						<span>${itemDeposito.reciclavel.volume}</span>
					</c:forEach>
					<span>${deposito.data}</span>
					<button type=submit>Aceitar</button>
					<button type=button>Rejeitar</button>
				</c:forEach>
				<span> Depósitos Agendados </span>
				<c:forEach var="deposito" items="${depositos}">
					<img src="#" alt="Imagem ItemDeposito" name="imagem" id=imagem8>
					<c:forEach var="itemDeposito" items="${itemDepositos}">
						<span>${itemDeposito.quantidadeReciclaveis}</span>
						<span>${itemDeposito.reciclavel.nome}</span>
						<span>${itemDeposito.reciclavel.volume}</span>
					</c:forEach>
					<span>${deposito.data}</span>
					<span>${deposito.coletor}</span>
					<button type=button>Excluir</button>
				</c:forEach>
			</div>
		</div>
	</body>
</html>
