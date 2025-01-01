package com.zxx17.im3.common.domain.moddel;

import com.zxx17.im3.common.domain.enums.IM3TerminalType;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * 群消息.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Data
public class IM3GroupMessage <T>{

    /**
     * 发消息的用户
     */
    private IM3UserInfo sender;

    /**
     * 接收者id列表(群成员列表,为空则不会推送)
     */
    private List<Long> receiveIds = new LinkedList<>();

    /**
     * 接收者终端类型，默认全部终端
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
