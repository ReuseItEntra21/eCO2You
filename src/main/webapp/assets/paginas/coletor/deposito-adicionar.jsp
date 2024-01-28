<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<br>
	<button type="button">Voltar</button>
	<br>
	<h1>Depósito</h1>
	<h3>Selecione algum material disponível para depósitar.</h3>
	<input type="date" id="dataNascimento" name="dataDeposito">
	<br>
	<br>
	<input type="image" src="caminho/da/imagem.jpg">
	<input type="image" src="caminho/da/imagem.jpg">
	<br>
	<label> <input type="radio" id=aluminio name=material
		value="220ml"> Alumínio <input type="radio" id=plastico
		name=material value="250ml"> Plástico
	</label>

	<h4>+ Adicionar um reciclável ao seu depósito</h4>
	<br>
	<input type="button" value="Voltar">
	<h1>Depósito</h1>
	<h3>Selecione o tamanho dos recíclaveis e a quantidade.</h3>
	<label> <input type="checkbox" name="tamanho" value="220ml">
		220ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="235ml">
		235ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="250ml">
		250ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="269ml">
		269ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="310ml">
		310ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="330ml">
		330ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="350ml">
		350ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="473ml">
		473ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="500ml">
		500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<input type="submit" value="Salvar">
	<br>
	<br>
	<input type="button" value="Voltar">
	<h1>Depósito</h1>
	<input type="date" id="dataNascimento" name="dataDeposito">
	<br>
	<br>
	<input type="image" src="caminho/da/imagem.jpg">
	<br>
	<input type="text" id=material name=material placeholder="Material">
	<pre>
    Quantidade do item, tipo de item, peso 1
    Quantidade do item, tipo de item, peso 2
    Quantidade do item, tipo de item, peso 3
    
    Irá receber o total de XX pontos.
    </pre>
	<h4>+ Adicionar um reciclável ao seu depósito</h4>
	<br>
	<input type="submit" value="Salvar Depósito">
</body>
</html>
