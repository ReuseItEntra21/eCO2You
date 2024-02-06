<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Perfil</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
    <body>
    <br>
	        <a href="./perfil-armazem">
				<button type="button" name="voltar" id=voltar>Voltar</button>
			</a>
	        <br>
	        <br>
	    <form action="atualizar-armazem">
			<h1> Informações </h1>
			<br>
		    <input type="text" value="<c:out value='${armazem.nome}' />" id="nome" name="nome" autofocus placeholder="Informe o seu Nome">
		    <br>
		    <input type="text" value="<c:out value='${armazem.cnpj}' />" id="cnpj" name="cnpj" placeholder="Informe o seu CNPJ">  
		    <br>
		    <input type="email" value="<c:out value='${armazem.email}' />" id="email" name="email" placeholder="Informe o seu Email">
		    <br>
		    <input type="number" value="<c:out value='${armazem.capacidadeArmazenagem}' />" id="capacidadeArmazenagem" name="capacidadeArmazenagem" placeholder="Informe o Número">
		    <br>
		    <input type="time" value="<c:out value='${armazem.horarioAbertura}' />" id="horarioAbertura" name="horarioAbertura" placeholder="Informe o seu Horario de Abertura">  
		    <br>
		    <input type="time" value="<c:out value='${armazem.horarioFechamento}' />" id="horarioFechamento" name="horarioFechamento" placeholder="Informe o seu Horario de Fechamento">  
		    <br>
		    <input type="tel" value="<c:out value='${armazem.endereco.telefone}' />" id="telefone" name="telefone" placeholder="Informe o seu Telefone">
		    <br>
		    <input type="number" value="<c:out value='${armazem.endereco.cep}' />" id="cep" name="cep" placeholder="Informe o seu CEP">
		    <br>
		    <input type="text" value="<c:out value='${armazem.endereco.cidade}' />" id="cidade" name="cidade" placeholder="Informe a sua Cidade">
		    <br>
		    <input type="text" value="<c:out value='${armazem.endereco.bairro}' />" id="bairro" name="bairro" placeholder="Informe o seu Bairro">
		    <br>
		    <input type="text" value="<c:out value='${armazem.endereco.logradouro}' />" id="logradouro" name="logradouro" placeholder="Informe o Logradouro">
		    <br>
		    <input type="number" value="<c:out value='${armazem.endereco.numeroEndereco}' />" id="numeroEndereco" name="numeroEndereco" placeholder="Informe o Número">
		    <br>
		    <input type="text" value="<c:out value='${armazem.endereco.complemento}' />" id="complemento" name="complemento" placeholder="Informe o complemento">
		    <br>
		    <input type="text" value="<c:out value='${armazem.senha}' />" id="senha" name="senha" placeholder="Informe a Senha">
		    <br>
		    <input type="submit" value="Salvar">
	    </form>
            <br>
            <button type="button" name="voltar" id=voltar>Voltar</button>
	        <h1> Horario de Funcionamento </h1>
	        <br>
            <input type="text" placeholder="Dia da Semana 1" id=dia1 name=dia>
	        <br>
            <h3> A </h3>
            <input type="text" placeholder="Dia da Semana 2" id=dia2 name=dia>
            <br>
            <br>
            <br>
            <br>
            <input type="text" placeholder="Horario 1" id=horario1 name=horario>
	        <br>
            <h3> Às </h3>
            <input type="text" placeholder="Horario 2" id=horario2 name=horario>
            <br>
            <br>
	        <input type="submit" value="Salvar Alterações" name="salvar" id=salvar>
    </body>
</html>