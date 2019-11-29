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
 * date: 2019/6/26
 * desc: 业务逻辑异常
 */
public class MelotException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private MelotErrorCode melotErrorCode;

    public MelotException(MelotErrorCode melotErrorCode) {
        super(melotErrorCode.getErrorMsg(), null);
        this.melotErrorCode = melotErrorCode;
    }

    public MelotException(MelotErrorCode melotErrorCode, String errorMsg) {
        super(errorMsg, null);
        this.melotErrorCode = melotErrorCode;
    }

    public MelotErrorCode getMelotErrorCode() {
        return this.melotErrorCode;
    }
}
