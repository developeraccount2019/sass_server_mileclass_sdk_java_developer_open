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

import com.meleclass.openapi.api.MelotErrorCode;
import com.meleclass.openapi.api.MelotException;
import org.apache.commons.lang3.StringUtils;

/**
 * author: zhenshui.xia
 * date: 2019/11/25
 * desc: 常用工具类
 */
public class MelotUtil {
    /**
     * 检查参数是否为空
     * @param t 参数值
     * @param name 参数名
     * @param <T>  参数类型
     * @throws MelotException  系统定义异常
     */
    public static <T>void checkEmptyParameter(T t, String name) throws MelotException {
        if(t == null || StringUtils.isBlank(t.toString())) {
            throw new MelotException(MelotErrorCode.ERROR_PARAM_EMPTY,
                    "参数"+name+"错误:"+"["+ t +"], "+name+"不能为空");
        }
    }
}
