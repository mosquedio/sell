package com.imooc.services;

import com.imooc.dto.OrderDTO;
import org.springframework.util.StringUtils;

/**
 * author: LEE
 * date: 2019/7/11  17:34
 * description:买家
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
