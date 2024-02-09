<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
		<style><%@include file="../../../resources/css/style.css"%></style>
    </head>
    <form action="apresentacao">
		<button type="submit" name="voltar" id="voltar"><i class="fa-solid fa-arrow-left" aria-hidden="true"></i></button>
	</form>
    <body>
    	<form action="inserir-conquista" method="post">
	        <h1 id="h1Titulo"> Nova Conquista </h1>
	        <br>
	        <br>
	        <div class="h2InDiv">
				<h2> Nome da Conquista </h2>
			</div>
	        <input type="text" id="nome" name="nome" autofocus placeholder="Nome da Conquista" maxlength="25"size="15" class="nomeIpontosIdescricao">
	        <br>
	        <br>
	        <div class="h2InDiv">
				<h2> Pontos da Conquista </h2>
			</div>
	        <input type="number" id="pontos" name="pontos" autofocus placeholder="Pontos da Conquista" maxlength="25"size="15" class="nomeIpontosIdescricao">
	        <br>
	        <br>
	        <input type="text" id="descricao" name="descricao" autofocus placeholder="Descrição da Conquista" maxlength="25"size="15" class="nomeIpontosIdescricao">
	        <br>
	        <br>
	        <div><button type="submit" name="cadastrar" id=cadastrar class="ButtonEntrar">Cadastrar Conquista</button></div>
        </form>
    </body>
</html>