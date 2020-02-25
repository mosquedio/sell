package com.imooc.services;

import com.imooc.dto.OrderDTO;

/**
 * author: LEE
 * date: 2019/7/29  16:33
 * description:推送消息
 */
public interface PushMessageService {

    //订单状态变更消息
    void orderStatus(OrderDTO orderDTO);
}
