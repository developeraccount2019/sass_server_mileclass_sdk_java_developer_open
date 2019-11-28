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

/**
 * @author: zhenshui.xia
 * @date: 2019/11/25
 * @desc: 配置类
 */
@Data
public class MelotConfiguration {
    /** 应用id */
    private  String appId;
    /** 应用密钥 */
    private  String appSecret;
    /** http读取超时时间，单位毫秒，默认10s */
    private Integer readTimeout;
    /** http连接超时时间，单位毫秒， 默认10s */
    private Integer connectionTimeout;



    public static class Builder {
        private  String appId;
        private  String appSecret;
        private Integer readTimeout;
        private Integer connectionTimeout;

        /**
         * 设置应用id
         * @param appId
         * @return
         */
        public Builder setAppId(String appId){
            this.appId = appId;
            return this;
        }

        /**
         * 设置应用密钥
         * @param appSecret
         * @return
         */
        public Builder setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         *  设置http读取超时时间，单位毫秒
         * @param milliseconds
         * @return
         */
        public Builder setReadTimeout(Integer milliseconds) {
            this.readTimeout = milliseconds;
            return this;
        }

        /**
         * 设置http连接超时时间，单位毫秒
         * @param milliseconds
         * @return
         */
        public Builder setConnectionTimeout(Integer milliseconds) {
            this.connectionTimeout = milliseconds;
            return this;
        }

        /**
         * 生成配置对象
         * @return
         */
        public MelotConfiguration build(){
            if(readTimeout == null || readTimeout<=0) {
                readTimeout = 10000;
            }

            if(connectionTimeout == null || connectionTimeout<=0) {
                connectionTimeout = 10000;
            }

            MelotConfiguration configuration = new MelotConfiguration();
            configuration.setAppId(appId);
            configuration.setAppSecret(appSecret);
            configuration.setReadTimeout(readTimeout);
            configuration.setConnectionTimeout(connectionTimeout);

            return configuration;
        }
    }

}
