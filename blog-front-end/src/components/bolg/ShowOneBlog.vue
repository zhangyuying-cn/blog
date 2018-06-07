<template>
  <div  >
    <mavon-editor class="h-100 " :value="blogContent" :toolbarsFlag="toolbarsFlag"
                  :subfield="subField" :defaultOpen="defaultOpen" />
  </div>
</template>

<script>
import * as apiService from '../../services/apiService'
export default {
  name: 'ShowOneBlog',
  data () {
    return {
      toolbarsFlag: false,
      subField: false,
      defaultOpen: 'preview',
      blogContent: ''
    }
  },
  beforeRouteEnter (to, from, next) {
    next(vm => {
      // vm.blogText = to.query.currentBlogId
      let blogId = to.query.currentBlogId
      // vm.blogContent = '### z这是题目'
      apiService.getBlogById(blogId).then((result) => {
        if (result.data.status === 200) {
          // 展示markdown的插件，接收string
          console.log(result.data.data.blog)
          let blogContent = JSON.stringify(result.data.data.blog)
          let blog = blogContent.replace(/^\"|\"$/g, '')
          vm.blogContent = blog
          console.log(vm.blogContent)
          // vm.blogContent = JSON.stringify(result.data.data.blog)
        } else {
          this.$router.push('/')
        }
      }).catch((error) => {
        console.log(error)
      })
    })
  }
}
</script>

<style scoped>
  /*.v-note-wrapper {*/
    /*min-height: 800px;*/
  /*}*/

</style>
