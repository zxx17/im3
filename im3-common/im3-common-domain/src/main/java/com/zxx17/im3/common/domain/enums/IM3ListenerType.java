package com.zxx17.im3.common.domain.enums;

import lombok.Getter;

/**
 * 监听枚举.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Getter
public enum IM3ListenerType {
    ALL(0, "全部消息"),
    PRIVATE_MESSAGE(1, "私聊消息"),
    GROUP_MESSAGE(2, "群聊消息");

    private final Integer code;

    private final String desc;

    IM3ListenerType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
