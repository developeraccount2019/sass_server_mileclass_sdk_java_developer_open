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

import lombok.Data;

/**
 * @author: zhenshui.xia
 * @date: 2019/11/25
 * @desc: 房间用户进出统计
 */
@Data
public class InoutStat {
    /** 用户id */
    private Integer userId;
    /** 用户角色，1-学生；2-老师；3-旁听 4：助教 */
    private Integer userType;
    /** 用户昵称 */
    private String nickName;
    /** 合作方用户ID*/
    private String userNo;
    /** 最早时入时间	 */
    private Long enterTime;
    /** 最后一次离开房间时间	 */
    private Long leaveTime;
    /** 实际听课时长，指上课状态下，学生在房间的停留时长，单位秒	 */
    private Integer totalTime;
}
