package com.imooc.services;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * author: LEE
 * date: 2019/7/6  10:01
 * description:
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
