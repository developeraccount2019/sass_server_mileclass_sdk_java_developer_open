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

import lombok.Data;

/**
 * @author: zhenshui.xia
 * @date: 2019/12/30
 * @desc: 老师点名信息
 */
@Data
public class Rollcall {
    /** 点名记录ID */
    private Integer rollcallId;
    /** 开始时间 */
    private Long startTime;
    /** 结束时间 */
    private Long endTime;
    /** 在线人数，发起点名时，房间内在线用户人数 */
    private Integer onlineCount;
    /** 点到人数，发起点名后，房间内点到用户人数 */
    private Integer rollcallCount;
}
