<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<style><%@include file="../../../resources/css/coletor/home.css"%></style>
	</head>
	<body>
		<%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
		<div class="box">
			<div class="flex-container">
				<div class="flex-item">
			        <div>
			        	<img alt="Imagem do Usuário" src="">
			        </div>
			        <div>
			        	<h3>${coletor.nome} ${coletor.sobrenome} ${coletor.dataNascimento}</h3>
			        </div>
					<div class="informacoes-box">
						<h3># ${coletor.id} </h3>
					</div>
					<div class="informacoes-box">
						<h3> Posição </h3>
					</div>
					<div class="informacoes-box">
						<h3> Pontuação </h3>
					</div>
				</div>
				 <div class=flex-item>
		        	<c:forEach var="deposito" items="${depositos}">
			        	<div class="deposito-box">
			        		Status: ${deposito.statusDeDeposito}
			        		Data: ${deposito.data}
						</div>
		    		</c:forEach>
		       	</div>
				<div class=flex-item>
		        	<c:forEach var="conquista" items="${conquistas}">
			        	<div class="conquista-box">
			        		<div class="image-conquista-box">
			        			&#127941;
			        		</div>
							${conquista.nome}
						</div>
		    		</c:forEach>
		       	</div>
	       	</div>
	       	<button style="float: right;">+</button>
		</div>
	</body>
</html>