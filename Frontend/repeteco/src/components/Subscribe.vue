<template>
  <div id="subscribe">
		<section class="wn__newsletter__area bg-image--2">
			<div class="container">
				<div class="row">
					<div class="col-lg-7 offset-lg-5 col-md-12 col-12 ptb--150">
						<div class="section__title text-center">
							<h2>Fique conosco</h2>
						</div>
						<div class="newsletter__block text-center">
							<p>Increva-se na nossa newsletter para ser o primeiro a <br/>
								saber sobre novos anúncios e receber ofertar exclusivas.</p>
							<form action="#">
								<div class="newsletter__box">
									<input type="email" placeholder="Seu e-mail">
									<button>Inscreva-se</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</section>
  </div>
</template>

<script>
export default {
  name: 'Subscribe'
}
</script>

<style scoped>
.newsletter__block p, .newsletter__block .newsletter__box input, .newsletter__block .newsletter__box button {
	color: #FFF;
}
</style>
