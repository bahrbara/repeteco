import Vue from 'vue'
import App from './App.vue'
import VueHead from 'vue-head'
import BootstrapVue from 'bootstrap-vue'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

import './css/plugins.css'
import './css/style.css'
import './css/custom.css'

// import "./js/popper.min.js"
// import "./js/bootstrap.min.js"
// import "./js/plugins.js"
// import "./js/active.js"

Vue.config.productionTip = false

Vue.use(VueHead)
Vue.use(BootstrapVue)


new Vue({
  render: h => h(App),
}).$mount('#app')
