package com.zyy.blog.blogapi.services;

import com.zyy.blog.blogapi.bean.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zyy.
 */
public interface IBlogService {
    /**
     * 根据id获取博客
     *
     * @param id
     * @return
     */
    Blog getBlogById(String id);

    /**
     * 获取所有的博客
     * @return
     */
    List<Blog> getAllBlog();

    /**
     * 保存博客
     *
     * @param blog
     */
    void saveBlog(Blog blog);

    /**
     * 根据id删除博客
     *
     * @param id
     */
    void deleteBlogById(String id);

    /**
     * 更新博客
     *
     * @param blog
     * @return
     */
    void updateBlog(Blog blog);
}
