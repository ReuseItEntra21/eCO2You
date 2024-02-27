<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Pendentes</title>
	    <style><%@include file="../../css/coletor/depositos-pendentes.css"%></style>
	</head>
	<body>
		<a href="perfil-armazem" id="voltar"><svg><%@include file="../../images/voltar.jsp"%></svg></a>
		<div class="container-depositos">
			<div class="title">
				<span>Depósitos Agendados</span>
			</div>
			<div class="depositos-agendados">
				<c:forEach var="deposito" items="${depositosAgendados}">
					<div class="item-deposito-agendado">
						<div class="info">
							<svg class="foto-armazem">
								<%@include file="../../images/perfil.jsp"%>
							</svg>
							<div class="vl"></div>
							<div class="depdoisosito-info">
								<p>Depósito #${deposito.id}</p>
								<p>${deposito.coletor.nome}</p>
								<p>Data: ${deposito.data}</p>
							</div>
						</div>
						<p>Resumo:</p>
						<div class="resumo-info">
							<c:forEach var="itemDeposito" items="${deposito.itensDeposito}">		
								${itemDeposito.quantidadeReciclaveis}x ${itemDeposito.reciclavel.nome} ${itemDeposito.reciclavel.volume}ml		
							</c:forEach>
						</div>
						<div>
							<a href="atualizar-deposito?id=<c:out value='${deposito.id}'/>&coletor_id=<c:out value='${deposito.coletor.id}'/>&status=CONCLUIDO">Finalizar</a>
						</div>
					</div>
				</c:forEach>
			</div>
			<div class="title">
				<span>Depósitos Pendentes</span>
			</div>
			<div class="depositos-pendentes">
				<c:forEach var="deposito" items="${depositosPendentes}">
					<div class="item-deposito-agendado">
						<div class="info">
							<svg class="foto-armazem">
								<%@include file="../../images/perfil.jsp"%>
							</svg>
							<div class="vl"></div>
							<div class="deposito-info">
								<p>Depósito #${deposito.id}</p>
								<p>Coletor: ${deposito.coletor.nome}</p>
								<p>Data: ${deposito.data}</p>
							</div>
						</div>
						<p>Resumo:</p>
						<div class="resumo-info">
							<c:forEach var="itemDeposito" items="${deposito.itensDeposito}">		
								${itemDeposito.quantidadeReciclaveis}x ${itemDeposito.reciclavel.nome} ${itemDeposito.reciclavel.volume}ml		
							</c:forEach>
						</div>
						<div>
							<a href="atualizar-deposito?id=<c:out value='${deposito.id}'/>&coletor_id=<c:out value='${deposito.coletor.id}'/>&status=AGENDADO">Aceitar</a>
							<a href="deletar-deposito?id=<c:out value='${deposito.id}'/>">Rejeitar</a>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</body>
</html>