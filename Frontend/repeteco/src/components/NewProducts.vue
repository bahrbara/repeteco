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
					<Product />
				</div>
				<!-- End Single Tab Content -->
			</div>
		</section>
  </div>
</template>

<script>
import Product from './Product.vue'

export default {
	name: 'NewProducts',
  components: {
    Product
  },
}
</script>

<style scoped>
</style>
