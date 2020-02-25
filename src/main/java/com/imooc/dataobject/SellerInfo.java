package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * author: LEE
 * date: 2019/7/23  10:34
 * description:
 */
@Entity
@Data
public class SellerInfo {

    @Id
    private String sellerId;

    private String userName;

    private String password;

    private String openid;

}
