<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Cadastro Depósito</title>
		<style><%@include file="../../../assets/css/coletor/cadastro-deposito.css"%></style>
	</head>
	<body>
		<a href="landing-page" id=voltar>Voltar</a>
	    <div style="text-align:center;">
			<span class="step"></span>
			<span class="step"></span>
		</div>
		<div class="container-cadastro">
			<form id="regForm" action="inserir-deposito">
				<div id="item-deposito-titulo"><span>Depósito</span></div>
				<div class="tab">
				<div class="item-deposito"><label for="deposito">Data de Depósito</label></div>
				<div>
					<div class="item-deposito-input"><input type="date" oninput="this.className = ''" name="data" id=deposito></div>
				</div>
				<div class="item-deposito"><label for="deposito">Armazém</label></div>
				<div>
					<div class="item-deposito-input"><input type="text" value="${armazem.id}" name="id"></div>
				</div>
				<div class="item-deposito" class="item-deposito-input"><label> Escolha a Reciclavel </label></div>
				<div class="item-deposito-input" class="item-deposito">
					<select name="reciclavel">
				    	<c:forEach var="reciclavel" items="${reciclaveis}">
				        	<option value="${reciclavel.id}">${reciclavel.nome}</option>
				    	</c:forEach>
			    	</select>
				</div>
				</div>
				<div class="tab">
				<div class="item-deposito"><label>Quantidade</label></div>	
				<div>
					<div class="item-deposito-input"><input type="number" oninput="this.className = ''" name="quantidade-reciclavel" id=deposito></div>
				</div>
				<div class="item-deposito"  id="recilcavel">
					<button type="submit">Agendar</button>
				</div>
				</div>
			</form>
		</div>
		<div style="margin-top: 1.5vw;" class="container-prev">
				<button type="button" name=voltar id="prevBtn" onclick="nextPrev(-1)">Anterior</button>
				<button type="button" name=avancar id="nextBtn" onclick="nextPrev(1)">Próximo</button> 
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
