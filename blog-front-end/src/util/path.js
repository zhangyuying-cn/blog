const path = {

  context: 'blog-api',

  getAllBlog: 'blog-api/api/blogs',

  getBlogById (id) {
    return `blog-api/api/blogs/${id}`
  },

  saveBlog: 'blog-api/api/blogs'

}

// const reg = /^\"|\"$/g

export {
  path
}
