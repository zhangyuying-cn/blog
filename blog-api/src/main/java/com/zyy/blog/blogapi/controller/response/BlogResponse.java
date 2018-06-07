package com.zyy.blog.blogapi.controller.response;

import com.zyy.blog.blogapi.constants.ResponseStatus;

/**
 * @author zyy.
 */
public class BlogResponse<T> {
    private T data;
    private Integer status;
    private String message;

    public BlogResponse(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public BlogResponse(ResponseStatus responseStatus, T data) {
        this.status = responseStatus.getStatus();
        this.message = responseStatus.getMessage();
        this.data = data;
    }

    public BlogResponse(ResponseStatus responseStatus) {
        this.status = responseStatus.getStatus();
        this.message = responseStatus.getMessage();
    }


    public BlogResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
