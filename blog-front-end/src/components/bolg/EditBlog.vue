<template>
  <div id="main">
    <mavon-editor v-model="value" />
    <button @click="saveBlog">保存</button>
    <button @click="closeEditBlog">取消</button>
  </div>
</template>

<script>
export default {
  name: 'showBlog',
  data () {
    return {
      value: ''
    }
  },
  methods: {
    saveBlog () {
      let text = this.value
      alert(text)
      // TODO 已经拿到了markdown,可以直接传入给后台
    },
    closeEditBlog () {
      this.$router.push({
        path: '/'
      }
      )
    }
  }
}
</script>

<style scoped>

</style>
