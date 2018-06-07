<template>
  <div class="container-fluid border-0" >
    <div class="col-1"></div>
    <div class="float-left col-7 border-right" style="clear:left;">
      <router-view/>
    </div>
    <div class="float-left col-2">
      <right-navigation></right-navigation>
    </div>
  </div>

</template>

<script>
import ShowBlogTitle from './bolg/ShowBlogTitle'
import RightNavigation from './bolg/RightNavigation'
import ShowOneBlog from './bolg/ShowOneBlog'

export default {
  name: 'HomePage',

  data () {
    return {
      showOne: false
    }
  },
  methods: {
  },
  components: {
    ShowBlogTitle,
    RightNavigation,
    ShowOneBlog
  }
}
</script>

<style scoped>

</style>
