package com.zxx17.im3.common.domain.moddel;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 接收到的信息.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class IM3ReceiveInfo extends TopicMessage implements Serializable {
    /**
     * 命令类型 IMCmdType枚举的值
     */
    private Integer cmd;

    /**
     * 发送消息的用户
     */
    private IM3UserInfo sender;

    /**
     * 接收消息的用户列表
     */
    List<IM3UserInfo> receivers;

    /**
     *  是否需要回调发送结果
     */
    private Boolean sendResult;

    /**
     * 推送消息体
     */
    private Object data;

}
