<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Perfil</title>
		<script src="https://kit.fontawesome.com/9b206050e6.js" crossorigin="anonymous"></script>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
    <body>
    <br>
	        <br>
	    <form action="atualizar-armazem">
	    <button type="submit" name="voltar" id="voltar"><i class="fa-solid fa-arrow-left" aria-hidden="true"></i></button>
			<h1> Informações </h1>
					<div>
					<input type="text" value="<c:out value='${armazem.nome}' />" id="nome" name="nome" autofocus placeholder="Informe o seu Nome"">
					<input type="number" value="<c:out value='${armazem.endereco.cep}' />" id="cep" name="cep" placeholder="Informe o seu CEP">
					<br>
					<input type="email" value="<c:out value='${armazem.email}' />" id="email" name="email" placeholder="Informe o seu Email">
					<input type="text" value="<c:out value='${armazem.cnpj}' />" id="cnpj" name="cnpj" placeholder="Informe o seu CNPJ">
					<br>
					<input type="tel" value="<c:out value='${armazem.endereco.telefone}' />" id="telefone" name="telefone" placeholder="Informe o seu Telefone">
					<input type="number" value="<c:out value='${armazem.endereco.numeroEndereco}' />" id="numeroEndereco" name="numeroEndereco" placeholder="Informe o Número">
					<br>
					<input type="text" value="<c:out value='${armazem.senha}' />" id="senha" name="senha" placeholder="Informe a Senha">
					<input type="text" value="<c:out value='${armazem.endereco.cidade}' />" id="cidade" name="cidade" placeholder="Informe a sua Cidade">
								<br>
					<input type="time" value="<c:out value='${armazem.horarioAbertura}' />" id="horarioAbertura" name="horarioAbertura" placeholder="Informe o seu Horario de Abertura">
								<input type="text" value="<c:out value='${armazem.endereco.bairro}' />" id="bairro" name="bairro" placeholder="Informe o seu Bairro">
								<br>
					<input type="time" value="<c:out value='${armazem.horarioFechamento}' />" id="horarioFechamento" name="horarioFechamento" placeholder="Informe o seu Horario de Fechamento">
					<input type="text" value="<c:out value='${armazem.endereco.logradouro}' />" id="logradouro" name="logradouro" placeholder="Informe o Logradouro">
					<br>
					<input type="number" value="<c:out value='${armazem.capacidadeArmazenagem}' />" id="capacidadeArmazenagem" name="capacidadeArmazenagem" placeholder="Informe o Número">
					<input type="text" value="<c:out value='${armazem.endereco.complemento}' />" id="complemento" name="complemento" placeholder="Informe o complemento">
				</div>
		    <br>
		    <input type="submit" value="Salvar" id="salvar">
	    </form>
    </body>
</html>