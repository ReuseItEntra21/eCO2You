<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	        <h1> Informações </h1>
	        <input type="text" id="nome" name="nome" autofocus placeholder="${armazem.nome}" maxlength="25" size="46"><br>
	        <br>
	        <input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" size="46"><br>
	        <br>
	        <input type="text" id="cnpj" name="cnpj" placeholder="Cnpj" maxlength="18" size="46">
	        <br>
	        <br>
	        <input type="text" id="telefone" name="telefone" placeholder="Telefone" maxlength="17"> <input type="text" id="bairro" name="bairro" placeholder="Endereço Bairro" maxlength="25"><br>
	        <br>
	        <input type="text" id="logradouro" name="logradouro" placeholder="Endereço Rua" maxlength="45"> <input type="text" id="cep" name="cep" placeholder="CEP"> <br>
	        <br>
	        <input type="text" id="numero" name="numeroResidencia" placeholder="Número"> <input type="text" id="cidade" name="cidade" placeholder="Cidade" maxlength="25">			
	        <br>
	        <br>
	        <input type="text" id="complemento" name="complemento" placeholder="Complementos" size="46">
	        <br>
	        <br>
	        <form action="recuperar-senha">
	        <button type="submit" name="alterarSenha" id=alterarSenha>Alterar Senha</button>
	        </form>
	        <br>
	        <input type="submit" value="Excluir a Conta" name="excluir" id=excluir>
	        <br>
	        <br>
	        <input type="submit" value="Salvar" name="salvar" id=salvar>
            <br>
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