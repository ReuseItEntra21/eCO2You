<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Perfil Armazem</title>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="tresPontos-icon"><i class="fa-solid fa-ellipsis"></i></div>
		<div class="container-perfil">
			<div class="item-perfil">
				<div class="funcao-perfil">
					<div class="relogio-icon"><i class="fa-regular fa-clock"></i></div>
				</div>
				<div class="nome-armazem">
					<img src="#" alt="Imagem Perfil" name="imagem" id=imagem1>
				</div>
				<div class="nome-armazem">
					<span>${armazem.nome}</span>
				</div>
				<div class="status-armazem">
              		<span>${armazem.horarioAbertura} - ${armazem.horarioFechamento}</span>
				</div>
				<div class="endereco-armazem">
					<span>${armazem.endereco.tipovia} ${armazem.endereco.logradouro}</span>
              		<span>${armazem.endereco.bairro}</span>
             		<span>${armazem.endereco.numeros}</span>
              		<span>${armazem.endereco.cidade}, SC</span>
              	</div>>
			</div>
		</div>			
	</body>
</html>


             
          