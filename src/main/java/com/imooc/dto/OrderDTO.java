package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.util.EnumUtil;
import com.imooc.util.serializer.Date2LongSerializer;
import lombok.Data;
import sun.plugin2.message.Serializer;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * author: LEE
 * date: 2019/7/10  15:29
 * description:
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    //订单id
    private String orderId;

    //买家名字
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家微信OpenId
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态,默认为 0-新下单
    private Integer orderStatus;

    //支付状态,默认为 0-未支付
    private  Integer payStatus;

    //创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    //更新时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    //获取code对应的订单状态枚举的对象
    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus,OrderStatusEnum.class);
    }

    //获取code对应的支付状态枚举的对象
    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus,PayStatusEnum.class);
    }

}
