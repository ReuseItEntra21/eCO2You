<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
    </head>
    <form action="apresentacao">
		<button type="submit" name="voltar" id=voltar>Voltar</button>
	</form>
    <body>
    	<form action="inserir-deposito" method="post">
	        <h1> Depósito </h1>
	        <br>
	        <input type="date" id="data" name="data" autofocus placeholder="Data para Depositar" maxlength="25" size="20">
	        <br>
	        <br>
	        <input type="image" src="caminho/da/imagem.jpg">
	<input type="image" src="caminho/da/imagem.jpg">
	<br>
	<label> <input type="radio" id=aluminio name=material
		value="220ml"> Alumínio <input type="radio" id=plastico
		name=material value="250ml"> Plástico
	</label>
	        <h4>+ Adicionar um reciclável ao seu depósito</h4>
	<br>
	<input type="button" value="Voltar">
     <br>
	<h1>Depósito</h1>
	<h3>Selecione o tamanho dos recíclaveis e a quantidade.</h3>
	<label> <input type="checkbox" name="tamanho" value="220ml">
		220ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="235ml">
		235ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="250ml">
		250ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="269ml">
		269ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="310ml">
		310ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="330ml">
		330ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="350ml">
		350ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="473ml">
		473ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="500ml">
		500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<input type="submit" value="Salvar">
	<br>
	<br>
    <h1>Depósito</h1>
	<h3>Selecione o tamanho dos recíclaveis e a quantidade.</h3>
	<label> <input type="checkbox" name="tamanho" value="200ml" id=200>
		200ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="500ml" id=500>
		500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="600ml" id=600>
		600ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="1000ml" id=1000>
		1000ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="1500ml" id=1500>
		1500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="2000ml" id=2000>
		2000ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="2500ml" id=2500>
		2500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="3000ml" id=3000>
		3000ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="5000ml" id=5000>
		5000ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
    <label> <input type="checkbox" name="tamanho" value="10000ml" id=10000>
		10000ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<input type="submit" value="Salvar">
	<br>
	<br>
	<input type="button" value="Voltar">
	<h1>Depósito</h1>
	<input type="date" id="dataNascimento" name="dataDeposito">
	<br>
	<br>
	<input type="image" src="caminho/da/imagem.jpg">
	<br>
	<input type="text" id=material name=material placeholder="Material">
	<pre>
    Quantidade do item, tipo de item, peso 1
    Quantidade do item, tipo de item, peso 2
    Quantidade do item, tipo de item, peso 3
    
    Irá receber o total de XX pontos.
    </pre>
	<h4>+ Adicionar um reciclável ao seu depósito</h4>
	<br>
	<input type="submit" value="Salvar Depósito">
</body>
</html>