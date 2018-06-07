package com.zyy.blog.blogapi.controller;

import com.zyy.blog.blogapi.bean.Blog;
import com.zyy.blog.blogapi.constants.ResponseStatus;
import com.zyy.blog.blogapi.controller.response.BlogResponse;
import com.zyy.blog.blogapi.controller.response.Resp;
import com.zyy.blog.blogapi.services.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyy.
 */
@RequestMapping("/api")
@RestController
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping(path = "/blogs/{id}")
    public BlogResponse getBlogById(@PathVariable("id") String id) {
        return Resp.getSuccess(blogService.getBlogById(id));
    }

    @GetMapping(path = "/blogs")
    public BlogResponse getAllBlog() {
        return Resp.getSuccess(blogService.getAllBlog());
    }

    @PostMapping(path = "/blogs",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BlogResponse saveBlog(@RequestBody Blog blog) {
        blogService.saveBlog(blog);
        return Resp.saveSuccess(blog);
    }
}
