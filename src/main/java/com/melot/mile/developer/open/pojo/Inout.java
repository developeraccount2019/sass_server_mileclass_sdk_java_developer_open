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
 * @desc: 用户进出信息
 */
@Data
public class Inout extends MelotPojo {
    /** 最早时入时间	 */
    private Long enterTime;
    /** 最晚退出时间 */
    private Long leaveTime;
    /** 用户类型 1-学生；2-老师；3-旁听 4：助教 */
    private Integer userType;
    /** 用户Id */
    private Integer userId;
}