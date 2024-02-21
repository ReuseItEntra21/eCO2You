<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
    </head>
    <br>
   <a href="perfil-cooperativa" class="dropbtn" id=voltar>Voltar</a>
    <body>
	     <a href="perfil-coletor" id=voltar>Voltar</a>
		<div class="container-cadastro">
			<form action="inserir-retirada">
				<span>Nova Retirada</span>
				<div>
					<label for="retirada">Data da Retirada</label>
					<input type="date" oninput="this.className = ''" name="data" id=retirada>
				</div>
				<div>
					<label for="retirada">Armazém</label>
					<input type="text" value="${armazem.id}" name="id">
				</div>
				<div>
					<label> Escolha o Reciclavel </label>
					<select name="reciclavel">
				    	<c:forEach var="reciclavel" items="${reciclaveis}">
				        	<option value="${reciclavel.id}">${reciclavel.nome}</option>
				    	</c:forEach>
			    	</select>
				</div>
				<div>
					<label>Quantidade</label>
					<input type="number" oninput="this.className = ''" name="quantidade-reciclavel" id=deposito>
				</div>
				<div>
					<button type="submit">Agendar</button>
				</div>
			</form>
		</div>
    </body>
</html>