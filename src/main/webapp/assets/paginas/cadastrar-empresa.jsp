<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
          <h1> Nova Conta </h1>
          <form action="/action_page.php">
            <input type="text" id="nome" name="nome" autofocus placeholder="Nome" minlength="3" maxlength="25"required size="35">
            <br>
            <br>
            <input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" minlength="8" size="35" required>
            <br>
            <br>
            <input type="text" id="cnpj" name="cnpj" placeholder="Cnpj" maxlength="18" minlength="14" required size="35">
            <br>
            <br>
            <input type="text" id="cep" name="cep" placeholder="Cep" required size="35">
            <br>
            <br>
            <input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25" minlength="8" size="35" required>
            <br>
            <br>
            <input type="submit" value="Entrar">
            <br>
            <br>
            <h2>Faça parte dessa mudança!</h2>
			<Pre>Conecte-se a uma comunidade<br> comprometida com a <br>sustentabilidade e preservação<br> do meio ambiente.</Pre>
          </form>
    </body>
</html>