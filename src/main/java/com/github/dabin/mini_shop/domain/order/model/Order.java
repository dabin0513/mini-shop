package com.github.dabin.mini_shop.domain.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private Long customerId;
    private String orderStatus;
    private int totalAmount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
