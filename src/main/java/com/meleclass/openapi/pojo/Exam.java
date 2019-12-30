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
 * @desc: 老师测试信息
 */
@Data
public class Exam {
    /** 答题记录ID */
    private Integer examId;
    /** 开始时间 */
    private Long startTime;
    /** 结束时间 */
    private Long endTime;
    /** 答题类型：1：选择题；2：判断题；3：主观题； */
    private Integer type;
    /** 在线人数，发起答题时，房间内在线用户人数 */
    private Integer onlineCount;
    /** 应答人数，发起答题后，房间内作答用户人数 */
    private Integer answerCount;
    /** 答对人数，若主观题类型，则因为没有正确答案，该字段没有意义，返回为0 */
    private Integer correctCount;
}
