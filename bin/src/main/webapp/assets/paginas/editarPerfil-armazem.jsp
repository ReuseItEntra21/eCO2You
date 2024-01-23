<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
    <br>
        <form action="/action_page.php">
        <input type="submit" value="Voltar">
        <br>
        <br>
        <input type="text" id="nome" name="nome" autofocus placeholder="Nome" minlength="3" maxlength="25" size="46" required><br>
        <br>
        <input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" minlength="8" size="46" required><br>
        <br>
        <input type="text" id="cnpj" name="cnpj" placeholder="Cnpj" maxlength="18" minlength="14" required size="46">
        <br>
        <br>
        <input type="text" id="telefone" name="telefone" placeholder="Telefone" maxlength="17" minlength="9" required> <input type="text" id="cep" name="cep" placeholder="Cep" maxlength="9" minlength="8" required><br>
        <br>
        <input type="text" id="rua" name="rua" placeholder="Endereço Rua" maxlength="45" minlength="3" required> <input type="text" id="bairro" name="bairro" placeholder="Endereço Bairro" maxlength="25" minlength="3" required><br>
        <br>
        <input type="text" id="numero" name="numero" placeholder="Número" required> <input type="text" id="cidade" name="cidade" placeholder="Cidade" maxlength="25" minlength="2" required><br>
        <br>
        <input type="text" id="complemento" name="complemento" placeholder="Complementos" size="46">
        <br>
        <br>
        <input type="submit" value="Alterar a Senha">
        <input type="submit" value="Excluir a Conta">
        <br>
        <br>
        <input type="submit" value="Salvar">
    </form>
    </body>
</html>