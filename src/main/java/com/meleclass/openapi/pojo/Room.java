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
 * author: zhenshui.xia
 * date: 2019/11/25
 * desc: 房间信息
 */
@Data
public class Room extends MelotPojo {
    /** 助教Token */
    private String assistantToken;
    /** 旁听Token */
    private String auditToken;
    /** 课堂结束时间 */
    private Long endTime;
    /** 课堂Id */
    private Integer roomId;
    /** 课堂备注 */
    private String roomRemark;
    /** 课堂开始时间 */
    private Long startTime;
    /** 课堂状态；0-关闭；1-开启，可以进入课堂	 */
    private String status;
    /** 学生Token */
    private String studentToken;
    /** 课堂主题 */
    private String subject;
    /** 老师备注 */
    private String teacherRemark;
    /** 老师Token */
    private String teacherToken;
}
