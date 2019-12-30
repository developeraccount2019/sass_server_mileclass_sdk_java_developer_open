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

/**
 * author: zhenshui.xia
 * date: 2019/11/25
 * desc: 常量类
 */
public class MelotConstant {
    /** 接口地址 */
    private static final String API_HOST = "http://openapi.meleclass.com";

    /** 创建房间接口地址 */
    public static final String ROOM_CREATE_URL = API_HOST + "/api/room/create";

    /** 修改房间接口地址 */
    public static final String ROOM_MODIFY_URL = API_HOST + "/api/room/modify";

    /** 创建房间接口地址 */
    public static final String ROOM_INFO_URL = API_HOST + "/api/room/info";

    /** 创建房间接口地址 */
    public static final String ROOM_PLAYBACK_URL = API_HOST + "/api/room/playback";

    /** 创建房间接口地址 */
    public static final String ROOM_INOUT_STAT_LIST_URL = API_HOST + "/api/room/inout/stat/list";

    /** 创建房间接口地址 */
    public static final String ROOM_LIVE_LIST_URL = API_HOST + "/api/room/live/list";

    /** 创建房间接口地址 */
    public static final String ROOM_INOUT_LIST_URL = API_HOST + "/api/room/inout/list";


    /** 根据房间ID查询房间内答题记录 */
    public static final String ROOM_EXAM_LIST_URL = API_HOST + "/api/room/exam/list";

    /** 根据答题记录ID查询用户答题数据 */
    public static final String ROOM_EXAM_DETAIL_URL = API_HOST + "/api/room/exam/detail";

    /** 根据房间ID查询房间内点名记录 */
    public static final String ROOM_ROLLCALL_LIST_URL = API_HOST + "/api/room/rollcall/list";

    /** 根据点名记录ID查询用户点名数据 */
    public static final String ROOM_ROLLCALL_DETAIL_URL = API_HOST + "/api/room/rollcall/detail";

    /** 根据房间ID查询用户连麦数据 */
    public static final String ROOM_JOINLIVE_LIST_URL = API_HOST + "/api/room/joinlive/list";

    /** 设置回调地址 */
    public static final String CALLBACK_SET_URL = API_HOST + "/api/callback/setUrl";

    /** 删除回调地址 */
    public static final String CALLBACK_DEL_URL = API_HOST + "/api/callback/delUrl";
}
