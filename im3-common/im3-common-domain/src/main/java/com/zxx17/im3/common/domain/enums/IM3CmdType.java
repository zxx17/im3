package com.zxx17.im3.common.domain.enums;

import lombok.Getter;

/**
 * 命令类型.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Getter
public enum IM3CmdType {
    LOGIN(0, "登录"),
    HEART_BEAT(1, "心跳"),
    FORCE_LOGUT(2, "强制下线"),
    PRIVATE_MESSAGE(3, "私聊消息"),
    GROUP_MESSAGE(4, "群发消息");


    private final Integer code;

    private final String desc;

    IM3CmdType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static IM3CmdType fromCode(Integer code) {
        for (IM3CmdType typeEnum : values()) {
            if (typeEnum.code.equals(code)) {
                return typeEnum;
            }
        }
        return null;
    }


}
