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

import lombok.*;

import java.io.Serializable;


/**
 * author: zhenshui.xia
 * date: 2019/6/26
 * desc: 接口响应对象
 */
@Data
public class MelotResult<T>  implements Serializable{

    /** 失败信息描述 */
    private String errorMsg ;

    /** 响应码 */
    private Integer code;

    /** 接口成功返回数据 */
    private T data;
}
