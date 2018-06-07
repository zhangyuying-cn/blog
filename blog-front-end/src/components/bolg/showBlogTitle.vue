<template>
  <div>
    <div class="m-1" v-for="(blog,index) in allBlogs"
         :key="index">
      <div class="mb-5 border-bottom">
        <h5 @click="showOneBlog(blog.id)"> {{ blog.title }}</h5>
        <div class="text-truncate text-justify"> &nbsp;&nbsp;&nbsp;&nbsp;{{
                                                 blog.blog }}
        </div>
        <div class="text-secondary text-sm-left form-control-sm mt-1"
             aria-label="Small">{{ blog.createTime }}
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ShowOneBlog from './ShowOneBlog'
import * as apiService from '../../services/apiService'

export default {
  name: 'showBlogTitle',
  data () {
    return {
      toolbarsFlag: false,
      subField: false,
      defaultOpen: 'preview',
      allBlogs: []
    }
  },
  methods: {
    showOneBlog (currentBlogId) {
      this.$router.push({
        path: '/showOneBlog',
        query: {
          currentBlogId
        }
      })
    }
  },
  created () {
    apiService.getAllBlog().then((result) => {
      if (result.data.status === 200) {
        this.allBlogs.push(...result.data.data)
      }
    })
  },
  components: {
    ShowOneBlog
  }
}
</script>

<style scoped>

  .v-note-wrapper {
    min-height: 100px;
  }
</style>
