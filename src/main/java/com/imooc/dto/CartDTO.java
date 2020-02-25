package com.imooc.dto;

import lombok.Data;

/**
 * author: LEE
 * date: 2019/7/10  16:30
 * description:
 */
@Data
public class CartDTO {

    //商品Id
    private String productId;

    //数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
