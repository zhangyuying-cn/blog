<template>
  <div id="app" class="mb-5" style="font-family:'Microsoft Yahei',Georgia,Serif;overflow-x:hidden">
    <div class="fixed-top shadow-sm px-5 bg-white"
    >
      <h4 class="float-left"
            style="margin-left:15%;margin-top:5px; line-height: 80px;"
      >先这样看吧</h4>
      <router-link
        tag="span"
        to="/editBlog"
        active-class="color:red"
        style="line-height: 80px;cursor: pointer;"
        class="btn-sm mb-0 float-right">
        <span>新增博客</span>
      </router-link>
      <router-link
        tag="span"
        to="/showBook"
        active-class="color:red"
        style="line-height: 80px;cursor: pointer;"
        class="btn-sm mb-0 float-right">
        <span>阅读书单</span>
      </router-link>
      <router-link
        tag="span"
        to="/"
        active-class="color:red"
        style="line-height: 80px;cursor: pointer;"
        class="btn-sm mb-0 float-right">
        <span>回到首页</span>
      </router-link>
    </div>
    <router-view style="margin-top:120px;margin-left:15%;"/>
  </div>
</template>

<script>
import RightNavigation from './components/bolg/RightNavigation'
export default {
  name: 'App',
  components: {
    RightNavigation
  }
}
</script>

<style>

  /*#app {*/
    /*font-family: 'Avenir', Helvetica, Arial, sans-serif;*/
    /*-webkit-font-smoothing: antialiased;*/
    /*-moz-osx-font-smoothing: grayscale;*/
    /*text-align: center;*/
    /*color: #2c3e50;*/
    /*margin-top: 60px;*/
  /*}*/
</style>
