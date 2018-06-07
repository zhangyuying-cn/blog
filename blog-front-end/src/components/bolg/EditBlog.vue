<template>
  <div>
    <button class="btn btn-primary" @click="saveBlog">保存</button>
    <button class="btn btn-primary" @click="closeEditBlog">取消</button>
    <mavon-editor v-model="blogValue" />

  </div>
</template>

<script>
import * as apiService from '../../services/apiService'

export default {
  name: 'showBlog',
  data () {
    return {
      blogValue: ''

    }
  },
  methods: {
    saveBlog () {
      // TODO 数据封装，还没有做好
      let blog = Object.create(null)
      blog.blog = this.blogValue
      blog.title = '这是一个测试数据'
      blog.tag = '测试数据的标签'
      blog.category = '测试数据的分类'
      blog.createTime = new Date()
      apiService.saveBlog(blog).then((result) => {
        if (result.data.status === 201) {
          alert('成功！')
        } else {
          alert('失败')
        }
      }).catch((error) => {
        console.log(error)
      })
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
