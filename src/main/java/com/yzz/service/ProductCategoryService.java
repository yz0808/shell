package com.yzz.service;

import com.yzz.domain.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    ProductCategory findOne(Integer productCategoryId);

    List<ProductCategory> findAll();

    /**
     * 根据类目编号查询
     * @param productTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> productTypeList);

    ProductCategory save(ProductCategory productCategory);
}
