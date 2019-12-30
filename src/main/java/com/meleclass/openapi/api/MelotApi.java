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

import com.google.common.reflect.TypeToken;
import com.meleclass.openapi.pojo.*;
import com.meleclass.openapi.utils.HttpUtil;
import com.meleclass.openapi.utils.MelotUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author: zhenshui.xia
 * date: 2019/11/25
 * desc: 接口调用实现
 */
public class MelotApi {
    /** 配置对象 */
    private MelotConfiguration configuration;

    public MelotApi(MelotConfiguration configuration) throws MelotException {
        if(configuration == null) {
            throw new MelotException(MelotErrorCode.ERROR_CONFIGURATION_EMPTY);
        }

        if(StringUtils.isBlank(configuration.getAppId())) {
            throw new MelotException(MelotErrorCode.ERROR_CONFIGURATION_APP_ID_EMPTY);
        }

        if(StringUtils.isBlank(configuration.getAppSecret())) {
            throw new MelotException(MelotErrorCode.ERROR_CONFIGURATION_APP_SECRET_EMPTY);
        }

        this.configuration = configuration;
    }

    /**
     * 房间创建
     * @param subject  房间主题(必填）
     * @param startTime  开始时间戳（必填）
     * @param endTime  结束时间戳（必填）
     * @param teacherRemark  老师备注
     * @param roomRemark  房间备注
     * @return  创建房间的信息
     */
    public MelotResult<Room> roomCreate(String subject, Long startTime, Long endTime, String teacherRemark, String roomRemark) {
        MelotUtil.checkEmptyParameter(subject, "subject");
        MelotUtil.checkEmptyParameter(startTime, "startTime");
        MelotUtil.checkEmptyParameter(endTime, "endTime");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("subject", subject);
        paramMap.put("startTime", startTime);
        paramMap.put("endTime", endTime);
        paramMap.put("teacherRemark", teacherRemark);
        paramMap.put("roomRemark", roomRemark);

        MelotResult<Room> melotResult = HttpUtil.post(MelotConstant.ROOM_CREATE_URL,
                paramMap, new TypeToken<MelotResult<Room>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 房间修改
     * @param roomId 房间id（必填）
     * @param subject  房间主题
     * @param startTime  开始时间戳
     * @param endTime  结束时间戳
     * @param teacherRemark  老师备注
     * @param roomRemark  房间备注
     * @param status  房间状态：0-关闭；1-开启（默认状态
     * @return  房间修改后信息
     */
    public MelotResult<Room> roomModify(Integer roomId, String subject, Long startTime, Long endTime, String teacherRemark, String roomRemark, Integer status) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);
        paramMap.put("subject", subject);
        paramMap.put("startTime", startTime);
        paramMap.put("endTime", endTime);
        paramMap.put("teacherRemark", teacherRemark);
        paramMap.put("roomRemark", roomRemark);
        paramMap.put("status", status);

        MelotResult<Room> melotResult = HttpUtil.post(MelotConstant.ROOM_MODIFY_URL,
                paramMap, new TypeToken<MelotResult<Room>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 获取房间信息
     * @param roomId 房间id（必填）
     * @return 当前roomId的房间信息
     */
    public MelotResult<Room> roomInfo(Integer roomId) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);

        MelotResult<Room> melotResult = HttpUtil.get(MelotConstant.ROOM_INFO_URL,
                paramMap, new TypeToken<MelotResult<Room>>(){}.getType(), configuration);
        return melotResult;
    }


    /**
     * 查询房间回放信息
     * @param roomId 房间id（必填）
     * @return  回放信息
     */
    public MelotResult<Playback> roomPlayback(Integer roomId) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);

        MelotResult<Playback> melotResult = HttpUtil.get(MelotConstant.ROOM_PLAYBACK_URL,
                paramMap, new TypeToken<MelotResult<Playback>>(){}.getType(), configuration);
        return melotResult;
    }


    /**
     * 查询房间用户听课统计记录
     * @param roomId 房间id（必填）
     * @param page 当前页，从第1页开始， 默认1
     * @param pageSize 每页最多数量， 默认20
     * @return  用户听课统计记录，分页
     */
    public MelotResult<MelotPage<InoutStat>> roomInoutStatList(Integer roomId, Integer page, Integer pageSize) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);
        paramMap.put("page", page);
        paramMap.put("pageSize", pageSize);

        MelotResult<MelotPage<InoutStat>> melotResult = HttpUtil.get(MelotConstant.ROOM_INOUT_STAT_LIST_URL,
                paramMap, new TypeToken<MelotResult<MelotPage<InoutStat>>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 查询房间用户进出记录
     * @param roomId 房间id（必填）
     * @param userId 用户id
     * @param page 当前页，从第1页开始， 默认1
     * @param pageSize 每页最多数量， 默认20
     * @return  用户进出记录
     */
    public MelotResult<MelotPage<Inout>> roomInoutList(Integer roomId, Integer userId, Integer page, Integer pageSize) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);
        paramMap.put("userId", userId);
        paramMap.put("page", page);
        paramMap.put("pageSize", pageSize);

        MelotResult<MelotPage<Inout>> melotResult = HttpUtil.get(MelotConstant.ROOM_INOUT_LIST_URL,
                paramMap, new TypeToken<MelotResult<MelotPage<Inout>>>(){}.getType(), configuration);
        return melotResult;
    }


    /**
     * 查询房间上课记录
     * @param roomId 房间id（必填）
     * @return 上课记录，分页
     */
    public MelotResult<List<Live>> roomLiveList(Integer roomId) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);

        MelotResult<List<Live>> melotResult = HttpUtil.get(MelotConstant.ROOM_LIVE_LIST_URL,
                paramMap, new TypeToken<MelotResult<List<Live>>>(){}.getType(), configuration);
        return melotResult;
    }


    /**
     * 根据房间ID查询房间内答题记录
     * @param roomId 房间id（必填）
     * @return 房间内答题记录
     */
    public MelotResult<List<Exam>> examList(Integer roomId) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);

        MelotResult<List<Exam>> melotResult = HttpUtil.get(MelotConstant.ROOM_EXAM_LIST_URL,
                paramMap, new TypeToken<MelotResult<List<Exam>>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 根据答题记录ID查询用户答题数据
     * @param examId 房间id（必填）
     * @return 用户答题数据
     */
    public MelotResult<List<ExamDetail>> examDetail(Integer examId) {
        MelotUtil.checkEmptyParameter(examId, "examId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("examId", examId);

        MelotResult<List<ExamDetail>> melotResult = HttpUtil.get(MelotConstant.ROOM_EXAM_DETAIL_URL,
                paramMap, new TypeToken<MelotResult<List<ExamDetail>>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 根据房间ID查询房间内点名记录
     * @param roomId 房间id（必填）
     * @return 房间内点名记录
     */
    public MelotResult<List<Rollcall>> rollcallList(Integer roomId) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);

        MelotResult<List<Rollcall>> melotResult = HttpUtil.get(MelotConstant.ROOM_ROLLCALL_LIST_URL,
                paramMap, new TypeToken<MelotResult<List<Rollcall>>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 根据点名记录ID查询用户点名数据
     * @param rollcallId 房间id（必填）
     * @return 用户点名数据
     */
    public MelotResult<List<RollcallDetail>> rollcallDetail(Integer rollcallId) {
        MelotUtil.checkEmptyParameter(rollcallId, "rollcallId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("rollcallId", rollcallId);

        MelotResult<List<RollcallDetail>> melotResult = HttpUtil.get(MelotConstant.ROOM_ROLLCALL_DETAIL_URL,
                paramMap, new TypeToken<MelotResult<List<RollcallDetail>>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 根据房间ID查询用户连麦数据
     * @param roomId 房间id（必填）
     * @return 用户连麦数据，分页
     */
    public MelotResult<MelotPage<JoinLive>> joinliveList(Integer roomId) {
        MelotUtil.checkEmptyParameter(roomId, "roomId");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("roomId", roomId);

        MelotResult<MelotPage<JoinLive>> melotResult = HttpUtil.get(MelotConstant.ROOM_JOINLIVE_LIST_URL,
                paramMap, new TypeToken<MelotResult<MelotPage<JoinLive>>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 设置回调地址
     * @param url 回调地址（必填）
     * @param requestMethod 回调请求方式，1：GET, 2:POST（非必填）
     * @return 无
     */
    public MelotResult<Void> callbackSetUrl(String url, Integer requestMethod) {
        MelotUtil.checkEmptyParameter(url, "url");

        if (requestMethod != null && (requestMethod != 1 || requestMethod != 2)) {
            throw new MelotException(MelotErrorCode.ERROR_PARAM_VALUE, "参数requestMethod错误:["+ requestMethod +"]");
        }

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("url", url);
        paramMap.put("requestMethod", requestMethod);


        MelotResult<Void> melotResult = HttpUtil.get(MelotConstant.CALLBACK_SET_URL,
                paramMap, new TypeToken<MelotResult<Void>>(){}.getType(), configuration);
        return melotResult;
    }

    /**
     * 删除回调地址
     * @return 无
     */
    public MelotResult<Void> callbackDelUrl() {
        MelotResult<Void> melotResult = HttpUtil.get(MelotConstant.CALLBACK_DEL_URL,
                null, new TypeToken<MelotResult<Void>>(){}.getType(), configuration);
        return melotResult;
    }

}
