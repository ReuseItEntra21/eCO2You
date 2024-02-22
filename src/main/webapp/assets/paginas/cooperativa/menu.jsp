<header>
	<nav>
		<div class="container-logo">
			<a class="item-logo" href="perfil-cooperativa">
				<svg class="imagem-eco2you">
		        	<%@include file="../../images/eCO2You.jsp"%>
		        </svg>
			</a>
		</div>
		<div class="container-menu">
			<div class="item-menu">
				<a  href="retiradas-pendentes-cooperativa" id=pendentes>
					<svg><%@include file="../../images/pendente.jsp"%></svg>Pendentes
				</a>
			</div>
			<div class="item-menu">
				<a href="historico-retiradas-cooperativa" id=historico>
					<svg><%@include file="../../images/historico.jsp"%></svg>Historico
				</a>
			</div>
			
			<div class="item-menu">
				<a href="procurar-armazem" id=procurarArmazem>
					<svg><%@include file="../../images/lupa.jsp"%></svg>Procurar Armazem
				</a>
			</div>
			<div class="item-menu">
				<a class="perfil" href="editar-perfil-cooperativa" id=perfil>
					<svg><%@include file="../../images/perfil.jsp"%></svg> perfil ${cooperativa.nome}
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
