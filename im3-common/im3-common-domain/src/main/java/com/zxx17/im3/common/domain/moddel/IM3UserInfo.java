package com.zxx17.im3.common.domain.moddel;

import lombok.Data;

/**
 * 发送消息的用户
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Data
public class IM3UserInfo {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 终端类型
     */
    private Integer terminal;
}
