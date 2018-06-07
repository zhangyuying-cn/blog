package com.zyy.blog.blogapi.util;

import java.util.UUID;

/**
 * @author zyy.
 */
public class CommonUtil {
    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
