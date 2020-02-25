package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.Getter;

import java.util.function.Supplier;

/**
 * author: LEE
 * date: 2019/7/10  15:50
 * description:
 */
@Getter
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
