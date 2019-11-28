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
package com.melot.mile.developer.open.api;

import lombok.Data;

import java.util.List;

/**
 * @author: zhenshui.xia
 * @date: 2019/11/25
 * @desc: 分页类
 */
@Data
public class MelotPage<T>  {
    /** 数据 */
    private List<T> list;
    /** 总共数据 */
    private long total;
    /** 每页最多数量 */
    private long pageSize;
    /** 当前页，从第一页开始 */
    private long page;
}
