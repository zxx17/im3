package com.zxx17.im3.common.domain.moddel;

import lombok.Data;

/**
 * 基础消息.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Data
public class TopicMessage {
    /**
     * 消息的目的地，可以是消息的主题
     */
    private String destination;

}
