<template>
  <div class="container-fluid">
    <button @click="editBlog">开始编辑</button>
    <show-blog-title></show-blog-title>
  </div>
</template>

<script>
import ShowBlogTitle from './bolg/showBlogTitle'
export default {
  name: 'HomePage',

  data () {
    return {
      text: {
        title: '深入理解java JVM',
        type: 'java'
      }
    }
  },
  methods: {
    editBlog () {
      this.$router.push({
        path: '/editBlog'
      })
    }
  },
  components: { ShowBlogTitle }
}
</script>

<style scoped>

</style>
