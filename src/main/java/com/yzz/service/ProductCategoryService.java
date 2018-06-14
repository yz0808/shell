package com.yzz.service;

import com.yzz.domain.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    ProductCategory findOne(Integer productCategoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> productTypeList);

    ProductCategory save(ProductCategory productCategory);
}
