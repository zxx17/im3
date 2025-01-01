package com.zxx17.im3.common.domain.moddel;

import com.zxx17.im3.common.domain.enums.IM3TerminalType;
import lombok.Data;

import java.util.List;

/**
 * 私聊消息.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Data
public class IM3PrivateMessage<T> {

    /**
     * 发消息的用户
     */
    private IM3UserInfo sender;

    /**
     * 接收消息的用户id
     */
    private Long receiveId;

    /**
     * 接收者的终端类型
     */
    private List<Integer> receiveTerminals = IM3TerminalType.codes();

    /**
     * 是否发送给自己的其他终端,默认true
     */
    private Boolean sendToSelf = true;

    /**
     * 是否需要回推发送结果,默认true
     */
    private Boolean sendResult = true;

    /**
     *  消息内容
     */
    private T data;

}
