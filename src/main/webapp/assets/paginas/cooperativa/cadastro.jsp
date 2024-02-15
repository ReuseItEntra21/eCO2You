<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Cadastro Cooperativa</title>
	<style><%@include file="../../../assets/css/cooperativa/cadastro.css"%></style>
</head>
<body>
    <a href="apresentacao" name="voltar" id=voltar>Voltar</a>
    <div style="text-align:center;">
		<span class="step"></span>
		<span class="step"></span>
	</div>
	<form id="regForm" action="inserir-cooperativa">
		<span class="Cadastro-cooperativa-Font50">Cadastro</span>
		<div class="tab">
			<div>
				<label for="nome">Nome</label>
				<input type="text" placeholder="user name" oninput="this.className = ''" name="nome" id=nome >
			</div>
			<div>
				<label for="sobrenome">Sobrenome</label>
		    	<input type="text" placeholder="user last name" oninput="this.className = ''" name="sobrenome" id=sobrenome >
			</div>
		    <label for="cnpj">CNPJ</label>
		    <input type="text" placeholder="00.000.000/0000-00" oninput="this.className = ''" name="cnpj" id=cnpj >
		    <label for="telefone">Telefone</label>
		    <input type="text" oninput="this.className = ''" name="telefone" id=telefone>
		    <label for="email">E-mail</label>
		    <input type="email" placeholder="username@gmail.com" oninput="this.className = ''" name="email" id=email>
		    <label for="senha">Senha</label>
		    <input type="password" placeholder="Senha" oninput="this.className = ''" name="senha" id=senha>
            <button type="button" name=avancar id="nextBtn" onclick="nextPrev(1)">Próximo</button>
            <span>Já tem uma Conta?</span>
    <a href="login" name="entre" id=entre1>Entre</a>
		</div>
        <span class="Cadastro-cooperativa-Font50">Cadastro</span>
		<div class="tab">
			<label for="cep">CEP</label>
			<input type="text" oninput="this.className = ''" name="cep" id=cep>
			<label for="cidade">Cidade</label>
		    <input type="text" oninput="this.className = ''" name="cidade" id=cidade>
		    <label for="bairro">Bairro</label>
		    <input type="text" oninput="this.className = ''" name="bairro" id=bairro>
		    <label for="tipoVia">Via</label>
		    <input type="text" oninput="this.className = ''" name="tipoVia" id=tipoVia>
		    <label for="logradouro">Logradouro</label>
		    <input type="text" oninput="this.className = ''" name="logradouro" id=logradouro>
		    <label for="numero">Número</label>
		    <input type="text" oninput="this.className = ''" name="numero" id=numero>
		    <label for="complemento">Complemento</label>
		    <input type="text" oninput="this.className = ''" name="complemento" id=complemento>
		    
		</div>
	</form>
	<div>
		<button type="button" name=voltar id="prevBtn" onclick="nextPrev(-1)">Voltar</button>
		<button type="button" name=confirmar id="nextBtn" onclick="nextPrev(1)">Confirmar</button>
	</div>
    <span>Já tem uma Conta?</span>
    <a href="login" name="entre" id=entre2>Entre</a>
	<script>
		var currentTab = 0;
		showTab(currentTab);
		
		function showTab(n) {
		  var x = document.getElementsByClassName("tab");
		  x[n].style.display = "block";
		  if (n == 0) {
		    document.getElementById("prevBtn").style.display = "none";
		  } else {
		    document.getElementById("prevBtn").style.display = "inline";
		  }
		  if (n == (x.length - 1)) {
		    document.getElementById("nextBtn").innerHTML = "Fazer Parte";
		  } else {
		    document.getElementById("nextBtn").innerHTML = "Próximo";
		  }
		  fixStepIndicator(n)
		}
		
		function nextPrev(n) {
		  var x = document.getElementsByClassName("tab");
		  if (n == 1 && !validateForm()) return false;
		  x[currentTab].style.display = "none";
		  currentTab = currentTab + n;
		  if (currentTab >= x.length) {
		    document.getElementById("regForm").submit();
		    return false;
		  }
		  showTab(currentTab);
		}
		
		function validateForm() {
		  var x, y, i, valid = true;
		  x = document.getElementsByClassName("tab");
		  y = x[currentTab].getElementsByTagName("input");
		  for (i = 0; i < y.length; i++) {
		    if (y[i].value == "") {
		      y[i].className += " invalid";
		      valid = false;
		    }
		  }
		  if (valid) {
		    document.getElementsByClassName("step")[currentTab].className += " finish";
		  }
		  return valid;
		}
		
		function fixStepIndicator(n) {
		  var i, x = document.getElementsByClassName("step");
		  for (i = 0; i < x.length; i++) {
		    x[i].className = x[i].className.replace(" active", "");
		  }
		  x[n].className += " active";
		}
	</script>
</body>
</html>