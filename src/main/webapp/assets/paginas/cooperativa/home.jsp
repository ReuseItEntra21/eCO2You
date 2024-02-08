<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style><%@include file="../../../resources/css/style.css"%></style>
</head>
<body>
	<%@ include file="../../../assets/paginas/cooperativa/menu.jsp"%>
	
		<div class="box">
			<div class="flex-container">
				<div class="flex-item">
			        <div>
			        	<img alt="Imagem do Usuário" src="">
			        </div>
			        <div>
			        	<h3>Nome: ${cooperativa.nome} #CNPJ ${cooperativa.cnpj} </h3>
			        </div>
					<div class="informacoes-box">
						<h3> Posição </h3>
					</div>
					<div class="informacoes-box">
						<h3> Pontuação </h3>
					</div>
				</div>
				 <div class=flex-item>
		        	<c:forEach var="retirada" items="${retiradas}">
			        	<div class="deposito-box">
			        		Status: ${retirada.statusDeRetirada}
			        		Data: ${retirada.data}
						</div>
		    		</c:forEach>
		       	</div>
	       	</div>
	       	<button style="float: right;">+</button>
		</div>
</body>
</html>
