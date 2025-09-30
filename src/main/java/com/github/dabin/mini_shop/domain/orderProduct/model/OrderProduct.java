package com.github.dabin.mini_shop.domain.orderProduct.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderProduct {
    private Long id;
    private Long orderId;
    private Long productId;
    private int quantity;
    private int salePrice;
    private int listPrice;
}
