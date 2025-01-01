package com.zxx17.im3.common.domain.enums;

import lombok.Getter;

/**
 * 发送编码.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Getter
public enum IM3SendCode {
    SUCCESS(0, "发送成功"),
    NOT_ONLINE(1, "对方当前不在线"),
    NOT_FIND_CHANNEL(2, "未找到对方的channel"),
    UNKNOWN_ERROR(9999, "未知异常");

    private final Integer code;
    private final String desc;

    IM3SendCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


}
