<template>
  <div id="app">
    <Menu />
    <Slider />
    <NewProducts />
    <Subscribe />
    <Products />
    <Footer />
  </div>
</template>

<script>
import Menu from './components/Menu.vue'
import Slider from './components/Slider.vue'
import NewProducts from './components/NewProducts.vue'
import Products from './components/Products.vue'
import Subscribe from './components/Subscribe.vue'
import Footer from './components/Footer.vue'

export default {
  name: 'app',
  components: {
    Menu,
    Slider,
    NewProducts,
    Products,
    Subscribe,
    Footer
  },
  head: {
    title: function() {
      return {
        inner: "Repeteco",
        complement: 'Olá'
      }
    },
    meta: [
      { name: "viewport", content: "width=device-width, initial-scale=1" },
      { name: "ie=edge", content: "x-ua-compatible" }
    ],
    link: [
      { rel: "shortcut icon", src: "./assets/favicon.ico?v=2" },
      { rel: "apple-touch-icon", src: "./assets/icon.png" },
      { rel: "stylesheet", src: "https://fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700,700i,900" },
      { rel: "stylesheet", src: "https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,600,600i,700,700i,800" },
      { rel: "stylesheet", src: "https://fonts.googleapis.com/css?family=Satisfy" }
    ]    
  }
}
</script>

<style>
</style>
