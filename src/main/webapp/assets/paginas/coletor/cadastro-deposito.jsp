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
	    <div style="text-align:center;">
			<span class="step"></span>
			<span class="step"></span>
		</div>
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
                    <span> Escolha a Reciclavel </span>
    					<c:forEach var="reciclavel" items="${reciclaveis}">
        					<input type="checkbox" name="reciclavel">${reciclavel.nome}
    					</c:forEach>
					<div>
						<label>Quantidade GarrafaPET</label>
				    	<input type="number" min=1 oninput="this.className = ''" name="quantidade" id=quantidade1>
					</div>
                    <div>
						<label>Quantidade Lata</label>
				    	<input type="number" min=1 oninput="this.className = ''" name="quantidade" id=quantidade2>
					</div>
                    <div>
						<label>Volume GarrafaPET</label>
				    	<input type="number" min=1 oninput="this.className = ''" name="volume" id=volume1>
                        <span>cm³</span>
					</div>
                    <div>
						<label>Volume Lata</label>
				    	<input type="number" min=1 oninput="this.className = ''" name="volume" id=volume2>
                        <span>cm³</span>
					</div>
		<div style="margin-top: 1.5vw;">
				<button type="button" name=avancar id="nextBtn" onclick="nextPrev(1)">Depositar</button>
		</div>
</body>
</html>
