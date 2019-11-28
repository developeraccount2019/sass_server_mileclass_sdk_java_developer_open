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
package com.melot.mile.developer.open.pojo;

import com.melot.mile.developer.open.api.MelotPojo;
import lombok.Data;

/**
 * @author: zhenshui.xia
 * @date: 2019/11/25
 * @desc: 上课记录
 */
@Data
public class Live extends MelotPojo {
    /** 开始时间 */
    private Long beginTime;

    /** 结束时间 */
    private Long endTime;

    /** 老师id */
    private Integer userId;
}
