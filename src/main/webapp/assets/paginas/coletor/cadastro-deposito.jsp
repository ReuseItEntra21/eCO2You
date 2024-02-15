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
    <%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
    	<form id="regForm" action="inserir-deposito" method="post">
	    	<span> Armazéns </span>
	    	<div class="tab">
	        	<span>Encontre o melhor ponto de entrega para você</span>
                <input type=search id=search name=search>
                <span id=resultados>número de resultados</span>
                <span>Aceitam</span>
            <label>
  			<input type="checkbox" name="quantidade" value="reciclavel">${reciclavel.nome} 
			</label>
	        	<div class="container-armazens">
	        		<c:forEach var="armazem" items="${armazens}">
	    				<div class="item-armazens">
	    					<img alt="Imagem Armazem" src="">
	    					<span>${armazem.nome}</span>
                            <span>${armazem.tipoVia}</span>
	    					<span>${armazem.logradouro}</span>
                            <span>${armazem.bairro}</span>
                            <form action="/perfil-armazem">
                            <button type="button">Solicite a Coleta</button>
                            </form>
	    				</div>
    				</c:forEach>
         <c:forEach var="armazem" items="${armazens}">           
	     <input type=number id=numero1 name=numero>
         <input type=number id=numero2 name=numero>
         <input type=number id=numero3 name=numero>
         <input type=number id=numero4 name=numero>
         <span>...</span>
         <input type=number id=numero5 name=numero>
		 </c:forEach>
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
		<%@ include file="../footer.jsp"%>
    </body>
</html>