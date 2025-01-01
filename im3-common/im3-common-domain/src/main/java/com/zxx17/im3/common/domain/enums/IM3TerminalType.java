package com.zxx17.im3.common.domain.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 终端类型枚举.
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
@Getter
public enum IM3TerminalType {

    WEB(0,"web"),
    APP(1,"app");

    private final Integer code;

    private final String desc;

    IM3TerminalType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static IM3TerminalType fromCode(Integer code){
        for (IM3TerminalType typeEnum:values()) {
            if (typeEnum.code.equals(code)) {
                return typeEnum;
            }
        }
        return null;
    }

    public static List<Integer> codes(){
        return Arrays.stream(values()).map(IM3TerminalType::getCode).collect(Collectors.toList());
    }

}
