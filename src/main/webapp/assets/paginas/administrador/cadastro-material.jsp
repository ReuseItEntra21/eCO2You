<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
    </head>
   <form action="apresentacao">
		
        <button type="submit" name="voltar" id="voltar"><i class="fa-solid fa-arrow-left" aria-hidden="true"></i></button>
	</form>
    <body>
    	<form action="inserir-material" method="post">
    <h1 id="novo-Material-H1"> Novo Material </h1>
    <br>
    <br>
    <input type="text" id="nome_material" name="nome" autofocus placeholder="Nome do material" maxlength="25"size="35">
    <br>
    <br>
    <button type="submit" name="cadastrar" id=cadastrar class="ButtonEntrar">Cadastrar Material</button>
  </form>
    </body>
</html> 