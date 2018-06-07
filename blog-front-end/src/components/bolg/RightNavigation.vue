<template>
  <div class="text-center mr-5">
    <img :src="headSvg" class="rounded"/>
    <div class="ml-2" style="clear: both">不积跬步，无以至千里</div>

    <div class="border-dark mt-4 pt-3 text-muted  border-top">
      <h4 style="">标签</h4>
      <div v-for="(value,index) in labels" :key="index">
        <span  class="btn-sm float-left m-2">{{ value }}</span>
      </div>
    </div>
  </div>

</template>

<script>
import headSvg from './../../assets/head/head.svg'
export default {
  name: 'RightNavigation',
  data () {
    return {
      headSvg,
      labels: ['linux', 'java', 'c++', 'web', '泛型', '单元测试']
    }
  }
}
</script>

<style scoped>

</style>
