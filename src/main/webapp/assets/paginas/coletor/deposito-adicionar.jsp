<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<br>
	<button type="button" name="voltar" id=voltar1 >Voltar</button>
	<br>
	<h1>Depósito</h1>
	<h3>Selecione algum material disponível para depósitar.</h3>
	<input type="date" id="dataDeposito1" name="dataDeposito">
	<br>
	<br>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem1>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem2>
	<br>
	<label> <input type="radio" id=aluminio name=material
		value="220ml"> Alumínio <input type="radio" id=plastico
		name=material value="250ml"> Plástico
	</label>

	<h4>+ Adicionar um reciclável ao seu depósito</h4>
	<br>
	<input type="button" value="Voltar" name="voltar" id=voltar2>
	<h1>Depósito</h1>
	<h3>Selecione o tamanho dos recíclaveis e a quantidade.</h3>
	<label> <input type="checkbox" name="tamanho" value="220ml" id=220>
		220ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="235ml" id=235>
		235ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="250ml" id=250>
		250ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="269ml" id=269>
		269ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="310ml" id=310>
		310ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="330ml" id=330>
		330ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="350ml" id=350>
		350ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="473ml" id=473>
		473ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="500ml" id=500>
		500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<input type="submit" value="Salvar" name="salvar" id=salvar1>
	<br>
    <br>
	<input type="button" value="Voltar" name="voltar" id=voltar2>
	<h1>Depósito</h1>
	<h3>Selecione o tamanho dos recíclaveis e a quantidade.</h3>
	<label> <input type="checkbox" name="tamanho" value="200ml" id=200>
		200ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="500ml" id=500>
		500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="600ml" id=600>
		600ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="1000ml" id=1000>
		100ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="1500ml" id=1500>
		1500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="2000ml" id=2000>
		2000ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="2500ml" id=2500>
		2500ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="3000ml" id=3000>
		3000ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<label> <input type="checkbox" name="tamanho" value="5000ml" id=5000>
		5000ml <input type=number min=0 max=100>
	</label>
	<br>
    <br>
	<label> <input type="checkbox" name="tamanho" value="10000ml" id=10000>
		10000ml <input type=number min=0 max=100>
	</label>
	<br>
	<br>
	<input type="submit" value="Salvar" name="salvar" id=salvar1>
	<br>
	<br>
	<input type="button" value="Voltar" name="voltar" id=voltar3>
	<h1>Depósito</h1>
	<input type="date" id="dataDeposito2" name="dataDeposito">
	<br>
	<br>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem3>
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
	<input type="submit" value="Salvar Depósito" name="salvar" id=salvar2>
</body>
</html>
