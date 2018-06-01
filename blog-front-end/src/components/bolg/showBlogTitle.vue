<template>
  <div>
    <div class="show_blog_title" v-for="value in values">
      <mavon-editor  :value="value.title"   :toolbarsFlag="toolbarsFlag"   :subfield="subField" :defaultOpen="defaultOpen"/>
    </div>
  </div>
</template>

<script>
export default {
  name: 'showBlogTitle',
  data () {
    return {
      toolbarsFlag: false,
      subField: false,
      defaultOpen: 'preview',
      values: [
        {title: '<h5> 深入理解java虚拟机</h5>'},
        {title: '* java编程思想'},
        {title: '* java并发编程'}
      ]
    }
  }
}
</script>

<style scoped>
.show_blog_title{
  width:80%;
  height:50px;
}
</style>
