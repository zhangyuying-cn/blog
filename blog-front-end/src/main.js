import Vue from 'vue'
import App from './App'
import router from './router'

// 手动引入
import 'bootstrap'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
// markdown 转化
import mavonEditor from 'mavon-editor'
import 'mavon-editor/dist/css/index.css'

Vue.config.productionTip = false
// Vue.use(jquery)
// Vue.use(bootstrap)
Vue.use(BootstrapVue)
// markdown 插件
Vue.use(mavonEditor)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
