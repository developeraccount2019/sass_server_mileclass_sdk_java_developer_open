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
package com.melot.mile.developer.open.utils;

import com.melot.mile.developer.open.api.MelotErrorCode;
import com.melot.mile.developer.open.api.MelotException;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: zhenshui.xia
 * @date: 2019/11/25
 * @desc: 常用工具类
 */
public class MelotUtil {
    /**
     * 检查参数是否为空
     * @param t
     * @param name
     * @param <T>
     * @throws MelotException
     */
    public static <T>void checkEmptyParameter(T t, String name) throws MelotException {
        if(t == null || StringUtils.isBlank(t.toString())) {
            throw new MelotException(MelotErrorCode.ERROR_PARAM_EMPTY,
                    "参数"+name+"错误:"+"["+ t +"], "+name+"不能为空");
        }
    }
}