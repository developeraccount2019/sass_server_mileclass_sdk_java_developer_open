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
package com.meleclass.openapi.api;

/**
 * author: zhenshui.xia
 * date: 2019/11/4
 * desc: 错误码描述
 */
public enum  MelotErrorCode {

    /** 配置信息不能为空*/
    ERROR_CONFIGURATION_EMPTY("配置信息不能为空"),

    /** 配置信息缺少appId*/
    ERROR_CONFIGURATION_APP_ID_EMPTY("配置信息缺少appId"),

    /** 配置信息缺少appSecret*/
    ERROR_CONFIGURATION_APP_SECRET_EMPTY("配置信息缺少appSecret"),

    /** 参数不能为空*/
    ERROR_PARAM_EMPTY("参数不能为空");


    /** 失败信息描述 */
    private String errorMsg ;


    MelotErrorCode(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }
}
