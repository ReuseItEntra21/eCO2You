<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Perfil Coletor</title>
		<style><%@include file="../../../resources/css/coletor/perfil.css"%></style>
	</head>
	<body>
    	<div>
        <a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
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
			<a href="editar-perfil-coletor" class="dropbtn" id=pendentes>Editar Perfil</a>
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
        <br>
    </nav>
		    <div>
		    	<h2> Nome </h2>
				<h3>${coletor.nome}</h3>
				<br>
				<h2> Sobrenome </h2>	
				<h3>${coletor.sobrenome}</h3>
				<br>
				<h2> CPF </h2>
				<h3>${coletor.cpf}</h3>
				<br>
				<h2> Data de Nascimento </h2>
				
			</div>
	        <div class="informacoes-box">
				<h3># ID</h3>
			</div>
			<div class="informacoes-box">
				<h3> Posição </h3>
			</div>
			<div class="informacoes-box">
				<h3> Pontuação </h3>
			</div>
        </div>
        <div style="position: fixed; left: 38vw; top: 0.75vw;" class=conquistas-container>
        	<c:forEach var="conquista" items="${conquistas}">
	        	<div class="image-conquista-box">
					&#127941;
					${conquista.nome}
				</div>
    		</c:forEach>
       	</div>
	</body>
</html>