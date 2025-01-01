package com.zxx17.im3.common.domain.moddel;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * .
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class IM3SendResult<T> extends TopicMessage implements Serializable {
    /**
     * 发送消息的用户
     */
    private IM3UserInfo sender;

    /**
     * 接收消息的用户
     */
    private IM3UserInfo receiver;

    /**
     * 发送状态 IMCmdType
     */
    private Integer code;

    /**
     *  消息内容
     */
    private T data;

}
