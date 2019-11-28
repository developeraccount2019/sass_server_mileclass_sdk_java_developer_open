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
package com.meleclass.openapi.pojo;

import com.meleclass.openapi.api.MelotPojo;
import lombok.Data;

/**
 * @author: zhenshui.xia
 * @date: 2019/11/25
 * @desc: 回放信息
 */
@Data
public class Playback extends MelotPojo {
    /** 回放状态 0：回放未生成 1：回放已经生成 */
    private Integer status;
    /** 回放地址 */
    private String url;
}
