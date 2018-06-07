package com.zyy.blog.blogapi.dao.mybatis;

import com.zyy.blog.blogapi.bean.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zyy.
 */
@Mapper
public interface BlogMapper {

    /**
     * 根据id获取博客
     *
     * @param id
     * @return
     */
    Blog getBlogById(@Param("id") String id);

    /**
     * 保存博客
     *
     * @param blog
     */
    void saveBlog(@Param("blog") Blog blog);

    /**
     * 根据id删除博客
     *
     * @param id
     */
    void deleteBlogById(@Param("id") String id);

    /**
     * 更新博客
     *
     * @param blog
     * @return
     */
    void updateBlog(@Param("blog") Blog blog);

    List<Blog> getAllBlog();

}
