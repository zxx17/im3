package com.zxx17.im3.common.domain.moddel;

import lombok.Data;

/**
 * 发送信息.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Data
public class IM3SendInfo<T> {
    /**
     * 命令类型 IMCmdType枚举的值
     */
    private Integer cmd;

    /**
     * 推送消息的数据
     */
    private T data;

}
