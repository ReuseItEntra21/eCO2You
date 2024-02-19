<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Perfil</title>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
		<link rel="stylesheet" href="style.css">
		
	</head>
    <body>
        <a href="perfil-coletor" id=voltar><i class="fa-solid fa-arrow-left" aria-hidden="true"></i></a>
        <form action="atualizar-coletor">
            <h1> Informações </h1>
            <br>
            <div>
                <input type="text" value="${coletor.nome}" id="nome" name="nome" placeholder="Informe seu nome">
                <input type="text" value="${coletor.sobrenome}" id="sobrenome" name="sobrenome" placeholder="Informe seu sobrenome">
                <br>
                <input type="text" value="${coletor.cpf}" id="cpf" name="cpf" placeholder="Informe seu CPF">
                <input type="email" value="${coletor.email}" id="email" name="email" placeholder="Informe seu Email">
                <br>
                <input type="tel" value="${coletor.endereco.telefone}" id="telefone" name="telefone" placeholder="Informe seu telefone">
                <input type="text" value="${coletor.senha}" id="senha" name="senha" placeholder="Digite uma senha">
                <br>
                <input type="text" value="${coletor.endereco.cidade}" id="cidade" name="cidade" placeholder="Informe a sua Cidade">
                <input type="text" value="${coletor.endereco.bairro}" id="bairro" name="bairro" placeholder="Informe seu bairro">
                <br>
                <input type="text" value="${coletor.endereco.logradouro}" id="logradouro" name="logradouro" placeholder="Informe seu logradouro">
                <input type="number" value="${coletor.endereco.numeroEndereco}" id="numeroEndereco" name="numeroEndereco" placeholder="Informe o número de residência">
                <br>
                <input type="text" value="${coletor.endereco.tipoVia}" id="tipoVia" name="tipoVia" placeholder="Informe o tipo de via da sua residência">
                <input type="text" value="${coletor.endereco.complemento}" id="complemento" name="complemento" placeholder="Complementos">
                <br>
                </div>
                <div id="cep02"><input type="text" value="${coletor.endereco.cep}" id="cep" name="cep" placeholder="Informe seu CEP"></div>
                <br>
				
                
					<input type="submit" value="Salvar" id="salvar">
					<br>
					<div id="atualizar">
					
					<br>
					<input type="submit" value="Excluir conta" id="excConta">
					<br>
					<input type="submit" value="Atualizar senha" id="AtualizarSenha">
				</div>
                </form> 
                
                <a href="deslogar">deslogar</a>   
    </body>
</html>