package com.zyy.blog.blogapi.constants;

/**
 * @author zyy.
 */
public enum ResponseStatus {
    //[GET]：服务器成功返回用户请求的数据
    RESPONSE_2XX_OK(200, "Ok"),
    //[POST/PUT/PATCH]：用户新建或修改数据成功。
    RESPONSE_2XX_CREATE(201, "Created"),
    RESPONSE_2XX_UPDATED(201, "Updated"),
    //表示一个请求已经进入后台排队（异步任务）
    RESPONSE_2XX_ACCEPTED(202, "Accepted"),
    //[DELETE]：用户删除数据成功。
    RESPONSE_2XX_NO_CONTENT(204, "No Content");

    private Integer status;

    private String message;

    ResponseStatus(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }


}
