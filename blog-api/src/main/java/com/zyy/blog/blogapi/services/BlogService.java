package com.zyy.blog.blogapi.services;

import com.zyy.blog.blogapi.bean.Blog;
import com.zyy.blog.blogapi.dao.mybatis.BlogMapper;
import com.zyy.blog.blogapi.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author zyy.
 */
@Service("blogService")
public class BlogService implements IBlogService {

    @Autowired
    private BlogMapper blogMapper;


    @Override
    public Blog getBlogById(String id) {
        return blogMapper.getBlogById(id);
    }

    @Override
    public List<Blog> getAllBlog() {
        return blogMapper.getAllBlog();
    }

    @Override
    public void saveBlog(Blog blog) {
        blog.setUpdateTime(new Date());
        blog.setId(CommonUtil.getUuid());
        blogMapper.saveBlog(blog);
    }

    @Override
    public void deleteBlogById(String id) {
        blogMapper.deleteBlogById(id);
    }

    @Override
    public void updateBlog(Blog blog) {
        blogMapper.updateBlog(blog);
    }

}
