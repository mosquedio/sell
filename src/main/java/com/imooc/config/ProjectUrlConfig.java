package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * author: LEE
 * date: 2019/7/29  11:11
 * description:
 */
@Data
@ConfigurationProperties(prefix = "project-url")
@Component
public class ProjectUrlConfig {

    //微信公众平台授权url
    private String wechatMpAuthorize;

    //微信开放平台授权url
    private String wechatOpenAuthorize;

    //点餐系统
    private String sell;

}
