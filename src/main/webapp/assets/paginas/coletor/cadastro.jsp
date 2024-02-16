<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Cadastro Coletor</title>
	<style><%@include file="../../../assets/css/coletor/cadastro.css"%></style>
</head>
<body>
	<a href="apresentacao" id=voltar>Voltar</a>
	    <div style="text-align:center;">
			<span class="step"></span>
			<span class="step"></span>
		</div>
		<div class="container-cadastro">
			<form id="regForm" action="inserir-coletor">
				Nova Conta
				<div class="tab">
					<div class="item-cadastro">
						<label for="nome">Nome</label>
						<input type="text" placeholder="user name" oninput="this.className = ''" name="nome" id=nome >
					</div>
					<div class="item-cadastro">
						<label for="sobrenome">Sobrenome</label>
				    	<p><input type="text" placeholder="user last name" oninput="this.className = ''" name="sobrenome" id=sobrenome ></p>
					</div>
					<div class="item-cadastro">
						<label for="cpf">CPF</label>
				    	<p><input type="text" placeholder="000.000.000-00" oninput="this.className = ''" name="cpf" id=cpf ></p>
					</div>
					<div class="item-cadastro">
						<div>
							<label for="nascimento">Data de Nascimento</label>
					    	<p><input type="date" oninput="this.className = ''" name="dataNascimento" id=nascimento></p>
						</div>
						<div>
							<label for="telefone">Telefone</label>
					    	<p><input type="text" placeholder="Telefone" oninput="this.className = ''" name="telefone" id=telefone></p>
						</div>
					</div>
					<div class="item-cadastro">
						<label for="email">E-mail</label>
				    	<p><input type="email" placeholder="E-mail" oninput="this.className = ''" name="email" id=email></p>
					</div>
					<div class="item-cadastro">
						<label for="senha">Senha</label>
				    	<p><input type="password" placeholder="Senha" oninput="this.className = ''" name="senha" id=senha></p>
					</div>
				</div>
				<div class="tab">
					<div class="item-cadastro">
						<label for="cep">CEP</label>
						<p><input type="text" placeholder="CEP" oninput="this.className = ''" name="cep" id=cep></p>
					</div>
					<div class="item-cadastro">
						<label for="cidade">Cidade</label>
				    	<p><input type="text" placeholder="Cidade" oninput="this.className = ''" name="cidade" id=cidade></p>
				    </div>
				    <div class="item-cadastro">
				    	<label for="bairro">Bairro</label>
				    	<p><input type="text" placeholder="Bairro" oninput="this.className = ''" name="bairro" id=bairro></p>
				    </div>
				    <div class="item-cadastro">
				    	<label for="tipoVia">Tipo da Via</label>
				    	<p><input type="text" placeholder="Tipo da Via" oninput="this.className = ''" name="tipoVia" id=tipoVia></p>
				    </div>
				    <div class="item-cadastro">
				    	<label for="logradouro">Logradouro</label>
				    	<p><input type="text" placeholder="Logradouro" oninput="this.className = ''" name="logradouro" id=logradouro></p>
				    </div>
				    <div class="item-cadastro">
				    	<label for="numero">Número da Residencia</label>
				   		<p><input type="text" placeholder="Número" oninput="this.className = ''" name="numero" id=numero></p>
				    </div>
				    <div class="item-cadastro">
				    	<label for="complemento">Complemento</label>
				    	<p><input type="text" placeholder="Complemento" oninput="this.className = ''" name="complemento" id=complemento></p>
					</div>
				</div>
			</form>
		</div>
		<div style="margin-top: 1.5vw;">
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