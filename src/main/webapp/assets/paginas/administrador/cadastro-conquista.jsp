<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
    </head>
    <body>
    	<form action="inserir-conquista" method="post">
        <h2> Nova Conquista </h2>
	        <h1 id="h1Titulo"> NOVA CONQUISTA </h1>
	        <div class="h2InDiv">
            <h4> Nome </h4>
			</div>
	        <input type="text" id="nome" name="nome" autofocus maxlength="25"size="15" class="nomeIpontosIdescricao">
	        <div class="h2InDiv">
				<h4> Pontos da conquista </h4>
			</div>
	        <input type="number" id="pontos" name="pontos" autofocus maxlength="25"size="15" class="nomeIpontosIdescricao">
			<div class="h2InDiv">
				<h4> Descrição da conquista </h4>
			</div>
	        <input type="text" id="descricao" name="descricao" autofocus  maxlength="25"size="15" class="nomeIpontosIdescricao">
	        <div><button type="submit" name="cadastrar" id=cadastrar class="ButtonEntrar">Cadastrar Conquista</button></div>
        </form>
    </body>
</html>