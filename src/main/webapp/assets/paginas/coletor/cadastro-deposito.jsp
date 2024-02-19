<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Cadastro Depósito</title>
<style><%@include file="../../../assets/css/coletor/cadastro-deposito.css"%></style>
</head>
<body>
	<a href="perfil-coletor" id=voltar>Voltar</a>
				Nova Depósito
					<div>
						<div>
							<label for="deposito">Data de Depósito</label>
					    	<input type="date" oninput="this.className = ''" name="dataDeposito" id=deposito>
						</div>
                        <span> Escolha o Armazem </span>
	        <select name="armazem">
    			<c:forEach var="armazem" items="${armazens}">
        			<option value="${armazem.id}">${armazem.nome}</option>
    			</c:forEach>
                </select>
                    <span> Escolha a Reciclavel </span>
    					<c:forEach var="reciclavel" items="${reciclaveis}">
        					<input type="checkbox" name="reciclavel">${reciclavel.nome}
    					</c:forEach>
					<div>
                    	<c:forEach var="reciclavel" items="${reciclaveis}">
						<label>Quantidade ${reciclavel.nome}</label>
				    	<input type="number" min=1 oninput="this.className = ''" name="quantidade">		   </c:forEach>
					</div>
                    <div>
                    	<c:forEach var="reciclavel" items="${reciclaveis}">
						<label>Volume ${reciclavel.nome}</label>
				    	<input type="number" min=1 oninput="this.className = ''" name="volume">
                        <span>cm³</span>
                        </c:forEach>
					</div>
		<div style="margin-top: 1.5vw;">
        	<form action="inserir-retirada" method="post">
				<button type="button" name=avancar id="nextBtn" onclick="nextPrev(1)">Depositar</button>
            </form>
		</div>
</body>
</html>
