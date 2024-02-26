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
			<div>
				<img src="#" alt="Imagem Perfil" name="imagem" id=imagem1> <span>${armazem.nome}</span>
				<span>${armazem.horarioAbertura} -
					${armazem.horarioFechamento}</span> <span>${armazem.endereco.tipoVia}
					${armazem.endereco.logradouro}</span> <span>${armazem.endereco.bairro}</span>
				<span>${armazem.endereco.numeroEndereco}</span> <span>${armazem.endereco.cidade},
					SC</span>
			</div>
			<div>
				<span>${armazem.statusArmazem}</span> <a href="editar-perfil-armazem"
					id=editarPerfil>Editar Perfil</a> <img src="#" name=imagem
					id=imagem2>
			</div>
			<div class="container-select">
				<div class="item-select">Depósitos pendentes</div>
				<div class="item-select">Retiradas pendentes</div>
				<div class="item-select">Histórico de depósitos</div>
				<div class="item-select">Histórico de retiradas</div>
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
