<template>

    <div class="product product__style--3">
      <div class="col-lg-3 col-md-4 col-sm-6 col-12">
        <div class="product__thumb">
          <a v-if="this.data.imagem1" class="first__img" href="#"><img v-bind:src="'data:image/png;base64,' + this.data.imagem1" alt="product image"></a>
          <div class="hot__box">
            <span class="hot-label">{{this.data.conservacao}}</span>
          </div>
        </div>
        <div class="product__content content--center">
          <h4><a href="#">{{this.data.titulo}}</a></h4>
          <ul class="prize d-flex">
            <li>R${{this.data.valor}}</li>
          </ul>
          <div class="action">
            <div class="actions_inner">
              <ul class="add_to_links">
                <li><a class="compare" href="#"><i class="bi bi-pencil"></i></a></li>
                <li><a data-toggle="modal" @click="apagar()" title="Quick View" class="quickview modal-view detail-link" href="#productmodal"><i class="bi bi-cross"></i></a></li>
              </ul>
            </div>
          </div>
          <div class="product__hover--content">
            <ul class="rating d-flex">
              <li class="on"><i class="fa fa-star-o"></i></li>
              <li class="on"><i class="fa fa-star-o"></i></li>
              <li class="on"><i class="fa fa-star-o"></i></li>
              <li><i class="fa fa-star-o"></i></li>
              <li><i class="fa fa-star-o"></i></li>
            </ul>
          </div>
        </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'Product',
  props: {
    data: Object
  },
  methods: {
    apagar: function() {
      var self = this;
      var del = confirm("Apagar o anúncio ID " + this.data.idAnuncio + "?");
      if (del == true) {
        axios({
          method: 'delete',
          url: 'http://localhost:8080/anuncio/' + this.data.idAnuncio
        })
        .then(function () {
          alert("Anúncio apagado");
          self.$root.$emit('refresh_products');
        });
      }
    }
  }
}
</script>

<style scoped>
.product__thumb {
  width: 200px;
  height: 200px;
}
</style>
