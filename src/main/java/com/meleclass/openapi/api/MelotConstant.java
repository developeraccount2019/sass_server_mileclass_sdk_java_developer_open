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
    private static final String API_HOST = "http://10.4.13.240:9528";

    /** 创建房间接口地址 */
    public static final String ROOM_CREATE_URL = API_HOST + "/api/server/room/create";

    /** 修改房间接口地址 */
    public static final String ROOM_MODIFY_URL = API_HOST + "/api/server/room/modify";

    /** 创建房间接口地址 */
    public static final String ROOM_INFO_URL = API_HOST + "/api/server/room/info";

    /** 创建房间接口地址 */
    public static final String ROOM_PLAYBACK_URL = API_HOST + "/api/server/room/playback";

    /** 创建房间接口地址 */
    public static final String ROOM_INOUT_STAT_LIST_URL = API_HOST + "/api/server/room/inout/stat/list";

    /** 创建房间接口地址 */
    public static final String ROOM_LIVE_LIST_URL = API_HOST + "/api/server/room/live/list";

    /** 创建房间接口地址 */
    public static final String ROOM_INOUT_LIST_URL = API_HOST + "/api/server/room/inout/list";
}
