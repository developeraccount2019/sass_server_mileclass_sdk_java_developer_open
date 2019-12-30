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
package com.meleclass.openapi;

import com.meleclass.openapi.api.MelotApi;
import com.meleclass.openapi.api.MelotConfiguration;

/**
 * @author: zhenshui.xia
 * @date: 2019/12/3
 * @desc:
 */
public class Hello {
    public static void main(String[] args) {
        MelotConfiguration configuration = new MelotConfiguration.Builder()
                .setAppId("143071")
                .setAppSecret("c620c1a51be26b8020bd6f539259f37f")
                .build();

        MelotApi api = new MelotApi(configuration);
//        MelotResult<Room> melotResult = api.roomCreate("subject", System.currentTimeMillis()+ 10000000,
//                System.currentTimeMillis()+2000000000, null, null);

        api.roomInoutList("210381", 11034, 3,10);
    }
}
