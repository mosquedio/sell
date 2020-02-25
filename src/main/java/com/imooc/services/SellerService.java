package com.imooc.services;

import com.imooc.dataobject.SellerInfo;

/**
 * author: LEE
 * date: 2019/7/23  10:59
 * description:卖家端接口
 */
public interface SellerService {
    //通过openid查询卖家信息
    SellerInfo findSellerInfoByOpenid(String openid);
}
