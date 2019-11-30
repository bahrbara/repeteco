<template>
  <div id="menu">
      <!-- Header -->
    <header id="wn__header" class="header__area header__absolute sticky__header">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-6 col-sm-6 col-6 col-lg-2">
              <div class="logo">
                <a href="index.html">
                  <img src="../assets/logo/logo.png" alt="logo images">
                </a>
              </div>
            </div>
            <div class="col-lg-8 d-none d-lg-block">
              <nav class="mainmenu__nav">
                <ul class="meninmenu d-flex justify-content-start">
                  <li class="drop with--one--item"><a href="index.html">Home</a></li>
                  <li class="drop"><a href="#">Anúncios</a>
                    <div class="megamenu mega03">
                      <ul class="item item03">
                        <li class="title">Anúncios</li>
                        <li><a href="produtos.html">Produtos</a></li>
                        <li><a href="servicos.html">Servicos</a></li>
                      </ul>
                      <ul class="item item03">
                        <li class="title">Produtos</li>
                        <li><a href="#">Mochilas</a></li>
                        <li><a href="#">Estojos</a></li>
                        <li><a href="#">Lancheiras</a></li>
                        <li><a href="#">Fichários</a></li>
                        <li><a href="#">Livros</a></li>
                        <li><a href="#">Mais...</a></li>
                      </ul>
                      <ul class="item item03">
                        <li class="title">Serviços</li>
                        <li><a href="#">Transporte Escolar</a></li>
                        <li><a href="#">Aulas Particulares</a></li>
                        <li><a href="#">Esportes</a></li>
                        <li><a href="#">Danças</a></li>
                        <li><a href="#">Mais...</a></li>
                      </ul>
                    </div>
                  </li>
                  <li><a href="contato.html">Contato</a></li>
                </ul>
              </nav>
            </div>
            <div class="col-md-6 col-sm-6 col-6 col-lg-2">
              <ul class="header__sidebar__right d-flex justify-content-end align-items-center">
                <li class="shop_search"><a class="search__active" href="#"></a></li>
                <li class="wishlist"><a href="#"></a></li>
                <li class="setting__bar__icon"><a class="setting__active" href="#"></a>
                  <div class="searchbar__content setting__block">
                    <div class="content-inner">
                      <div class="switcher-currency">
                        <strong class="label switcher-label">
                          <span>Meus Anúncios</span>
                        </strong>
                        <div class="switcher-options">
                          <div class="switcher-currency-trigger">
                            <div class="setting__menu">
                              <span><a href="/meus-produtos.html">Meus Produtos</a></span>
                              <span><a href="/meus-servicos.html">Meus Serviços</a></span>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="switcher-currency">
                        <strong class="label switcher-label">
                          <span>Minha Conta</span>
                        </strong>
                        <div class="switcher-options">
                          <div class="switcher-currency-trigger">
                            <div class="setting__menu">
                              <span><a href="/minha-conta.html">Minha Conta</a></span>
                              <span><a href="/login.html">Login</a></span>
                              <span><a href="/cadastro-usuario.html">Criar Conta</a></span>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="switcher-currency">
                        <strong class="label switcher-label">
                          <span>Painel Administrativo</span>
                        </strong>
                        <div class="switcher-options">
                          <div class="switcher-currency-trigger">
                            <div class="setting__menu">
                              <span><a href="/gerenciar-escolas.html">Gerenciar Escolas</a></span>
                              <span><a href="/relatorio-anuncios.html">Relatórios de Anúncios</a></span>
                              <span><a href="/relatorio-usuarios.html">Relatórios de Usuários</a></span>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
              </ul>
            </div>
          </div>
          <!-- Start Mobile Menu -->
          <div class="row d-none">
            <div class="col-lg-12 d-none">
              <nav class="mobilemenu__nav">
                <ul class="meninmenu">
                  <li><a href="index.html">Home</a></li>
                    <ul>
                      <li><a href="contato.html">Sobre Nós</a></li>
                      <li><a href="my-account.html">Minha Conta</a></li>
                    </ul>
                  <li><a href="#">Anúncios</a>
                    <ul>
                      <li><a href="meus-produtos.html">Produtos</a></li>
                      <li><a href="meus-servicos.html">Serviços</a></li>
                    </ul>
                  </li>
                  <li><a href="s#">Painel Administrativo</a>
                    <ul>
                      <li><a href="gerenciar-escolas.html">Gerenciar Escolas</a></li>
                      <li><a href="relatorio-anuncios.html">Relatório de Anúncios</a></li>
                      <li><a href="relatorio-usuarios.html">Relatório de Usuários</a></li>
                    </ul>
                  </li>
                  <li><a href="contato.html">Contato</a></li>
                </ul>
              </nav>
            </div>
          </div>
          <!-- End Mobile Menu -->
          <div class="mobile-menu d-block d-lg-none">
          </div>
          <!-- Mobile Menu -->	
        </div>		
      </header>
      <!-- //Header -->
      <!-- Start Search Popup -->
      <div class="brown--color box-search-content search_active block-bg close__top">
        <form id="search_mini_form" class="minisearch" action="#">
          <div class="field__search">
            <input type="text" placeholder="Busque aqui por toda a loja...">
            <div class="action">
              <a href="#"><i class="zmdi zmdi-search"></i></a>
            </div>
          </div>
        </form>
        <div class="close__wrap">
          <span>Fechar</span>
        </div>
      </div>
      <!-- End Search Popup -->
  </div>
</template>

<script>
export default {
  name: 'Menu'
}
</script>

<style scoped>
</style>
