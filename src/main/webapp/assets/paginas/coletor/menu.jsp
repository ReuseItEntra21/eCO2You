<header>
	<nav>
		<div class="container-logo">
			<a class="item-logo" href="perfil-coletor">
				<svg>
		        	<%@include file="../../images/eCO2You.jsp"%>
		        </svg>
			</a>
		</div>
		<div class="container-menu">
			<a class="item-menu" href="depositos-pendentes-coletor" id=pendentes>
				<img alt="Pendentes" src="">
			</a>
		    <a class="item-menu" href="historico-depositos-coletor" id=historico>
				<img alt="Histórico" src="">
			</a>
		    <a class="item-menu" href="ranking-coletor" id=ranking>
				<img alt="Ranking" src="">
			</a>
			<a class="item-menu" href="procurar-coletor" id=procurarColetor>
				<img alt="Pesquisar Coletor" src="">
			</a>
			<a class="item-menu" href="procurar-armazem" id=procurarArmazem>
				<img alt="Pesquisar Armazem" src="">
			</a>
			<a class="item-menu" href="deslogar" id=deslogar>
				<img alt="Sair da Conta" src="">
			</a>
			<a class="item-menu" href="editar-perfil-coletor" class="dropbtn" id=perfil>
				<img alt="Olá ${usuario.nome}" src="">
			</a>
		</div>
    </nav>
    <hr/>
</header>