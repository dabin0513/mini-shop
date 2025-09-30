package com.github.dabin.mini_shop.domain.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long id;
    private Long categoryId;
    private Long stockId;
    private String name;
    private Long salePrice;
    private Long listPrice;
    private String imageUrl;
    private String productStatus;
    private int salesCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
