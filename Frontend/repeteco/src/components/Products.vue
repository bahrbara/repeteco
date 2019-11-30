<template>
  <div id="products">
  <section class="wn__product__area brown--color pt--80  pb--30">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="section__title text-center">
							<h2 class="title__be--2">Produtos e <span class="color--theme">Serviços</span></h2>
							<p>Busque e navegue pelos proutos e serviços. Se achar melhor use o filtro para facilitar sua experiência.</p>
						</div>
					</div>
				</div>
				<div class="row mt--50">
					<div class="col-md-12 col-lg-12 col-sm-12">
						<div class="product__nav nav justify-content-center" role="tablist">
								<a class="nav-item nav-link active" data-toggle="tab" href="#nav-all" role="tab">TODOS</a>
								<a class="nav-item nav-link" data-toggle="tab" href="#nav-biographic" role="tab">LIVROS</a>
								<a class="nav-item nav-link" data-toggle="tab" href="#nav-adventure" role="tab">MOCHILAS</a>
								<a class="nav-item nav-link" data-toggle="tab" href="#nav-children" role="tab">UNIFORMES</a>
								<a class="nav-item nav-link" data-toggle="tab" href="#nav-cook" role="tab">SERVIÇOS</a>
						</div>
					</div>
				</div>
				<div class="tab__container mt--60">
					<!-- Start Single Tab Content -->
					<div class="row single__tab tab-pane fade show active" id="nav-all" role="tabpanel">
						<div class="product__indicator--4 arrows_style owl-carousel owl-theme">
							<div class="single__product" v-for="item in products" v-bind:key="item.idAnuncio">
								<Product :data="item"/>
							</div>
						</div>
					</div>
					<!-- End Single Tab Content -->
				</div>
			</div>
		</section>
  </div>
</template>

<script>
import Product from './Product.vue'
import axios from 'axios';

export default {
	name: 'Products',
  components: {
    Product
	},
	data() {
    return {
			products: []
		}
	},
	mounted () {
			var self = this;
      axios.get('http://localhost:8080/anuncio', this.product)
      .then(function (response) {
        self.products = response.data;
      });
	}
}
</script>

<style scoped>
.single__product {
	float: left;
}
</style>
