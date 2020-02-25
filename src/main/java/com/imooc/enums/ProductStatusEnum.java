package com.imooc.enums;

import com.imooc.util.EnumUtil;
import lombok.Getter;

/**
 * author: LEE
 * date: 2019/7/6  11:55
 * description:
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"上架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
