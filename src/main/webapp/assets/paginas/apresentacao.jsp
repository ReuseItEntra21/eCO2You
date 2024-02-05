<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>eCO2You</title>
		<style><%@include file="../../resources/css/style.css"%></style>
	</head>
	<body>
		<a href="<%=request.getContextPath()%>/login">Login</a>
		<br>
		<img src="#" alt="" name="imagem" id=imagem1>
		<img src="#" alt="" name="imagem" id=imagem2>
		<img src="#" alt="" name="imagem" id=imagem3>
        <h3> Nós, da reuse-it, somos uma empresa que luta para melhorar a qualidade de vida das pessoas e do próprio meio ambiente. Temos o objetivo de incentivar as pessoas a fazer parte disso e ajudar, mesmo nas pequenas coisas. Então criamos um sistema, o eco2you, um aplicátivo com sistema de gamificação aplicado para incentivar o ato de reciclagem, em troca de experiência para subir o nível da conta do usuário. </h3>

		<h3>
			Na eCO2You, assumimos a responsabilidade de cuidar do meio ambiente. Trabalhamos incansavelmente para desenvolver soluções inovadoras que minimizem a pegada de carbono. Nossos processos de reciclagem são projetados para preservar os recursos naturais, reduzir a produção de resíduos e criar um ciclo sustentável.
		</h3>
		<h3>
			O Que Fazemos:
		</h3>
            <ul>
			<li>Reciclagem Eficiente</li>
			</ul>
			<ul>
			<li>Consultoria Sustentável</li>
			</ul>
			<ul>
			<li>Educação Ambiental</li>
            </ul>
		<h3>
			Na eCO2You, transformamos resíduos em oportunidades, impactando o presente e moldando um futuro melhor. Estamos comprometidos com você e nosso planeta. Vamos construir juntos um mundo onde a sustentabilidade é a norma, eCO2You é a escolha óbvia
		</h3>
        <h3>Somos uma empresa comprometida com a missão de promover um futuro mais verde e sustentável, transformando resíduos em recursos valiosos. </h3>
        <h3> Se você se interessou no nosso trabalho e quer fazer parte dessa comunidade, escolha entre três opções de associado e comece a mudar o planeta.</h3>
        <h3> Coletor </h3>
        <pre> 
        Os coletores são os usuários comuns,
        pessoas que recolhem e
        guardam os recicláveis,
        depois enviam para os armazéns.
        <br>
        <a href="<%=request.getContextPath()%>/cadastro-coletor">Criar Conta como Coletor</a>
        </pre>
        <h3> Armazém </h3>
        <pre> 
        Os armazéns são os
        locais, ou empresas, que
        se dispõem a armazenar
        os recicláveis coletados
        pelos coletores.
        <br>
        <a href="<%=request.getContextPath()%>/cadastro-armazem">Criar Conta como Armazém</a>
        </pre>
        <h3>Cooperativa</h3>
       	 <pre>
       	As cooperativas são as
        empresas e fábricas que
        compram o material
        armazenado dos
        armazéns, e então
        transforma em novos
        produtos.
        <br>
        <a href="<%=request.getContextPath()%>/cadastro-cooperativa">Criar Conta como Cooperativa</a>
        </pre> 
		<footer>
			<table>
		  		<tr>
		  			<td><a href="/sobre-nos">Sobre Nós</a></td>
		  			<td><a href="/suporte">Suporte</a></td>
		  			<td><a href="/contato">Redes Socias</a></td>
		  		</tr>
		  		<tr>
		  			<td><a href="/suporte">Empresa</a></td>
		  			<td><a href="/suporte">eCO2you@contato.com</a></td>
		  			<td><a href="/suporte">Github</a></td>
		  		</tr>
		  		<tr>
		  			<td><a href="/contato">Objetivo</a></td>
		  			<td><a href="/suporte">Termos de Uso</a></td>
		  			<td><a href="/suporte">Linkedin</a></td>
		  		</tr>
				</table>
	        <p>&copy; 2024 eCO2you. Todos os direitos reservados.</p>
		</footer>
	</body>
</html>
