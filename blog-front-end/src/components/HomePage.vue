<template>
  <div class="container-fluid">
    <button @click="editBlog">开始编辑</button>
    <div class="row">
      <div class="col">
        {{ text.title }}
      </div>
      <div class="col">
        分类：{{ text.type }}
      </div>
    </div>
  </div>
</template>

<script>
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
  }
}
</script>

<style scoped>

</style>
