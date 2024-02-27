<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Retiradas</title>
<style><%@include file="../../css/armazem/retiradas-agendadas.css"%></style>
</head>
<body>
	<div>
		<a href="perfil-armazem" id="voltar">
			<svg>
				<%@include file="../../images/voltar.jsp"%>
			</svg>
		</a>
	    <div class="container-retiradas">
		    <h2> Retiradas á serem aceitas </h2>
		    <c:forEach var="retirada" items="${retiradas}">
		        <img src="#" alt="Imagem ItemRetirada" name="imagem" id=imagem7>
		        <c:forEach var="itemRetirada" items="${itemRetiradas}">
		            <span>${itemRetirada.material.nome}</span>
                  <span>${itemRetirada.peso}</span>
		        </c:forEach>
		        <span>${retirada.data}</span>
		        <button type=submit>Aceitar</button>
		        <button type=button>Rejeitar</button>
		    </c:forEach>
		 <h2> Retiradas Agendadas </h2>
          <c:forEach var="retirada" items="${retiradas}">
              <img src="#" alt="Imagem ItemRetirada" name="imagem" id=imagem8>
              <c:forEach var="itemRetirada" items="${itemRetiradas}">
                  <span>${itemRetirada.material.nome}</span>
                  <span>${itemRetirada.peso}</span>
              </c:forEach>
              <span>${retirada.data}</span>
              <span>${retirada.cooperativa}</span>
              <button type=button>Excluir</button>
          </c:forEach>
      </div>
   </div>  
</body>
</html>  