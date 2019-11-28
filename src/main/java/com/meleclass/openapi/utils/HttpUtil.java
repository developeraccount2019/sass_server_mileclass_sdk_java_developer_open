/**
 * ========================================================
 * Copyright(c) 2012-2019 Melot All Rights Reserve
 * ========================================================
 * 本软件由杭州米络科技有限公司所有, 未经书面许可, 任何单位和个人不得以
 * 任何形式复制代码的部分或全部, 并以任何形式传播。
 * 公司网址
 * <p>
 * http://melotgroup.com/
 * <p>
 * ========================================================
 */
package com.meleclass.openapi.utils;

import cn.hutool.core.util.IdUtil;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSONObject;
import com.meleclass.openapi.api.MelotConfiguration;
import com.meleclass.openapi.api.MelotResult;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhenshui.xia
 * @date: 2019/11/25
 * @desc: http请求工具类
 */
public class HttpUtil {
    /**
     * get请求
     * @param url  请求地址
     * @param paramMap 请求参数
     * @param type  返回对象类型
     * @param configuration  配置参数
     * @return
     */
    public static MelotResult get(String url, Map<String, Object> paramMap, Type type, MelotConfiguration configuration){
        String result = HttpRequest.get(url)
                .addHeaders(getHeader(configuration))
                .form(paramMap)
                .setReadTimeout(configuration.getReadTimeout())
                .setConnectionTimeout(configuration.getConnectionTimeout())
                .execute().body();
        System.out.println(result);
        MelotResult melotResult = JSONObject.parseObject(result, type);
        return melotResult;
    }

    /**
     * post请求
     * @param url  请求地址
     * @param paramMap 请求参数
     * @param type  返回对象类型
     * @param configuration  配置参数
     * @return
     */
    public static MelotResult post(String url, Map<String, Object> paramMap, Type type, MelotConfiguration configuration){
        String result = HttpRequest.post(url)
                .addHeaders(getHeader(configuration))
                .form(paramMap)
                .setReadTimeout(configuration.getReadTimeout())
                .setConnectionTimeout(configuration.getConnectionTimeout())
                .execute().body();
        System.out.println(result);
        MelotResult melotResult = JSONObject.parseObject(result, type);
        return melotResult;
    }

    /**
     *  获取http请求头参数
     * @param configuration
     * @return
     */
    private static Map<String, String> getHeader(MelotConfiguration configuration) {
        String nonce = IdUtil.randomUUID();
        String timestamp = String.valueOf(System.currentTimeMillis());
        Map<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("appId", configuration.getAppId());
        headerMap.put("nonce", nonce);
        headerMap.put("timestamp", timestamp);
        headerMap.put("signature", Md5Util.md5(configuration.getAppSecret() + nonce + timestamp));
        return headerMap;
    }
}
