package com.github.dabin.mini_shop.domain.product.repository;

import com.github.dabin.mini_shop.domain.product.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
