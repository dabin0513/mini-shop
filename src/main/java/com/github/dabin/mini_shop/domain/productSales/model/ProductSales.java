package com.github.dabin.mini_shop.domain.productSales.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductSales {
    private Long id;
    private Long productId;
    private int salesCount;
}
