<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Recuperar Senha</title>
</head>
<body>
<div>
	<a href="login" class=""> Voltar</a>
	<span id="recuperarSenha">Recuperar Senha</span>
	<div>
		<label for="nome">E-mail</label>
		<input type="email" placeholder="username@gmail.com" name="email" id=email1 onchange=validarFormulario() oninput="this.className = ''" required>
	</div>
	<div>
		<label for="nome">Confirme seu e-mail</label>
		<input type="email" placeholder="username@gmail.com" name="email" id=email2 onchange=validarFormulario() oninput="this.className = ''" required>
	</div>
	<button type=submit id=proximo1 disabled>Próximo</button>            
	<script>
	   function validarFormulario(){
	   const email1 = document.getElementById("email1").value;
	   const email2 = document.getElementById("email2").value;
	   const botao = document.getElementById("proximo1");
	   if(email1 === email2) 
	      botao.disabled = false;
	   }
	</script>
</div>	
<div>
	<a href="login" class=""> Voltar</a>
	<span id="recuperarSenha">Recuperar Senha</span>
	<span>Informe o código que recebeu por e-mail</span>
	<input type="number" name="codigo" id=codigo class="codigo" min=0 max=9 oninput="this.className = ''" required>
    <input type="number" name="codigo" id=codigo class="codigo" min=0 max=9 oninput="this.className = ''" required>
    <input type="number" name="codigo" id=codigo class="codigo" min=0 max=9 oninput="this.className = ''" required>
    <input type="number" name="codigo" id=codigo class="codigo" min=0 max=9 oninput="this.className = ''" required>
    <button type=submit id=recuperar>Recuperar</button>
</div>
<div>
	<a href="login" class=""> Voltar</a>
    <span id="recuperarSenha">Recuperar Senha</span>
    <div class="tab">
    	<label for=senha>Nova senha:</label>
        <input type=password id=senha placeholder=Senha onchange=validarFormulario2() oninput="this.className = ''" required>
        <label for=outra-senha>Confirme sua a nova senha:</label>
        <input type=password id=outra-senha placeholder=Senha onchange=validarFormulario2() oninput="this.className = ''" required>
        <button type=submit id=submeter disabled>Finalizar</button>
    </div>
	<script>
		function validarFormulario2(){
	    const senha = document.getElementById("senha").value;
	    const outraSenha = document.getElementById("outra-senha").value;
	    const botao = document.getElementById("submeter");
	    if(senha == outraSenha) 
	   		botao.disabled = false;
	  	}
	</script>
</div>
</body>
</html>