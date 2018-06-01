import Vue from 'vue'
import App from './App'
import router from './router'

// 手动引入
import vueResource from 'vue-resource'
import 'bootstrap'
// markdown 转化
import mavonEditor from 'mavon-editor'
import 'mavon-editor/dist/css/index.css'

Vue.config.productionTip = false
Vue.use(vueResource)
Vue.use(mavonEditor)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
