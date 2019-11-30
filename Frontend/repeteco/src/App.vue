<template>
  <div id="app">
    <Menu/>
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
import Menu from './components/Menu.vue'
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'app',
  components: {
    Menu,
    HelloWorld
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
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
