<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Depositos</title>
<style><%@include file="../../css/armazem/depositos-agendados.css"%></style>
</head>
<body>
	<div>
		<a href="perfil-armazem" id="voltar">
			<svg>
				<%@include file="../../images/voltar.jsp"%>
			</svg>
		</a>
	    <div class="container-depositos">
		    <h2> Depósitos á serem aceitos </h2>
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
		 <h2> Depósitos Agendados </h2>
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