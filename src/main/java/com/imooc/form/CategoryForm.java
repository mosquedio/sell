package com.imooc.form;

import lombok.Data;

/**
 * author: LEE
 * date: 2019/7/22  18:13
 * description:
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    //类目名字
    private String categoryName;

    //类目编号
    private Integer categoryType;
}
