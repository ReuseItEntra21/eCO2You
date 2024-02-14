<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../css/coletor/cadastro-deposito.css"%></style>
    </head>
    <body>
    	<a href="home-coletor" id=voltar>Voltar</a>
    	<form id="regForm" action="inserir-deposito" method="post">
	    	<h1> Depósito </h1>
	    	<div class="tab">
	        	<h2>Escolha o Armazem</h2>
	        	<div class="container-armazens">
	        		<c:forEach var="armazem" items="${armazens}">
	    				<div class="item-armazens">
	    					<img alt="Imagem Armazem" src="">
	    					<h3>${armazem.nome}</h3>
	    					<p>${armazem.id}</p>
	    				</div>
    				</c:forEach>
	        	</div>
		  	</div>
		  	<div class="tab">
		  		<h2>Escolha a Data para o Depósito</h2>
            	<input type="date" id="data" name="data">
            	<h2>Escolha o Material</h2>
	        	<select name="material">
    				<c:forEach var="material" items="${materiais}">
        				<option value="${material.id}">${material.nome}</option>
    				</c:forEach>
				</select>
				<h2>Escolha o Reciclável</h2>
	        	<select name="reciclavel">
    				<c:forEach var="reciclavel" items="${reciclaveis}">
        				<option value="${reciclavel.id}">${reciclavel.nome}</option>
    				</c:forEach>
				</select>
				<h2>Escolha a Quantidade do Reciclavel</h2>
	        	<input type="number" id="quantidade-reciclaveis" name="quantidade-reciclaveis" min=1>
		  	</div>
			<div style="text-align:center;">
			    <span class="step"></span>
			    <span class="step"></span>
			    <span class="step"></span>
		 	</div>
		 	<div>
			    <button type="button" name=voltar id="prevBtn" onclick="nextPrev(-1)">Anterior</button>
			    <button type="button" name=avancar id="nextBtn" onclick="nextPrev(1)">Próximo</button>
		  </div>
	     </form>
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