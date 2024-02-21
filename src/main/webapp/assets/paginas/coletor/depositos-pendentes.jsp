<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pendentes</title>
</head>
<body>
<br>
<a href="home-coletor" id="voltar">Voltar</a>

<form action="principal-coletor">
    <h2>DEPÓSITOS A SEREM ACEITOS</h2>
    <c:forEach var="deposito" items="${listaDepositosAceitos}">
        <div>
            <input type="image" src="caminho/da/imagem.jpg" name="imagem" id="imagem1">
            ${deposito.quantidade}x ${deposito.tipo}

            <br>
            <input type="date" id="data" name="dataDeposito" value="${deposito.data}">
            <input type="text" placeholder="Empresa" name="empresa" id="empresa" value="${deposito.empresa}">
        </div>
    </c:forEach>

    <h2>DEPÓSITOS AGENDADOS</h2>
    <c:forEach var="deposito" items="${listaDepositosAgendados}">
        <div>
            <input type="image" src="caminho/da/imagem.jpg" name="imagem" id="imagem1">
            ${deposito.quantidade}x ${deposito.tipo}

            <br>
            <input type="date" id="data" name="dataDeposito" value="${deposito.data}">
            <input type="text" placeholder="Empresa" name="empresa" id="empresa" value="${deposito.empresa}">
        </div>
    </c:forEach>
</form>
<br>
<a href="cadastro-deposito" class="dropbtn" id="voltar">Criar Depósito</a>

</body>
</html>
