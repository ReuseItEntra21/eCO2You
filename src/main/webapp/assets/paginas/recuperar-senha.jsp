<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Recuperar Senha</title>
	<style><%@include file="../../../resources/css/style.css"%></style>
</head>
<body>
	<div style="text-align: center;">
	<h1>Recuperar Senha</h1>
		<form id="regForm" action="apresentacao">
		  <div class="tab">
		  	<p>E-mail</p>
		    <p><input type="email" oninput="this.className = ''" name="email" id=email></p>
		    <p>Confirme seu E-mail</p>
		    <p><input type="email" oninput="this.className = ''" name="email" id=email></p>
		  </div>
		  <div class="tab">
		  <p>Código que recebeu em seu E-mail</p>
		    <p><input type="number" oninput="this.className = ''" name="codigo" id=codigo></p>
		  </div>
		  <div class="tab">
		 	 <p>Informe a nova senha</p>
		    <p><input type="password" placeholder="Senha" oninput="this.className = ''" name="senha" id=senha></p>
		    <p>Confirme a nova Senha</p>
		    <p><input type="password" placeholder="Senha" oninput="this.className = ''" name="senha" id=senha></p>
		  </div>
		  <div style="text-align:center;">
		    <span class="step"></span>
		    <span class="step"></span>
		    <span class="step"></span>
		  </div>
		  <div style="overflow:auto;">
		    <div>
		      <button type="button" name=voltar id="prevBtn" onclick="nextPrev(-1)">Anterior</button>
		      <button type="button" name=avancar id="nextBtn" onclick="nextPrev(1)">Próximo</button>
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