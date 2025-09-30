package com.github.dabin.mini_shop.domain.stock.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    private Long id;
    private int stockQuantity;
    private int stockThreshold;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
