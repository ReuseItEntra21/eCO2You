<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Ranking</title>
		<style><%@include file="../../../assets/css/coletor/ranking.css"%></style>
	</head>
	<body>
		<%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
        <br>
        <br>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem1>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem2>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem3>
        <div class="container-ranking">
        <div class="item-coletor"><h3> &#129351;  1° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3> &#129352;  2° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3> &#129353;  3° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3>4° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3>5° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3>6° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3>7° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3>8° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3>9° &#128100; Nome Pontuação Pontos </h3></div>
       	<div class="item-coletor"><h3>10° &#128100; Nome Pontuação Pontos </h3></div>
        <div class="item-coletor"><h3>N° &#128100; ${usuario.nome} ??? Pontos </h3></div>
        </div>
	</body>
</html>