<template>
  <div>
    <div  v-for="(bookTitle,index) in bookTitles"
         :key="index">
      <div class="shadow p-3 mb-5 bg-white rounded w-25 float-left mr-3">
       {{ bookTitle.title }}
      </div>
    </div>

  </div>

</template>

<script>
export default {
  name: 'ShowBookTitle',
  data () {
    return {
      bookTitles: [
        { title: '深入理解java虚拟机' },
        { title: 'java编程思想' },
        { title: 'java并发编程' },
        { title: '编程珠玑' },
        { title: '七天七并发' },
        { title: '重构，改善既有代码设计' }
      ]
    }
  }
}
</script>

<style scoped>

</style>
