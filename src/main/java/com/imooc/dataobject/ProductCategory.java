package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * author: LEE
 * date: 2019/7/3  11:07
 * description:类目表
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    //类目ID
    @Id                            //主键注解
    @GeneratedValue(strategy = GenerationType.IDENTITY)                //自增类型注解
    private Integer categoryId;

    //类目名字
    private String categoryName;

    //类目编号
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }


}
