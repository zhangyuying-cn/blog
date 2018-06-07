import Axios from 'axios'
import { path } from '../util/path.js'

export function getAllBlog () {
  return Axios.get(path.getAllBlog)
}

export function getBlogById (blogId) {
  return Axios.get(path.getBlogById(blogId))
}

export function saveBlog (blog) {
  return Axios.post(path.saveBlog, blog)
}

// export sync function saveBlog (blog) {
//  await Axios.post(path.saveBlog, blog)
// }
