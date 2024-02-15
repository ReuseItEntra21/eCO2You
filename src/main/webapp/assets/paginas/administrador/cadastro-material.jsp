<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>/style>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
    </head>
    <body>
 		<div>
            <h2>Cadastrar Material</h2>
        </div>
            <div class="box">
                        <h1> NOVO MATERIAL </h1>
                        <h4>Nome</h4>
                    <form action="inserir-material" method="post">
                        <div class="nome_material"><input type="text" id="nome_material" name="nome" autofocus maxlength="25"size="35"></div>
                        <div class="cadastrar_material"><button type="submit" name="cadastrar" id=cadastrar class="ButtonEntrar">Cadastrar material</button></div>
                    </form>
            </div>
    </body>
</html>