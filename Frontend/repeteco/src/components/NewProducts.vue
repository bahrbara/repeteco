<template>
  <div id="new_products">
  <section class="wn__product__area brown--color pt--80  pb--30">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="section__title text-center">
							<h2 class="title__be--2">Novos <span class="color--theme">Anúncios</span></h2>
							<p>Há vários produtos e serviços novos esperando por você. </p>
						</div>
					</div>
				</div>
				<!-- Start Single Tab Content -->
				<div class="furniture--4 border--round arrows_style owl-carousel owl-theme row mt--50">
					<div class="single__product" v-for="item in products" v-bind:key="item.idAnuncio">
						<Product :data="item"/>
					</div>					
				</div>
				<!-- End Single Tab Content -->
			</div>
		</section>
  </div>
</template>

<script>
import Product from './Product.vue'
import axios from 'axios';

export default {
	name: 'NewProducts',
  components: {
    Product
	},
	data() {
    return {
			products: []
		}
	},	
	mounted () {
			this.loadProducts();
			this.$root.$on('refresh_products', () => {
				this.loadProducts();
			});
	},
	methods: {
		loadProducts: function() {
			var self = this;
			axios.get('http://localhost:8080/anuncio/order/', this.product)
			.then(function (response) {
				self.products = response.data;
			});
		}
	}
}
</script>

<style scoped>
single__product {
	float: left;
}
</style>
