package com.imooc.util;

import com.imooc.enums.CodeEnum;

/**
 * author: LEE
 * date: 2019/7/19  11:32
 * description:通过枚举类型的code值获取枚举类型对象
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each:enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
