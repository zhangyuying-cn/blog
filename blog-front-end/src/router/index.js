import Vue from 'vue'
import Router from 'vue-router'
import HomePage from '@/components/HomePage'
import editBlog from '@/components/bolg/editBlog'
import ShowOneBlog from '@/components/bolg/ShowOneBlog'
import ShowBlogTitle from '@/components/bolg/ShowBlogTitle'
import showBook from '@/components/book/ShowBookTitle'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HomePage',
      component: HomePage,
      children: [ {
        path: '/',
        name: 'showBlogTitle',
        component: ShowBlogTitle
      }, {
        path: '/showOneBlog',
        name: 'showOneBlog',
        component: ShowOneBlog
      }]
    }, {
      path: '/editBlog',
      name: 'editBlog',
      component: editBlog
    }, {
      path: '/showBook',
      name: 'showBook',
      component: showBook
    }

  ]
})
