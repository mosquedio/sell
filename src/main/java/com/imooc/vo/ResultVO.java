package com.imooc.vo;

import lombok.Data;

/**
 * author: LEE
 * date: 2019/7/6  14:34
 * description:http请求返回的最外层对象
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;
}
