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
		<nav>
    	<ul>
    		<li>
			<a href="home-coletor" class="dropbtn" id=home>Home</a>
			</li>
        </ul>
        <ul>
        	<li>
			<a href="depositosPendentes-coletor" class="dropbtn" id=pendentes>Pendentes</a>
			</li>
        </ul>
        <ul>
        	<li>
            <a href="ranking-coletor" class="dropbtn" id=ranking>Ranking</a>
            </li>
        </ul>
        <ul>
        	<li>
            <a href="historicoDepositos-coletor" class="dropbtn" id=historico>Histórico</a>
        	</li>
        </ul>
        <ul>
        	<li>
        	<input type="search" id="consulta-nome" name= lupa placeholder="Buscar Usuário por nome">
        	</li>
        </ul>
        <ul>
        	<li>
            <a href="perfil-coletor" class="dropbtn" id=perfil>Perfil</a>
            </li>
        </ul>    
    </nav>
        <h2> Ranking </h2>
        <h3> &#129351;  1° &#128100; Nome Pontuação Pontos </h3>
        <h3> &#129352;  2° &#128100; Nome Pontuação Pontos </h3>
        <h3> &#129353;  3° &#128100; Nome Pontuação Pontos </h3>
        <h2> Seu Nível de Elo </h2>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem1>
        <h2> Depósitos Recentes </h2>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem2 >
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar1 >
					<b>EXCLUIR</b>
					</button>
				<br>
				<input type="date" id="data1" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa1>
        <br>
        <br>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem3 >
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar2 >
					<b>EXCLUIR</b>
					</button>
				<br>
				<input type="date" id="data2" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa2>
        <h2> Depósitos à Serem Aceitos </h2>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem3 >
				2x latinhas de 220ml
                <br>
				<br>
				<input type="date" id="data3" name="dataDeposito">
                <br>
                <br>
				<input type="text" placeholder="Empresa" name="empresa" id=empresa3>
                <br>
                <br>
                <button type="button" class="buttonDelete" name="deletar" id=deletar3 >
					<b>EXCLUIR</b>
					</button>
        <br>
        <br>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem4 >
				2x latinhas de 220ml
                <br>
				<br>
				<input type="date" id="data4" name="dataDeposito">
                <br>
                <br>
				<input type="text" placeholder="Empresa" name="empresa" id=empresa4>
                <br>
                <br>
                <button type="button" class="buttonDelete" name="deletar" id=deletar4>
					<b>EXCLUIR</b>
					</button>
        <h2>Conquistas Recentes </h2>
        
        <c:forEach var="deposito" items="${depositos}">
        			<h3>Armazem:</h3>
        			<p>${deposito.armazem}</p>
        			<br>
        			<h3>Data:</h3>
        			<p>${deposito.data}</p>
        			<br>
        			<h3>Reciclavel:</h3>
        			<p>${deposito.reciclavel}</p>
        			<br>
        			<h3>Quantidade do Reciclavel:</h3>
        			<p>${deposito.quantidadeReciclaveis}</p>
    	</c:forEach>
    			
        <a href="cadastro-deposito" class="dropbtn" id=voltar><h2>+</h2></a>
	</body>
</html>