<template>
  <div id="menu">
      <!-- Header -->
    <header id="wn__header" class="header__area header__absolute sticky__header">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-6 col-sm-6 col-6 col-lg-2">
              <div class="logo">
                <a href="#">
                  <img src="../assets/logo/logo.png" alt="logo images">
                </a>
              </div>
            </div>
            <div class="col-lg-8 d-none d-lg-block">
              <nav class="mainmenu__nav">
                <ul class="meninmenu d-flex justify-content-start">
                  <li class="drop with--one--item"><a href="#">Home</a></li>
                  <li class="drop"><a href="#">Anúncios</a>
                    <div class="megamenu mega03">
                      <ul class="item item03">
                        <li class="title">Administração</li>
                        <li><a href="#" @click="modalShow = !modalShow">Produtos</a></li>
                        <li><a href="#">Servicos</a></li>
                        <li><a href="#">Usuários</a></li>
                      </ul>
                    </div>
                  </li>
                  <!-- <li><a href="#">Contato</a></li> -->
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
                              <span><a href="#">Meus Produtos</a></span>
                              <span><a href="#">Meus Serviços</a></span>
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
                              <span><a href="#">Minha Conta</a></span>
                              <span><a href="#">Login</a></span>
                              <span><a href="#">Criar Conta</a></span>
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
                              <span><a href="#">Gerenciar Escolas</a></span>
                              <span><a href="#">Relatórios de Anúncios</a></span>
                              <span><a href="#">Relatórios de Usuários</a></span>
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
                  <li><a href="#">Home</a></li>
                    <ul>
                      <li><a href="#">Sobre Nós</a></li>
                      <li><a href="#">Minha Conta</a></li>
                    </ul>
                  <li><a href="#">Anúncios</a>
                    <ul>
                      <li><a href="3">Produtos</a></li>
                      <li><a href="#">Serviços</a></li>
                    </ul>
                  </li>
                  <li><a href="#">Painel Administrativo</a>
                    <ul>
                      <li><a href="#">Gerenciar Escolas</a></li>
                      <li><a href="#">Relatório de Anúncios</a></li>
                      <li><a href="#">Relatório de Usuários</a></li>
                    </ul>
                  </li>
                  <li><a href="#">Contato</a></li>
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
      <b-modal v-model="modalShow" title="Cadastro de Produto">
        <div class="container">
          <div class="row">
            <div class="col-lg-12 col-12">
              <div class="contact-form-wrap">
                <form id="contact-form" action="#" method="post">
                    <div class="single-contact-form space-between">
                        <input type="text" name="nome" v-model="product.titulo" placeholder="Título*">
                    </div>
                    <div class="single-contact-form space-between">
                      <select class="form-select" name="tipo_produto" v-model="product.type">
                        <option>Tipo de produto</option>
                        <option value="MATERIAL">Material escolar</option>
                        <option value="UNIFORME">Uniforme escolar</option>
                      </select>
                      <select class="form-select" name="estado_conservacao" v-model="product.conservacao">
                        <option>Estado de conservação</option>
                        <option value="NOVO">Novo</option>
                        <option value="USADO">Usado</option>
                      </select>									
                    </div>
                    <div class="single-contact-form space-between">
                      <textarea name="descricao" placeholder="Descrição" v-model="product.descricao"></textarea>
                    </div>
                    <div class="single-contact-form space-between">
                      <select class="form-select" name="nome_escola" v-model="product.idEscola">
                        <option>Nome da Escola</option>
                        <option value="1">Alfa Objetivo</option>
                      </select>	
                      </div>								
                      <div class="single-contact-form space-between">
                        <input type="text" name="valor" placeholder="Valor*" v-model="product.valor">			
                        <input type="text" name="tamanho" placeholder="Tamanho*" v-model="product.tamanho">
                      </div>		
                      <div class="single-contact-form space-between">
                        <input type="file" name="anexo1">
                        <input type="file" name="anexo1">
                      </div>
                    </form>
                </div> 
            </div>
          </div>
        </div>
        <template v-slot:modal-footer="{ ok, cancel }">
          <div class="contact-btn">
            <b-button type="reset" class="btn-cancel" @click="cancel()">Cancelar</b-button>
            <b-button type="submit" @click="saveProduct(); ok();">Salvar</b-button>
          </div>
        </template>
      </b-modal>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'Menu',
  components: {
    // FormProduct
  },
  methods: {
    saveProduct: function() {
      axios.post('http://localhost:8080/anuncio', this.product)
      .then(function (response) {
        alert(response);
      });
    }
  },
  data() {
    return {
      modalShow: false,
      currentForm: '',
      product: {
        "idClient": 1,
        "idEscola": 1,
        "titulo": null,
        "descricao": null,
        "dtInicial": null,
        "dtFinal": null,
        "valor": null,
        "tamanho": null,
        "conservacao": null,
        "imagem1": null,
        "imagem2": null,
        "type": null
      }
    }
  }
}
</script>

<style scoped>
.contact-btn {
  width: 100%;
}
.contact-btn button{
  border-radius: 0;
}
</style>
