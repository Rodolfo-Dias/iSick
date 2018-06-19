<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>ISick - gerenciador de farmácias</title>
</head>
<body>
    <content tag="nav">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administrar <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.logicalPropertyName}</g:link>
                    </li>
                </g:each>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">O time <span class="caret"></span></a>
            <ul class="dropdown-menu">
                    <li><a href="https://github.com/henriqueykajihara" target="_blank">Henrique Yoshiharu Kajihara</a></li>
                    <li><a href="https://github.com/MarcosViniciusPeres" target="_blank">Marcos Vinicius Peres</a></li>
                    <li><a href="https://github.com/Rodolfo-Dias" target="_blank">Rodolfo Noronha Dias</a></li>
                    <li><a href="https://github.com/vivianetolomeotti" target="_blank">Viviane Tolomeotti Ritter</a></li>

            </ul>
        </li>
    </content>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="logo.png" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Bem-vindo ao ISick</h1>

            <p>
                O ISick é o gerenciador da sua farmácia. Aqui você poderá fazer o controle administrativo, pessoal(clientes e funcionários) e de produtos da sua loja. No módulo online para o cliente, incluso no sistema, o cliente poderá verificar a disponibilidade dos medicamentos e realizar o pedido destes. Todas as suas vendas serão administradas por nosso sistema, que é rápido e fácil de usar
            </p>

        </section>
    </div>

</body>
</html>
