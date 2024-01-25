<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../resources/css/style.css"%></style>
    </head>
    <body>
          	<form action="inserir-armazem" method="post">
          	<input type="submit" value="Voltar">
          	<br>
          	<br>
          	<h1> Nova Conta </h1>
          	<br>
            <input type="text" id="nome" name="nome" autofocus placeholder="Nome do Armazém" maxlength="25"required size="35">
            <br>
            <br>
            <input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" size="35" required>
            <br>
            <br>
            <input type="text" id="cnpj" name="cnpj" placeholder="Cnpj" maxlength="18" required size="35">
            <br>
            <br>
            <input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25" size="35" required>
            <br>
            <br>
            <input type="number" id="capacidadeArmazenagem" name="capacidadeArmazenagem" placeholder="Capacidade em quilogramas" maxlength="10000000" required size="35">
            <br>
            <br>
            <input type="time" id="horarioAbertura" name="horarioAbertura" required size="17">
            <br>
            <br>
            <input type="time" id="horarioFechamento" name="horarioFechamento" required size="17">          
            <br>
            <br>
            <button type="submit" class="ButtonEntrar">Fazer Parte</button>
            <br>
            <br>
            <h2>Faça parte dessa mudança!</h2>
			<Pre>Conecte-se a uma comunidade<br> comprometida com a <br>sustentabilidade e preservação<br> do meio ambiente.</Pre>
          </form>
    </body>
</html>