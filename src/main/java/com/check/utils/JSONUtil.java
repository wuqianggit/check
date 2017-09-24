package com.check.utils;

import net.sf.json.JSONObject;

/**
 *
 * com.check.utils
 *
 * 2017/9/23-19:24
 * 2017
 * Created by wuqiang on 2017/9/23.
 */
public class JSONUtil {
    /**
     * java对象转换类
     * @param object
     * @return
     */
    public static JSONObject obj2JsonObj(Object object){
        JSONObject jsonObject = JSONObject.fromObject(object);
        return jsonObject;
    }
}
