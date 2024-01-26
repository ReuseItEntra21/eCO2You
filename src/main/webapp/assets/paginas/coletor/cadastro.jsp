<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Cadastro</title>
	<style><%@include file="../../../resources/css/style.css"%></style>
	<script><%@include file="../../../resources/css/style.css"%></script>
</head>
<body>
	<div style="float: left">
		<h2>Faça parte dessa mudança!</h2>
		Conecte-se a uma comunidade comprometida com a sustentabilidade e
		preservação do meio ambiente
	</div>
	<div style="float: right">
		<form id="regForm" action="inserir-coletor">
		  <h1>Criar Conta</h1>
		  <div class="tab">
		    <p><input type="text" placeholder="Nome" oninput="this.className = ''" name="nome"></p>
		    <p><input type="text" placeholder="Sobrenome" oninput="this.className = ''" name="sobrenome"></p>
		  </div>
		  <div class="tab">
		    <p><input type="text" placeholder="CPF" oninput="this.className = ''" name="cpf"></p>
		    <p><input type="date" placeholder="Data de Nascimento" oninput="this.className = ''" name="dataNascimento"></p>
		  </div>
		  <div class="tab">
		    <p><input type="email" placeholder="E-mail" oninput="this.className = ''" name="email"></p>
		    <p><input type="password" placeholder="Senha" oninput="this.className = ''" name="senha"></p>
		  </div>
		  <div class="tab">
		    <p><input type="text" placeholder="CEP" oninput="this.className = ''" name="cep"></p>
		    <p><input type="text" placeholder="Cidade" oninput="this.className = ''" name="cidade"></p>
		    <p><input type="text" placeholder="Bairro" oninput="this.className = ''" name="bairro"></p>
		    <p><input type="text" placeholder="Tipo da Via" oninput="this.className = ''" name="tipoVia"></p>
		    <p><input type="text" placeholder="Logradouro" oninput="this.className = ''" name="logradouro"></p>
		    <p><input type="text" placeholder="Número" oninput="this.className = ''" name="numeroEndereco"></p>
		    <p><input type="text" placeholder="Complemento" oninput="this.className = ''" name="complemento"></p>
		    <p><input type="text" placeholder="Telefone" oninput="this.className = ''" name="telefone"></p>
		  </div>
		  <div style="text-align:center;">
		    <span class="step"></span>
		    <span class="step"></span>
		    <span class="step"></span>
		    <span class="step"></span>
		  </div>
		  <div style="overflow:auto;">
		    <div>
		      <button type="button" id="prevBtn" onclick="nextPrev(-1)">Anterior</button>
		      <button type="button" id="nextBtn" onclick="nextPrev(1)">Próximo</button>
		    </div>
		  </div>
		</form>
	</div>
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