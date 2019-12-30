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
 * @desc: 学生点到信息
 */
@Data
public class RollcallDetail {
    /** 用户id */
    private Integer userId;
    /** 用户昵称 */
    private String nickName;
    /** 点到时间 */
    private Long rollcallTime;
}
