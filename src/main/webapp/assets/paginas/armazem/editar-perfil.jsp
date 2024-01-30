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
        <form action="/">
        <button type="button" name="voltar" id=voltar>Voltar</button>
        <br>
        <br>
        <input type="text" id="nome" name="nome" autofocus placeholder="Nome" maxlength="25" size="46"><br>
        <br>
        <input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" size="46"><br>
        <br>
        <input type="text" id="cnpj" name="cnpj" placeholder="Cnpj" maxlength="18" size="46">
        <br>
        <br>
        <input type="text" id="telefone" name="telefone" placeholder="Telefone" maxlength="17"> <input type="text" id="cep" name="cep" placeholder="Cep" maxlength="9"><br>
        <br>
        <input type="text" id="rua" name="rua" placeholder="Endereço Rua" maxlength="45"> <input type="text" id="bairro" name="bairro" placeholder="Endereço Bairro" maxlength="25"><br>
        <br>
        <input type="text" id="numero" name="numero" placeholder="Número"> <input type="text" id="cidade" name="cidade" placeholder="Cidade" maxlength="25"><br>
        <br>
        <input type="text" id="complemento" name="complemento" placeholder="Complementos" size="46">
        <br>
        <br>
        <input type="submit" value="Alterar a Senha" name="alterar" id=alterar>
        <input type="submit" value="Excluir a Conta" name="excluir" id=excluir>
        <br>
        <br>
        <input type="submit" value="Salvar" name="salvar" id=salvar>
    </form>
    </body>
</html>