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
			<div class="item-menu">
				<a  href="depositos-pendentes-coletor" id=pendentes>
					<svg><%@include file="../../images/pendente.jsp"%></svg>Pendentes
				</a>
			</div>
			<div class="item-menu">
				<a href="historico-depositos-coletor" id=historico>
					<svg><%@include file="../../images/historico.jsp"%></svg>Histórico
				</a>
			</div>
			<div class="item-menu">
				<a href="ranking-coletor" id=ranking>
					<svg><%@include file="../../images/ranking.jsp"%></svg>Ranking
				</a>
			</div>
			<div class="item-menu">
				<a href="procurar-coletor" id=procurarColetor>
					<svg><%@include file="../../images/lupa.jsp"%></svg>Procurar Coletor
				</a>
			</div>
			<div class="item-menu">
				<a href="procurar-armazem" id=procurarArmazem>
					<svg><%@include file="../../images/lupa.jsp"%></svg>Procurar Armazém
				</a>
			</div>
			<div class="item-menu">
				<a href="editar-perfil-coletor" class="dropbtn" id=perfil>
					<svg><%@include file="../../images/perfil.jsp"%></svg> Olá ${coletor.nome}
				</a>
			</div>
			<div class="item-menu">
				<a class="item-menu" href="deslogar" id=deslogar>
					<svg><%@include file="../../images/logout.jsp"%></svg>
				</a>
			</div>
		</div>
    </nav>
    <hr/>
</header>