// export function getBlogText() {
//
// }
import Axios from 'Axios'
import path from './util/path.js'

export async function getBlogText () {
  let blog = await Axios.get(path.getBlog)
  return blog
}
