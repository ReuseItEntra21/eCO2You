<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<link rel="preconnect" href="https://fonts.googleapis.com">
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
		<link href="https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,200..1000;1,200..1000&family=Poppins&family=Raleway:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
		<meta charset="UTF-8">
		<title>Editar Perfil</title>
		<style><%@include file="../../../assets/css/coletor/editar-perfil.css"%></style>
	</head>
    <body>
        <div class="container-form">
        	<div class="item-form">
	        	<div  class="container-head">
	        		<div class="item-head">
	        			<span>Editar Perfil</span>
	        		</div>
	        		<div class="item-head">
	        			<div id="back">
	        				<a href="perfil-coletor" id="voltar"><svg><%@include file="../../images/xmark.jsp"%></svg></a>
	        			</div>
	        		</div>
	        	</div>
	        	<form action="atualizar-coletor">
					<div class="container-inputs">
						<input type="text" value="${coletor.nome}"id="nome" name="nome" placeholder="Informe seu nome">
						<input type="text" value="${coletor.sobrenome}" id="sobrenome" name="sobrenome" placeholder="Informe seu sobrenome">
				        <input type="text" value="${coletor.cpf}" id="cpf" name="cpf" placeholder="Informe seu CPF">
				        <input type="email" value="${coletor.email}" id="email" name="email" placeholder="Informe seu Email">
				        <input type="tel" value="${coletor.endereco.telefone}" id="telefone" name="telefone" placeholder="Informe seu telefone">
				        <input type="text" value="${coletor.senha}" id="senha" name="senha" placeholder="Digite uma senha">
				        <input type="text" value="${coletor.endereco.cidade}" id="cidade" name="cidade" placeholder="Informe a sua Cidade">
				        <input type="text" value="${coletor.endereco.bairro}" id="bairro" name="bairro" placeholder="Informe seu bairro">
				        <input type="text" value="${coletor.endereco.logradouro}" id="logradouro" name="logradouro" placeholder="Informe seu logradouro">
				        <input type="number" value="${coletor.endereco.numeroEndereco}" id="numeroEndereco" name="numeroEndereco" placeholder="Informe o número de residência">
				        <input type="text" value="${coletor.endereco.tipoVia}" id="tipoVia" name="tipoVia" placeholder="Informe o tipo de via da sua residência">
				        <input type="text" value="${coletor.endereco.complemento}" id="complemento" name="complemento" placeholder="Complementos">
				        <input type="text" value="${coletor.endereco.cep}" id="cep" name="cep" placeholder="Informe seu CEP">
			        </div>
				</form>
	        </div>
	        <div class="item-form" id="button">
	        	<input type="submit" value="Salvar" id="salvar">
	        </div>
        </div>
		<div>
			<a href="deslogar" id="deslogar">Deslogar</a>
			<a href="deletar-coletor" id="excuir">Excluir Conta</a>
			<a href="recuperar-senha" id="recuperar">Atualizar Senha</a>
		</div> 
    </body>
</html>