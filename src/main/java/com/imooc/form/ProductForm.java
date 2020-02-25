package com.imooc.form;

import com.imooc.enums.ProductStatusEnum;
import lombok.Data;

import java.math.BigDecimal;

/**
 * author: LEE
 * date: 2019/7/22  16:23
 * description:
 */
@Data
public class ProductForm {

    private String productId;

    //商品名称
    private String productName;

    //商品价格
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //描述
    private String productDescription;

    //小图
    private String productIcon;

    //商品状态 0：正常  1：下架
    private int productStatus;

    //类目编号
    private Integer categoryType;

}
