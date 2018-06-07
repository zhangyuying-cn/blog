package com.zyy.blog.blogapi.controller.response;

import com.zyy.blog.blogapi.constants.ResponseStatus;

/**
 * @author zyy.
 */
public class Resp {
    public static BlogResponse getSuccess(Object data) {
        return new BlogResponse(ResponseStatus.RESPONSE_2XX_OK, data);
    }

    public static BlogResponse saveSuccess(Object data) {
        return new BlogResponse(ResponseStatus.RESPONSE_2XX_CREATE, data);
    }

    public static BlogResponse updateSuccess(Object data) {
        return new BlogResponse(ResponseStatus.RESPONSE_2XX_UPDATED, data);
    }

    public static BlogResponse deleteSuccess() {
        return new BlogResponse(ResponseStatus.RESPONSE_2XX_NO_CONTENT);
    }
}
