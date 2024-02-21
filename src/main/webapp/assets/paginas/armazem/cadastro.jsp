<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Cadastro Armazem</title>
	<style><%@include file="../../../assets/css/armazem/cadastro.css"%></style>
</head>
<body>
	<a href="apresentacao" id=voltar>Voltar</a>
	    <div style="text-align:center;">
			<span class="step"></span>
			<span class="step"></span>
		</div>
		<div class="container-cadastro">
			<form id="regForm" action="inserir-armazem">
				<span class="titulo-cadastro">Cadastro</span>
				<div class="tab">
					<div class="item-cadastro">
						<label for="nome" class="informacao-cadastro">Nome</label>
						<input type="text" placeholder="user name" oninput="this.className = ''" name="nome" id=nome >
					</div>
					<div class="container-cadastro-row">
						<div class="item-cadastro-row">
							<label for="horarioAbertura">Horario Abertura</label>
					    	<input type="text" placeholder="Horario Abertura" oninput="this.className = ''" name="horarioAbertura" id=horarioAbertura >
						</div>
						<div class="item-cadastro-row">
							<label for="horarioFechamento">Horario Fechamento</label>
					    	<input type="text" placeholder="Horario Fechamento" oninput="this.className = ''" name="horarioFechamento" id=horarioFechamento >
						</div>
					</div>
					<div class="item-cadastro">
						<label for="cnpj">CNPJ</label>
				    	<input type="text" placeholder="00.000.000/0000-00" oninput="this.className = ''" name="cnpj" id=cnpj >
					</div>
					<div class="container-cadastro-row">
						<div class="item-cadastro-row">
							<label for="capacidadeArmazenagem">Capacidade Armazenagem</label>
					    	<input type="text" placeholder="Capacidade Armazenagem" oninput="this.className = ''" name="capacidadeArmazenagem" id=capacidadeArmazenagem>
						</div>
						<div class="item-cadastro-row">
							<label for="telefone">Telefone</label>
					    	<input type="text" placeholder="Telefone" oninput="this.className = ''" name="telefone" id=telefone>
						</div>
					</div>	
					<div class="item-cadastro">
						<label for="email">E-mail</label>
				    	<input type="email" placeholder="E-mail" oninput="this.className = ''" name="email" id=email>
					</div>
					<div class="item-cadastro">
						<label for="senha">Senha</label>
				    	<input type="password" placeholder="Senha" oninput="this.className = ''" name="senha" id=senha>
					</div>
				</div>
				<div class="tab">
					<div class="item-cadastro">
						<label for="cep">CEP</label>
						<input type="text" placeholder="CEP" oninput="this.className = ''" name="cep" id=cep>
					</div>
					<div class="item-cadastro">
						<label for="cidade">Cidade</label>
				    	<input type="text" placeholder="Cidade" oninput="this.className = ''" name="cidade" id=cidade>
				    </div>
				    <div class="item-cadastro">
				    	<label for="bairro">Bairro</label>
				    	<input type="text" placeholder="Bairro" oninput="this.className = ''" name="bairro" id=bairro>
				    </div>
				   <div class="container-cadastro-row">
						<div class="item-cadastro-row">
							<label for="tipoVia">Tipo da Via</label>
					    	<input type="text" placeholder="Tipo da Via" oninput="this.className = ''" name="tipoVia" id=tipoVia>
						</div>
						<div class="item-cadastro-row">
							<label for="logradouro">Logradouro</label>
					    	<input type="text" placeholder="Logradouro" oninput="this.className = ''" name="logradouro" id=logradouro>
						</div>
					</div>
				    <div class="item-cadastro">
				    	<label for="numeroEndereco">Número da Residencia</label>
				   		<input type="text" placeholder="Número" oninput="this.className = ''" name="numeroEndereco" id=numeroEndereco>
				    </div>
				    <div class="item-cadastro">
				    	<label for="complemento">Complemento</label>
				    	<input type="text" placeholder="Complemento" oninput="this.className = ''" name="complemento" id=complemento>
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